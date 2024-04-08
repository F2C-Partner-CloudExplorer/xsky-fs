package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsNfsShareAclDTO;
import com.fit2cloud.oss.service.FsNfsShareAclService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "nfs 共享 acl")
@RestController
@RequestMapping(value = "xsky/nfs/share/acl", headers = "Accept=application/json")
public class FsNfsShareAclController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsNfsShareAclService fsNfsShareAclService;

    @ApiOperation("nfs共享acl列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsNfsShareAclDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsNfsShareAclDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsNfsShareAclService.pagingAcl(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("nfs共享acl列表")
    @GetMapping(value = "/listByShare/{accountId}/{shareId}")
    public List<FsNfsShareAclDTO> listByAccount(@PathVariable String accountId, @PathVariable Long shareId) {
        return fsNfsShareAclService.listAclByShare(accountId, shareId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }


    @ApiOperation("删除 nfs共享acl")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsNfsShareAclService.deleteAcl(id);
    }
}
