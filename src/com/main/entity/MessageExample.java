package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(String value) {
            addCriterion("messageID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(String value) {
            addCriterion("messageID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(String value) {
            addCriterion("messageID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("messageID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(String value) {
            addCriterion("messageID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(String value) {
            addCriterion("messageID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLike(String value) {
            addCriterion("messageID like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotLike(String value) {
            addCriterion("messageID not like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<String> values) {
            addCriterion("messageID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<String> values) {
            addCriterion("messageID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(String value1, String value2) {
            addCriterion("messageID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(String value1, String value2) {
            addCriterion("messageID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidIsNull() {
            addCriterion("messagevideoID is null");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidIsNotNull() {
            addCriterion("messagevideoID is not null");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidEqualTo(String value) {
            addCriterion("messagevideoID =", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidNotEqualTo(String value) {
            addCriterion("messagevideoID <>", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidGreaterThan(String value) {
            addCriterion("messagevideoID >", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidGreaterThanOrEqualTo(String value) {
            addCriterion("messagevideoID >=", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidLessThan(String value) {
            addCriterion("messagevideoID <", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidLessThanOrEqualTo(String value) {
            addCriterion("messagevideoID <=", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidLike(String value) {
            addCriterion("messagevideoID like", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidNotLike(String value) {
            addCriterion("messagevideoID not like", value, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidIn(List<String> values) {
            addCriterion("messagevideoID in", values, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidNotIn(List<String> values) {
            addCriterion("messagevideoID not in", values, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidBetween(String value1, String value2) {
            addCriterion("messagevideoID between", value1, value2, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessagevideoidNotBetween(String value1, String value2) {
            addCriterion("messagevideoID not between", value1, value2, "messagevideoid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIsNull() {
            addCriterion("messageuserID is null");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIsNotNull() {
            addCriterion("messageuserID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageuseridEqualTo(String value) {
            addCriterion("messageuserID =", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotEqualTo(String value) {
            addCriterion("messageuserID <>", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridGreaterThan(String value) {
            addCriterion("messageuserID >", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridGreaterThanOrEqualTo(String value) {
            addCriterion("messageuserID >=", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridLessThan(String value) {
            addCriterion("messageuserID <", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridLessThanOrEqualTo(String value) {
            addCriterion("messageuserID <=", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridLike(String value) {
            addCriterion("messageuserID like", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotLike(String value) {
            addCriterion("messageuserID not like", value, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridIn(List<String> values) {
            addCriterion("messageuserID in", values, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotIn(List<String> values) {
            addCriterion("messageuserID not in", values, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridBetween(String value1, String value2) {
            addCriterion("messageuserID between", value1, value2, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageuseridNotBetween(String value1, String value2) {
            addCriterion("messageuserID not between", value1, value2, "messageuserid");
            return (Criteria) this;
        }

        public Criteria andMessageusernameIsNull() {
            addCriterion("messageuserName is null");
            return (Criteria) this;
        }

        public Criteria andMessageusernameIsNotNull() {
            addCriterion("messageuserName is not null");
            return (Criteria) this;
        }

        public Criteria andMessageusernameEqualTo(String value) {
            addCriterion("messageuserName =", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameNotEqualTo(String value) {
            addCriterion("messageuserName <>", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameGreaterThan(String value) {
            addCriterion("messageuserName >", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameGreaterThanOrEqualTo(String value) {
            addCriterion("messageuserName >=", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameLessThan(String value) {
            addCriterion("messageuserName <", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameLessThanOrEqualTo(String value) {
            addCriterion("messageuserName <=", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameLike(String value) {
            addCriterion("messageuserName like", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameNotLike(String value) {
            addCriterion("messageuserName not like", value, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameIn(List<String> values) {
            addCriterion("messageuserName in", values, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameNotIn(List<String> values) {
            addCriterion("messageuserName not in", values, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameBetween(String value1, String value2) {
            addCriterion("messageuserName between", value1, value2, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageusernameNotBetween(String value1, String value2) {
            addCriterion("messageuserName not between", value1, value2, "messageusername");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNull() {
            addCriterion("messageTime is null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIsNotNull() {
            addCriterion("messageTime is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetimeEqualTo(String value) {
            addCriterion("messageTime =", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotEqualTo(String value) {
            addCriterion("messageTime <>", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThan(String value) {
            addCriterion("messageTime >", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeGreaterThanOrEqualTo(String value) {
            addCriterion("messageTime >=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThan(String value) {
            addCriterion("messageTime <", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLessThanOrEqualTo(String value) {
            addCriterion("messageTime <=", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeLike(String value) {
            addCriterion("messageTime like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotLike(String value) {
            addCriterion("messageTime not like", value, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeIn(List<String> values) {
            addCriterion("messageTime in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotIn(List<String> values) {
            addCriterion("messageTime not in", values, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeBetween(String value1, String value2) {
            addCriterion("messageTime between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagetimeNotBetween(String value1, String value2) {
            addCriterion("messageTime not between", value1, value2, "messagetime");
            return (Criteria) this;
        }

        public Criteria andMessagehandIsNull() {
            addCriterion("messageHand is null");
            return (Criteria) this;
        }

        public Criteria andMessagehandIsNotNull() {
            addCriterion("messageHand is not null");
            return (Criteria) this;
        }

        public Criteria andMessagehandEqualTo(String value) {
            addCriterion("messageHand =", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandNotEqualTo(String value) {
            addCriterion("messageHand <>", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandGreaterThan(String value) {
            addCriterion("messageHand >", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandGreaterThanOrEqualTo(String value) {
            addCriterion("messageHand >=", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandLessThan(String value) {
            addCriterion("messageHand <", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandLessThanOrEqualTo(String value) {
            addCriterion("messageHand <=", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandLike(String value) {
            addCriterion("messageHand like", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandNotLike(String value) {
            addCriterion("messageHand not like", value, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandIn(List<String> values) {
            addCriterion("messageHand in", values, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandNotIn(List<String> values) {
            addCriterion("messageHand not in", values, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandBetween(String value1, String value2) {
            addCriterion("messageHand between", value1, value2, "messagehand");
            return (Criteria) this;
        }

        public Criteria andMessagehandNotBetween(String value1, String value2) {
            addCriterion("messageHand not between", value1, value2, "messagehand");
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