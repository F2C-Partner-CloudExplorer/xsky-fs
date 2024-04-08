package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsControllerHelper;
import com.fit2cloud.oss.dto.FsXskyUserDTO;
import com.fit2cloud.oss.service.FsUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "Xsky用户")
@RestController
@RequestMapping(value = "xsky/user", headers = "Accept=application/json")
public class FsUserController {
    @Resource
    private FsControllerHelper helper;
    @Resource
    private FsUserService fsUserService;

    @ApiOperation("文件用户列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsXskyUserDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsXskyUserDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsUserService.pagingUser(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("创建用户")
    @PostMapping(value = "/create")
    public void create(@RequestBody FsXskyUserDTO record) {
        fsUserService.createUser(record);
    }

    @ApiOperation("更新文件用户")
    @PostMapping(value = "/update")
    public void update(@RequestBody FsXskyUserDTO record) {
        fsUserService.updateUser(record);
    }

    @ApiOperation("授权工作空间")
    @GetMapping(value = "/bind/{id}/{organizationId}/{workspaceId}")
    public void update(@PathVariable Integer id, @PathVariable String organizationId, @PathVariable String workspaceId) {
        fsUserService.bindWorkspace(id, workspaceId, organizationId);
    }

    @ApiOperation("删除文件用户")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsUserService.deleteUser(id);
    }

    @ApiOperation("文件用户列表")
    @GetMapping(value = "/listByAccount/{accountId}")
    public List<FsXskyUserDTO> listByAccount(@PathVariable String accountId) {
        return fsUserService.listUserByAccount(accountId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }
}
