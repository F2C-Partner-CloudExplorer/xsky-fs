package com.fit2cloud.oss.controller;


import com.fit2cloud.oss.controller.helper.FsControllerHelper;
import com.fit2cloud.oss.dto.FsXskyPoolDTO;
import com.fit2cloud.oss.service.FsPoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "XSky存储池")
@RestController
@RequestMapping(value = "xsky/pool", headers = "Accept=application/json")
public class FsPoolController {
    @Resource
    private FsControllerHelper helper;
    @Resource
    private FsPoolService fsPoolService;

    @ApiOperation("文件客户端列表")
    @GetMapping(value = "/listByAccount/{accountId}")
    public List<FsXskyPoolDTO> listByAccount(@PathVariable String accountId) {
        return fsPoolService.listPoolByAccountId(accountId).stream()
                .map(helper::convert2DTO).collect(Collectors.toList());
    }
}
