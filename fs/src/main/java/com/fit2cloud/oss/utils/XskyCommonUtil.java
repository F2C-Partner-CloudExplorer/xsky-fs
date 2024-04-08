package com.fit2cloud.oss.utils;

import org.springframework.stereotype.Service;
import org.threeten.bp.OffsetDateTime;

@Service
public class XskyCommonUtil {
    public static String humpToLine(String str) {
        return str.replaceAll("[A-Z]", "_$0").toLowerCase();
    }

    public static long convertTime2Mills(OffsetDateTime time) {
        return time.toInstant().toEpochMilli();
    }

}
