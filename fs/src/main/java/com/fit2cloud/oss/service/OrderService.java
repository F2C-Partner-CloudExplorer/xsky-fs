package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSON;
import com.fit2cloud.commons.server.base.domain.FlowTask;
import com.fit2cloud.commons.server.base.mapper.FlowTaskMapper;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.commons.server.process.ProcessService;
import com.fit2cloud.commons.server.process.TaskService;
import com.fit2cloud.commons.server.service.OperationLogService;
import com.fit2cloud.commons.server.service.RoleCommonService;
import com.fit2cloud.commons.server.utils.IDGenerator;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.commons.utils.UUIDUtil;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsXskyAccountMapper;
import com.fit2cloud.oss.base.mapper.OrderItemLogMapper;
import com.fit2cloud.oss.base.mapper.OrderItemMapper;
import com.fit2cloud.oss.base.mapper.OrderMapper;
import com.fit2cloud.oss.base.mapper.ext.ExtOrderMapper;
import com.fit2cloud.oss.common.constants.FsConstants;
import com.fit2cloud.oss.common.constants.GeneralConstants;
import com.fit2cloud.oss.common.constants.OrderConstants;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.google.gson.Gson;
import io.swagger.models.auth.In;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional(rollbackFor = Exception.class)
public class OrderService {
    @Value("${spring.application.name:null}")
    private String moduleId;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderItemMapper orderItemMapper;
    @Resource
    private ProcessService processService;
    @Resource
    private WorkspaceService workspaceService;
    @Resource
    private RoleCommonService roleCommonService;
    @Resource
    private ExtOrderMapper extOrderMapper;
    @Resource
    private TaskService taskService;
    @Resource
    private FlowTaskMapper flowTaskMapper;
    @Resource
    private OrderItemLogMapper orderItemLogMapper;
    @Resource
    private FsSmbShareService fsSmbShareService;
    @Resource
    private FsFtpShareService fsFtpShareService;
    @Resource
    private FsXskyAccountMapper fsXskyAccountMapper;

    @Resource
    private QuotaService quotaService;

    public void addPermissionFilter(OrderDTO request) {
        String parentRoleId = SessionUtils.getUser().getParentRoleId();
        if (roleCommonService.isExtendUser(parentRoleId)) {
            String workspaceId = SessionUtils.getWorkspaceId();
            request.setWorkspaceId(workspaceId);
            request.setWorkspaceIds(Collections.singletonList(workspaceId));
        }

//        if (roleCommonService.isExtendOrgAdmin(parentRoleId)) {
//            String organizationId = SessionUtils.getOrganizationId();
//            List<Workspace> workspaces = workspaceService.selectWorkspacesByOrgId(organizationId);
//            List<String> workspaceIds = workspaces.stream().map(Workspace::getId).collect(Collectors.toList());
//            request.setWorkspaceIds(workspaceIds);
//        }
    }

    public List<OrderSearchDTO> searchOrder(OrderDTO request) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria =  example.createCriteria();
        Optional.ofNullable(request.getWorkspaceIds()).ifPresent(criteria::andWorkspaceIdIn);

        Optional.ofNullable(request.getStatus()).ifPresent(criteria::andStatusEqualTo);
        Optional.ofNullable(request.getApplyUser()).ifPresent(criteria::andApplyUserLike);
        Optional.ofNullable(request.getId()).ifPresent(criteria::andIdLike);
        Optional.ofNullable(request.getWorkspaceId()).ifPresent(criteria::andWorkspaceIdEqualTo);
        Optional.ofNullable(request.getCreateTimeStart()).ifPresent(criteria::andCreateTimeGreaterThan);
        Optional.ofNullable(request.getCreateTimeEnd()).ifPresent(criteria::andCreateTimeLessThan);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationIdEqualTo);

        example.setOrderByClause("create_time desc");

        List<Order> orderList = orderMapper.selectByExample(example);

        List<OrderSearchDTO> orderSearchDTOList = orderList.stream().map(order -> {
            OrderSearchDTO orderSearchDTO = new OrderSearchDTO();
            BeanUtils.copyProperties(order, orderSearchDTO);
            OrderDTO orderDTO = extOrderMapper.getOrderDetail(order.getId());
            if (ObjectUtils.isNotEmpty(orderDTO) && ObjectUtils.isNotEmpty(orderDTO.getOrderItemList())) {
                String details = null;
                for (OrderItem orderItem : orderDTO.getOrderItemList()) {
                    if (StringUtils.isNotEmpty(orderItem.getDetails())) {
                        details = orderItem.getDetails();
                    }
                }
                FsXskyFolder fsXskyFolder = JSON.parseObject(details, FsXskyFolder.class);
                String accountId = fsXskyFolder.getAccountId();
                //获取云账号
                FsXskyAccount fsXskyAccount = fsXskyAccountMapper.selectByPrimaryKey(accountId);
                if (ObjectUtils.isEmpty(fsXskyAccount)) {
                    orderSearchDTO.setAccount("当前订单账号已被删除");
                } else {
                    orderSearchDTO.setAccount(fsXskyAccount.getName());
                }
            } else {
                orderSearchDTO.setAccount("当前订单账号已被删除");
            }
            return orderSearchDTO;
        }).collect(Collectors.toList());
        return orderSearchDTOList;
    }

    public Order createFolderOrder(FsFolderRequest orderItemDTO, OrderConstants.Type type, OrderConstants.MODEL_ID modelId,
                                   FsConstants.ORDER_TYPE orderType, String resourceOperation, String resourceName) throws Exception {
//        quotaService.validateQuotaFolderCount(orderItemDTO.getFolder().getWorkspace(), 1);
//        quotaService.validateQuotaFolderSize(orderItemDTO.getFolder().getWorkspace(), orderItemDTO.getFolder().getSizeGB());
        if (type == OrderConstants.Type.UPDATE_FOLDER) {
           /* fsFolderService.checkUpdateFolder(orderItemDTO.getFolder());*/
        }
        if (type == OrderConstants.Type.CREATE_FOLDER) {
           /* fsFolderService.checkCreateFolder(orderItemDTO.getFolder());*/
        }

        Order order = createOrder(type, orderItemDTO.getDescription(),
                orderItemDTO.getFolder().getWorkspace(), orderItemDTO.getFolder().getOrganization());
        orderMapper.insertSelective(order);
        OrderItem orderItem = new OrderItem();
        orderItem.setId(UUIDUtil.newUUID());
        orderItem.setOrderId(order.getId());
        orderItem.setDetails(new Gson().toJson(orderItemDTO.getFolder()));
        orderItem.setStatus(OrderConstants.Status.UNCHECKED.name());
        orderItem.setCount(orderItemDTO.getCount());
        orderItem.setResourceType(FsConstants.RESOURCE_TYPE.FOLDER.name());
        orderItemMapper.insertSelective(orderItem);
        createProcess(order.getProcessId(), order.getId(), order.getApplyUser(), modelId);
        OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()),
                SessionUtils.getUser(), order.getId(), resourceName,
                orderType.name(), resourceOperation, "");
        return order;
    }

    public Order createShareOrder(FsShareRequest orderItemDTO, OrderConstants.Type type, OrderConstants.MODEL_ID modelId,
                                  FsConstants.ORDER_TYPE orderType, String resourceOperation, String resourceName) throws Exception {
        //校验同一类型 共享时不能选择相同的 文件网关组 和 文件用户
        if(orderItemDTO != null && (type.equals(OrderConstants.Type.CREATE_SHARE)
                || type.equals(OrderConstants.Type.UPDATE_SHARE))
                && (orderItemDTO.getShareType().equals("ftp")
                || orderItemDTO.getShareType().equals("smb"))){
            Integer integer = this.checkFolderGatewayAndFolderUser(orderItemDTO);
            if (integer > 0){
                F2CException.throwException("文件共享时不同的文件系统不能选择相同的文件网关组和文件用户!");
            }
        }
        Order order = null;
        String workspaceId=null;
        String organizationId=null;
        if (orderItemDTO.getShareType().equals("ftp")){
            workspaceId=orderItemDTO.getFtpShareDTO().getWorkspace();
            organizationId=orderItemDTO.getFtpShareDTO().getOrganization();
        }else if (orderItemDTO.getShareType().equals("nfs")){
            workspaceId=orderItemDTO.getNfsShareDTO().getWorkspace();
            organizationId=orderItemDTO.getNfsShareDTO().getOrganization();
        }else{
            workspaceId=orderItemDTO.getSmbShareDTO().getWorkspace();
            organizationId=orderItemDTO.getSmbShareDTO().getOrganization();
        }

        // 校验所需要的配额工作空间是否满足
        //获取所在工作空间的配额
        /*if (type.equals(OrderConstants.Type.CREATE_SHARE)){
            FolderQuotaSetting quotaSetting = quotaService.getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
            if(quotaSetting.getFolderAllocateResourceIfExceed().equals(GeneralConstants.Options.DEFAULT)){
                FolderQuotaSetting defaultQuota = quotaService.getDefaultQuota(FolderQuotaSetting.WORKSPACE_KEY);
                quotaSetting.setFolderAllocateResourceIfExceed(defaultQuota.getFolderAllocateResourceIfExceed());
            }
            if(!quotaSetting.getFolderAllocateResourceIfExceed().equals(GeneralConstants.Options.YES)){
                //获取当前数量
                Integer count = 1;
                if (count>(quotaSetting.getFolderCount()-quotaSetting.getFolderCountUsed())){
                    throw new BusinessException(ReturnCode.E600000, "工作空间配额不够");
                }
            }
        }*/

        order = createOrder(type, orderItemDTO.getDescription(),workspaceId, organizationId);
        orderMapper.insertSelective(order);
        OrderItem orderItem = new OrderItem();
        orderItem.setId(UUIDUtil.newUUID());
        orderItem.setOrderId(order.getId());
        GeneralConstants.PROTOCOL protocol = EnumUtils.getEnum(GeneralConstants.PROTOCOL.class,
                orderItemDTO.getShareType());
        switch (protocol) {
            case ftp:
                orderItem.setDetails(new Gson().toJson(orderItemDTO.getFtpShareDTO()));
                orderItem.setResourceType(FsConstants.RESOURCE_TYPE.FTP_SHARE.name());
                break;
            case nfs:
                orderItem.setDetails(new Gson().toJson(orderItemDTO.getNfsShareDTO()));
                orderItem.setResourceType(FsConstants.RESOURCE_TYPE.NFS_SHARE.name());
                break;
            case smb:
                orderItem.setDetails(new Gson().toJson(orderItemDTO.getSmbShareDTO()));
                orderItem.setResourceType(FsConstants.RESOURCE_TYPE.SMB_SHARE.name());
                break;
        }

        orderItem.setStatus(OrderConstants.Status.UNCHECKED.name());
        orderItem.setCount(1);
        orderItemMapper.insertSelective(orderItem);
        createProcess(order.getProcessId(), order.getId(), order.getApplyUser(), modelId);
        OperationLogService.log(workspaceService.selectWorkspaceById(order.getWorkspaceId()),
                SessionUtils.getUser(), order.getId(), resourceName,
                orderType.name(), resourceOperation, "");
        return order;
    }

    public String getOrderStatus(String orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        return Optional.ofNullable(order.getStatus()).orElse("");
    }

    public OrderDTO getOrderProcessInfo(String orderId) {
        OrderDTO orderProcessInfo = extOrderMapper.getOrderProcessInfo(orderId);
        if (orderProcessInfo == null) {
            F2CException.throwException("未找到订单:" + orderId + "的model id");
        }
        return orderProcessInfo;
    }

    private Order createOrder(OrderConstants.Type type, String description,
                              String workspaceId, String organizationId) {
        Order order = new Order();
        String orderId = IDGenerator.newBusinessId(OrderConstants.ORDER_ID_PREFIX, SessionUtils.getWorkspaceId());
        String processId = UUIDUtil.newUUID();
        order.setId(orderId);
        order.setApplyUser(SessionUtils.getUser().getId());
        order.setCreateTime(System.currentTimeMillis());
        if (StringUtils.isNotEmpty(workspaceId)){
            order.setWorkspaceId(workspaceId);
        }else {
            order.setWorkspaceId(SessionUtils.getWorkspaceId());
        }
        if (StringUtils.isNotEmpty(organizationId)){
            order.setOrganizationId(organizationId);
        }else {
            order.setOrganizationId(SessionUtils.getOrganizationId());
        }
        order.setStatus(OrderConstants.Status.UNCHECKED.name());
        order.setProcessId(processId);
        order.setType(type.name());
        order.setDescription(description);
        return order;
    }

    private void createProcess(String processId, String orderId, String creator, OrderConstants.MODEL_ID modelId) {
        processService.createProcess(modelId.name(), processId, creator, orderId, moduleId);
    }

//    public OrderDTO getOrderExtendInfo(String orderId) {
//        return extOrderMapper.getOrderExtendInfo(orderId);
//    }

    public OrderDTO getOrderDetail(String orderId) {
        return setOrderInfo(extOrderMapper.getOrderDetail(orderId));
    }

    public void checkOwner(String processId) throws Exception {
        String user = SessionUtils.getUser().getId();
        FlowTask lastTaskByAssignee = taskService.getLastTaskByAssignee(processId, user);
        if (lastTaskByAssignee == null) {
            throw new Exception("当前用户没有操作此订单的权限");
        }
    }

    public void approval(OrderRequest orderRequest) {
        FlowTask flowTask = flowTaskMapper.selectByPrimaryKey(orderRequest.getTaskId());
        flowTask.setTaskRemarks(orderRequest.getRemarks());
        taskService.complete(flowTask, null);
    }

    public void updateOrderStatus(String id, String status) {
        Order order = new Order();
        order.setId(id);
        order.setStatus(status);
        orderMapper.updateByPrimaryKeySelective(order);
    }

    void updateOrderItemStatus(String orderItemId, OrderConstants.Status status) {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(orderItemId);
        orderItem.setStatus(status.toString());
        orderItemMapper.updateByPrimaryKeySelective(orderItem);
    }

    int updateOrderStatus(String orderId, String oldStatus, String newStatus) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(orderId);
        if (StringUtils.isNotBlank(oldStatus)) {
            criteria.andStatusEqualTo(oldStatus);
        }
        Order sfOrder = new Order();
        sfOrder.setStatus(newStatus);
        return orderMapper.updateByExampleSelective(sfOrder, example);
    }

    void saveOrderItemLog(String orderItemId, String resourcePrimaryKey, String operation, String output, boolean success) {
        OrderItemLog sfOrderItemLog = new OrderItemLog();
        String operator = "system";
        try {
            if (SessionUtils.getUser() != null) {
                operator = SessionUtils.getUser().getId();
            }
        } catch (Exception e) {
            //防止单元测试无session
        }
        sfOrderItemLog.setOperator(operator);
        sfOrderItemLog.setCreateTime(System.currentTimeMillis());
        sfOrderItemLog.setOrderItemId(StringUtils.isBlank(orderItemId) ? StringUtils.EMPTY : orderItemId);
        sfOrderItemLog.setResourceId(resourcePrimaryKey);
        sfOrderItemLog.setOperation(operation);
        sfOrderItemLog.setOutput(output);
        sfOrderItemLog.setResult(success);
        orderItemLogMapper.insert(sfOrderItemLog);
    }

    public List<OrderItemLogDTO> getOrderItemLogByResourceId(String resourceId) {
        List<OrderItemLogDTO> result = new ArrayList<>();
        OrderItemLogDTO orderItemLogDTO = new OrderItemLogDTO();
        OrderItemLogExample orderItemLogExample = new OrderItemLogExample();
        orderItemLogExample.createCriteria().andResourceIdEqualTo(resourceId);
        orderItemLogExample.setOrderByClause("create_time");
        List<OrderItemLog> orderItemLogs = orderItemLogMapper.selectByExampleWithBLOBs(orderItemLogExample);
        orderItemLogDTO.setOrderItemLogList(orderItemLogs);
        if (CollectionUtils.isNotEmpty(orderItemLogs)) {
            OrderItem item = orderItemMapper.selectByPrimaryKey(orderItemLogs.get(0).getOrderItemId());
            orderItemLogDTO.setOrderItem(item);
        }
        result.add(orderItemLogDTO);
        return result;
    }

    public List<OrderItemLogDTO> getOrderItemLogByOrderId(String orderId) {
        List<OrderItemLogDTO> result = new ArrayList<>();
        OrderItemExample orderItemExample = new OrderItemExample();
        orderItemExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemExample);
        for (OrderItem orderItem : orderItems) {
            result.addAll(getOrderItemLogByOrderItemId(orderItem.getId()));
        }
        return result;
    }

    private List<OrderItemLogDTO> getOrderItemLogByOrderItemId(String orderItemId) {
        List<OrderItemLogDTO> result = new ArrayList<>();
        OrderItem orderItem = orderItemMapper.selectByPrimaryKey(orderItemId);
        if (orderItem != null) {
            OrderItemLogDTO orderItemLogDTO = new OrderItemLogDTO();
            orderItemLogDTO.setOrderItem(orderItem);
            OrderItemLogExample orderItemLogExample = new OrderItemLogExample();
            orderItemLogExample.createCriteria().andOrderItemIdEqualTo(orderItem.getId());
            orderItemLogExample.setOrderByClause("create_time");
            orderItemLogDTO.setOrderItemLogList(orderItemLogMapper.selectByExampleWithBLOBs(orderItemLogExample));
            result.add(orderItemLogDTO);
        }
        return result;
    }

    private OrderDTO setOrderInfo(OrderDTO orderDTO) {
        try {
            if (!CollectionUtils.isEmpty(orderDTO.getOrderItemList())) {
                for (OrderItem orderItem : orderDTO.getOrderItemList()) {
                    if(StringUtils.isEmpty(orderItem.getDetails())){
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.error("setOrderInfo error, orderId:" + orderDTO.getId(), e);
            //忽略异常，不做处理
        }
        return orderDTO;
    }

    /**
     * 校验文件网关组和文件用户
     * @param orderItemDTO
     * @return
     */
    private Integer checkFolderGatewayAndFolderUser(FsShareRequest orderItemDTO){
        Integer result = 0;
        //共享类型
        String shareType = orderItemDTO.getShareType();
        switch (shareType){
            case "ftp":
                FsFtpShareDTO ftpShareDTO = orderItemDTO.getFtpShareDTO();
                if (ftpShareDTO != null){
                    Long gatewayGroupId = ftpShareDTO.getGatewayGroupId();
                    List<Long> visitIdList = ftpShareDTO.getVisitIdList();
                    if (visitIdList.size() >0){
                        result = fsFtpShareService.checkSmbGatewayAndUser(gatewayGroupId, visitIdList).size();
                    }else{
                        LogUtil.info("visitIdList is null But visitGroupIdList :"+new Gson().toJson(ftpShareDTO.getVisitGroupIdList()));
                    }
                }else {
                    F2CException.throwException("参数校验失败！");
                }
                break;
            case "smb":
                FsSmbShareDTO smbShareDTO = orderItemDTO.getSmbShareDTO();
                if (smbShareDTO != null){
                    Long gatewayGroupId = smbShareDTO.getGatewayGroupId();
                    List<Long> visitIdList = smbShareDTO.getVisitIdList();
                    if (visitIdList.size() > 0){
                        result = fsSmbShareService.checkSmbGatewayAndUser(gatewayGroupId, visitIdList).size();
                    }else{
                        LogUtil.info("visitIdList is null But visitGroupIdList :"+new Gson().toJson(smbShareDTO.getVisitGroupIdList()));
                    }
                }else {
                    F2CException.throwException("参数校验失败！");
                }
                break;
        }
        return result;
    }

}

