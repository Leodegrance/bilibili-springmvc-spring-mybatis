package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class OrdertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdertableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @date 2018-07-18
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderusernameIsNull() {
            addCriterion("OrderuserName is null");
            return (Criteria) this;
        }

        public Criteria andOrderusernameIsNotNull() {
            addCriterion("OrderuserName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderusernameEqualTo(String value) {
            addCriterion("OrderuserName =", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameNotEqualTo(String value) {
            addCriterion("OrderuserName <>", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameGreaterThan(String value) {
            addCriterion("OrderuserName >", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderuserName >=", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameLessThan(String value) {
            addCriterion("OrderuserName <", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameLessThanOrEqualTo(String value) {
            addCriterion("OrderuserName <=", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameLike(String value) {
            addCriterion("OrderuserName like", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameNotLike(String value) {
            addCriterion("OrderuserName not like", value, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameIn(List<String> values) {
            addCriterion("OrderuserName in", values, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameNotIn(List<String> values) {
            addCriterion("OrderuserName not in", values, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameBetween(String value1, String value2) {
            addCriterion("OrderuserName between", value1, value2, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderusernameNotBetween(String value1, String value2) {
            addCriterion("OrderuserName not between", value1, value2, "orderusername");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameIsNull() {
            addCriterion("OrderIgridsName is null");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameIsNotNull() {
            addCriterion("OrderIgridsName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameEqualTo(String value) {
            addCriterion("OrderIgridsName =", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameNotEqualTo(String value) {
            addCriterion("OrderIgridsName <>", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameGreaterThan(String value) {
            addCriterion("OrderIgridsName >", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderIgridsName >=", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameLessThan(String value) {
            addCriterion("OrderIgridsName <", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameLessThanOrEqualTo(String value) {
            addCriterion("OrderIgridsName <=", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameLike(String value) {
            addCriterion("OrderIgridsName like", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameNotLike(String value) {
            addCriterion("OrderIgridsName not like", value, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameIn(List<String> values) {
            addCriterion("OrderIgridsName in", values, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameNotIn(List<String> values) {
            addCriterion("OrderIgridsName not in", values, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameBetween(String value1, String value2) {
            addCriterion("OrderIgridsName between", value1, value2, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrderigridsnameNotBetween(String value1, String value2) {
            addCriterion("OrderIgridsName not between", value1, value2, "orderigridsname");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgIsNull() {
            addCriterion("OrdergridsImg is null");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgIsNotNull() {
            addCriterion("OrdergridsImg is not null");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgEqualTo(String value) {
            addCriterion("OrdergridsImg =", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgNotEqualTo(String value) {
            addCriterion("OrdergridsImg <>", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgGreaterThan(String value) {
            addCriterion("OrdergridsImg >", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgGreaterThanOrEqualTo(String value) {
            addCriterion("OrdergridsImg >=", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgLessThan(String value) {
            addCriterion("OrdergridsImg <", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgLessThanOrEqualTo(String value) {
            addCriterion("OrdergridsImg <=", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgLike(String value) {
            addCriterion("OrdergridsImg like", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgNotLike(String value) {
            addCriterion("OrdergridsImg not like", value, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgIn(List<String> values) {
            addCriterion("OrdergridsImg in", values, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgNotIn(List<String> values) {
            addCriterion("OrdergridsImg not in", values, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgBetween(String value1, String value2) {
            addCriterion("OrdergridsImg between", value1, value2, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrdergridsimgNotBetween(String value1, String value2) {
            addCriterion("OrdergridsImg not between", value1, value2, "ordergridsimg");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbIsNull() {
            addCriterion("OrderzongRMB is null");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbIsNotNull() {
            addCriterion("OrderzongRMB is not null");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbEqualTo(String value) {
            addCriterion("OrderzongRMB =", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbNotEqualTo(String value) {
            addCriterion("OrderzongRMB <>", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbGreaterThan(String value) {
            addCriterion("OrderzongRMB >", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbGreaterThanOrEqualTo(String value) {
            addCriterion("OrderzongRMB >=", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbLessThan(String value) {
            addCriterion("OrderzongRMB <", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbLessThanOrEqualTo(String value) {
            addCriterion("OrderzongRMB <=", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbLike(String value) {
            addCriterion("OrderzongRMB like", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbNotLike(String value) {
            addCriterion("OrderzongRMB not like", value, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbIn(List<String> values) {
            addCriterion("OrderzongRMB in", values, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbNotIn(List<String> values) {
            addCriterion("OrderzongRMB not in", values, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbBetween(String value1, String value2) {
            addCriterion("OrderzongRMB between", value1, value2, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderzongrmbNotBetween(String value1, String value2) {
            addCriterion("OrderzongRMB not between", value1, value2, "orderzongrmb");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(String value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(String value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(String value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(String value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(String value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(String value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLike(String value) {
            addCriterion("OrderState like", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotLike(String value) {
            addCriterion("OrderState not like", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<String> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<String> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(String value1, String value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(String value1, String value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("OrderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("OrderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("OrderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("OrderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("OrderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("OrderTime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("OrderTime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("OrderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("OrderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("OrderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("OrderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrderaddrIsNull() {
            addCriterion("OrderAddr is null");
            return (Criteria) this;
        }

        public Criteria andOrderaddrIsNotNull() {
            addCriterion("OrderAddr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderaddrEqualTo(String value) {
            addCriterion("OrderAddr =", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrNotEqualTo(String value) {
            addCriterion("OrderAddr <>", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrGreaterThan(String value) {
            addCriterion("OrderAddr >", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrGreaterThanOrEqualTo(String value) {
            addCriterion("OrderAddr >=", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrLessThan(String value) {
            addCriterion("OrderAddr <", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrLessThanOrEqualTo(String value) {
            addCriterion("OrderAddr <=", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrLike(String value) {
            addCriterion("OrderAddr like", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrNotLike(String value) {
            addCriterion("OrderAddr not like", value, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrIn(List<String> values) {
            addCriterion("OrderAddr in", values, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrNotIn(List<String> values) {
            addCriterion("OrderAddr not in", values, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrBetween(String value1, String value2) {
            addCriterion("OrderAddr between", value1, value2, "orderaddr");
            return (Criteria) this;
        }

        public Criteria andOrderaddrNotBetween(String value1, String value2) {
            addCriterion("OrderAddr not between", value1, value2, "orderaddr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @date 2018-07-18
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