package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.Organization;
import com.fit2cloud.commons.server.base.domain.Workspace;
import com.fit2cloud.commons.utils.PageUtils;
import com.fit2cloud.commons.utils.Pager;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.service.AccountService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author yan chao
 * @create 2020/10/24 12:02
 * OSS account controller.
 */
@RestController
@RequestMapping(value = "/xsky/account")
@Api(tags = "xsky账号")
public class AccountController {

    @Resource
    private AccountService accountService;

    @ApiOperation("XSKY账号列表")
    @PostMapping(value = "/list/{goPage}/{pageSize}")
    public Pager <List <FsXskyAccount>> list(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody FsXskyAccount request) {
        Page page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, accountService.pagingAccount(request));
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createAccount(@RequestBody FsXskyAccount account) {
            accountService.createAccount(account);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateAccount(@RequestBody FsXskyAccount account) {
            accountService.updateAccount(account);
    }

    @RequestMapping(value = "/delete/{id}")
    public Object deleteAccount(@PathVariable String id) {
        try {
            accountService.deleteAccount(id);
            return new ResultHolder();
        } catch (Exception e) {
            return new ResultHolder(false, e.getMessage());
        }
    }

    @RequestMapping(value = "/validate/{accountId}")
    public void validateAccount(@PathVariable String accountId) {
            accountService.validateAccount(accountId);
    }

    @RequestMapping(value = "/sync/{accountId}")
    public void syncAccount(@PathVariable String accountId) {
        accountService.syncResources(accountId);
    }


    @RequestMapping(value = "/org/list")
    public List<Organization> getOrgModels() {
        return accountService.getOrgModels();
    }

    @RequestMapping(value = "/getAllAccounts")
    public List<FsXskyAccount> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(value = "/getAllWorkSpaceByOrgId/{id}")
    public List<Workspace> getAllWorkSpaceByOrgId(@PathVariable String id) {
        return accountService.getAllWorkSpaceByOrgId(id);
    }

    @RequestMapping(value = "/getAllWorkSpace")
    public List<Workspace> getAllWorkSpace() {
        return accountService.getAllWorkspace();
    }
}
