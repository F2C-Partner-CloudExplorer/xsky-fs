package com.fit2cloud.oss.service.ext;

import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.mapper.FsXskyAccountMapper;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ExtAccountService {

    @Resource
    private FsXskyAccountMapper accountMapper;

    /**
     * 判断存储桶是否存在
     *
     * @param accountId
     * @return
     */
    public FsXskyAccount getXskyAccount(String accountId) {
        if (null == accountId) {
            throw new BusinessException(ReturnCode.E400000, "Invalid XSky account.");
        }
        FsXskyAccount account = accountMapper.selectByPrimaryKey(accountId);
        if (null == account) {
            throw new BusinessException(ReturnCode.E500001, "Target XSky account not exists.");
        }
        return account;
    }
}
