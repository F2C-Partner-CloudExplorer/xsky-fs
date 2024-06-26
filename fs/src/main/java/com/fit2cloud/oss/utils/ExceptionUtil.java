package com.fit2cloud.oss.utils;

import com.fit2cloud.sdk.PluginException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.Collections;
import java.util.List;

public class ExceptionUtil {

    public static String getExceptionMsg(Throwable e) {
        try {
            List list = ExceptionUtils.getThrowableList(e);
            if (CollectionUtils.isNotEmpty(list)) {
                Collections.reverse(list);
                for (Object element : list) {
                    if (element instanceof PluginException) {
                        String exceptionMsg = ((PluginException) element).getMessage();
                        if (StringUtils.isNotBlank(exceptionMsg)) {
                            return exceptionMsg;
                        }
                    }
                }
            }
        } catch (Exception ignore) {
        }
        String exceptionMsg = ExceptionUtils.getRootCauseMessage(e);
        if (exceptionMsg.contains(": ")) {
            return exceptionMsg.substring(exceptionMsg.indexOf(": ") + 1);
        } else {
            return exceptionMsg;
        }
    }
}