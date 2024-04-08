package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsFtpShareDTO;
import com.fit2cloud.oss.service.FsFtpShareAclService;
import com.fit2cloud.oss.service.FsFtpShareService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "ftp共享")
@RestController
@RequestMapping(value = "xsky/ftp/share", headers = "Accept=application/json")
public class FsFtpShareController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsFtpShareService fsFtpShareService;
    @Resource
    private FsFtpShareAclService fsFtpShareAclService;

    @ApiOperation("ftp共享列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsFtpShareDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsFtpShareDTO request) {
        List<Long> shareIds = fsFtpShareAclService.listShareIdsByAcl(request.getAccountId());
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsFtpShareService.pagingShare(request, shareIds).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("创建ftp共享")
    @PostMapping(value = "/create")
    public void create(@RequestBody FsFtpShareDTO record) {
        fsFtpShareService.createShare(record);
    }

    @ApiOperation("更新ftp共享")
    @PostMapping(value = "/update")
    public void update(@RequestBody FsFtpShareDTO record) {
        fsFtpShareService.updateShare(record);
    }

    @ApiOperation("删除ftp共享")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsFtpShareService.deleteShare(id);
    }

    @ApiOperation("授权工作空间")
    @GetMapping(value = "/bind/{id}/{organizationId}/{workspaceId}")
    public void update(@PathVariable Integer id, @PathVariable String organizationId, @PathVariable String workspaceId) {
        fsFtpShareService.bindWorkspace(id, workspaceId, organizationId);
    }
}
