package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.constants.ResourceOperation;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.base.domain.Order;
import com.fit2cloud.oss.common.constants.FsConstants;
import com.fit2cloud.oss.common.constants.OrderConstants;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "订单管理")
@RestController
@RequestMapping(value = "order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping(value = "list/{goPage}/{pageSize}")
    @ApiOperation("查看订单")
    public Pager<List<OrderSearchDTO>> searchOrder(@RequestBody OrderDTO request, @PathVariable int goPage, @PathVariable int pageSize) {
        orderService.addPermissionFilter(request);
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, orderService.searchOrder(request));
    }

    @PostMapping("apply/folder")
    @ApiOperation("提交订单")
    public Order applyFolder(@RequestBody FsFolderRequest request) throws Exception {
        return orderService.createFolderOrder(request, OrderConstants.Type.CREATE_FOLDER, OrderConstants.MODEL_ID.folder_create,
                FsConstants.ORDER_TYPE.FOLDER_CREATE, ResourceOperation.CREATE, "文件系统申请");
    }

    @PostMapping("update/folder")
    @ApiOperation("变更文件系统")
    public Order updateFolder(@RequestBody FsFolderRequest request) throws Exception {
        return orderService.createFolderOrder(request, OrderConstants.Type.UPDATE_FOLDER, OrderConstants.MODEL_ID.folder_update,
                FsConstants.ORDER_TYPE.FOLDER_UPDATE, ResourceOperation.UPDATE, "文件系统变更");
    }

    @PostMapping("delete/folder")
    @ApiOperation("删除文件系统")
    public Order deleteFolder(@RequestBody FsFolderRequest request) throws Exception {
        return orderService.createFolderOrder(request, OrderConstants.Type.DELETE_FOLDER, OrderConstants.MODEL_ID.folder_delete,
                FsConstants.ORDER_TYPE.FOLDER_REMOVE, ResourceOperation.DELETE, "文件系统删除");
    }

    @PostMapping("apply/share")
    @ApiOperation("提交订单")
    public Order applyShare(@RequestBody FsShareRequest request) throws Exception {
        return orderService.createShareOrder(request, OrderConstants.Type.CREATE_SHARE, OrderConstants.MODEL_ID.share_create,
                FsConstants.ORDER_TYPE.SHARE_CREATE, ResourceOperation.CREATE, "文件共享删除");
    }

    @PostMapping("update/share")
    @ApiOperation("变更共享")
    public Order updateShare(@RequestBody FsShareRequest request) throws Exception {
        return orderService.createShareOrder(request, OrderConstants.Type.UPDATE_SHARE, OrderConstants.MODEL_ID.share_update,
                FsConstants.ORDER_TYPE.SHARE_UPDATE, ResourceOperation.UPDATE, "文件共享变更");
    }

    @PostMapping("delete/share")
    @ApiOperation("删除共享")
    public Order deleteShare(@RequestBody FsShareRequest request) throws Exception {
        return orderService.createShareOrder(request, OrderConstants.Type.DELETE_SHARE, OrderConstants.MODEL_ID.share_delete,
                FsConstants.ORDER_TYPE.SHARE_REMOVE, ResourceOperation.DELETE, "文件共享删除");
    }

    @GetMapping(value = "detail/readonly/{orderId}")
    @ApiOperation("查看订单项")
    public OrderDTO getOrderRODetail(@PathVariable String orderId) {
        return orderService.getOrderDetail(orderId);
    }

    @GetMapping(value = "status/{orderId}")
    public String getOrderStatus(@PathVariable String orderId) {
        return orderService.getOrderStatus(orderId);
    }

    @GetMapping(value = "process/{orderId}")
    public OrderDTO getOrderProcessInfo(@PathVariable String orderId) {
        return orderService.getOrderProcessInfo(orderId);
    }

    @GetMapping(value = "detail/{orderId}")
    @ApiOperation("处理订单")
    public OrderDTO getOrderDetail(@PathVariable String orderId) {
        return orderService.getOrderDetail(orderId);
    }

    @PostMapping(value = "approval")
    public void approval(@RequestBody OrderRequest orderRequest) throws Exception {
        orderService.checkOwner(orderRequest.getOrder().getProcessId());
        orderService.approval(orderRequest);
    }

    @GetMapping(value = "log/resourceId/{resourceId}")
    public Object getOrderItemLogByResource(@PathVariable String resourceId) {
        return orderService.getOrderItemLogByResourceId(resourceId);
    }

    @GetMapping(value = "log/orderId/{orderId}")
    public Object getOrderItemLogByOrder(@PathVariable String orderId) {
        return orderService.getOrderItemLogByOrderId(orderId);
    }

}

