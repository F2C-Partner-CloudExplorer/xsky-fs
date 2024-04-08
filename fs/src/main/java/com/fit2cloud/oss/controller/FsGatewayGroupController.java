package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsControllerHelper;
import com.fit2cloud.oss.dto.FsXskyGatewayGroupDTO;
import com.fit2cloud.oss.service.FsGatewayGroupService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "Xsky网关")
@RestController
@RequestMapping(value = "xsky/gatewayGroup" +
        "", headers = "Accept=application/json")
public class FsGatewayGroupController {
    @Resource
    private FsControllerHelper helper;
    @Resource
    private FsGatewayGroupService fsGatewayGroupService;

    @ApiOperation("文件系统客户端列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsXskyGatewayGroupDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsXskyGatewayGroupDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsGatewayGroupService.pagingGatewayGroup(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

    @ApiOperation("文件系统列表")
    @GetMapping(value = "/listByAccount/{accountId}/{type}")
    public List<FsXskyGatewayGroupDTO> listByAccount(@PathVariable String accountId, @PathVariable String type) {
        return fsGatewayGroupService.listFsGatewayGroupByAccount(accountId, type).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }

}
