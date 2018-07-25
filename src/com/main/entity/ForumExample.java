package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andForumidIsNull() {
            addCriterion("forumID is null");
            return (Criteria) this;
        }

        public Criteria andForumidIsNotNull() {
            addCriterion("forumID is not null");
            return (Criteria) this;
        }

        public Criteria andForumidEqualTo(String value) {
            addCriterion("forumID =", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidNotEqualTo(String value) {
            addCriterion("forumID <>", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidGreaterThan(String value) {
            addCriterion("forumID >", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidGreaterThanOrEqualTo(String value) {
            addCriterion("forumID >=", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidLessThan(String value) {
            addCriterion("forumID <", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidLessThanOrEqualTo(String value) {
            addCriterion("forumID <=", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidLike(String value) {
            addCriterion("forumID like", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidNotLike(String value) {
            addCriterion("forumID not like", value, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidIn(List<String> values) {
            addCriterion("forumID in", values, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidNotIn(List<String> values) {
            addCriterion("forumID not in", values, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidBetween(String value1, String value2) {
            addCriterion("forumID between", value1, value2, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumidNotBetween(String value1, String value2) {
            addCriterion("forumID not between", value1, value2, "forumid");
            return (Criteria) this;
        }

        public Criteria andForumbtIsNull() {
            addCriterion("forumBT is null");
            return (Criteria) this;
        }

        public Criteria andForumbtIsNotNull() {
            addCriterion("forumBT is not null");
            return (Criteria) this;
        }

        public Criteria andForumbtEqualTo(String value) {
            addCriterion("forumBT =", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtNotEqualTo(String value) {
            addCriterion("forumBT <>", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtGreaterThan(String value) {
            addCriterion("forumBT >", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtGreaterThanOrEqualTo(String value) {
            addCriterion("forumBT >=", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtLessThan(String value) {
            addCriterion("forumBT <", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtLessThanOrEqualTo(String value) {
            addCriterion("forumBT <=", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtLike(String value) {
            addCriterion("forumBT like", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtNotLike(String value) {
            addCriterion("forumBT not like", value, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtIn(List<String> values) {
            addCriterion("forumBT in", values, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtNotIn(List<String> values) {
            addCriterion("forumBT not in", values, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtBetween(String value1, String value2) {
            addCriterion("forumBT between", value1, value2, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForumbtNotBetween(String value1, String value2) {
            addCriterion("forumBT not between", value1, value2, "forumbt");
            return (Criteria) this;
        }

        public Criteria andForummessageIsNull() {
            addCriterion("forummessage is null");
            return (Criteria) this;
        }

        public Criteria andForummessageIsNotNull() {
            addCriterion("forummessage is not null");
            return (Criteria) this;
        }

        public Criteria andForummessageEqualTo(String value) {
            addCriterion("forummessage =", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageNotEqualTo(String value) {
            addCriterion("forummessage <>", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageGreaterThan(String value) {
            addCriterion("forummessage >", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageGreaterThanOrEqualTo(String value) {
            addCriterion("forummessage >=", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageLessThan(String value) {
            addCriterion("forummessage <", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageLessThanOrEqualTo(String value) {
            addCriterion("forummessage <=", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageLike(String value) {
            addCriterion("forummessage like", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageNotLike(String value) {
            addCriterion("forummessage not like", value, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageIn(List<String> values) {
            addCriterion("forummessage in", values, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageNotIn(List<String> values) {
            addCriterion("forummessage not in", values, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageBetween(String value1, String value2) {
            addCriterion("forummessage between", value1, value2, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForummessageNotBetween(String value1, String value2) {
            addCriterion("forummessage not between", value1, value2, "forummessage");
            return (Criteria) this;
        }

        public Criteria andForumusernameIsNull() {
            addCriterion("forumuserName is null");
            return (Criteria) this;
        }

        public Criteria andForumusernameIsNotNull() {
            addCriterion("forumuserName is not null");
            return (Criteria) this;
        }

        public Criteria andForumusernameEqualTo(String value) {
            addCriterion("forumuserName =", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameNotEqualTo(String value) {
            addCriterion("forumuserName <>", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameGreaterThan(String value) {
            addCriterion("forumuserName >", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameGreaterThanOrEqualTo(String value) {
            addCriterion("forumuserName >=", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameLessThan(String value) {
            addCriterion("forumuserName <", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameLessThanOrEqualTo(String value) {
            addCriterion("forumuserName <=", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameLike(String value) {
            addCriterion("forumuserName like", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameNotLike(String value) {
            addCriterion("forumuserName not like", value, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameIn(List<String> values) {
            addCriterion("forumuserName in", values, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameNotIn(List<String> values) {
            addCriterion("forumuserName not in", values, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameBetween(String value1, String value2) {
            addCriterion("forumuserName between", value1, value2, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumusernameNotBetween(String value1, String value2) {
            addCriterion("forumuserName not between", value1, value2, "forumusername");
            return (Criteria) this;
        }

        public Criteria andForumtimeIsNull() {
            addCriterion("forumTime is null");
            return (Criteria) this;
        }

        public Criteria andForumtimeIsNotNull() {
            addCriterion("forumTime is not null");
            return (Criteria) this;
        }

        public Criteria andForumtimeEqualTo(String value) {
            addCriterion("forumTime =", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeNotEqualTo(String value) {
            addCriterion("forumTime <>", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeGreaterThan(String value) {
            addCriterion("forumTime >", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeGreaterThanOrEqualTo(String value) {
            addCriterion("forumTime >=", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeLessThan(String value) {
            addCriterion("forumTime <", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeLessThanOrEqualTo(String value) {
            addCriterion("forumTime <=", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeLike(String value) {
            addCriterion("forumTime like", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeNotLike(String value) {
            addCriterion("forumTime not like", value, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeIn(List<String> values) {
            addCriterion("forumTime in", values, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeNotIn(List<String> values) {
            addCriterion("forumTime not in", values, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeBetween(String value1, String value2) {
            addCriterion("forumTime between", value1, value2, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumtimeNotBetween(String value1, String value2) {
            addCriterion("forumTime not between", value1, value2, "forumtime");
            return (Criteria) this;
        }

        public Criteria andForumliebieIsNull() {
            addCriterion("forumliebie is null");
            return (Criteria) this;
        }

        public Criteria andForumliebieIsNotNull() {
            addCriterion("forumliebie is not null");
            return (Criteria) this;
        }

        public Criteria andForumliebieEqualTo(String value) {
            addCriterion("forumliebie =", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieNotEqualTo(String value) {
            addCriterion("forumliebie <>", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieGreaterThan(String value) {
            addCriterion("forumliebie >", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieGreaterThanOrEqualTo(String value) {
            addCriterion("forumliebie >=", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieLessThan(String value) {
            addCriterion("forumliebie <", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieLessThanOrEqualTo(String value) {
            addCriterion("forumliebie <=", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieLike(String value) {
            addCriterion("forumliebie like", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieNotLike(String value) {
            addCriterion("forumliebie not like", value, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieIn(List<String> values) {
            addCriterion("forumliebie in", values, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieNotIn(List<String> values) {
            addCriterion("forumliebie not in", values, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieBetween(String value1, String value2) {
            addCriterion("forumliebie between", value1, value2, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumliebieNotBetween(String value1, String value2) {
            addCriterion("forumliebie not between", value1, value2, "forumliebie");
            return (Criteria) this;
        }

        public Criteria andForumamountIsNull() {
            addCriterion("forumAmount is null");
            return (Criteria) this;
        }

        public Criteria andForumamountIsNotNull() {
            addCriterion("forumAmount is not null");
            return (Criteria) this;
        }

        public Criteria andForumamountEqualTo(String value) {
            addCriterion("forumAmount =", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountNotEqualTo(String value) {
            addCriterion("forumAmount <>", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountGreaterThan(String value) {
            addCriterion("forumAmount >", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountGreaterThanOrEqualTo(String value) {
            addCriterion("forumAmount >=", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountLessThan(String value) {
            addCriterion("forumAmount <", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountLessThanOrEqualTo(String value) {
            addCriterion("forumAmount <=", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountLike(String value) {
            addCriterion("forumAmount like", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountNotLike(String value) {
            addCriterion("forumAmount not like", value, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountIn(List<String> values) {
            addCriterion("forumAmount in", values, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountNotIn(List<String> values) {
            addCriterion("forumAmount not in", values, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountBetween(String value1, String value2) {
            addCriterion("forumAmount between", value1, value2, "forumamount");
            return (Criteria) this;
        }

        public Criteria andForumamountNotBetween(String value1, String value2) {
            addCriterion("forumAmount not between", value1, value2, "forumamount");
            return (Criteria) this;
        }

        public Criteria andFirumhandIsNull() {
            addCriterion("firumhand is null");
            return (Criteria) this;
        }

        public Criteria andFirumhandIsNotNull() {
            addCriterion("firumhand is not null");
            return (Criteria) this;
        }

        public Criteria andFirumhandEqualTo(String value) {
            addCriterion("firumhand =", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandNotEqualTo(String value) {
            addCriterion("firumhand <>", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandGreaterThan(String value) {
            addCriterion("firumhand >", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandGreaterThanOrEqualTo(String value) {
            addCriterion("firumhand >=", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandLessThan(String value) {
            addCriterion("firumhand <", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandLessThanOrEqualTo(String value) {
            addCriterion("firumhand <=", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandLike(String value) {
            addCriterion("firumhand like", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandNotLike(String value) {
            addCriterion("firumhand not like", value, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandIn(List<String> values) {
            addCriterion("firumhand in", values, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandNotIn(List<String> values) {
            addCriterion("firumhand not in", values, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandBetween(String value1, String value2) {
            addCriterion("firumhand between", value1, value2, "firumhand");
            return (Criteria) this;
        }

        public Criteria andFirumhandNotBetween(String value1, String value2) {
            addCriterion("firumhand not between", value1, value2, "firumhand");
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