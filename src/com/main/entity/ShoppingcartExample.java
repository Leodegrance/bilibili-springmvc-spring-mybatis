package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartExample() {
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
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-07-23
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

        public Criteria andCartidIsNull() {
            addCriterion("cartID is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartID is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(String value) {
            addCriterion("cartID =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(String value) {
            addCriterion("cartID <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(String value) {
            addCriterion("cartID >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(String value) {
            addCriterion("cartID >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(String value) {
            addCriterion("cartID <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(String value) {
            addCriterion("cartID <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLike(String value) {
            addCriterion("cartID like", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotLike(String value) {
            addCriterion("cartID not like", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<String> values) {
            addCriterion("cartID in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<String> values) {
            addCriterion("cartID not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(String value1, String value2) {
            addCriterion("cartID between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(String value1, String value2) {
            addCriterion("cartID not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andShoopingidIsNull() {
            addCriterion("shoopingID is null");
            return (Criteria) this;
        }

        public Criteria andShoopingidIsNotNull() {
            addCriterion("shoopingID is not null");
            return (Criteria) this;
        }

        public Criteria andShoopingidEqualTo(String value) {
            addCriterion("shoopingID =", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidNotEqualTo(String value) {
            addCriterion("shoopingID <>", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidGreaterThan(String value) {
            addCriterion("shoopingID >", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidGreaterThanOrEqualTo(String value) {
            addCriterion("shoopingID >=", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidLessThan(String value) {
            addCriterion("shoopingID <", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidLessThanOrEqualTo(String value) {
            addCriterion("shoopingID <=", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidLike(String value) {
            addCriterion("shoopingID like", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidNotLike(String value) {
            addCriterion("shoopingID not like", value, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidIn(List<String> values) {
            addCriterion("shoopingID in", values, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidNotIn(List<String> values) {
            addCriterion("shoopingID not in", values, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidBetween(String value1, String value2) {
            addCriterion("shoopingID between", value1, value2, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingidNotBetween(String value1, String value2) {
            addCriterion("shoopingID not between", value1, value2, "shoopingid");
            return (Criteria) this;
        }

        public Criteria andShoopingnameIsNull() {
            addCriterion("shoopingName is null");
            return (Criteria) this;
        }

        public Criteria andShoopingnameIsNotNull() {
            addCriterion("shoopingName is not null");
            return (Criteria) this;
        }

        public Criteria andShoopingnameEqualTo(String value) {
            addCriterion("shoopingName =", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameNotEqualTo(String value) {
            addCriterion("shoopingName <>", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameGreaterThan(String value) {
            addCriterion("shoopingName >", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameGreaterThanOrEqualTo(String value) {
            addCriterion("shoopingName >=", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameLessThan(String value) {
            addCriterion("shoopingName <", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameLessThanOrEqualTo(String value) {
            addCriterion("shoopingName <=", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameLike(String value) {
            addCriterion("shoopingName like", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameNotLike(String value) {
            addCriterion("shoopingName not like", value, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameIn(List<String> values) {
            addCriterion("shoopingName in", values, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameNotIn(List<String> values) {
            addCriterion("shoopingName not in", values, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameBetween(String value1, String value2) {
            addCriterion("shoopingName between", value1, value2, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingnameNotBetween(String value1, String value2) {
            addCriterion("shoopingName not between", value1, value2, "shoopingname");
            return (Criteria) this;
        }

        public Criteria andShoopingimgIsNull() {
            addCriterion("shoopingImg is null");
            return (Criteria) this;
        }

        public Criteria andShoopingimgIsNotNull() {
            addCriterion("shoopingImg is not null");
            return (Criteria) this;
        }

        public Criteria andShoopingimgEqualTo(String value) {
            addCriterion("shoopingImg =", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgNotEqualTo(String value) {
            addCriterion("shoopingImg <>", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgGreaterThan(String value) {
            addCriterion("shoopingImg >", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgGreaterThanOrEqualTo(String value) {
            addCriterion("shoopingImg >=", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgLessThan(String value) {
            addCriterion("shoopingImg <", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgLessThanOrEqualTo(String value) {
            addCriterion("shoopingImg <=", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgLike(String value) {
            addCriterion("shoopingImg like", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgNotLike(String value) {
            addCriterion("shoopingImg not like", value, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgIn(List<String> values) {
            addCriterion("shoopingImg in", values, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgNotIn(List<String> values) {
            addCriterion("shoopingImg not in", values, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgBetween(String value1, String value2) {
            addCriterion("shoopingImg between", value1, value2, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingimgNotBetween(String value1, String value2) {
            addCriterion("shoopingImg not between", value1, value2, "shoopingimg");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageIsNull() {
            addCriterion("shoopingjiage is null");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageIsNotNull() {
            addCriterion("shoopingjiage is not null");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageEqualTo(String value) {
            addCriterion("shoopingjiage =", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageNotEqualTo(String value) {
            addCriterion("shoopingjiage <>", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageGreaterThan(String value) {
            addCriterion("shoopingjiage >", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageGreaterThanOrEqualTo(String value) {
            addCriterion("shoopingjiage >=", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageLessThan(String value) {
            addCriterion("shoopingjiage <", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageLessThanOrEqualTo(String value) {
            addCriterion("shoopingjiage <=", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageLike(String value) {
            addCriterion("shoopingjiage like", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageNotLike(String value) {
            addCriterion("shoopingjiage not like", value, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageIn(List<String> values) {
            addCriterion("shoopingjiage in", values, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageNotIn(List<String> values) {
            addCriterion("shoopingjiage not in", values, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageBetween(String value1, String value2) {
            addCriterion("shoopingjiage between", value1, value2, "shoopingjiage");
            return (Criteria) this;
        }

        public Criteria andShoopingjiageNotBetween(String value1, String value2) {
            addCriterion("shoopingjiage not between", value1, value2, "shoopingjiage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-07-23
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