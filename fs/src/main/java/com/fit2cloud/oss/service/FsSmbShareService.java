package com.fit2cloud.oss.service;

import com.fit2cloud.commons.server.base.domain.TagMapping;
import com.fit2cloud.commons.server.constants.BillingRollupType;
import com.fit2cloud.commons.server.model.billing.BillingItem;
import com.fit2cloud.commons.server.model.billing.BillingResource;
import com.fit2cloud.commons.server.model.billing.BillingTag;
import com.fit2cloud.commons.server.model.billing.BillingUsage;
import com.fit2cloud.commons.server.service.TagMappingService;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FSPricePolicyMapper;
import com.fit2cloud.oss.base.mapper.FsSmbShareMapper;
import com.fit2cloud.oss.base.mapper.FsXskyAccountMapper;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsSmbShareDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.dto.ResourcePriceDTO;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.FsShareClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static com.fit2cloud.oss.exception.BusinessException.INVALID_REQUEST_PARAM_MSG;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsSmbShareService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsSmbShareMapper fsSmbShareMapper;
    @Resource
    ExtAccountService extAccountService;
    @Resource
    FsSmbShareAclService fsSmbShareAclService;
    @Resource
    private FsGatewayGroupService fsGatewayGroupService;
    @Resource
    private FsXskyAccountMapper accountMapper;
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsXskyAccountMapper fsXskyAccountMapper;
    @Resource
    private FSPricePolicyMapper fsPricePolicyMapper;
    @Resource
    private PricePolicyService pricePolicyService;
    @Resource
    private TagMappingService tagMappingService;


    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsSmbShare> pagingShare(FsSmbShareDTO condition, List<Long> shareIds){
        FsSmbShareExample example = new FsSmbShareExample();
        FsSmbShareExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsSmbShareDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (SessionUtils.getOrganizationId() != null || SessionUtils.getWorkspaceId() != null) {
            if (CollectionUtils.isEmpty(shareIds)) {
                return new ArrayList<>();
            }
            criteria.andShareIdIn(shareIds);
        }

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);

        return fsSmbShareMapper.selectByExample(example);
    }

    public List<FsSmbShare> listShareByAccount(String accountId){
        FsSmbShareExample example = new FsSmbShareExample();
        FsSmbShareExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId);
        return fsSmbShareMapper.selectByExample(example);
    }

    public void syncSmbShare(FsXskyAccount account, FsShareClient client) {
        Map<Long, FsSmbShare> localShares = getLocalShares(account);
        Map<Long, DfsSMBShareRecord> xskyShares = getSmbShares(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localShareId : localShares.keySet()){
            if(!xskyShares.containsKey(localShareId)){
                fsSmbShareMapper.deleteByPrimaryKey(localShares.get(localShareId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyShareId : xskyShares.keySet()){
            FsSmbShare xskyShare = convert(account.getId(), xskyShares.get(xskyShareId));

            if(!localShares.containsKey(xskyShareId)){
                fsSmbShareMapper.insert(xskyShare);
            }else{
                FsSmbShareExample example = new FsSmbShareExample();
                example.createCriteria().andShareIdEqualTo(xskyShare.getShareId())
                        .andAccountIdEqualTo(account.getId());
                fsSmbShareMapper.updateByExampleSelective(xskyShare, example);
            }
        }
    }

    private FsSmbShare convert(String accountId, DfsSMBShare dfsSMBShare) {
        FsSmbShare share = new FsSmbShare();
        share.setAccountId(accountId);
//        share.setAclNum(fsSmbShare.getAclNum());
        share.setShareId(dfsSMBShare.getId());
        share.setStatus(dfsSMBShare.getStatus());
        share.setName(dfsSMBShare.getName());

        share.setUpdateTime(XskyCommonUtil.convertTime2Mills(dfsSMBShare.getUpdate()));
        share.setCreateTime(XskyCommonUtil.convertTime2Mills(dfsSMBShare.getCreate()));

        Optional.ofNullable(dfsSMBShare.getDfsPath()).map(DfsPathNestview::getId).ifPresent(share::setPathId);
        Optional.ofNullable(dfsSMBShare.getDfsPath()).map(DfsPathNestview::getName).ifPresent(share::setPathName);
        Optional.ofNullable(dfsSMBShare.getDfsRootfs()).map(DfsRootfsNestview::getId).ifPresent(share::setFolderId);
        Optional.ofNullable(dfsSMBShare.getDfsRootfs()).map(DfsRootfsNestview::getName).ifPresent(share::setFolderName);
        Optional.ofNullable(dfsSMBShare.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getId)
                .ifPresent(share::setGatewayGroupId);
        Optional.ofNullable(dfsSMBShare.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getName)
                .ifPresent(share::setGatewayGroupName);
        return share;
    }

    private Map<Long, FsSmbShare> getLocalShares(FsXskyAccount account){
        FsSmbShareExample example = new FsSmbShareExample();
        FsSmbShareExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsSmbShare> clients = fsSmbShareMapper.selectByExample(example);

        Map<Long, FsSmbShare> localShares =new HashMap<>();
        clients.forEach(share -> localShares.put(share.getShareId(), share));
        return localShares;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public FsSmbShare createShare(FsSmbShareDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }

        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));
        DfsSMBShare resRecord = client.createFsSMBShare(record);

        FsSmbShare share = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);

        share.setOrganization(record.getOrganization());
        share.setWorkspace(record.getWorkspace());

        fsSmbShareMapper.insert(share);
        fsSmbShareAclService.syncFsSmbShareAcl(extAccountService.getXskyAccount(record.getAccountId()),
                client, record.getShareId());
       // fsFolderService.fetchFolderStatusAfterOpt(record.getAccountId(), record.getFolderId(), false);

        return share;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public FsSmbShare updateShare(FsSmbShareDTO record){
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsSmbShare dbRecord = fsSmbShareMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));
        DfsSMBShare resRecord = client.updateFsSMBShare(record);
        if (resRecord != null) {
            FsSmbShare share = convert(record.getAccountId(), resRecord);
            share.setId(record.getId());
            fsSmbShareMapper.updateByPrimaryKeySelective(share);
            fsSmbShareAclService.syncFsSmbShareAcl(extAccountService.getXskyAccount(record.getAccountId()),
                    client, record.getShareId());
            return share;
        }
        return dbRecord;
    }

    /**
     * 删除对象用户
     *
     * @param shareId
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteShare(Integer shareId) {
        if (null == shareId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsSmbShare record = fsSmbShareMapper.selectByPrimaryKey(shareId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));

        client.deleteFsSMBShare(record.getShareId());
        fsSmbShareMapper.deleteByPrimaryKey(record.getId());
       // fsFolderService.fetchFolderStatusAfterOpt(record.getAccountId(), record.getFolderId(), true);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsSmbShareExample example = new FsSmbShareExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        fsSmbShareMapper.deleteByExample(example);
    }

    private Map<Long, DfsSMBShareRecord> getSmbShares(FsShareClient client) {
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsSMBShareRecord> shares = client.getDfsSmbShares(page);

        Map<Long, DfsSMBShareRecord> xskyShares =new HashMap <>();
        shares.forEach( c -> {
                    xskyShares.put(c.getId(), c);
                }
        );
        return xskyShares;
    }

    public List<FsSmbShareAcl> checkSmbGatewayAndUser(Long gatewayGroupId, List<Long> visitIdList) {
        List<FsSmbShareAcl> fsSmbShareAcls = new ArrayList<>();
        if (gatewayGroupId != null && visitIdList.size() > 0){
            try {
                //查询文件网关组
                FsXskyGatewayGroup fsGatewayGroup =
                        fsGatewayGroupService.getFSGatewayGroupByGatewayGroupId(gatewayGroupId);
                FsSmbShareExample fsSmbShareExample = new FsSmbShareExample();
                fsSmbShareExample.createCriteria().andGatewayGroupNameEqualTo(fsGatewayGroup.getName());
                List<FsSmbShare> fsSmbShares = fsSmbShareMapper.selectByExample(fsSmbShareExample);
                if (CollectionUtils.isNotEmpty(fsSmbShares)){
                    List<Long> shareIds = fsSmbShares.stream().map(FsSmbShare::getShareId).collect(Collectors.toList());
                    // 根据共享文件Id和用户查询共享的acl
                    fsSmbShareAcls = fsSmbShareAclService.getSmbShareAclsByShareIdsAndUserIds(shareIds, visitIdList);
                }
                return fsSmbShareAcls;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return fsSmbShareAcls;
    }

    public List<DfsRootfsRecord> DfsRootfsesInfo(String accountId) {
        FsClient client = new FsClient(extAccountService.getXskyAccount(accountId));
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        return client.DfsRootfsesInfo(page);
    }

    public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsSmbShare record = fsSmbShareMapper.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(record)) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        fsSmbShareMapper.updateByPrimaryKey(record);
    }

    public List<BillingItem> selectBillingItems() throws Exception {
        long billingTime = System.currentTimeMillis();

        //  --start-- 中控： 以环境维度区分价格统计计算(目前只统计xsky 的)
        List<FsSmbShareDTO> fsSmbShareDTOS = fsSmbShareMapper.selectByExample(new FsSmbShareExample()).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
        List<BillingItem> billingItems = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(fsSmbShareDTOS)) {
            List<ResourcePriceDTO> resourcePrices = fsSmbShareDTOS.stream().filter(ftpShare -> StringUtils.isNotEmpty(ftpShare.getWorkspace())).map(fsSmbShare -> {
                //查询云账号的所有环境的价格策略
                String accountId = fsSmbShare.getAccountId();
                FsXskyAccount fsXskyAccount = fsXskyAccountMapper.selectByPrimaryKey(accountId);
                String platform = fsXskyAccount.getPlatform();
                FSPricePolicyExample fsPricePolicyExample = new FSPricePolicyExample();
                fsPricePolicyExample.createCriteria().andPlatformEqualTo(platform);
                Map<String, FSPricePolicy> collect = fsPricePolicyMapper.selectByExample(fsPricePolicyExample)
                        .stream().collect(Collectors.toMap(FSPricePolicy::getEnv, FSPricePolicy -> FSPricePolicy));

                String workspaceId = fsSmbShare.getWorkspace();
                String priceByEnv = pricePolicyService.getPriceByEnv(workspaceId);
                FSPricePolicy fsPricePolicy = collect.get(priceByEnv);
                ResourcePriceDTO resourcePriceDTO = new ResourcePriceDTO();
                resourcePriceDTO.setId(fsSmbShare.getId() + "-fs-smb");
                resourcePriceDTO.setResourceId(fsSmbShare.getName());
                resourcePriceDTO.setResourceName(fsSmbShare.getName()+"_SMB文件共享");
                resourcePriceDTO.setShare(1L);
                resourcePriceDTO.setWorkspaceId(fsSmbShare.getWorkspace());
                resourcePriceDTO.setResourceCreateTime(ObjectUtils.isNotEmpty(fsSmbShare.getCreateTime()) ? fsSmbShare.getCreateTime() : 0L);
                resourcePriceDTO.setOrganizationId(fsSmbShare.getOrganization());
                resourcePriceDTO.setResourceType("文件系统");
                resourcePriceDTO.setInstanceType(fsSmbShare.getPathName());

                if (ObjectUtils.isEmpty(fsPricePolicy)) {
                    LogUtil.info("通过空间" + workspaceId + "环境的价格策略为空，请配置后统计价格!");
                    resourcePriceDTO.setPrice(new BigDecimal(0));
                } else {
                    BigDecimal bigDecimalPrice = fsPricePolicy.getCapacityPrice().multiply(new BigDecimal(1)).setScale(4, BigDecimal.ROUND_HALF_UP);
                    resourcePriceDTO.setPrice(bigDecimalPrice);
                }
                return resourcePriceDTO;
            }).collect(Collectors.toList());
            //  --end--

            for (ResourcePriceDTO resourcePrice : resourcePrices) {
                BillingItem billingItem = new BillingItem();
                billingItem.setOrganizationId(resourcePrice.getOrganizationId());
                billingItem.setWorkspaceId(resourcePrice.getWorkspaceId());

                BillingResource billingResource = new BillingResource();
                BeanUtils.copyProperties(billingResource, resourcePrice);
                billingResource.setResourceType(resourcePrice.getResourceType());
                billingResource.setInstanceType(resourcePrice.getInstanceType());
                billingItem.setBillingResource(billingResource);

                billingItem.setBillingRollupType(BillingRollupType.HOURLY);
                billingItem.setBillingTime(billingTime);
                List<BillingUsage> billingUsages = new ArrayList<>();

                BillingUsage billingUsage = new BillingUsage();
                billingUsage.setCumulative(true);
                billingUsage.setUsageCost(resourcePrice.getPrice());
                billingUsage.setUsageDescription("Cost per day");
                billingUsage.setUsageQuality(BigDecimal.ONE);
                billingUsage.setUsageType("Running Day");
                billingUsages.add(billingUsage);

                billingItem.setBillingUsages(billingUsages);

                List<BillingTag> billingTags = new ArrayList<>();
                Map<String, String> params = new HashMap<>();
                params.put("resourceId", String.valueOf(resourcePrice.getId()));
                Optional.ofNullable(tagMappingService.selectTagMappings(params)).ifPresent(tagMappings -> {
                    for (TagMapping tagMapping : tagMappings) {
                        BillingTag billingTag = new BillingTag();
                        billingTag.setTagKey(tagMapping.getTagKey());
                        billingTag.setTagValueId(tagMapping.getTagValueId());
                        billingTag.setTagMappingId(tagMapping.getId());
                        billingTags.add(billingTag);
                    }
                });
                billingItem.setBillingTags(billingTags);
                billingItems.add(billingItem);
            }
        }
        return billingItems;
    }
}
