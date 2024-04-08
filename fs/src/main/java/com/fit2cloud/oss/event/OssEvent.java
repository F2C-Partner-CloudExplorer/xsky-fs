package com.fit2cloud.oss.event;

import com.fit2cloud.commons.server.process.ProcessEvent;
import com.fit2cloud.commons.server.process.ProcessEventContext;
import com.fit2cloud.commons.utils.CommonBeanFactory;
import com.fit2cloud.oss.common.constants.TicketConstants;
import com.fit2cloud.oss.service.AccountService;
import org.apache.commons.lang3.StringUtils;

public class OssEvent implements ProcessEvent {

    @Override
    public void execute(ProcessEventContext context) {
        String para = context.getArguments();
        if (StringUtils.isBlank(para)) {
            return;
        }
        TicketConstants.Status status = TicketConstants.Status.valueOf(para);
        AccountService bucketService = CommonBeanFactory.getBean(AccountService.class);
        String id = context.getProcess().getBusinessKey();
        //bucketService.updateOrderStatus(id, status.toString());
    }
}
