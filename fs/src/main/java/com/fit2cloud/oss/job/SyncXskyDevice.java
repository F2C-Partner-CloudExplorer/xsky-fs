package com.fit2cloud.oss.job;

import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.service.AccountService;
import com.fit2cloud.quartz.anno.QuartzScheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class SyncXskyDevice {
    @Resource
    private AccountService accountService;

    @QuartzScheduled(cron = "0 0 * * * ?")
    public void syncXSkyData() {
        List<FsXskyAccount> accountList =  accountService.getAllValidAccounts();
        for (FsXskyAccount account : accountList) {
            accountService.syncResources(account.getId());
        }
    }
}
