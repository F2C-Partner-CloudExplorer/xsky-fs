package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.Plugin;
import com.fit2cloud.commons.server.i18n.Translator;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.base.domain.FSPricePolicy;
import com.fit2cloud.oss.common.constants.PermissionConstants;
import com.fit2cloud.oss.dto.FsPricePolicyDTO;
import com.fit2cloud.oss.dto.request.FsPricePolicyRequest;
import com.fit2cloud.oss.dto.request.PricePolicyRequest;
import com.fit2cloud.oss.service.PricePolicyService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("policy")
@Api(tags = Translator.PREFIX + "价格策略" + Translator.SUFFIX)
public class PricePolicyController {
    @Resource
    private PricePolicyService pricePolicyService;

    @PostMapping("config/list/{goPage}/{pageSize}")
    @ApiOperation(Translator.PREFIX + "查看按具体配置价格策略" + Translator.SUFFIX)
    @RequiresPermissions(PermissionConstants.POLICY_READ)
    public Pager<List<FSPricePolicy>> getPolicyConfigList(@PathVariable int goPage, @PathVariable int pageSize) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, pricePolicyService.selectPolicyConfigList());
    }

    @PostMapping("add")
    @ApiOperation(Translator.PREFIX + "创建价格策略" + Translator.SUFFIX)
    @RequiresPermissions(value = {PermissionConstants.POLICY_CREATE, PermissionConstants.POLICY_CREATE}, logical = Logical.OR)
    public FSPricePolicy createPricePolicy(@RequestBody FSPricePolicy pricePolicy) {
        return pricePolicyService.saveConfigurationPrice(pricePolicy);
    }


    @PostMapping("update")
    @RequiresPermissions(value = {PermissionConstants.POLICY_EDIT, PermissionConstants.POLICY_EDIT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "编辑价格策略" + Translator.SUFFIX)
    public void updatePricePolicy(@RequestBody FSPricePolicy pricePolicy) {
        pricePolicyService.saveConfigurationPrice(pricePolicy);
    }


    @PostMapping("delete/{id}")
    @RequiresPermissions(value = {PermissionConstants.POLICY_DELETE, PermissionConstants.POLICY_DELETE}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_delete_price_policy" + Translator.SUFFIX)
    public void deletePolicy(@PathVariable String id) {
        pricePolicyService.deletePolicy(id);
    }


    @GetMapping("/getEnvList")
    public List<String> getEnvList() {
        return pricePolicyService.getEnvList();
    }

    @PostMapping("/getSharePricePolicyInfo")
    public FsPricePolicyDTO getSharePricePolicyInfo(@RequestBody FsPricePolicyRequest fsPricePolicyRequest) {
        return pricePolicyService.getSharePricePolicyInfo((fsPricePolicyRequest));
    }

    @PostMapping("/getPricePolicy")
    public FSPricePolicy getPricePolicy(@RequestBody PricePolicyRequest pricePolicyRequest) {
        return pricePolicyService.getPricePolicy(pricePolicyRequest);
    }
}
