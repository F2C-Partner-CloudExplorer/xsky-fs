package com.fit2cloud.oss.job;

import com.fit2cloud.quartz.anno.QuartzScheduled;
import org.springframework.stereotype.Component;

@Component
public class SyncDemo {
    @QuartzScheduled(cron = "${cron.expression.oss}")
    public void syncCloudServer() {
        System.out.println("this is oss");
    }
}
