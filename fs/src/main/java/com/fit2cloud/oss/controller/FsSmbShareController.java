package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsSmbShareDTO;
import com.fit2cloud.oss.service.FsSmbShareAclService;
import com.fit2cloud.oss.service.FsSmbShareService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import xio.sds.client.model.DfsRootfsRecord;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "Smb共享")
@RestController
@RequestMapping(value = "xsky/smb/share", headers = "Accept=application/json")
public class FsSmbShareController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsSmbShareService fsSmbShareService;
    @Resource
    private FsSmbShareAclService fsSmbShareAclService;

    @ApiOperation("smb共享列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsSmbShareDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsSmbShareDTO request) {
        List<Long> shareIds = fsSmbShareAclService.listShareIdsByAcl(request.getAccountId());
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsSmbShareService.pagingShare(request, shareIds).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("创建smb共享")
    @PostMapping(value = "/create")
    public void create(@RequestBody FsSmbShareDTO record) {
        fsSmbShareService.createShare(record);
    }

    @ApiOperation("更新smb共享")
    @PostMapping(value = "/update")
    public void update(@RequestBody FsSmbShareDTO record) {
        fsSmbShareService.updateShare(record);
    }

    @ApiOperation("删除ftp共享")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsSmbShareService.deleteShare(id);
    }

    @ApiOperation("实时获取分布式集群信息")
    @GetMapping("DfsRootfsesInfo/{accountId}")
    public List<DfsRootfsRecord> DfsRootfsesInfo(@PathVariable String accountId){
        return fsSmbShareService.DfsRootfsesInfo(accountId);
    }

    @ApiOperation("授权工作空间")
    @GetMapping(value = "/bind/{id}/{organizationId}/{workspaceId}")
    public void update(@PathVariable Integer id, @PathVariable String organizationId, @PathVariable String workspaceId) {
        fsSmbShareService.bindWorkspace(id, workspaceId, organizationId);
    }
}
