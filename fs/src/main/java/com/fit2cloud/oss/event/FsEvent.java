package com.fit2cloud.oss.event;

import com.fit2cloud.commons.server.process.ProcessEvent;
import com.fit2cloud.commons.server.process.ProcessEventContext;
import com.fit2cloud.commons.utils.CommonBeanFactory;
import com.fit2cloud.oss.common.constants.OrderConstants;
import com.fit2cloud.oss.service.OrderService;
import org.apache.commons.lang3.StringUtils;

public class FsEvent implements ProcessEvent {

    @Override
    public void execute(ProcessEventContext context) {
        String param = context.getArguments();
        if (StringUtils.isBlank(param)) {
            return;
        }
        OrderConstants.Status status = OrderConstants.Status.valueOf(param);
        OrderService orderService = CommonBeanFactory.getBean(OrderService.class);
        String id = context.getProcess().getBusinessKey();
        orderService.updateOrderStatus(id, status.toString());
    }
}
