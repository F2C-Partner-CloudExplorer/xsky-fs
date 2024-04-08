package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.PluginWithBLOBs;
import com.fit2cloud.oss.common.constants.PermissionConstants;
import com.fit2cloud.oss.service.PluginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author upeoe
 * @create 2018/10/24 14:26
 */

@RestController
@RequestMapping(value = "plugin")
@Api(tags = "插件")
public class PluginController {

    @Resource
    private PluginService pluginService;

    @ApiOperation("全部插件")
    @RequestMapping(value = "all")
    @RequiresPermissions(PermissionConstants.PLUGIN_READ)
    public List<PluginWithBLOBs> getAllPlugins() {
        return pluginService.getAllPlugins();
    }

    @ApiOperation("获取云账号凭证模板")
    @RequestMapping(value = "credential/{pluginName}", method = RequestMethod.GET)
    @RequiresPermissions(PermissionConstants.PLUGIN_READ)
    public Object getCredential(@PathVariable String pluginName) {
        return pluginService.getCredential(pluginName);
    }

}
