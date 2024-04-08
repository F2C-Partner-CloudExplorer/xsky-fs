package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.pluginmanager.CloudProviderManager;
import com.fit2cloud.commons.server.base.domain.PluginWithBLOBs;
import com.fit2cloud.commons.server.base.mapper.PluginMapper;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.sdk.ICloudProvider;
import com.fit2cloud.sdk.PluginException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author upeoe
 * @create 2018/10/24 14:24
 * Plugin service.
 */
@Service
public class PluginService {

    private Logger logger = LoggerFactory.getLogger("ossPluginLogger");

    private static final String ERR_PLUGIN_NOT_FOUND = "Plugin not found.";
    private static final String SECRET_CONTENT = "*** secret content ***";
    private static final String GET_CREDENTIAL_PAGE_TEMPLATE = "getCredentialPageTemplate";

    @Resource
    private PluginMapper pluginMapper;
    @Resource
    private CloudProviderManager cloudProviderManager;

    /**
     * Get all plugins.
     *
     * @return plugins
     */
    public List<PluginWithBLOBs> getAllPlugins() {
        return pluginMapper.selectByExampleWithBLOBs(null);
    }

    /**
     * Get plugin's credential template.
     *
     * @param pluginName plugin name
     * @return credential template
     */
    public Object getCredential(String pluginName) {
        try {
            Object cloudProvider = cloudProviderManager.getCloudProvider(pluginName);
            if (cloudProvider == null) {
                F2CException.throwException(ERR_PLUGIN_NOT_FOUND);
            }
            Method method = cloudProvider.getClass().getMethod(GET_CREDENTIAL_PAGE_TEMPLATE);
            return method.invoke(cloudProvider);
        } catch (Exception e) {
            LogUtil.error("获取Credential参数出错: " + pluginName, e);
            F2CException.throwException("获取插件参数失败");
            return "";
        }
    }

    public Object executePluginMethod(ICloudProvider cloudProvider, String method, Object... params) throws Exception {
        return executePluginMethod(cloudProvider, method, Object.class, params);
    }

    private <T> T executePluginMethod(ICloudProvider cloudProvider, String method, Class<T> resultType, Object... params) throws Exception {
        String requestId = UUID.randomUUID().toString();
        try {
            Object[] logContent = new Object[params.length];
            for (int i = 0; i < params.length; i++) {
                if (params[i] instanceof String) {
                    try {
                        JSONObject jsonObject = JSONObject.parseObject((String) params[i]);
                        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                            if (StringUtils.equalsIgnoreCase(entry.getKey(), "credential")) {
                                jsonObject.put(entry.getKey(), SECRET_CONTENT);
                            }

                            if (StringUtils.containsAny(entry.getKey().toLowerCase(), "password".toLowerCase(), "passwd".toLowerCase())) {
                                jsonObject.put(entry.getKey(), SECRET_CONTENT);
                            }
                        }
                        logContent[i] = jsonObject.toJSONString();
                        continue;
                    } catch (Exception ignored) {
                    }
                }
                logContent[i] = params[i];
            }

            logger.debug("RequestId: {}, Method: {}, Parameters: {}", requestId, method, JSONObject.toJSONString(logContent));
            Object result = MethodUtils.invokeMethod(cloudProvider, method, params);
            logger.debug("RequestId: {}, Result: {}", requestId, JSONObject.toJSONString(result));
            return resultType.cast(result);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof PluginException) {
                logger.error("RequestId: {}, Method: {}", requestId, method, targetException);
                throw (PluginException) targetException;
            }
        } catch (Exception e) {
            logger.error("RequestId: {}, Method: {}", requestId, method, e);
            throw e;
        }
        return null;
    }

}
