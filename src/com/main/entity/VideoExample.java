package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoidIsNull() {
            addCriterion("videoID is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoID =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoID <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoID >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoID >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoID <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoID <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoID like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoID not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoID in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoID not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoID between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoID not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoName =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoName <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoName like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoName not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoName in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideoimageIsNull() {
            addCriterion("videoImage is null");
            return (Criteria) this;
        }

        public Criteria andVideoimageIsNotNull() {
            addCriterion("videoImage is not null");
            return (Criteria) this;
        }

        public Criteria andVideoimageEqualTo(String value) {
            addCriterion("videoImage =", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotEqualTo(String value) {
            addCriterion("videoImage <>", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageGreaterThan(String value) {
            addCriterion("videoImage >", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageGreaterThanOrEqualTo(String value) {
            addCriterion("videoImage >=", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLessThan(String value) {
            addCriterion("videoImage <", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLessThanOrEqualTo(String value) {
            addCriterion("videoImage <=", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLike(String value) {
            addCriterion("videoImage like", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotLike(String value) {
            addCriterion("videoImage not like", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageIn(List<String> values) {
            addCriterion("videoImage in", values, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotIn(List<String> values) {
            addCriterion("videoImage not in", values, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageBetween(String value1, String value2) {
            addCriterion("videoImage between", value1, value2, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotBetween(String value1, String value2) {
            addCriterion("videoImage not between", value1, value2, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNull() {
            addCriterion("videoAddress is null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNotNull() {
            addCriterion("videoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressEqualTo(String value) {
            addCriterion("videoAddress =", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotEqualTo(String value) {
            addCriterion("videoAddress <>", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThan(String value) {
            addCriterion("videoAddress >", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoAddress >=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThan(String value) {
            addCriterion("videoAddress <", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThanOrEqualTo(String value) {
            addCriterion("videoAddress <=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLike(String value) {
            addCriterion("videoAddress like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotLike(String value) {
            addCriterion("videoAddress not like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIn(List<String> values) {
            addCriterion("videoAddress in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotIn(List<String> values) {
            addCriterion("videoAddress not in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressBetween(String value1, String value2) {
            addCriterion("videoAddress between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotBetween(String value1, String value2) {
            addCriterion("videoAddress not between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeIsNull() {
            addCriterion("videolookTime is null");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeIsNotNull() {
            addCriterion("videolookTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeEqualTo(String value) {
            addCriterion("videolookTime =", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeNotEqualTo(String value) {
            addCriterion("videolookTime <>", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeGreaterThan(String value) {
            addCriterion("videolookTime >", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeGreaterThanOrEqualTo(String value) {
            addCriterion("videolookTime >=", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeLessThan(String value) {
            addCriterion("videolookTime <", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeLessThanOrEqualTo(String value) {
            addCriterion("videolookTime <=", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeLike(String value) {
            addCriterion("videolookTime like", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeNotLike(String value) {
            addCriterion("videolookTime not like", value, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeIn(List<String> values) {
            addCriterion("videolookTime in", values, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeNotIn(List<String> values) {
            addCriterion("videolookTime not in", values, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeBetween(String value1, String value2) {
            addCriterion("videolookTime between", value1, value2, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideolooktimeNotBetween(String value1, String value2) {
            addCriterion("videolookTime not between", value1, value2, "videolooktime");
            return (Criteria) this;
        }

        public Criteria andVideocollectionIsNull() {
            addCriterion("videoCollection is null");
            return (Criteria) this;
        }

        public Criteria andVideocollectionIsNotNull() {
            addCriterion("videoCollection is not null");
            return (Criteria) this;
        }

        public Criteria andVideocollectionEqualTo(String value) {
            addCriterion("videoCollection =", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionNotEqualTo(String value) {
            addCriterion("videoCollection <>", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionGreaterThan(String value) {
            addCriterion("videoCollection >", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionGreaterThanOrEqualTo(String value) {
            addCriterion("videoCollection >=", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionLessThan(String value) {
            addCriterion("videoCollection <", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionLessThanOrEqualTo(String value) {
            addCriterion("videoCollection <=", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionLike(String value) {
            addCriterion("videoCollection like", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionNotLike(String value) {
            addCriterion("videoCollection not like", value, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionIn(List<String> values) {
            addCriterion("videoCollection in", values, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionNotIn(List<String> values) {
            addCriterion("videoCollection not in", values, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionBetween(String value1, String value2) {
            addCriterion("videoCollection between", value1, value2, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideocollectionNotBetween(String value1, String value2) {
            addCriterion("videoCollection not between", value1, value2, "videocollection");
            return (Criteria) this;
        }

        public Criteria andVideoleavingIsNull() {
            addCriterion("videoLeaving is null");
            return (Criteria) this;
        }

        public Criteria andVideoleavingIsNotNull() {
            addCriterion("videoLeaving is not null");
            return (Criteria) this;
        }

        public Criteria andVideoleavingEqualTo(String value) {
            addCriterion("videoLeaving =", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingNotEqualTo(String value) {
            addCriterion("videoLeaving <>", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingGreaterThan(String value) {
            addCriterion("videoLeaving >", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingGreaterThanOrEqualTo(String value) {
            addCriterion("videoLeaving >=", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingLessThan(String value) {
            addCriterion("videoLeaving <", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingLessThanOrEqualTo(String value) {
            addCriterion("videoLeaving <=", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingLike(String value) {
            addCriterion("videoLeaving like", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingNotLike(String value) {
            addCriterion("videoLeaving not like", value, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingIn(List<String> values) {
            addCriterion("videoLeaving in", values, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingNotIn(List<String> values) {
            addCriterion("videoLeaving not in", values, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingBetween(String value1, String value2) {
            addCriterion("videoLeaving between", value1, value2, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideoleavingNotBetween(String value1, String value2) {
            addCriterion("videoLeaving not between", value1, value2, "videoleaving");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNull() {
            addCriterion("videoTime is null");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNotNull() {
            addCriterion("videoTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideotimeEqualTo(String value) {
            addCriterion("videoTime =", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotEqualTo(String value) {
            addCriterion("videoTime <>", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThan(String value) {
            addCriterion("videoTime >", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoTime >=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThan(String value) {
            addCriterion("videoTime <", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThanOrEqualTo(String value) {
            addCriterion("videoTime <=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLike(String value) {
            addCriterion("videoTime like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotLike(String value) {
            addCriterion("videoTime not like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeIn(List<String> values) {
            addCriterion("videoTime in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotIn(List<String> values) {
            addCriterion("videoTime not in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeBetween(String value1, String value2) {
            addCriterion("videoTime between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotBetween(String value1, String value2) {
            addCriterion("videoTime not between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideostateIsNull() {
            addCriterion("videoState is null");
            return (Criteria) this;
        }

        public Criteria andVideostateIsNotNull() {
            addCriterion("videoState is not null");
            return (Criteria) this;
        }

        public Criteria andVideostateEqualTo(String value) {
            addCriterion("videoState =", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateNotEqualTo(String value) {
            addCriterion("videoState <>", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateGreaterThan(String value) {
            addCriterion("videoState >", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateGreaterThanOrEqualTo(String value) {
            addCriterion("videoState >=", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateLessThan(String value) {
            addCriterion("videoState <", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateLessThanOrEqualTo(String value) {
            addCriterion("videoState <=", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateLike(String value) {
            addCriterion("videoState like", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateNotLike(String value) {
            addCriterion("videoState not like", value, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateIn(List<String> values) {
            addCriterion("videoState in", values, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateNotIn(List<String> values) {
            addCriterion("videoState not in", values, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateBetween(String value1, String value2) {
            addCriterion("videoState between", value1, value2, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideostateNotBetween(String value1, String value2) {
            addCriterion("videoState not between", value1, value2, "videostate");
            return (Criteria) this;
        }

        public Criteria andVideocategoryIsNull() {
            addCriterion("videocAtegory is null");
            return (Criteria) this;
        }

        public Criteria andVideocategoryIsNotNull() {
            addCriterion("videocAtegory is not null");
            return (Criteria) this;
        }

        public Criteria andVideocategoryEqualTo(String value) {
            addCriterion("videocAtegory =", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryNotEqualTo(String value) {
            addCriterion("videocAtegory <>", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryGreaterThan(String value) {
            addCriterion("videocAtegory >", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryGreaterThanOrEqualTo(String value) {
            addCriterion("videocAtegory >=", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryLessThan(String value) {
            addCriterion("videocAtegory <", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryLessThanOrEqualTo(String value) {
            addCriterion("videocAtegory <=", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryLike(String value) {
            addCriterion("videocAtegory like", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryNotLike(String value) {
            addCriterion("videocAtegory not like", value, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryIn(List<String> values) {
            addCriterion("videocAtegory in", values, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryNotIn(List<String> values) {
            addCriterion("videocAtegory not in", values, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryBetween(String value1, String value2) {
            addCriterion("videocAtegory between", value1, value2, "videocategory");
            return (Criteria) this;
        }

        public Criteria andVideocategoryNotBetween(String value1, String value2) {
            addCriterion("videocAtegory not between", value1, value2, "videocategory");
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