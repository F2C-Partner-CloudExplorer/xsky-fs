package com.fit2cloud.oss.controller;


import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsControllerHelper;
import com.fit2cloud.oss.dto.FsXskyUserGroupDTO;
import com.fit2cloud.oss.service.FsUserGroupService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "Xsky用户组")
@RestController
@RequestMapping(value = "xsky/userGroup", headers = "Accept=application/json")
public class FsUserGroupController {
    @Resource
    private FsControllerHelper helper;
    @Resource
    private FsUserGroupService fsUserGroupService;

    @ApiOperation("文件用户组列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsXskyUserGroupDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsXskyUserGroupDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsUserGroupService.pagingUserGroup(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("创建文件用户组")
    @PostMapping(value = "/create")
    public void create(@RequestBody FsXskyUserGroupDTO record) {
        record.setUserIds(JSONObject.toJSONString(record.getUserIdList()));
        fsUserGroupService.createUserGroup(record);
    }

    @ApiOperation("更新文件用户组")
    @PostMapping(value = "/update")
    public void update(@RequestBody FsXskyUserGroupDTO record) {
        record.setUserIds(JSONObject.toJSONString(record.getUserIdList()));
        fsUserGroupService.updateUserGroup(record);
    }

    @ApiOperation("授权工作空间")
    @GetMapping(value = "/bind/{id}/{organizationId}/{workspaceId}")
    public void update(@PathVariable Integer id, @PathVariable String organizationId, @PathVariable String workspaceId) {
        fsUserGroupService.bindWorkspace(id, workspaceId, organizationId);
    }

    @ApiOperation("删除文件用户组")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsUserGroupService.deleteUserGroup(id);
    }

    @ApiOperation("文件用户组组列表")
    @GetMapping(value = "/listByAccount/{accountId}")
    public List<FsXskyUserGroupDTO> listByAccount(@PathVariable String accountId) {
        return fsUserGroupService.listUserGroupByAccount(accountId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }
}
