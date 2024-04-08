package com.fit2cloud.oss.controller;


import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.controller.helper.FsControllerHelper;
import com.fit2cloud.oss.dto.FsXskyGatewayDTO;
import com.fit2cloud.oss.service.FsGatewayService;
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
@RequestMapping(value = "xsky/gateway", headers = "Accept=application/json")
public class FsGatewayController {
    @Resource
    private FsControllerHelper helper;
    @Resource
    private FsGatewayService fsGatewayService;

    @ApiOperation("文件系统客户端列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsXskyGatewayDTO>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsXskyGatewayDTO request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, fsGatewayService.pagingGateway(request).stream()
                .map(helper::convert2DTO).collect(Collectors.toList()));
    }

}
