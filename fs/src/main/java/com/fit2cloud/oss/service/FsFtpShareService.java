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
import com.fit2cloud.oss.base.mapper.FsFtpShareMapper;
import com.fit2cloud.oss.base.mapper.FsXskyAccountMapper;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsFtpShareDTO;
import com.fit2cloud.oss.dto.FsXskyFolderDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.dto.ResourcePriceDTO;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
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
public class FsFtpShareService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsFtpShareMapper fsFtpShareMapper;
    @Resource
    ExtAccountService extAccountService;
    @Resource
    private FsFtpShareAclService fsFtpShareAclService;
   /* @Resource
    FsFolderService fsFolderService;*/
    @Resource
    private FsGatewayGroupService fsGatewayGroupService;
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

    public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsFtpShare record = fsFtpShareMapper.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(record)) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        fsFtpShareMapper.updateByPrimaryKey(record);
    }
    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsFtpShare> pagingShare(FsFtpShareDTO condition, List<Long> shareIds){
        FsFtpShareExample example = new FsFtpShareExample();
        FsFtpShareExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsFtpShareDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (SessionUtils.getOrganizationId() != null || SessionUtils.getWorkspaceId() != null) {
            if (CollectionUtils.isEmpty(shareIds)) {
                return new ArrayList<>();
            }
            criteria.andShareIdIn(shareIds);
        }

        Optional.ofNullable(condition.getFolderName())
                .ifPresent(criteria::andFolderNameLike);
        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);
        return fsFtpShareMapper.selectByExample(example);
    }

    public void syncFtpShare(FsXskyAccount account, FsShareClient client) {
        Map<Long, FsFtpShare> localShares = getLocalShares(account);
        Map<Long, DfsFTPShareRecord> xskyShares = getFtpShares(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localUserId : localShares.keySet()){
            if(!xskyShares.containsKey(localUserId)){
                fsFtpShareMapper.deleteByPrimaryKey(localShares.get(localUserId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyShareId : xskyShares.keySet()){
            FsFtpShare xskyShare = convert(account.getId(), xskyShares.get(xskyShareId));

            if(!localShares.containsKey(xskyShareId)){
                fsFtpShareMapper.insert(xskyShare);
            }else{
                FsFtpShareExample example = new FsFtpShareExample();
                example.createCriteria().andShareIdEqualTo(xskyShare.getShareId())
                        .andAccountIdEqualTo(account.getId());
                fsFtpShareMapper.updateByExampleSelective(xskyShare, example);
            }
        }
    }

    private FsFtpShare convert(String accountId, DfsFTPShare fsftpShare) {
        FsFtpShare share = new FsFtpShare();
        share.setAccountId(accountId);
//        share.setAclNum(fsftpShare.getAclNum());
        share.setShareId(fsftpShare.getId());
        share.setStatus(fsftpShare.getStatus());
        share.setName(fsftpShare.getName());


        share.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsftpShare.getUpdate()));
        share.setCreateTime(XskyCommonUtil.convertTime2Mills(fsftpShare.getCreate()));
        Optional.ofNullable(fsftpShare.getDfsRootfs()).map(DfsRootfsNestview::getId).ifPresent(share::setFolderId);
        Optional.ofNullable(fsftpShare.getDfsRootfs()).map(DfsRootfsNestview::getName).ifPresent(share::setFolderName);
        Optional.ofNullable(fsftpShare.getDfsPath()).map(DfsPathNestview::getId).ifPresent(share::setPathId);
        Optional.ofNullable(fsftpShare.getDfsPath()).map(DfsPathNestview::getName).ifPresent(share::setPathName);
        Optional.ofNullable(fsftpShare.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getId)
                .ifPresent(share::setGatewayGroupId);
        Optional.ofNullable(fsftpShare.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getName)
                .ifPresent(share::setGatewayGroupName);



        return share;
    }

    private Map<Long, FsFtpShare> getLocalShares(FsXskyAccount account){
        FsFtpShareExample example = new FsFtpShareExample();
        FsFtpShareExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsFtpShare> clients = fsFtpShareMapper.selectByExample(example);

        Map<Long, FsFtpShare> localShares =new HashMap<>();
        clients.forEach(share -> localShares.put(share.getShareId(), share));
        return localShares;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public FsFtpShare createShare(FsFtpShareDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }

        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));
        DfsFTPShare resRecord = client.createFsFTPShare(record);

        FsFtpShare share = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);

        share.setOrganization(record.getOrganization());
        share.setWorkspace(record.getWorkspace());

        fsFtpShareMapper.insert(share);
        fsFtpShareAclService.syncFsFtpShareAcl(extAccountService.getXskyAccount(record.getAccountId()),
                client, record.getShareId());
        //fsFolderService.fetchFolderStatusAfterOpt(record.getAccountId(), record.getFolderId(), false);
        return share;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public FsFtpShare updateShare(FsFtpShareDTO record){
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsFtpShare dbRecord = fsFtpShareMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));
        DfsFTPShare resRecord = client.updateFsFTPShare(record);
        if (resRecord != null) {
            FsFtpShare share = convert(record.getAccountId(), resRecord);
            share.setId(record.getId());
            fsFtpShareMapper.updateByPrimaryKeySelective(share);
            fsFtpShareAclService.syncFsFtpShareAcl(extAccountService.getXskyAccount(record.getAccountId()),
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
        FsFtpShare record = fsFtpShareMapper.selectByPrimaryKey(shareId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));

        client.deleteFsFTPShare(record.getShareId());
        fsFtpShareMapper.deleteByPrimaryKey(record.getId());
        //fsFolderService.fetchFolderStatusAfterOpt(record.getAccountId(), record.getFolderId(), true);

    }

    public void deleteLocalData(String xskyAccountId) {
        FsFtpShareExample example = new FsFtpShareExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        fsFtpShareMapper.deleteByExample(example);
    }

    private Map<Long, DfsFTPShareRecord> getFtpShares(FsShareClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsFTPShareRecord> shares = client.getFsFTPShare(page);

        Map<Long, DfsFTPShareRecord> xskyShares =new HashMap <>();
        shares.forEach( c -> {
            xskyShares.put(c.getId(), c);
            }
        );
        return xskyShares;
    }

    /**
     * 根据共享的shareIds和userIds查询Acl
     */
    public List<FsFtpShareAcl> checkSmbGatewayAndUser(Long gatewayGroupId, List<Long> visitIdList) {
        List<FsFtpShareAcl> fsFtpShareAcls = new ArrayList<>();
        if (gatewayGroupId != null && visitIdList.size() > 0){
            try {
                //查询文件网关组
                FsXskyGatewayGroup fsGatewayGroup =
                        fsGatewayGroupService.getFSGatewayGroupByGatewayGroupId(gatewayGroupId);
                FsFtpShareExample example = new FsFtpShareExample();
                example.createCriteria().andGatewayGroupNameEqualTo(fsGatewayGroup.getName());
                List<FsFtpShare> fsFtpShares = fsFtpShareMapper.selectByExample(example);
                if (CollectionUtils.isNotEmpty(fsFtpShares)){
                    List<Long> shareIds = fsFtpShares.stream().map(FsFtpShare::getShareId).collect(Collectors.toList());
                    // 根据共享文件Id和用户查询共享的acl
                    fsFtpShareAcls = fsFtpShareAclService.getSmbShareAclsByShareIdsAndUserIds(shareIds, visitIdList);
                }
                return fsFtpShareAcls;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return fsFtpShareAcls;
    }

    public List<BillingItem> selectBillingItems() throws Exception {
        long billingTime = System.currentTimeMillis();

        //  --start-- 中控： 以环境维度区分价格统计计算(目前只统计xsky 的)
        List<FsFtpShareDTO> fsFtpShareDTOS = fsFtpShareMapper.selectByExample(new FsFtpShareExample()).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
        List<BillingItem> billingItems = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(fsFtpShareDTOS)) {
            List<ResourcePriceDTO> resourcePrices = fsFtpShareDTOS.stream().filter(ftpShare -> StringUtils.isNotEmpty(ftpShare.getWorkspace())).map(fsFtpShare -> {
                //查询云账号的所有环境的价格策略
                String accountId = fsFtpShare.getAccountId();
                FsXskyAccount fsXskyAccount = fsXskyAccountMapper.selectByPrimaryKey(accountId);
                String platform = fsXskyAccount.getPlatform();
                FSPricePolicyExample fsPricePolicyExample = new FSPricePolicyExample();
                fsPricePolicyExample.createCriteria().andPlatformEqualTo(platform);
                Map<String, FSPricePolicy> collect = fsPricePolicyMapper.selectByExample(fsPricePolicyExample)
                        .stream().collect(Collectors.toMap(FSPricePolicy::getEnv, FSPricePolicy -> FSPricePolicy));

                String workspaceId = fsFtpShare.getWorkspace();
                String priceByEnv = pricePolicyService.getPriceByEnv(workspaceId);
                FSPricePolicy fsPricePolicy = collect.get(priceByEnv);
                ResourcePriceDTO resourcePriceDTO = new ResourcePriceDTO();
                resourcePriceDTO.setId(fsFtpShare.getId() + "-fs-ftp");
                resourcePriceDTO.setResourceId(fsFtpShare.getName());
                resourcePriceDTO.setResourceName(fsFtpShare.getName()+"_FTP文件共享");
                resourcePriceDTO.setShare(1L);
                resourcePriceDTO.setWorkspaceId(fsFtpShare.getWorkspace());
                resourcePriceDTO.setResourceCreateTime(ObjectUtils.isNotEmpty(fsFtpShare.getCreateTime()) ? fsFtpShare.getCreateTime() : 0L);
                resourcePriceDTO.setOrganizationId(fsFtpShare.getOrganization());
                resourcePriceDTO.setResourceType("文件系统");
                resourcePriceDTO.setInstanceType(fsFtpShare.getPathName());

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
