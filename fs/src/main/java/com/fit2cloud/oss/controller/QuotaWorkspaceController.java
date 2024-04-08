package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.Workspace;
import com.fit2cloud.commons.server.i18n.Translator;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.oss.common.constants.PermissionConstants;
import com.fit2cloud.oss.dto.FolderQuotaSetting;
import com.fit2cloud.oss.service.QuotaService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "quota")
@Api(tags = Translator.PREFIX + "i18n_workspace_quota_manage" + Translator.SUFFIX)
public class QuotaWorkspaceController {
    @Resource
    private QuotaService quotaService;

    @PostMapping(value = "/workspace/list/{goPage}/{pageSize}")
    @RequiresPermissions(PermissionConstants.QUOTA_WORKSPACE_READ)
    @ApiOperation(Translator.PREFIX + "i18n_workspace_quota" + Translator.SUFFIX)
    public Object listAll(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody Workspace workspace) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, quotaService.listAllGroup(workspace, SessionUtils.getUser().getOrganizationId()));
    }

    @GetMapping(value = "org/current")
    @RequiresPermissions(PermissionConstants.QUOTA_WORKSPACE_READ)
    public FolderQuotaSetting getOrgQuotaUsage() {
        return quotaService.getQuotaUsage(SessionUtils.getOrganizationId(), FolderQuotaSetting.ORG_KEY);
    }
}
