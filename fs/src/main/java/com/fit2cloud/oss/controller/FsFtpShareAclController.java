package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsShareControllerHelper;
import com.fit2cloud.oss.dto.FsFtpShareAclDTO;
import com.fit2cloud.oss.service.FsFtpShareAclService;
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
@RequestMapping(value = "xsky/ftp/share/acl", headers = "Accept=application/json")
public class FsFtpShareAclController {
    @Resource
    private FsShareControllerHelper helper;
    @Resource
    private FsFtpShareAclService fsFtpShareAclService;

    @ApiOperation("ftp共享acl列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsFtpShareAclDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsFtpShareAclDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsFtpShareAclService.pagingAcl(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("ftp共享acl列表")
    @GetMapping(value = "/listByShare/{accountId}/{shareId}")
    public List<FsFtpShareAclDTO> listByAccount(@PathVariable String accountId, @PathVariable Long shareId) {
        return fsFtpShareAclService.listAclByShare(accountId, shareId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }

//    @ApiOperation("创建ftp共享")
//    @PostMapping(value = "/create")
//    public void create(@RequestBody FsXskyUserDTO record) {
//        fsFtpShareService.createShare(record);
//    }

//    @ApiOperation("更新ftp共享")
//    @PostMapping(value = "/update")
//    public void update(@RequestBody FsXskyUserDTO record) {
//        fsFtpShareService.updateShare(record);
//    }

    @ApiOperation("删除ftp共享acl")
    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        fsFtpShareAclService.deleteAcl(id);
    }
}
