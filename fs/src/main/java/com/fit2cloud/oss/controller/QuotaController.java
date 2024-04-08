package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.Organization;
import com.fit2cloud.commons.server.base.domain.Workspace;
import com.fit2cloud.commons.server.i18n.Translator;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.common.constants.PermissionConstants;
import com.fit2cloud.oss.controller.request.QuotaSearchRequest;
import com.fit2cloud.oss.dto.FolderQuotaSetting;
import com.fit2cloud.oss.service.QuotaService;
import com.fit2cloud.oss.service.WorkspaceService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 配额Controller
 */
@RestController
@RequestMapping(value = "quota")
@Api(tags = Translator.PREFIX + "i18n_quota_list" + Translator.SUFFIX)
public class QuotaController {

    @Resource
    private QuotaService quotaService;
    @Resource
    private WorkspaceService workspaceService;

    /**
     * 获取所有组织
     * @param goPage
     * @param pageSize
     * @param organization
     * @return
     */
    @PostMapping(value = "org/list/{goPage}/{pageSize}")
    @RequiresPermissions(PermissionConstants.QUOTA_READ)
    @ApiOperation(Translator.PREFIX + "i18n_organization_quota_list" + Translator.SUFFIX)
    public Pager<List<Organization>> listAllOrg(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody Organization organization) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, quotaService.listAllOrg(organization));
    }

    /**
     * 获取一组织下所有工作空间
     * @param orgId
     * @return
     */
    @GetMapping(value = "org/workspaces/{orgId}")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_READ}, logical = Logical.OR)
    public List<Workspace> listAllWorkspaceByOrgId(@PathVariable String orgId) {
        List<Workspace> workspaces = workspaceService.selectWorkspacesByOrgId(orgId);
        List<String> workspaceIds = workspaces.stream().map(Workspace::getId).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(workspaceIds)) {
            return new ArrayList<>();
        }
        return quotaService.listAllWorkspaces(new Workspace(), workspaceIds);
    }

    /**
     * 获取组织默认配额
     * @return
     */
    @GetMapping(value = "org/default")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_WORKSPACE_READ, PermissionConstants.QUOTA_READ}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_organization_quota_default" + Translator.SUFFIX)
    public FolderQuotaSetting getOrgDefaultQuota() {
        return quotaService.getDefaultQuota(FolderQuotaSetting.ORG_KEY);
    }

    /**
     * 获取工作空间默认配额
     * @return
     */
    @GetMapping(value = "default")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_WORKSPACE_READ, PermissionConstants.QUOTA_READ}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_workspace_quota_default" + Translator.SUFFIX)
    public FolderQuotaSetting getDefaultQuota() {
        return quotaService.getDefaultQuota(FolderQuotaSetting.WORKSPACE_KEY);
    }

    /**
     * 保存/更新组织默认配额
     * @param quotaSetting
     */
    @PostMapping(value = "/org/save-default")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_EDIT_DEFAULT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_save_organization_quota_default" + Translator.SUFFIX)
    public void saveOrgDefaultQuota(@RequestBody FolderQuotaSetting quotaSetting) {
        quotaService.saveDefaultQuota(quotaSetting, FolderQuotaSetting.ORG_DEFAULT_KEY);
    }

    /**
     * 保存/更新工作空间默认配额
     * @param quotaSetting
     */
    @PostMapping(value = "/save-default")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_WORKSPACE_EDIT_DEFAULT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_save_workspace_quota_default" + Translator.SUFFIX)
    public void saveDefaultQuota(@RequestBody FolderQuotaSetting quotaSetting) {
        quotaService.saveDefaultQuota(quotaSetting, FolderQuotaSetting.WORKSPACE_DEFAULT_KEY);
    }

    /**
     * 获取指定组织配额
     * @param orgId
     * @return
     */
    @GetMapping(value = "org/{orgId}")
    @RequiresPermissions(PermissionConstants.QUOTA_READ)
    @ApiOperation(Translator.PREFIX + "i18n_organization_quota" + Translator.SUFFIX)
    public FolderQuotaSetting getOrgQuotaUsage(@PathVariable String orgId) {
        return quotaService.getQuotaUsage(orgId, FolderQuotaSetting.ORG_KEY);
    }


    /**
     * 获取指定工作空间配额
     * @param workspaceId
     * @return
     */
    @GetMapping(value = "workspace/{workspaceId}")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_WORKSPACE_READ, PermissionConstants.QUOTA_READ, PermissionConstants.QUOTA_USER_READ}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_workspace_quota" + Translator.SUFFIX)
    public FolderQuotaSetting getQuotaUsage(@PathVariable String workspaceId) {
        return quotaService.getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
    }

    /**
     * 保存/更新指定组织配额
     * @param orgId
     * @param quotaSetting
     */
    @PostMapping(value = "org/save/{orgId}")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_EDIT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_save_organization_quota" + Translator.SUFFIX)
    public void saveOrgQuota(@PathVariable String orgId, @RequestBody FolderQuotaSetting quotaSetting) {
        quotaService.saveQuota(orgId, quotaSetting, FolderQuotaSetting.ORG_KEY);
    }

    /**
     * 保存/更新指定工作空间配额
     * @param workspaceId
     * @param quotaSetting
     */
    @PostMapping(value = "save/{workspaceId}")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_WORKSPACE_EDIT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_save_workspace_quota" + Translator.SUFFIX)
    public void saveQuota(@PathVariable String workspaceId, @RequestBody FolderQuotaSetting quotaSetting) {
        quotaService.saveQuota(workspaceId, quotaSetting, FolderQuotaSetting.WORKSPACE_KEY);
    }

    @PostMapping(value = "org/orgs/{orgId}")
    @RequiresPermissions(value = {PermissionConstants.QUOTA_READ, PermissionConstants.QUOTA_WORKSPACE_READ}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "i18n_query_org_workspace_quota" + Translator.SUFFIX)
    public List<Organization> listAllOrgByOrgId(@PathVariable String orgId) {
        QuotaSearchRequest quotaSearchRequest = new QuotaSearchRequest();
        quotaSearchRequest.setWorkspaceId(orgId);
        return quotaService.listAllOrgByPid(quotaSearchRequest);
    }

}
