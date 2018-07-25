package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class ForumreplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumreplyExample() {
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

        public Criteria andReplyidIsNull() {
            addCriterion("replyid is null");
            return (Criteria) this;
        }

        public Criteria andReplyidIsNotNull() {
            addCriterion("replyid is not null");
            return (Criteria) this;
        }

        public Criteria andReplyidEqualTo(String value) {
            addCriterion("replyid =", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotEqualTo(String value) {
            addCriterion("replyid <>", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThan(String value) {
            addCriterion("replyid >", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThanOrEqualTo(String value) {
            addCriterion("replyid >=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThan(String value) {
            addCriterion("replyid <", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThanOrEqualTo(String value) {
            addCriterion("replyid <=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLike(String value) {
            addCriterion("replyid like", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotLike(String value) {
            addCriterion("replyid not like", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidIn(List<String> values) {
            addCriterion("replyid in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotIn(List<String> values) {
            addCriterion("replyid not in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidBetween(String value1, String value2) {
            addCriterion("replyid between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotBetween(String value1, String value2) {
            addCriterion("replyid not between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyneirongIsNull() {
            addCriterion("replyneirong is null");
            return (Criteria) this;
        }

        public Criteria andReplyneirongIsNotNull() {
            addCriterion("replyneirong is not null");
            return (Criteria) this;
        }

        public Criteria andReplyneirongEqualTo(String value) {
            addCriterion("replyneirong =", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongNotEqualTo(String value) {
            addCriterion("replyneirong <>", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongGreaterThan(String value) {
            addCriterion("replyneirong >", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongGreaterThanOrEqualTo(String value) {
            addCriterion("replyneirong >=", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongLessThan(String value) {
            addCriterion("replyneirong <", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongLessThanOrEqualTo(String value) {
            addCriterion("replyneirong <=", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongLike(String value) {
            addCriterion("replyneirong like", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongNotLike(String value) {
            addCriterion("replyneirong not like", value, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongIn(List<String> values) {
            addCriterion("replyneirong in", values, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongNotIn(List<String> values) {
            addCriterion("replyneirong not in", values, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongBetween(String value1, String value2) {
            addCriterion("replyneirong between", value1, value2, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplyneirongNotBetween(String value1, String value2) {
            addCriterion("replyneirong not between", value1, value2, "replyneirong");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("replytime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("replytime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(String value) {
            addCriterion("replytime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(String value) {
            addCriterion("replytime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(String value) {
            addCriterion("replytime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("replytime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(String value) {
            addCriterion("replytime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(String value) {
            addCriterion("replytime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLike(String value) {
            addCriterion("replytime like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotLike(String value) {
            addCriterion("replytime not like", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<String> values) {
            addCriterion("replytime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<String> values) {
            addCriterion("replytime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(String value1, String value2) {
            addCriterion("replytime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(String value1, String value2) {
            addCriterion("replytime not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplyhandIsNull() {
            addCriterion("replyhand is null");
            return (Criteria) this;
        }

        public Criteria andReplyhandIsNotNull() {
            addCriterion("replyhand is not null");
            return (Criteria) this;
        }

        public Criteria andReplyhandEqualTo(String value) {
            addCriterion("replyhand =", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandNotEqualTo(String value) {
            addCriterion("replyhand <>", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandGreaterThan(String value) {
            addCriterion("replyhand >", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandGreaterThanOrEqualTo(String value) {
            addCriterion("replyhand >=", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandLessThan(String value) {
            addCriterion("replyhand <", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandLessThanOrEqualTo(String value) {
            addCriterion("replyhand <=", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandLike(String value) {
            addCriterion("replyhand like", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandNotLike(String value) {
            addCriterion("replyhand not like", value, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandIn(List<String> values) {
            addCriterion("replyhand in", values, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandNotIn(List<String> values) {
            addCriterion("replyhand not in", values, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandBetween(String value1, String value2) {
            addCriterion("replyhand between", value1, value2, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplyhandNotBetween(String value1, String value2) {
            addCriterion("replyhand not between", value1, value2, "replyhand");
            return (Criteria) this;
        }

        public Criteria andReplytieziidIsNull() {
            addCriterion("replytieziid is null");
            return (Criteria) this;
        }

        public Criteria andReplytieziidIsNotNull() {
            addCriterion("replytieziid is not null");
            return (Criteria) this;
        }

        public Criteria andReplytieziidEqualTo(String value) {
            addCriterion("replytieziid =", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidNotEqualTo(String value) {
            addCriterion("replytieziid <>", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidGreaterThan(String value) {
            addCriterion("replytieziid >", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidGreaterThanOrEqualTo(String value) {
            addCriterion("replytieziid >=", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidLessThan(String value) {
            addCriterion("replytieziid <", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidLessThanOrEqualTo(String value) {
            addCriterion("replytieziid <=", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidLike(String value) {
            addCriterion("replytieziid like", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidNotLike(String value) {
            addCriterion("replytieziid not like", value, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidIn(List<String> values) {
            addCriterion("replytieziid in", values, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidNotIn(List<String> values) {
            addCriterion("replytieziid not in", values, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidBetween(String value1, String value2) {
            addCriterion("replytieziid between", value1, value2, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplytieziidNotBetween(String value1, String value2) {
            addCriterion("replytieziid not between", value1, value2, "replytieziid");
            return (Criteria) this;
        }

        public Criteria andReplynameIsNull() {
            addCriterion("replyname is null");
            return (Criteria) this;
        }

        public Criteria andReplynameIsNotNull() {
            addCriterion("replyname is not null");
            return (Criteria) this;
        }

        public Criteria andReplynameEqualTo(String value) {
            addCriterion("replyname =", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotEqualTo(String value) {
            addCriterion("replyname <>", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameGreaterThan(String value) {
            addCriterion("replyname >", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameGreaterThanOrEqualTo(String value) {
            addCriterion("replyname >=", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLessThan(String value) {
            addCriterion("replyname <", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLessThanOrEqualTo(String value) {
            addCriterion("replyname <=", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameLike(String value) {
            addCriterion("replyname like", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotLike(String value) {
            addCriterion("replyname not like", value, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameIn(List<String> values) {
            addCriterion("replyname in", values, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotIn(List<String> values) {
            addCriterion("replyname not in", values, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameBetween(String value1, String value2) {
            addCriterion("replyname between", value1, value2, "replyname");
            return (Criteria) this;
        }

        public Criteria andReplynameNotBetween(String value1, String value2) {
            addCriterion("replyname not between", value1, value2, "replyname");
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