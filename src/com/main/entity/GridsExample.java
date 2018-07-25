package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class GridsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GridsExample() {
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

        public Criteria andGridsidIsNull() {
            addCriterion("gridsID is null");
            return (Criteria) this;
        }

        public Criteria andGridsidIsNotNull() {
            addCriterion("gridsID is not null");
            return (Criteria) this;
        }

        public Criteria andGridsidEqualTo(String value) {
            addCriterion("gridsID =", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidNotEqualTo(String value) {
            addCriterion("gridsID <>", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidGreaterThan(String value) {
            addCriterion("gridsID >", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidGreaterThanOrEqualTo(String value) {
            addCriterion("gridsID >=", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidLessThan(String value) {
            addCriterion("gridsID <", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidLessThanOrEqualTo(String value) {
            addCriterion("gridsID <=", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidLike(String value) {
            addCriterion("gridsID like", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidNotLike(String value) {
            addCriterion("gridsID not like", value, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidIn(List<String> values) {
            addCriterion("gridsID in", values, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidNotIn(List<String> values) {
            addCriterion("gridsID not in", values, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidBetween(String value1, String value2) {
            addCriterion("gridsID between", value1, value2, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGridsidNotBetween(String value1, String value2) {
            addCriterion("gridsID not between", value1, value2, "gridsid");
            return (Criteria) this;
        }

        public Criteria andGirdsnameIsNull() {
            addCriterion("girdsName is null");
            return (Criteria) this;
        }

        public Criteria andGirdsnameIsNotNull() {
            addCriterion("girdsName is not null");
            return (Criteria) this;
        }

        public Criteria andGirdsnameEqualTo(String value) {
            addCriterion("girdsName =", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameNotEqualTo(String value) {
            addCriterion("girdsName <>", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameGreaterThan(String value) {
            addCriterion("girdsName >", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameGreaterThanOrEqualTo(String value) {
            addCriterion("girdsName >=", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameLessThan(String value) {
            addCriterion("girdsName <", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameLessThanOrEqualTo(String value) {
            addCriterion("girdsName <=", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameLike(String value) {
            addCriterion("girdsName like", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameNotLike(String value) {
            addCriterion("girdsName not like", value, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameIn(List<String> values) {
            addCriterion("girdsName in", values, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameNotIn(List<String> values) {
            addCriterion("girdsName not in", values, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameBetween(String value1, String value2) {
            addCriterion("girdsName between", value1, value2, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsnameNotBetween(String value1, String value2) {
            addCriterion("girdsName not between", value1, value2, "girdsname");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageIsNull() {
            addCriterion("girdsjiage is null");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageIsNotNull() {
            addCriterion("girdsjiage is not null");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageEqualTo(String value) {
            addCriterion("girdsjiage =", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageNotEqualTo(String value) {
            addCriterion("girdsjiage <>", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageGreaterThan(String value) {
            addCriterion("girdsjiage >", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageGreaterThanOrEqualTo(String value) {
            addCriterion("girdsjiage >=", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageLessThan(String value) {
            addCriterion("girdsjiage <", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageLessThanOrEqualTo(String value) {
            addCriterion("girdsjiage <=", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageLike(String value) {
            addCriterion("girdsjiage like", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageNotLike(String value) {
            addCriterion("girdsjiage not like", value, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageIn(List<String> values) {
            addCriterion("girdsjiage in", values, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageNotIn(List<String> values) {
            addCriterion("girdsjiage not in", values, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageBetween(String value1, String value2) {
            addCriterion("girdsjiage between", value1, value2, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsjiageNotBetween(String value1, String value2) {
            addCriterion("girdsjiage not between", value1, value2, "girdsjiage");
            return (Criteria) this;
        }

        public Criteria andGirdsimgIsNull() {
            addCriterion("girdsimg is null");
            return (Criteria) this;
        }

        public Criteria andGirdsimgIsNotNull() {
            addCriterion("girdsimg is not null");
            return (Criteria) this;
        }

        public Criteria andGirdsimgEqualTo(String value) {
            addCriterion("girdsimg =", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgNotEqualTo(String value) {
            addCriterion("girdsimg <>", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgGreaterThan(String value) {
            addCriterion("girdsimg >", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgGreaterThanOrEqualTo(String value) {
            addCriterion("girdsimg >=", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgLessThan(String value) {
            addCriterion("girdsimg <", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgLessThanOrEqualTo(String value) {
            addCriterion("girdsimg <=", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgLike(String value) {
            addCriterion("girdsimg like", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgNotLike(String value) {
            addCriterion("girdsimg not like", value, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgIn(List<String> values) {
            addCriterion("girdsimg in", values, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgNotIn(List<String> values) {
            addCriterion("girdsimg not in", values, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgBetween(String value1, String value2) {
            addCriterion("girdsimg between", value1, value2, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdsimgNotBetween(String value1, String value2) {
            addCriterion("girdsimg not between", value1, value2, "girdsimg");
            return (Criteria) this;
        }

        public Criteria andGirdskucunIsNull() {
            addCriterion("girdskucun is null");
            return (Criteria) this;
        }

        public Criteria andGirdskucunIsNotNull() {
            addCriterion("girdskucun is not null");
            return (Criteria) this;
        }

        public Criteria andGirdskucunEqualTo(Integer value) {
            addCriterion("girdskucun =", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunNotEqualTo(Integer value) {
            addCriterion("girdskucun <>", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunGreaterThan(Integer value) {
            addCriterion("girdskucun >", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunGreaterThanOrEqualTo(Integer value) {
            addCriterion("girdskucun >=", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunLessThan(Integer value) {
            addCriterion("girdskucun <", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunLessThanOrEqualTo(Integer value) {
            addCriterion("girdskucun <=", value, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunIn(List<Integer> values) {
            addCriterion("girdskucun in", values, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunNotIn(List<Integer> values) {
            addCriterion("girdskucun not in", values, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunBetween(Integer value1, Integer value2) {
            addCriterion("girdskucun between", value1, value2, "girdskucun");
            return (Criteria) this;
        }

        public Criteria andGirdskucunNotBetween(Integer value1, Integer value2) {
            addCriterion("girdskucun not between", value1, value2, "girdskucun");
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