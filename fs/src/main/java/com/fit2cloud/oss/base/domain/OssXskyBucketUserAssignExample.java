package com.fit2cloud.oss.base.domain;

import java.util.ArrayList;
import java.util.List;

public class OssXskyBucketUserAssignExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public OssXskyBucketUserAssignExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andBucketIdIsNull() {
            addCriterion("bucket_id is null");
            return (Criteria) this;
        }

        public Criteria andBucketIdIsNotNull() {
            addCriterion("bucket_id is not null");
            return (Criteria) this;
        }

        public Criteria andBucketIdEqualTo(Long value) {
            addCriterion("bucket_id =", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotEqualTo(Long value) {
            addCriterion("bucket_id <>", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdGreaterThan(Long value) {
            addCriterion("bucket_id >", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bucket_id >=", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdLessThan(Long value) {
            addCriterion("bucket_id <", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdLessThanOrEqualTo(Long value) {
            addCriterion("bucket_id <=", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdIn(List<Long> values) {
            addCriterion("bucket_id in", values, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotIn(List<Long> values) {
            addCriterion("bucket_id not in", values, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdBetween(Long value1, Long value2) {
            addCriterion("bucket_id between", value1, value2, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotBetween(Long value1, Long value2) {
            addCriterion("bucket_id not between", value1, value2, "bucketId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAssignerIdIsNull() {
            addCriterion("assigner_id is null");
            return (Criteria) this;
        }

        public Criteria andAssignerIdIsNotNull() {
            addCriterion("assigner_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerIdEqualTo(String value) {
            addCriterion("assigner_id =", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdNotEqualTo(String value) {
            addCriterion("assigner_id <>", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdGreaterThan(String value) {
            addCriterion("assigner_id >", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdGreaterThanOrEqualTo(String value) {
            addCriterion("assigner_id >=", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdLessThan(String value) {
            addCriterion("assigner_id <", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdLessThanOrEqualTo(String value) {
            addCriterion("assigner_id <=", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdLike(String value) {
            addCriterion("assigner_id like", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdNotLike(String value) {
            addCriterion("assigner_id not like", value, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdIn(List<String> values) {
            addCriterion("assigner_id in", values, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdNotIn(List<String> values) {
            addCriterion("assigner_id not in", values, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdBetween(String value1, String value2) {
            addCriterion("assigner_id between", value1, value2, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAssignerIdNotBetween(String value1, String value2) {
            addCriterion("assigner_id not between", value1, value2, "assignerId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdIsNull() {
            addCriterion("authuser_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdIsNotNull() {
            addCriterion("authuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdEqualTo(Long value) {
            addCriterion("authuser_id =", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdNotEqualTo(Long value) {
            addCriterion("authuser_id <>", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdGreaterThan(Long value) {
            addCriterion("authuser_id >", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("authuser_id >=", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdLessThan(Long value) {
            addCriterion("authuser_id <", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdLessThanOrEqualTo(Long value) {
            addCriterion("authuser_id <=", value, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdIn(List<Long> values) {
            addCriterion("authuser_id in", values, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdNotIn(List<Long> values) {
            addCriterion("authuser_id not in", values, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdBetween(Long value1, Long value2) {
            addCriterion("authuser_id between", value1, value2, "authuserId");
            return (Criteria) this;
        }

        public Criteria andAuthuserIdNotBetween(Long value1, Long value2) {
            addCriterion("authuser_id not between", value1, value2, "authuserId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Long value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Long value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Long value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Long> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andSqlCriterion(String value) {
            addCriterion("(" + value + ")");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oss_xsky_bucket_user_assign
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}