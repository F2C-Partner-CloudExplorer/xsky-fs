package com.fit2cloud.oss.dto;

import com.alibaba.fastjson.JSON;

/**
 * @author upeoe
 * @create 2018/7/12 14:12
 */
public class GTMAuthnLoginDTO {
    private String username;
    private LoginReference loginReference;
    private String loginProviderName;
    private Token token;
    private Integer generation;
    private Long lastUpdateMicros;

    public static class LoginReference {
        private String link;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
    }

    public static class Token {
        private String token;
        private String name;
        private String userName;
        private String authProviderName;
        private User user;
        private String[] groupReferences;
        private Long timeout;
        private String startTime;
        private String address;
        private String partition;
        private Integer generation;
        private String lastUpdaateMicros;
        private String expirationMicros;
        private String kind;
        private String selfLink;

        public static class User {
            private String link;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            @Override
            public String toString() {
                return JSON.toJSONString(this);
            }
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAuthProviderName() {
            return authProviderName;
        }

        public void setAuthProviderName(String authProviderName) {
            this.authProviderName = authProviderName;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public String[] getGroupReferences() {
            return groupReferences;
        }

        public void setGroupReferences(String[] groupReferences) {
            this.groupReferences = groupReferences;
        }

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPartition() {
            return partition;
        }

        public void setPartition(String partition) {
            this.partition = partition;
        }

        public Integer getGeneration() {
            return generation;
        }

        public void setGeneration(Integer generation) {
            this.generation = generation;
        }

        public String getLastUpdaateMicros() {
            return lastUpdaateMicros;
        }

        public void setLastUpdaateMicros(String lastUpdaateMicros) {
            this.lastUpdaateMicros = lastUpdaateMicros;
        }

        public String getExpirationMicros() {
            return expirationMicros;
        }

        public void setExpirationMicros(String expirationMicros) {
            this.expirationMicros = expirationMicros;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getSelfLink() {
            return selfLink;
        }

        public void setSelfLink(String selfLink) {
            this.selfLink = selfLink;
        }

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LoginReference getLoginReference() {
        return loginReference;
    }

    public void setLoginReference(LoginReference loginReference) {
        this.loginReference = loginReference;
    }

    public String getLoginProviderName() {
        return loginProviderName;
    }

    public void setLoginProviderName(String loginProviderName) {
        this.loginProviderName = loginProviderName;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Long getLastUpdateMicros() {
        return lastUpdateMicros;
    }

    public void setLastUpdateMicros(Long lastUpdateMicros) {
        this.lastUpdateMicros = lastUpdateMicros;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
