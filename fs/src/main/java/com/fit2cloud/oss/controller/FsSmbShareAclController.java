package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsSmbShareAclDTO;
import com.fit2cloud.oss.service.FsSmbShareAclService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "smb 共享 acl")
@RestController
@RequestMapping(value = "xsky/smb/share/acl", headers = "Accept=application/json")
public class FsSmbShareAclController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsSmbShareAclService fsSmbShareAclService;

    @ApiOperation("smb共享acl列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsSmbShareAclDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsSmbShareAclDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsSmbShareAclService.pagingAcl(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("smb共享acl列表")
    @GetMapping(value = "/listByShare/{accountId}/{shareId}")
    public List<FsSmbShareAclDTO> listByAccount(@PathVariable String accountId, @PathVariable Long shareId) {
        return fsSmbShareAclService.listAclByShare(accountId, shareId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }

    @ApiOperation("删除 smb共享acl")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsSmbShareAclService.deleteAcl(id);
    }
}
