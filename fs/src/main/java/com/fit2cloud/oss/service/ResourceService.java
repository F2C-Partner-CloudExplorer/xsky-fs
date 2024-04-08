package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.constants.ResourceOperation;
import com.fit2cloud.commons.server.service.OperationLogService;
import com.fit2cloud.commons.utils.BeanUtils;
import com.fit2cloud.commons.utils.CommonThreadPool;
import com.fit2cloud.commons.utils.GlobalConfigurations;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.OrderItemMapper;
import com.fit2cloud.oss.base.mapper.OrderMapper;
import com.fit2cloud.oss.common.constants.FsConstants;
import com.fit2cloud.oss.common.constants.OrderConstants;
import com.fit2cloud.oss.dto.FsFtpShareDTO;
import com.fit2cloud.oss.dto.FsNfsShareDTO;
import com.fit2cloud.oss.dto.FsSmbShareDTO;
import com.fit2cloud.oss.dto.FsXskyFolderDTO;
import com.fit2cloud.oss.utils.ExceptionUtil;
import com.google.gson.Gson;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
@EnableScheduling
public class ResourceService {
    // 每个工作空间只有一个订单在处理，防止配额超卖
    private static ConcurrentHashMap<String, String> processingGroupIdMap = new ConcurrentHashMap<>();

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private CommonThreadPool commonThreadPool;
    @Resource
    private OrderService orderService;
    @Resource
    private OrderItemMapper orderItemMapper;
    @Resource
    private WorkspaceService workspaceService;
    /*@Resource
    private FsFolderService fsFolderService;*/
    @Resource
    private FsNfsShareService fsNfsShareService;
    @Resource
    private FsSmbShareService fsSmbShareService;
    @Resource
    private FsFtpShareService fsFtpShareService;

    @Scheduled(fixedRate = 10000)
    public void handleOrders() {
        if (!GlobalConfigurations.isReleaseMode()) {
            return;
        }
        final OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andStatusEqualTo(OrderConstants.Status.APPROVED.toString());
        if (CollectionUtils.isNotEmpty(processingGroupIdMap.keySet())) {
            criteria.andWorkspaceIdNotIn(new ArrayList<>(processingGroupIdMap.keySet()));
        }
        orderExample.setOrderByClause("create_time limit 10");
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        if (CollectionUtils.isNotEmpty(orderList)) {
            orderList.forEach(order -> {
                LogUtil.info("handling order: {}", JSONObject.toJSONString(order));
                final Order orderToBeProceed = BeanUtils.copyBean(new Order(), order);
                if (processingGroupIdMap.get(orderToBeProceed.getApplyUser()) != null) {
                    return;
                }
                commonThreadPool.addTask(() -> {
                    try {
                        if (processingGroupIdMap.get(orderToBeProceed.getApplyUser()) != null) {
                            return;
                        }
                        processingGroupIdMap.put(orderToBeProceed.getApplyUser(), orderToBeProceed.getId());
                        handleOrder(orderToBeProceed);
                    } catch (Exception e) {
                        LogUtil.error(e);
                    } finally {
                        processingGroupIdMap.remove(orderToBeProceed.getApplyUser());
                    }
                });
            });
        }
    }

    public void handleOrder(Order order) {
        String orderId = order.getId();
        int i = orderService.updateOrderStatus(orderId, OrderConstants.Status.APPROVED.toString(), OrderConstants.Status.PROCESSING.toString());
        if (i == 0) {
            return;
        }
        try {
            OrderItemExample orderItemExample = new OrderItemExample();
            orderItemExample.createCriteria().andOrderIdEqualTo(orderId).andStatusEqualTo(OrderConstants.Status.UNCHECKED.name());
            List<OrderItem> OrderItem = orderItemMapper.selectByExampleWithBLOBs(orderItemExample);
            int successCount = 0;
            for (com.fit2cloud.oss.base.domain.OrderItem orderItem : OrderItem) {
                if (LogUtil.getLogger().isDebugEnabled()) {
                    LogUtil.getLogger().debug("handling orderItem: {}", JSONObject.toJSONString(orderItem));
                }
                if (handleOrderItem(BeanUtils.copyBean(new OrderItem(), orderItem), order)) {
                    successCount++;
                }
            }
            if (OrderItem.size() > 0 && successCount == 0) {
                throw new Exception("Faild to handle all orderItems, orderId: " + order.getId());
            }
            String orderStatus = OrderConstants.Status.FINISHED.toString();
            if (successCount != OrderItem.size()) {
                orderStatus = OrderConstants.Status.WARNING.toString();
            }
            orderService.updateOrderStatus(orderId, null, orderStatus);
//            processMessageService.sendProcessMessage(orderId, ProcessConstants.MessageOperation.BUSINESS_COMPLETE, params);
        } catch (Exception e) {
            orderService.updateOrderStatus(orderId, null, OrderConstants.Status.ERROR.toString());
            LogUtil.error("handleOrder, orderId: " + orderId, e);
        }
    }

    private boolean handleOrderItem(OrderItem orderItem, Order order) {
        orderService.updateOrderItemStatus(orderItem.getId(), OrderConstants.Status.PROCESSING);
        try {
            switch (orderItem.getResourceType()) {
                case "FOLDER":
                    if (StringUtils.contains(order.getType(), "CREATE")) {
                        createFolder(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "UPDATE")) {
                        updateFolder(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "DELETE")) {
                        deleteFolder(orderItem, order);
                    }
                    break;
                case "NFS_SHARE":
                    if (StringUtils.contains(order.getType(), "CREATE")) {
                        createNfsShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "UPDATE")) {
                        updateNfsShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "DELETE")) {
                        deleteNfsShare(orderItem, order);
                    }
                    break;
                case "FTP_SHARE":
                    if (StringUtils.contains(order.getType(), "CREATE")) {
                        createFtpShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "UPDATE")) {
                        updateFtpShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "DELETE")) {
                        deleteFtpShare(orderItem, order);
                    }
                    break;
                case "SMB_SHARE":
                    if (StringUtils.contains(order.getType(), "CREATE")) {
                        createSmbShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "UPDATE")) {
                        updateSmbShare(orderItem, order);
                    }
                    if (StringUtils.contains(order.getType(), "DELETE")) {
                        deleteSmbShare(orderItem, order);
                    }
                    break;
                default:
                    break;
            }

            orderService.updateOrderItemStatus(orderItem.getId(), OrderConstants.Status.FINISHED);
            return true;
        } catch (Exception e) {
            orderService.updateOrderItemStatus(orderItem.getId(), OrderConstants.Status.ERROR);
            LogUtil.error("handleOrderItem, orderItemId: " + orderItem.getId(), e);
            // 一个处理失败了，其余继续
//            throw e;
            return false;
        }
    }


    private void createFolder(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("createResource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "创建文件系统";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsXskyFolderDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsXskyFolderDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getName(), "开始: " + operation, StringUtils.EMPTY, true);

           /* FsXskyFolder xskyFolder = fsFolderService.createFolder(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("resource created: {}", new Gson().toJson(xskyFolder));
            }

            orderService.saveOrderItemLog(orderItemId, xskyFolder.getName(), "结束: " + operation, "资源名称: " + xskyFolder.getName(), true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, xskyFolder.getName(),
                    FsConstants.RESOURCE_TYPE.FOLDER.name(), ResourceOperation.CREATE, "文件系统");*/
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("createResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void updateFolder(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("update Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "变更文件系统";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsXskyFolderDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsXskyFolderDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getName(), "开始: " + operation, StringUtils.EMPTY, true);

           /* FsXskyFolder xskyFolder = fsFolderService.updateFolder(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("update created: {}", new Gson().toJson(xskyFolder));
            }

            orderService.saveOrderItemLog(orderItemId, xskyFolder.getName(), "结束: " + operation, "资源名称: " + xskyFolder.getName(), true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, xskyFolder.getName(),
                    FsConstants.RESOURCE_TYPE.FOLDER.name(), ResourceOperation.UPDATE, "文件系统");*/
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("updateResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void deleteFolder(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("delete Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "删除文件系统";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsXskyFolderDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsXskyFolderDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getName(), "开始: " + operation, StringUtils.EMPTY, true);

           // fsFolderService.deleteFolder(params.getId());
            orderService.saveOrderItemLog(orderItemId, params.getName(), "结束: " + operation, "文件系统名称: " + params.getName(), true);
            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, params.getName(),
                    FsConstants.RESOURCE_TYPE.FOLDER.name(), ResourceOperation.DELETE, "文件系统");

        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("delete Resource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void createNfsShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("createResource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "创建NFS文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsNfsShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsNfsShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsNfsShare nfsShare = fsNfsShareService.createShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("resource created: {}", new Gson().toJson(nfsShare));
            }

            orderService.saveOrderItemLog(orderItemId, nfsShare.getFolderName(), "结束: " + operation, "文件共享: /" + nfsShare.getFolderName() + "/", true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, nfsShare.getFolderName(),
                    FsConstants.RESOURCE_TYPE.NFS_SHARE.name(), ResourceOperation.CREATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("createResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void updateNfsShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("update Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "变更NFS文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsNfsShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsNfsShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsNfsShare nfsShare = fsNfsShareService.updateShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("update created: {}", new Gson().toJson(nfsShare));
            }

            orderService.saveOrderItemLog(orderItemId, nfsShare.getFolderName(), "结束: " + operation, "文件共享: /" + nfsShare.getFolderName() + "/", true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, nfsShare.getFolderName(),
                    FsConstants.RESOURCE_TYPE.NFS_SHARE.name(), ResourceOperation.UPDATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("updateResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void deleteNfsShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("delete Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "删除Nfs文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsNfsShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsNfsShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            fsNfsShareService.deleteShare(params.getId());
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "结束: " + operation, "文件共享: /" + params.getFolderName() + "/", true);
            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, params.getFolderName(),
                    FsConstants.RESOURCE_TYPE.NFS_SHARE.name(), ResourceOperation.DELETE, "文件共享");

        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("delete Resource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void createFtpShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("createResource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "创建FTP文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsFtpShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsFtpShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsFtpShare share = fsFtpShareService.createShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("resource created: {}", new Gson().toJson(share));
            }

            orderService.saveOrderItemLog(orderItemId, share.getFolderName(), "结束: " + operation, "文件共享: /" + share.getFolderName() + "/", true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, share.getFolderName(),
                    FsConstants.RESOURCE_TYPE.FTP_SHARE.name(), ResourceOperation.CREATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("createResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void updateFtpShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("update Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "变更Ftp文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsFtpShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsFtpShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsFtpShare share = fsFtpShareService.updateShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("update created: {}", new Gson().toJson(share));
            }

            orderService.saveOrderItemLog(orderItemId, share.getFolderName(), "结束: " + operation, "文件共享: /" + share.getFolderName() + "/", true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, share.getFolderName(),
                    FsConstants.RESOURCE_TYPE.FTP_SHARE.name(), ResourceOperation.UPDATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("updateResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void deleteFtpShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("delete Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "删除Ftp文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsFtpShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsFtpShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            fsFtpShareService.deleteShare(params.getId());
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "结束: " + operation, "文件共享: /" + params.getFolderName() + "/", true);
            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, params.getFolderName(),
                    FsConstants.RESOURCE_TYPE.FTP_SHARE.name(), ResourceOperation.DELETE, "文件共享");

        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("delete Resource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void createSmbShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("createResource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "创建SMB文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsSmbShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsSmbShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsSmbShare share = fsSmbShareService.createShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("resource created: {}", new Gson().toJson(share));
            }

            orderService.saveOrderItemLog(orderItemId, share.getFolderName(), "结束: " + operation, "文件共享: " + share.getName(), true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, share.getName(),
                    FsConstants.RESOURCE_TYPE.SMB_SHARE.name(), ResourceOperation.CREATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("createResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void updateSmbShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("update Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "变更Smb文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsSmbShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsSmbShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            FsSmbShare share = fsSmbShareService.updateShare(params);

            if (LogUtil.getLogger().isDebugEnabled()) {
                LogUtil.getLogger().debug("update created: {}", new Gson().toJson(share));
            }

            orderService.saveOrderItemLog(orderItemId, share.getFolderName(), "结束: " + operation, "文件共享: " + share.getName(), true);

            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, share.getName(),
                    FsConstants.RESOURCE_TYPE.SMB_SHARE.name(), ResourceOperation.UPDATE, "文件共享");
        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("updateResource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    private void deleteSmbShare(OrderItem orderItem, Order order) throws Exception {
        LogUtil.getLogger().info("delete Resource for orderItem: {}", JSONObject.toJSONString(orderItem));
        String operation = "删除Smb文件共享";

        String orderItemId = orderItem.getId();
        try {
            OrderItem tmpSfOrderItem = BeanUtils.copyBean(new OrderItem(), orderItem);
            FsSmbShareDTO params = new Gson().fromJson(tmpSfOrderItem.getDetails(), FsSmbShareDTO.class);
            tmpSfOrderItem.setCount(1);
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "开始: " + operation, StringUtils.EMPTY, true);

            fsSmbShareService.deleteShare(params.getId());
            orderService.saveOrderItemLog(orderItemId, params.getFolderName(), "结束: " + operation, "文件共享: " + params.getName(), true);
            OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()), null, null, params.getName(),
                    FsConstants.RESOURCE_TYPE.SMB_SHARE.name(), ResourceOperation.DELETE, "文件共享");

        } catch (Exception e) {
            orderService.saveOrderItemLog(orderItemId, null, "异常: " + operation, ExceptionUtil.getExceptionMsg(e), false);
            LogUtil.error("delete Resource, orderItemId: " + orderItemId, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }
}
