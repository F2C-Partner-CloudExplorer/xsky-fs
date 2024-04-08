package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsNfsShareDTO;
import com.fit2cloud.oss.service.FsNfsShareAclService;
import com.fit2cloud.oss.service.FsNfsShareService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "nfs共享")
@RestController
@RequestMapping(value = "xsky/nfs/share", headers = "Accept=application/json")
public class FsNfsShareController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsNfsShareService fsNfsShareService;
    @Resource
    private FsNfsShareAclService fsNfsShareAclService;

    @ApiOperation("nfs共享列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsNfsShareDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsNfsShareDTO request) {
        List<Long> shareIds = fsNfsShareAclService.listShareIdsByAcl(request.getAccountId());
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsNfsShareService.pagingShare(request, shareIds).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("创建nfs共享")
    @PostMapping(value = "/create")
    public void create(@RequestBody FsNfsShareDTO record) {
        fsNfsShareService.createShare(record);
    }

    @ApiOperation("更新nfs共享")
    @PostMapping(value = "/update")
    public void update(@RequestBody FsNfsShareDTO record) {
        fsNfsShareService.updateShare(record);
    }

    @ApiOperation("删除nfs共享")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsNfsShareService.deleteShare(id);
    }

    @ApiOperation("授权工作空间")
    @GetMapping(value = "/bind/{id}/{organizationId}/{workspaceId}")
    public void update(@PathVariable Integer id, @PathVariable String organizationId, @PathVariable String workspaceId) {
        fsNfsShareService.bindWorkspace(id, workspaceId, organizationId);
    }
}
