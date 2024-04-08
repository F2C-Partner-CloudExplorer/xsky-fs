package com.fit2cloud.oss.common.constants;

import org.apache.commons.lang3.StringUtils;

/**
 *
 */
public class FsAclConstants {

    public enum AclType {
        user_group("用户组"), user("用户"),
        client("客户端"), client_group("客户端组");

        AclType(String explain) {
            this.explain = explain;
        }

        private String explain;

        public String getExplain() {
            return explain;
        }

        public static String getByName(String type) {
            for (AclType aclType : AclType.values()) {
                if (StringUtils.equals(type, aclType.name())) {
                    return aclType.getExplain();
                }
            }
            return "NAN";
        }
    }
}
