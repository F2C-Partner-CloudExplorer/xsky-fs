package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.i18n.Translator;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.base.domain.FsXskyPlatform;
import com.fit2cloud.oss.common.constants.PermissionConstants;
import com.fit2cloud.oss.service.FsXskyPlatformService;
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
@RequestMapping("platform")
@Api(tags = Translator.PREFIX + "存储类型" + Translator.SUFFIX)
public class FsXskyPlatformController {

    @Resource
    private FsXskyPlatformService fsXskyPlatformService;

    @RequestMapping("getAll")
    @ApiOperation(Translator.PREFIX + "查看所有存储类型" + Translator.SUFFIX)
    @RequiresPermissions(PermissionConstants.POLICY_READ)
    public List<FsXskyPlatform> getAll(){
        return fsXskyPlatformService.getAll();
    }



    @PostMapping("list/{goPage}/{pageSize}")
    @ApiOperation(Translator.PREFIX + "分页查看存储类型列表" + Translator.SUFFIX)
    @RequiresPermissions(PermissionConstants.POLICY_READ)
    public Pager<List<FsXskyPlatform>> listPager(@PathVariable int goPage, @PathVariable int pageSize) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsXskyPlatformService.getAll());
    }

    @PostMapping("add")
    @ApiOperation(Translator.PREFIX + "创建存储类型" + Translator.SUFFIX)
    @RequiresPermissions(value = {PermissionConstants.POLICY_CREATE, PermissionConstants.POLICY_CREATE}, logical = Logical.OR)
    public void createBucketType(@RequestBody FsXskyPlatform ossXskyPlatform) {
        fsXskyPlatformService.createBucketType(ossXskyPlatform);
    }


    @PostMapping("update")
    @RequiresPermissions(value = {PermissionConstants.POLICY_EDIT, PermissionConstants.POLICY_EDIT}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "编辑存储类型" + Translator.SUFFIX)
    public void updateBucketType(@RequestBody FsXskyPlatform ossXskyPlatform) {
        fsXskyPlatformService.updateBucketType(ossXskyPlatform);
    }


    @PostMapping("delete/{id}")
    @RequiresPermissions(value = {PermissionConstants.POLICY_DELETE, PermissionConstants.POLICY_DELETE}, logical = Logical.OR)
    @ApiOperation(Translator.PREFIX + "删除存储类型" + Translator.SUFFIX)
    public void deletePolicy(@PathVariable String id) {
        fsXskyPlatformService.deleteBucketType(id);
    }
}
