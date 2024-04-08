package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.pluginmanager.CloudProviderManager;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.sdk.ICloudProvider;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Map;

@Service
public class CommonService {

    private static final String CREDENTIAL = "credential";

    @Resource
    private PluginService pluginService;
    @Resource
    private CloudProviderManager cloudProviderManager;

/*
    public Object executePluginMethod(Account ossAccount, String method, Map<String, Object> extParams) throws Exception {
        if (ossAccount == null) {
            F2CException.throwException("未找到OSS账号.");
        }

        JSONObject object = new JSONObject();
        ICloudProvider cp = cloudProviderManager.getCloudProvider(ossAccount.getPluginName());
        object.put(CREDENTIAL, ossAccount.getCredential());

        if (MapUtils.isNotEmpty(extParams)) {
            object.putAll(extParams);
        }
        Object[] methodparams = new Object[1];
        methodparams[0] = object.toString();
        try {
            return pluginService.executePluginMethod(cp, method, methodparams);
        } catch (Exception e) {
            LogUtil.error(String.format("执行Method:%s异常，Method Params:%s, OSS Account ID:%s.",
                    method, extParams.toString(), ossAccount.getId()));
            return new ArrayList<>();
        }
    }
*/
}
