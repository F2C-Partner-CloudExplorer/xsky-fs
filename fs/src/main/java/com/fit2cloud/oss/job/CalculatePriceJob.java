package com.fit2cloud.oss.job;

import com.fit2cloud.commons.server.model.billing.BillingItem;
import com.fit2cloud.commons.server.service.BillingRecalculationService;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.service.FsFtpShareService;
import com.fit2cloud.oss.service.FsNfsShareService;
import com.fit2cloud.oss.service.FsSmbShareService;
import com.fit2cloud.quartz.anno.QuartzScheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class CalculatePriceJob {
    @Resource
    private BillingRecalculationService billingService;
    @Resource
    private FsFtpShareService fsFtpShareService;
    @Resource
    private FsNfsShareService fsNfsShareService;
    @Resource
    private FsSmbShareService fsSmbShareService;


    @QuartzScheduled(cron = "0,0 0,0 7 * * ?")
    public void calculateResourcePrice() {
        List<BillingItem> billingItems = new ArrayList<>();
        try {
            billingItems.addAll(fsFtpShareService.selectBillingItems());
            billingItems.addAll(fsNfsShareService.selectBillingItems());
            billingItems.addAll(fsSmbShareService.selectBillingItems());
        } catch (Exception e) {
            LogUtil.error("calculate price error: ", e);
            return;
        }
        for (BillingItem b : billingItems) {
//            billingService.charge(b);
        }
    }
}
