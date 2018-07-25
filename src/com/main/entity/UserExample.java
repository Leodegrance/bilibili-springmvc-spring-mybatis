package com.main.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsermingziIsNull() {
            addCriterion("userMingzi is null");
            return (Criteria) this;
        }

        public Criteria andUsermingziIsNotNull() {
            addCriterion("userMingzi is not null");
            return (Criteria) this;
        }

        public Criteria andUsermingziEqualTo(String value) {
            addCriterion("userMingzi =", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziNotEqualTo(String value) {
            addCriterion("userMingzi <>", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziGreaterThan(String value) {
            addCriterion("userMingzi >", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziGreaterThanOrEqualTo(String value) {
            addCriterion("userMingzi >=", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziLessThan(String value) {
            addCriterion("userMingzi <", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziLessThanOrEqualTo(String value) {
            addCriterion("userMingzi <=", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziLike(String value) {
            addCriterion("userMingzi like", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziNotLike(String value) {
            addCriterion("userMingzi not like", value, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziIn(List<String> values) {
            addCriterion("userMingzi in", values, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziNotIn(List<String> values) {
            addCriterion("userMingzi not in", values, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziBetween(String value1, String value2) {
            addCriterion("userMingzi between", value1, value2, "usermingzi");
            return (Criteria) this;
        }

        public Criteria andUsermingziNotBetween(String value1, String value2) {
            addCriterion("userMingzi not between", value1, value2, "usermingzi");
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

        public Criteria andUsersexIsNull() {
            addCriterion("usersex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("usersex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("usersex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("usersex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("usersex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("usersex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("usersex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("usersex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("usersex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("usersex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("usersex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("usersex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("usersex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("usersex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("passWord is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("passWord is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("passWord =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("passWord <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("passWord >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("passWord >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("passWord <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("passWord <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("passWord like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("passWord not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("passWord in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("passWord not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("passWord between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("passWord not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserhandIsNull() {
            addCriterion("userHand is null");
            return (Criteria) this;
        }

        public Criteria andUserhandIsNotNull() {
            addCriterion("userHand is not null");
            return (Criteria) this;
        }

        public Criteria andUserhandEqualTo(String value) {
            addCriterion("userHand =", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandNotEqualTo(String value) {
            addCriterion("userHand <>", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandGreaterThan(String value) {
            addCriterion("userHand >", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandGreaterThanOrEqualTo(String value) {
            addCriterion("userHand >=", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandLessThan(String value) {
            addCriterion("userHand <", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandLessThanOrEqualTo(String value) {
            addCriterion("userHand <=", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandLike(String value) {
            addCriterion("userHand like", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandNotLike(String value) {
            addCriterion("userHand not like", value, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandIn(List<String> values) {
            addCriterion("userHand in", values, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandNotIn(List<String> values) {
            addCriterion("userHand not in", values, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandBetween(String value1, String value2) {
            addCriterion("userHand between", value1, value2, "userhand");
            return (Criteria) this;
        }

        public Criteria andUserhandNotBetween(String value1, String value2) {
            addCriterion("userHand not between", value1, value2, "userhand");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("userAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("userAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("userAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("userAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("userAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserqqIsNull() {
            addCriterion("userQQ is null");
            return (Criteria) this;
        }

        public Criteria andUserqqIsNotNull() {
            addCriterion("userQQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserqqEqualTo(String value) {
            addCriterion("userQQ =", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotEqualTo(String value) {
            addCriterion("userQQ <>", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqGreaterThan(String value) {
            addCriterion("userQQ >", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqGreaterThanOrEqualTo(String value) {
            addCriterion("userQQ >=", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLessThan(String value) {
            addCriterion("userQQ <", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLessThanOrEqualTo(String value) {
            addCriterion("userQQ <=", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqLike(String value) {
            addCriterion("userQQ like", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotLike(String value) {
            addCriterion("userQQ not like", value, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqIn(List<String> values) {
            addCriterion("userQQ in", values, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotIn(List<String> values) {
            addCriterion("userQQ not in", values, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqBetween(String value1, String value2) {
            addCriterion("userQQ between", value1, value2, "userqq");
            return (Criteria) this;
        }

        public Criteria andUserqqNotBetween(String value1, String value2) {
            addCriterion("userQQ not between", value1, value2, "userqq");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "Useremail");
            return (Criteria) this;
        }

        public Criteria andUsercollectionIsNull() {
            addCriterion("userCollection is null");
            return (Criteria) this;
        }

        public Criteria andUsercollectionIsNotNull() {
            addCriterion("userCollection is not null");
            return (Criteria) this;
        }

        public Criteria andUsercollectionEqualTo(String value) {
            addCriterion("userCollection =", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionNotEqualTo(String value) {
            addCriterion("userCollection <>", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionGreaterThan(String value) {
            addCriterion("userCollection >", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionGreaterThanOrEqualTo(String value) {
            addCriterion("userCollection >=", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionLessThan(String value) {
            addCriterion("userCollection <", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionLessThanOrEqualTo(String value) {
            addCriterion("userCollection <=", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionLike(String value) {
            addCriterion("userCollection like", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionNotLike(String value) {
            addCriterion("userCollection not like", value, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionIn(List<String> values) {
            addCriterion("userCollection in", values, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionNotIn(List<String> values) {
            addCriterion("userCollection not in", values, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionBetween(String value1, String value2) {
            addCriterion("userCollection between", value1, value2, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUsercollectionNotBetween(String value1, String value2) {
            addCriterion("userCollection not between", value1, value2, "usercollection");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIsNull() {
            addCriterion("useryinghangka is null");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIsNotNull() {
            addCriterion("useryinghangka is not null");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaEqualTo(String value) {
            addCriterion("useryinghangka =", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotEqualTo(String value) {
            addCriterion("useryinghangka <>", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaGreaterThan(String value) {
            addCriterion("useryinghangka >", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaGreaterThanOrEqualTo(String value) {
            addCriterion("useryinghangka >=", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLessThan(String value) {
            addCriterion("useryinghangka <", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLessThanOrEqualTo(String value) {
            addCriterion("useryinghangka <=", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLike(String value) {
            addCriterion("useryinghangka like", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotLike(String value) {
            addCriterion("useryinghangka not like", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIn(List<String> values) {
            addCriterion("useryinghangka in", values, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotIn(List<String> values) {
            addCriterion("useryinghangka not in", values, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaBetween(String value1, String value2) {
            addCriterion("useryinghangka between", value1, value2, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotBetween(String value1, String value2) {
            addCriterion("useryinghangka not between", value1, value2, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(String value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(String value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(String value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(String value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(String value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(String value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLike(String value) {
            addCriterion("userState like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotLike(String value) {
            addCriterion("userState not like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<String> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<String> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(String value1, String value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(String value1, String value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNull() {
            addCriterion("userLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNotNull() {
            addCriterion("userLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeEqualTo(String value) {
            addCriterion("userLoginTime =", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotEqualTo(String value) {
            addCriterion("userLoginTime <>", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThan(String value) {
            addCriterion("userLoginTime >", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("userLoginTime >=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThan(String value) {
            addCriterion("userLoginTime <", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThanOrEqualTo(String value) {
            addCriterion("userLoginTime <=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLike(String value) {
            addCriterion("userLoginTime like", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotLike(String value) {
            addCriterion("userLoginTime not like", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIn(List<String> values) {
            addCriterion("userLoginTime in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotIn(List<String> values) {
            addCriterion("userLoginTime not in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeBetween(String value1, String value2) {
            addCriterion("userLoginTime between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotBetween(String value1, String value2) {
            addCriterion("userLoginTime not between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUseripIsNull() {
            addCriterion("userIP is null");
            return (Criteria) this;
        }

        public Criteria andUseripIsNotNull() {
            addCriterion("userIP is not null");
            return (Criteria) this;
        }

        public Criteria andUseripEqualTo(String value) {
            addCriterion("userIP =", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotEqualTo(String value) {
            addCriterion("userIP <>", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThan(String value) {
            addCriterion("userIP >", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThanOrEqualTo(String value) {
            addCriterion("userIP >=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThan(String value) {
            addCriterion("userIP <", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThanOrEqualTo(String value) {
            addCriterion("userIP <=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLike(String value) {
            addCriterion("userIP like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotLike(String value) {
            addCriterion("userIP not like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripIn(List<String> values) {
            addCriterion("userIP in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotIn(List<String> values) {
            addCriterion("userIP not in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripBetween(String value1, String value2) {
            addCriterion("userIP between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotBetween(String value1, String value2) {
            addCriterion("userIP not between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordIsNull() {
            addCriterion("userPaypassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordIsNotNull() {
            addCriterion("userPaypassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordEqualTo(String value) {
            addCriterion("userPaypassword =", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordNotEqualTo(String value) {
            addCriterion("userPaypassword <>", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordGreaterThan(String value) {
            addCriterion("userPaypassword >", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPaypassword >=", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordLessThan(String value) {
            addCriterion("userPaypassword <", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordLessThanOrEqualTo(String value) {
            addCriterion("userPaypassword <=", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordLike(String value) {
            addCriterion("userPaypassword like", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordNotLike(String value) {
            addCriterion("userPaypassword not like", value, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordIn(List<String> values) {
            addCriterion("userPaypassword in", values, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordNotIn(List<String> values) {
            addCriterion("userPaypassword not in", values, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordBetween(String value1, String value2) {
            addCriterion("userPaypassword between", value1, value2, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserpaypasswordNotBetween(String value1, String value2) {
            addCriterion("userPaypassword not between", value1, value2, "userpaypassword");
            return (Criteria) this;
        }

        public Criteria andUserrmbIsNull() {
            addCriterion("userRMB is null");
            return (Criteria) this;
        }

        public Criteria andUserrmbIsNotNull() {
            addCriterion("userRMB is not null");
            return (Criteria) this;
        }

        public Criteria andUserrmbEqualTo(String value) {
            addCriterion("userRMB =", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbNotEqualTo(String value) {
            addCriterion("userRMB <>", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbGreaterThan(String value) {
            addCriterion("userRMB >", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbGreaterThanOrEqualTo(String value) {
            addCriterion("userRMB >=", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbLessThan(String value) {
            addCriterion("userRMB <", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbLessThanOrEqualTo(String value) {
            addCriterion("userRMB <=", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbLike(String value) {
            addCriterion("userRMB like", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbNotLike(String value) {
            addCriterion("userRMB not like", value, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbIn(List<String> values) {
            addCriterion("userRMB in", values, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbNotIn(List<String> values) {
            addCriterion("userRMB not in", values, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbBetween(String value1, String value2) {
            addCriterion("userRMB between", value1, value2, "userrmb");
            return (Criteria) this;
        }

        public Criteria andUserrmbNotBetween(String value1, String value2) {
            addCriterion("userRMB not between", value1, value2, "userrmb");
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