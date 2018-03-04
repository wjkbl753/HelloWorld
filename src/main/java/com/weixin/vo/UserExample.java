package com.weixin.vo;

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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(String value) {
            addCriterion("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(String value) {
            addCriterion("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(String value) {
            addCriterion("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(String value) {
            addCriterion("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(String value) {
            addCriterion("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLike(String value) {
            addCriterion("lasttime like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotLike(String value) {
            addCriterion("lasttime not like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<String> values) {
            addCriterion("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<String> values) {
            addCriterion("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(String value1, String value2) {
            addCriterion("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(String value1, String value2) {
            addCriterion("lasttime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNull() {
            addCriterion("nowtime is null");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNotNull() {
            addCriterion("nowtime is not null");
            return (Criteria) this;
        }

        public Criteria andNowtimeEqualTo(String value) {
            addCriterion("nowtime =", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotEqualTo(String value) {
            addCriterion("nowtime <>", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThan(String value) {
            addCriterion("nowtime >", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("nowtime >=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThan(String value) {
            addCriterion("nowtime <", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThanOrEqualTo(String value) {
            addCriterion("nowtime <=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLike(String value) {
            addCriterion("nowtime like", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotLike(String value) {
            addCriterion("nowtime not like", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIn(List<String> values) {
            addCriterion("nowtime in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotIn(List<String> values) {
            addCriterion("nowtime not in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeBetween(String value1, String value2) {
            addCriterion("nowtime between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotBetween(String value1, String value2) {
            addCriterion("nowtime not between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andLastipIsNull() {
            addCriterion("lastip is null");
            return (Criteria) this;
        }

        public Criteria andLastipIsNotNull() {
            addCriterion("lastip is not null");
            return (Criteria) this;
        }

        public Criteria andLastipEqualTo(String value) {
            addCriterion("lastip =", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotEqualTo(String value) {
            addCriterion("lastip <>", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThan(String value) {
            addCriterion("lastip >", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThanOrEqualTo(String value) {
            addCriterion("lastip >=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThan(String value) {
            addCriterion("lastip <", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThanOrEqualTo(String value) {
            addCriterion("lastip <=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLike(String value) {
            addCriterion("lastip like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotLike(String value) {
            addCriterion("lastip not like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipIn(List<String> values) {
            addCriterion("lastip in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotIn(List<String> values) {
            addCriterion("lastip not in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipBetween(String value1, String value2) {
            addCriterion("lastip between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotBetween(String value1, String value2) {
            addCriterion("lastip not between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andNowipIsNull() {
            addCriterion("nowip is null");
            return (Criteria) this;
        }

        public Criteria andNowipIsNotNull() {
            addCriterion("nowip is not null");
            return (Criteria) this;
        }

        public Criteria andNowipEqualTo(String value) {
            addCriterion("nowip =", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipNotEqualTo(String value) {
            addCriterion("nowip <>", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipGreaterThan(String value) {
            addCriterion("nowip >", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipGreaterThanOrEqualTo(String value) {
            addCriterion("nowip >=", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipLessThan(String value) {
            addCriterion("nowip <", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipLessThanOrEqualTo(String value) {
            addCriterion("nowip <=", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipLike(String value) {
            addCriterion("nowip like", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipNotLike(String value) {
            addCriterion("nowip not like", value, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipIn(List<String> values) {
            addCriterion("nowip in", values, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipNotIn(List<String> values) {
            addCriterion("nowip not in", values, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipBetween(String value1, String value2) {
            addCriterion("nowip between", value1, value2, "nowip");
            return (Criteria) this;
        }

        public Criteria andNowipNotBetween(String value1, String value2) {
            addCriterion("nowip not between", value1, value2, "nowip");
            return (Criteria) this;
        }

        public Criteria andOfficecallIsNull() {
            addCriterion("officecall is null");
            return (Criteria) this;
        }

        public Criteria andOfficecallIsNotNull() {
            addCriterion("officecall is not null");
            return (Criteria) this;
        }

        public Criteria andOfficecallEqualTo(String value) {
            addCriterion("officecall =", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallNotEqualTo(String value) {
            addCriterion("officecall <>", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallGreaterThan(String value) {
            addCriterion("officecall >", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallGreaterThanOrEqualTo(String value) {
            addCriterion("officecall >=", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallLessThan(String value) {
            addCriterion("officecall <", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallLessThanOrEqualTo(String value) {
            addCriterion("officecall <=", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallLike(String value) {
            addCriterion("officecall like", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallNotLike(String value) {
            addCriterion("officecall not like", value, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallIn(List<String> values) {
            addCriterion("officecall in", values, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallNotIn(List<String> values) {
            addCriterion("officecall not in", values, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallBetween(String value1, String value2) {
            addCriterion("officecall between", value1, value2, "officecall");
            return (Criteria) this;
        }

        public Criteria andOfficecallNotBetween(String value1, String value2) {
            addCriterion("officecall not between", value1, value2, "officecall");
            return (Criteria) this;
        }

        public Criteria andHomecallIsNull() {
            addCriterion("homecall is null");
            return (Criteria) this;
        }

        public Criteria andHomecallIsNotNull() {
            addCriterion("homecall is not null");
            return (Criteria) this;
        }

        public Criteria andHomecallEqualTo(String value) {
            addCriterion("homecall =", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallNotEqualTo(String value) {
            addCriterion("homecall <>", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallGreaterThan(String value) {
            addCriterion("homecall >", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallGreaterThanOrEqualTo(String value) {
            addCriterion("homecall >=", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallLessThan(String value) {
            addCriterion("homecall <", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallLessThanOrEqualTo(String value) {
            addCriterion("homecall <=", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallLike(String value) {
            addCriterion("homecall like", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallNotLike(String value) {
            addCriterion("homecall not like", value, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallIn(List<String> values) {
            addCriterion("homecall in", values, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallNotIn(List<String> values) {
            addCriterion("homecall not in", values, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallBetween(String value1, String value2) {
            addCriterion("homecall between", value1, value2, "homecall");
            return (Criteria) this;
        }

        public Criteria andHomecallNotBetween(String value1, String value2) {
            addCriterion("homecall not between", value1, value2, "homecall");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("mobilenumber is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("mobilenumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("mobilenumber =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("mobilenumber <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("mobilenumber >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobilenumber >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("mobilenumber <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("mobilenumber <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("mobilenumber like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("mobilenumber not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("mobilenumber in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("mobilenumber not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("mobilenumber between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("mobilenumber not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberIsNull() {
            addCriterion("shortnumber is null");
            return (Criteria) this;
        }

        public Criteria andShortnumberIsNotNull() {
            addCriterion("shortnumber is not null");
            return (Criteria) this;
        }

        public Criteria andShortnumberEqualTo(String value) {
            addCriterion("shortnumber =", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberNotEqualTo(String value) {
            addCriterion("shortnumber <>", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberGreaterThan(String value) {
            addCriterion("shortnumber >", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberGreaterThanOrEqualTo(String value) {
            addCriterion("shortnumber >=", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberLessThan(String value) {
            addCriterion("shortnumber <", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberLessThanOrEqualTo(String value) {
            addCriterion("shortnumber <=", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberLike(String value) {
            addCriterion("shortnumber like", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberNotLike(String value) {
            addCriterion("shortnumber not like", value, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberIn(List<String> values) {
            addCriterion("shortnumber in", values, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberNotIn(List<String> values) {
            addCriterion("shortnumber not in", values, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberBetween(String value1, String value2) {
            addCriterion("shortnumber between", value1, value2, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andShortnumberNotBetween(String value1, String value2) {
            addCriterion("shortnumber not between", value1, value2, "shortnumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("msn not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNull() {
            addCriterion("zhicheng is null");
            return (Criteria) this;
        }

        public Criteria andZhichengIsNotNull() {
            addCriterion("zhicheng is not null");
            return (Criteria) this;
        }

        public Criteria andZhichengEqualTo(String value) {
            addCriterion("zhicheng =", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotEqualTo(String value) {
            addCriterion("zhicheng <>", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThan(String value) {
            addCriterion("zhicheng >", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengGreaterThanOrEqualTo(String value) {
            addCriterion("zhicheng >=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThan(String value) {
            addCriterion("zhicheng <", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLessThanOrEqualTo(String value) {
            addCriterion("zhicheng <=", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengLike(String value) {
            addCriterion("zhicheng like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotLike(String value) {
            addCriterion("zhicheng not like", value, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengIn(List<String> values) {
            addCriterion("zhicheng in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotIn(List<String> values) {
            addCriterion("zhicheng not in", values, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengBetween(String value1, String value2) {
            addCriterion("zhicheng between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andZhichengNotBetween(String value1, String value2) {
            addCriterion("zhicheng not between", value1, value2, "zhicheng");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("xuewei is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("xuewei is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("xuewei =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("xuewei <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("xuewei >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("xuewei >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("xuewei <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("xuewei <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("xuewei like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("xuewei not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("xuewei in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("xuewei not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("xuewei between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("xuewei not between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNull() {
            addCriterion("banji is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNotNull() {
            addCriterion("banji is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiEqualTo(String value) {
            addCriterion("banji =", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotEqualTo(String value) {
            addCriterion("banji <>", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThan(String value) {
            addCriterion("banji >", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThanOrEqualTo(String value) {
            addCriterion("banji >=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThan(String value) {
            addCriterion("banji <", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThanOrEqualTo(String value) {
            addCriterion("banji <=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLike(String value) {
            addCriterion("banji like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotLike(String value) {
            addCriterion("banji not like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiIn(List<String> values) {
            addCriterion("banji in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotIn(List<String> values) {
            addCriterion("banji not in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiBetween(String value1, String value2) {
            addCriterion("banji between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotBetween(String value1, String value2) {
            addCriterion("banji not between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameIsNull() {
            addCriterion("zhuanyename is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameIsNotNull() {
            addCriterion("zhuanyename is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameEqualTo(String value) {
            addCriterion("zhuanyename =", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameNotEqualTo(String value) {
            addCriterion("zhuanyename <>", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameGreaterThan(String value) {
            addCriterion("zhuanyename >", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanyename >=", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameLessThan(String value) {
            addCriterion("zhuanyename <", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameLessThanOrEqualTo(String value) {
            addCriterion("zhuanyename <=", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameLike(String value) {
            addCriterion("zhuanyename like", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameNotLike(String value) {
            addCriterion("zhuanyename not like", value, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameIn(List<String> values) {
            addCriterion("zhuanyename in", values, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameNotIn(List<String> values) {
            addCriterion("zhuanyename not in", values, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameBetween(String value1, String value2) {
            addCriterion("zhuanyename between", value1, value2, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhuanyenameNotBetween(String value1, String value2) {
            addCriterion("zhuanyename not between", value1, value2, "zhuanyename");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuIsNull() {
            addCriterion("zhidaorenshu is null");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuIsNotNull() {
            addCriterion("zhidaorenshu is not null");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuEqualTo(Integer value) {
            addCriterion("zhidaorenshu =", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuNotEqualTo(Integer value) {
            addCriterion("zhidaorenshu <>", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuGreaterThan(Integer value) {
            addCriterion("zhidaorenshu >", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhidaorenshu >=", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuLessThan(Integer value) {
            addCriterion("zhidaorenshu <", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuLessThanOrEqualTo(Integer value) {
            addCriterion("zhidaorenshu <=", value, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuIn(List<Integer> values) {
            addCriterion("zhidaorenshu in", values, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuNotIn(List<Integer> values) {
            addCriterion("zhidaorenshu not in", values, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuBetween(Integer value1, Integer value2) {
            addCriterion("zhidaorenshu between", value1, value2, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andZhidaorenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("zhidaorenshu not between", value1, value2, "zhidaorenshu");
            return (Criteria) this;
        }

        public Criteria andJidinameIsNull() {
            addCriterion("jidiname is null");
            return (Criteria) this;
        }

        public Criteria andJidinameIsNotNull() {
            addCriterion("jidiname is not null");
            return (Criteria) this;
        }

        public Criteria andJidinameEqualTo(String value) {
            addCriterion("jidiname =", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameNotEqualTo(String value) {
            addCriterion("jidiname <>", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameGreaterThan(String value) {
            addCriterion("jidiname >", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameGreaterThanOrEqualTo(String value) {
            addCriterion("jidiname >=", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameLessThan(String value) {
            addCriterion("jidiname <", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameLessThanOrEqualTo(String value) {
            addCriterion("jidiname <=", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameLike(String value) {
            addCriterion("jidiname like", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameNotLike(String value) {
            addCriterion("jidiname not like", value, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameIn(List<String> values) {
            addCriterion("jidiname in", values, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameNotIn(List<String> values) {
            addCriterion("jidiname not in", values, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameBetween(String value1, String value2) {
            addCriterion("jidiname between", value1, value2, "jidiname");
            return (Criteria) this;
        }

        public Criteria andJidinameNotBetween(String value1, String value2) {
            addCriterion("jidiname not between", value1, value2, "jidiname");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameIsNull() {
            addCriterion("innerteachername is null");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameIsNotNull() {
            addCriterion("innerteachername is not null");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameEqualTo(String value) {
            addCriterion("innerteachername =", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameNotEqualTo(String value) {
            addCriterion("innerteachername <>", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameGreaterThan(String value) {
            addCriterion("innerteachername >", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("innerteachername >=", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameLessThan(String value) {
            addCriterion("innerteachername <", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameLessThanOrEqualTo(String value) {
            addCriterion("innerteachername <=", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameLike(String value) {
            addCriterion("innerteachername like", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameNotLike(String value) {
            addCriterion("innerteachername not like", value, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameIn(List<String> values) {
            addCriterion("innerteachername in", values, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameNotIn(List<String> values) {
            addCriterion("innerteachername not in", values, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameBetween(String value1, String value2) {
            addCriterion("innerteachername between", value1, value2, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andInnerteachernameNotBetween(String value1, String value2) {
            addCriterion("innerteachername not between", value1, value2, "innerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameIsNull() {
            addCriterion("outerteachername is null");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameIsNotNull() {
            addCriterion("outerteachername is not null");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameEqualTo(String value) {
            addCriterion("outerteachername =", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameNotEqualTo(String value) {
            addCriterion("outerteachername <>", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameGreaterThan(String value) {
            addCriterion("outerteachername >", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("outerteachername >=", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameLessThan(String value) {
            addCriterion("outerteachername <", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameLessThanOrEqualTo(String value) {
            addCriterion("outerteachername <=", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameLike(String value) {
            addCriterion("outerteachername like", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameNotLike(String value) {
            addCriterion("outerteachername not like", value, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameIn(List<String> values) {
            addCriterion("outerteachername in", values, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameNotIn(List<String> values) {
            addCriterion("outerteachername not in", values, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameBetween(String value1, String value2) {
            addCriterion("outerteachername between", value1, value2, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andOuterteachernameNotBetween(String value1, String value2) {
            addCriterion("outerteachername not between", value1, value2, "outerteachername");
            return (Criteria) this;
        }

        public Criteria andAIsNull() {
            addCriterion("A is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("A is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(Integer value) {
            addCriterion("A =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(Integer value) {
            addCriterion("A <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(Integer value) {
            addCriterion("A >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(Integer value) {
            addCriterion("A >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(Integer value) {
            addCriterion("A <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(Integer value) {
            addCriterion("A <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<Integer> values) {
            addCriterion("A in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<Integer> values) {
            addCriterion("A not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(Integer value1, Integer value2) {
            addCriterion("A between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(Integer value1, Integer value2) {
            addCriterion("A not between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("B is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("B is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(Integer value) {
            addCriterion("B =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(Integer value) {
            addCriterion("B <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(Integer value) {
            addCriterion("B >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(Integer value) {
            addCriterion("B >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(Integer value) {
            addCriterion("B <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(Integer value) {
            addCriterion("B <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<Integer> values) {
            addCriterion("B in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<Integer> values) {
            addCriterion("B not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(Integer value1, Integer value2) {
            addCriterion("B between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(Integer value1, Integer value2) {
            addCriterion("B not between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("C is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("C is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(Integer value) {
            addCriterion("C =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(Integer value) {
            addCriterion("C <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(Integer value) {
            addCriterion("C >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(Integer value) {
            addCriterion("C >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(Integer value) {
            addCriterion("C <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(Integer value) {
            addCriterion("C <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<Integer> values) {
            addCriterion("C in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<Integer> values) {
            addCriterion("C not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(Integer value1, Integer value2) {
            addCriterion("C between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(Integer value1, Integer value2) {
            addCriterion("C not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("D is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("D is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(Integer value) {
            addCriterion("D =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(Integer value) {
            addCriterion("D <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(Integer value) {
            addCriterion("D >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(Integer value) {
            addCriterion("D >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(Integer value) {
            addCriterion("D <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(Integer value) {
            addCriterion("D <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<Integer> values) {
            addCriterion("D in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<Integer> values) {
            addCriterion("D not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(Integer value1, Integer value2) {
            addCriterion("D between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(Integer value1, Integer value2) {
            addCriterion("D not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andEIsNull() {
            addCriterion("E is null");
            return (Criteria) this;
        }

        public Criteria andEIsNotNull() {
            addCriterion("E is not null");
            return (Criteria) this;
        }

        public Criteria andEEqualTo(Integer value) {
            addCriterion("E =", value, "e");
            return (Criteria) this;
        }

        public Criteria andENotEqualTo(Integer value) {
            addCriterion("E <>", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThan(Integer value) {
            addCriterion("E >", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThanOrEqualTo(Integer value) {
            addCriterion("E >=", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThan(Integer value) {
            addCriterion("E <", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThanOrEqualTo(Integer value) {
            addCriterion("E <=", value, "e");
            return (Criteria) this;
        }

        public Criteria andEIn(List<Integer> values) {
            addCriterion("E in", values, "e");
            return (Criteria) this;
        }

        public Criteria andENotIn(List<Integer> values) {
            addCriterion("E not in", values, "e");
            return (Criteria) this;
        }

        public Criteria andEBetween(Integer value1, Integer value2) {
            addCriterion("E between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andENotBetween(Integer value1, Integer value2) {
            addCriterion("E not between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andFIsNull() {
            addCriterion("F is null");
            return (Criteria) this;
        }

        public Criteria andFIsNotNull() {
            addCriterion("F is not null");
            return (Criteria) this;
        }

        public Criteria andFEqualTo(Integer value) {
            addCriterion("F =", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotEqualTo(Integer value) {
            addCriterion("F <>", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThan(Integer value) {
            addCriterion("F >", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThanOrEqualTo(Integer value) {
            addCriterion("F >=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThan(Integer value) {
            addCriterion("F <", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThanOrEqualTo(Integer value) {
            addCriterion("F <=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFIn(List<Integer> values) {
            addCriterion("F in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFNotIn(List<Integer> values) {
            addCriterion("F not in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFBetween(Integer value1, Integer value2) {
            addCriterion("F between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andFNotBetween(Integer value1, Integer value2) {
            addCriterion("F not between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andGIsNull() {
            addCriterion("G is null");
            return (Criteria) this;
        }

        public Criteria andGIsNotNull() {
            addCriterion("G is not null");
            return (Criteria) this;
        }

        public Criteria andGEqualTo(Integer value) {
            addCriterion("G =", value, "g");
            return (Criteria) this;
        }

        public Criteria andGNotEqualTo(Integer value) {
            addCriterion("G <>", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThan(Integer value) {
            addCriterion("G >", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThanOrEqualTo(Integer value) {
            addCriterion("G >=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThan(Integer value) {
            addCriterion("G <", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThanOrEqualTo(Integer value) {
            addCriterion("G <=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGIn(List<Integer> values) {
            addCriterion("G in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGNotIn(List<Integer> values) {
            addCriterion("G not in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGBetween(Integer value1, Integer value2) {
            addCriterion("G between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andGNotBetween(Integer value1, Integer value2) {
            addCriterion("G not between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("H is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("H is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(Integer value) {
            addCriterion("H =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(Integer value) {
            addCriterion("H <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(Integer value) {
            addCriterion("H >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(Integer value) {
            addCriterion("H >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(Integer value) {
            addCriterion("H <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(Integer value) {
            addCriterion("H <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<Integer> values) {
            addCriterion("H in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<Integer> values) {
            addCriterion("H not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(Integer value1, Integer value2) {
            addCriterion("H between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(Integer value1, Integer value2) {
            addCriterion("H not between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andIIsNull() {
            addCriterion("I is null");
            return (Criteria) this;
        }

        public Criteria andIIsNotNull() {
            addCriterion("I is not null");
            return (Criteria) this;
        }

        public Criteria andIEqualTo(Integer value) {
            addCriterion("I =", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotEqualTo(Integer value) {
            addCriterion("I <>", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThan(Integer value) {
            addCriterion("I >", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThanOrEqualTo(Integer value) {
            addCriterion("I >=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThan(Integer value) {
            addCriterion("I <", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThanOrEqualTo(Integer value) {
            addCriterion("I <=", value, "i");
            return (Criteria) this;
        }

        public Criteria andIIn(List<Integer> values) {
            addCriterion("I in", values, "i");
            return (Criteria) this;
        }

        public Criteria andINotIn(List<Integer> values) {
            addCriterion("I not in", values, "i");
            return (Criteria) this;
        }

        public Criteria andIBetween(Integer value1, Integer value2) {
            addCriterion("I between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andINotBetween(Integer value1, Integer value2) {
            addCriterion("I not between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andJIsNull() {
            addCriterion("J is null");
            return (Criteria) this;
        }

        public Criteria andJIsNotNull() {
            addCriterion("J is not null");
            return (Criteria) this;
        }

        public Criteria andJEqualTo(Integer value) {
            addCriterion("J =", value, "j");
            return (Criteria) this;
        }

        public Criteria andJNotEqualTo(Integer value) {
            addCriterion("J <>", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThan(Integer value) {
            addCriterion("J >", value, "j");
            return (Criteria) this;
        }

        public Criteria andJGreaterThanOrEqualTo(Integer value) {
            addCriterion("J >=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThan(Integer value) {
            addCriterion("J <", value, "j");
            return (Criteria) this;
        }

        public Criteria andJLessThanOrEqualTo(Integer value) {
            addCriterion("J <=", value, "j");
            return (Criteria) this;
        }

        public Criteria andJIn(List<Integer> values) {
            addCriterion("J in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJNotIn(List<Integer> values) {
            addCriterion("J not in", values, "j");
            return (Criteria) this;
        }

        public Criteria andJBetween(Integer value1, Integer value2) {
            addCriterion("J between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andJNotBetween(Integer value1, Integer value2) {
            addCriterion("J not between", value1, value2, "j");
            return (Criteria) this;
        }

        public Criteria andKIsNull() {
            addCriterion("K is null");
            return (Criteria) this;
        }

        public Criteria andKIsNotNull() {
            addCriterion("K is not null");
            return (Criteria) this;
        }

        public Criteria andKEqualTo(Integer value) {
            addCriterion("K =", value, "k");
            return (Criteria) this;
        }

        public Criteria andKNotEqualTo(Integer value) {
            addCriterion("K <>", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThan(Integer value) {
            addCriterion("K >", value, "k");
            return (Criteria) this;
        }

        public Criteria andKGreaterThanOrEqualTo(Integer value) {
            addCriterion("K >=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThan(Integer value) {
            addCriterion("K <", value, "k");
            return (Criteria) this;
        }

        public Criteria andKLessThanOrEqualTo(Integer value) {
            addCriterion("K <=", value, "k");
            return (Criteria) this;
        }

        public Criteria andKIn(List<Integer> values) {
            addCriterion("K in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKNotIn(List<Integer> values) {
            addCriterion("K not in", values, "k");
            return (Criteria) this;
        }

        public Criteria andKBetween(Integer value1, Integer value2) {
            addCriterion("K between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andKNotBetween(Integer value1, Integer value2) {
            addCriterion("K not between", value1, value2, "k");
            return (Criteria) this;
        }

        public Criteria andLIsNull() {
            addCriterion("L is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("L is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(Integer value) {
            addCriterion("L =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(Integer value) {
            addCriterion("L <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(Integer value) {
            addCriterion("L >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(Integer value) {
            addCriterion("L >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(Integer value) {
            addCriterion("L <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(Integer value) {
            addCriterion("L <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<Integer> values) {
            addCriterion("L in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<Integer> values) {
            addCriterion("L not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(Integer value1, Integer value2) {
            addCriterion("L between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(Integer value1, Integer value2) {
            addCriterion("L not between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andMIsNull() {
            addCriterion("M is null");
            return (Criteria) this;
        }

        public Criteria andMIsNotNull() {
            addCriterion("M is not null");
            return (Criteria) this;
        }

        public Criteria andMEqualTo(Integer value) {
            addCriterion("M =", value, "m");
            return (Criteria) this;
        }

        public Criteria andMNotEqualTo(Integer value) {
            addCriterion("M <>", value, "m");
            return (Criteria) this;
        }

        public Criteria andMGreaterThan(Integer value) {
            addCriterion("M >", value, "m");
            return (Criteria) this;
        }

        public Criteria andMGreaterThanOrEqualTo(Integer value) {
            addCriterion("M >=", value, "m");
            return (Criteria) this;
        }

        public Criteria andMLessThan(Integer value) {
            addCriterion("M <", value, "m");
            return (Criteria) this;
        }

        public Criteria andMLessThanOrEqualTo(Integer value) {
            addCriterion("M <=", value, "m");
            return (Criteria) this;
        }

        public Criteria andMIn(List<Integer> values) {
            addCriterion("M in", values, "m");
            return (Criteria) this;
        }

        public Criteria andMNotIn(List<Integer> values) {
            addCriterion("M not in", values, "m");
            return (Criteria) this;
        }

        public Criteria andMBetween(Integer value1, Integer value2) {
            addCriterion("M between", value1, value2, "m");
            return (Criteria) this;
        }

        public Criteria andMNotBetween(Integer value1, Integer value2) {
            addCriterion("M not between", value1, value2, "m");
            return (Criteria) this;
        }

        public Criteria andNIsNull() {
            addCriterion("N is null");
            return (Criteria) this;
        }

        public Criteria andNIsNotNull() {
            addCriterion("N is not null");
            return (Criteria) this;
        }

        public Criteria andNEqualTo(Integer value) {
            addCriterion("N =", value, "n");
            return (Criteria) this;
        }

        public Criteria andNNotEqualTo(Integer value) {
            addCriterion("N <>", value, "n");
            return (Criteria) this;
        }

        public Criteria andNGreaterThan(Integer value) {
            addCriterion("N >", value, "n");
            return (Criteria) this;
        }

        public Criteria andNGreaterThanOrEqualTo(Integer value) {
            addCriterion("N >=", value, "n");
            return (Criteria) this;
        }

        public Criteria andNLessThan(Integer value) {
            addCriterion("N <", value, "n");
            return (Criteria) this;
        }

        public Criteria andNLessThanOrEqualTo(Integer value) {
            addCriterion("N <=", value, "n");
            return (Criteria) this;
        }

        public Criteria andNIn(List<Integer> values) {
            addCriterion("N in", values, "n");
            return (Criteria) this;
        }

        public Criteria andNNotIn(List<Integer> values) {
            addCriterion("N not in", values, "n");
            return (Criteria) this;
        }

        public Criteria andNBetween(Integer value1, Integer value2) {
            addCriterion("N between", value1, value2, "n");
            return (Criteria) this;
        }

        public Criteria andNNotBetween(Integer value1, Integer value2) {
            addCriterion("N not between", value1, value2, "n");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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