package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.FlowProcessLog;
import com.fit2cloud.commons.server.base.domain.FlowTask;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.commons.server.process.TaskService;
import com.fit2cloud.commons.server.utils.SessionUtils;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "待办管理")
@RestController
@RequestMapping(value = "task")
public class TaskController {
    @Resource
    private TaskService taskService;

    @PostMapping(value = "/reject")
    public void reject(@RequestBody FlowTask task) {
        FlowTask flowTask = taskService.getTask(task.getTaskId());
        if (flowTask == null) {
            F2CException.throwException("未找到flow_task:" + task.getTaskId());
        }
        FlowTask lastTaskByAssignee = taskService.getLastTaskByAssignee(flowTask.getProcessId(), SessionUtils.getUser().getId());
        if (lastTaskByAssignee == null) {
            F2CException.throwException("当前用户没有操作此订单的权限");
        }
        flowTask.setTaskRemarks(task.getTaskRemarks());
        taskService.reject(flowTask);
    }

    @GetMapping(value = "/logs/{processId}")
    public List<FlowProcessLog> listTaskLog(@PathVariable String processId) {
        return taskService.listTaskLog(processId);
    }
}
