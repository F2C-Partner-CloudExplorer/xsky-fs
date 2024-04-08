package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.pluginmanager.CloudProviderManager;
import com.fit2cloud.commons.server.base.domain.Plugin;
import com.fit2cloud.commons.server.base.mapper.PluginMapper;
import com.fit2cloud.commons.server.constants.PluginConstants;
import com.fit2cloud.commons.server.constants.ResourceTypeConstants;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.commons.server.i18n.Translator;
import com.fit2cloud.commons.server.service.OperationLogService;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.commons.utils.UUIDUtil;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.*;
import com.fit2cloud.oss.base.mapper.ext.ExtOrderMapper;
import com.fit2cloud.oss.common.constants.VMResourceOperate;
import com.fit2cloud.oss.dto.FsPricePolicyDTO;
import com.fit2cloud.oss.dto.OrderDTO;
import com.fit2cloud.oss.dto.request.FsPricePolicyRequest;
import com.fit2cloud.oss.dto.request.PricePolicyRequest;
import com.fit2cloud.sdk.ICloudProvider;
import com.fit2cloud.sdk.constants.F2CPricePolicy;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class PricePolicyService {

    @Resource
    private SystemParameterService systemParameterService;

    @Resource
    private ResourcePoolTagService resourcePoolTagService;

    @Resource
    private ProjectAbbreviationRefMapper projectAbbreviationRefMapper;

    @Resource
    private FSPricePolicyMapper fsPricePolicyMapper;

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ExtOrderMapper extOrderMapper;

    @Resource
    private FsXskyAccountMapper fsXskyAccountMapper;

    private static final String ENV_TAG = "vm.price.policy.env";

    private static final String VM_PRICE_POLICY_ABBREVIATION_ENV = "vm.price.policy.abbreviation.env";


    public String initEnv() {
        return systemParameterService.selectParameterByKey(ENV_TAG);
    }

    public String initAbbreviation() {
        return systemParameterService.selectParameterByKey(VM_PRICE_POLICY_ABBREVIATION_ENV);
    }

    public FSPricePolicy saveConfigurationPrice(FSPricePolicy pricePolicy) {
        if (StringUtils.isNotBlank(pricePolicy.getId())) {
            FSPricePolicyExample FSPricePolicyExample = new FSPricePolicyExample();
            FSPricePolicyExample.createCriteria().andEnvEqualTo(pricePolicy.getEnv())
                    .andPlatformEqualTo(pricePolicy.getPlatform()).andIdNotEqualTo(pricePolicy.getId());
            List<FSPricePolicy> vmPricePolicies = fsPricePolicyMapper.selectByExample(FSPricePolicyExample);
            if (CollectionUtils.isNotEmpty(vmPricePolicies)) {
                throw new RuntimeException("此平台当前环境的价格策略已经存在，不能重复添加");
            }
            fsPricePolicyMapper.updateByPrimaryKeySelective(pricePolicy);
            OperationLogService.log(null, pricePolicy.getId(), pricePolicy.getPlatform(), ResourceTypeConstants.PRICE_POLICY.name(), VMResourceOperate.UPDATE, Translator.get("更新价格策略"));
            return pricePolicy;
        }
        pricePolicy.setId(UUIDUtil.newUUID());
        FSPricePolicyExample priceExample = new FSPricePolicyExample();

        // 中控定制： 按配置同一个平台一个环境只能有一条记录
        priceExample.createCriteria()
                .andPlatformEqualTo(pricePolicy.getPlatform())
                .andEnvEqualTo(pricePolicy.getEnv());
        List<FSPricePolicy> pricePolicies = fsPricePolicyMapper.selectByExample(priceExample);
        if (CollectionUtils.isNotEmpty(pricePolicies)) {
            throw new RuntimeException(Translator.get("已经存在此价格策略"));
        } else {
            fsPricePolicyMapper.insertSelective(pricePolicy);
            OperationLogService.log(null, pricePolicy.getId(), pricePolicy.getPlatform(), ResourceTypeConstants.PRICE_POLICY.name(), VMResourceOperate.CREATE, Translator.get("创建价格策略"));
        }
        return pricePolicy;
    }

    public List<FSPricePolicy> selectPolicyConfigList() {
        FSPricePolicyExample example = new FSPricePolicyExample();
        example.createCriteria()
                .andCapacityPriceIsNotNull();
        return fsPricePolicyMapper.selectByExample(example);
    }

    public void deletePolicy(String id) {
        FSPricePolicy billsPricePolicy = fsPricePolicyMapper.selectByPrimaryKey(id);
        if (billsPricePolicy != null) {
            fsPricePolicyMapper.deleteByPrimaryKey(id);
            OperationLogService.log(null, id, billsPricePolicy.getPlatform(), ResourceTypeConstants.PRICE_POLICY.name(), VMResourceOperate.DELETE, Translator.get("删除价格策略"));
        }
    }


    /**
     * 获取资源池的环境标签
     *
     * @return
     */
    public List<String> getEnvList() {
        List<ResourcePoolTag> list = resourcePoolTagService.list();
        System.out.println(this.initEnv());
        if (CollectionUtils.isNotEmpty(list)) {
            String id = list.stream().filter(x -> x.getParent() == null)
                    .filter(y -> this.initEnv().equalsIgnoreCase(y.getTagValue()))
                    .findFirst().get().getId();
            LogUtil.info("查询资源池环境标签ID为:{}", id);
            if (StringUtils.isBlank(id)) {
                F2CException.getException("环境ID查询为空!");
            }
            return list.stream().filter(x -> id.equals(x.getParent())).map(ResourcePoolTag::getTagValue).collect(Collectors.toList());
        }
        return null;
    }

    /**
     * 文件系统预估价格计算 (容量大小*每小时价格)
     *
     * @param fsPricePolicyRequest
     * @return
     */
    public FsPricePolicyDTO getSharePricePolicyInfo(FsPricePolicyRequest fsPricePolicyRequest) {
        String accountId = fsPricePolicyRequest.getAccountId();
        String workspaceId = fsPricePolicyRequest.getWorkspaceId();
        //根据账号id获取存储类型
        FsXskyAccount fsXskyAccount = fsXskyAccountMapper.selectByPrimaryKey(accountId);
        if (ObjectUtils.isEmpty(fsXskyAccount)){
            throw new NullPointerException("当前订单的账号不存在");
        }
        String platform = fsXskyAccount.getPlatform();

        if (StringUtils.isEmpty(workspaceId)) {
            workspaceId = SessionUtils.getWorkspaceId();
        }
        //根据工作空间获取环境信息
        String priceByEnv = this.getPriceByEnv(workspaceId);
        if (StringUtils.isNotBlank(priceByEnv)) {
            //根据存储类型和环境获取价格策略信息
            FSPricePolicyExample fsPricePolicyExample = new FSPricePolicyExample();
            fsPricePolicyExample.createCriteria().andPlatformEqualTo(platform)
                    .andEnvEqualTo(priceByEnv);
            List<FSPricePolicy> fsPricePolicies = fsPricePolicyMapper.selectByExample(fsPricePolicyExample);
            if (CollectionUtils.isEmpty(fsPricePolicies)) {
                throw new RuntimeException("当前价格策略为空");
            }
            FSPricePolicy fsPricePolicy = fsPricePolicies.stream().findFirst().get();
            //根据容量计算价格
            Integer share = fsPricePolicyRequest.getFileShare();
            BigDecimal capacityPrice = fsPricePolicy.getCapacityPrice();
            BigDecimal totalPrice = capacityPrice.multiply(new BigDecimal(share));
            FsPricePolicyDTO fsPricePolicyDTO = new FsPricePolicyDTO();
            fsPricePolicyDTO.setName(fsPricePolicyRequest.getName());
            fsPricePolicyDTO.setTotalPrice(totalPrice);
            return fsPricePolicyDTO;
        }

        return null;
    }

    /**
     * 根据工作空间获取价格策略环境信息
     *
     * @param workspaceId
     * @return
     */
    public String getPriceByEnv(String workspaceId) {
        ProjectAbbreviationRefExample projectAbbreviationRefExample = new ProjectAbbreviationRefExample();
        projectAbbreviationRefExample.createCriteria().andWorkspaceIdEqualTo(workspaceId);
        List<ProjectAbbreviationRef> projectAbbreviationRefs = projectAbbreviationRefMapper.selectByExample(projectAbbreviationRefExample);
        if (CollectionUtils.isNotEmpty(projectAbbreviationRefs)) {
            String envTag = projectAbbreviationRefs.stream()
                    .map(projectAbbreviationRef -> StringUtils.substring(projectAbbreviationRef.getAbbreviation(), projectAbbreviationRef.getAbbreviation().length() - 1, projectAbbreviationRef.getAbbreviation().length()))
                    .findFirst().get();
            HashMap<String, String> hashMap = JSON.parseObject(this.initAbbreviation(), HashMap.class);
            return hashMap.get(envTag);
        }
        return null;
    }

    /**
     * 根据订单信息获取价格
     *
     * @param pricePolicyRequest
     * @return
     */
    public FSPricePolicy getPricePolicy(PricePolicyRequest pricePolicyRequest) {
        //获取工作空间
        Order order = orderMapper.selectByPrimaryKey(pricePolicyRequest.getFsOrderId());
        OrderDTO orderDTO = extOrderMapper.getOrderDetail(order.getId());
        if (ObjectUtils.isEmpty(orderDTO.getOrderItemList())){
            throw new NullPointerException(order.getId()+" 订单的订单项为空");
        }
        String details=null;
        for (OrderItem orderItem : orderDTO.getOrderItemList()) {
            if(StringUtils.isEmpty(orderItem.getDetails())){
                throw new NullPointerException(order.getId()+" 订单的订单项为空");
            }else{
                details=orderItem.getDetails();
            }
        }
        JSONObject jsonObject = JSON.parseObject(details);
        String accountId = jsonObject.getString("accountId");
        //根据账号id获取存储类型
        FsXskyAccount fsXskyAccount = fsXskyAccountMapper.selectByPrimaryKey(accountId);
        if (ObjectUtils.isEmpty(fsXskyAccount)){
            return null;
        }
        String platform = fsXskyAccount.getPlatform();

        //获取环境
        String env = this.getPriceByEnv(order.getWorkspaceId());
        if (StringUtils.isNotBlank(env)) {
            //获取价格策略
            FSPricePolicyExample fsPricePolicyExample = new FSPricePolicyExample();
            fsPricePolicyExample.createCriteria().andPlatformEqualTo(platform)
                    .andEnvEqualTo(env);
            List<FSPricePolicy> fsPricePolicies = fsPricePolicyMapper.selectByExample(fsPricePolicyExample);
            if (CollectionUtils.isEmpty(fsPricePolicies)) {
                throw new RuntimeException("当前价格策略为空");
            }
            return fsPricePolicies.stream().findFirst().get();
        }

        return null;
    }
}
