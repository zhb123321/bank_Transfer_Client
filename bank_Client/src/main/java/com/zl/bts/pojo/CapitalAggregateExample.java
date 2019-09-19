package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CapitalAggregateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalAggregateExample() {
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

        public Criteria andCapitalidIsNull() {
            addCriterion("CAPITALID is null");
            return (Criteria) this;
        }

        public Criteria andCapitalidIsNotNull() {
            addCriterion("CAPITALID is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalidEqualTo(BigDecimal value) {
            addCriterion("CAPITALID =", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidNotEqualTo(BigDecimal value) {
            addCriterion("CAPITALID <>", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidGreaterThan(BigDecimal value) {
            addCriterion("CAPITALID >", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITALID >=", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidLessThan(BigDecimal value) {
            addCriterion("CAPITALID <", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITALID <=", value, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidIn(List<BigDecimal> values) {
            addCriterion("CAPITALID in", values, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidNotIn(List<BigDecimal> values) {
            addCriterion("CAPITALID not in", values, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITALID between", value1, value2, "capitalid");
            return (Criteria) this;
        }

        public Criteria andCapitalidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITALID not between", value1, value2, "capitalid");
            return (Criteria) this;
        }

        public Criteria andOutaccountIsNull() {
            addCriterion("OUTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOutaccountIsNotNull() {
            addCriterion("OUTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOutaccountEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT =", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT <>", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThan(BigDecimal value) {
            addCriterion("OUTACCOUNT >", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT >=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThan(BigDecimal value) {
            addCriterion("OUTACCOUNT <", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTACCOUNT <=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountIn(List<BigDecimal> values) {
            addCriterion("OUTACCOUNT in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotIn(List<BigDecimal> values) {
            addCriterion("OUTACCOUNT not in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTACCOUNT between", value1, value2, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTACCOUNT not between", value1, value2, "outaccount");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIsNull() {
            addCriterion("OUTBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIsNotNull() {
            addCriterion("OUTBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutbanknameEqualTo(String value) {
            addCriterion("OUTBANKNAME =", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotEqualTo(String value) {
            addCriterion("OUTBANKNAME <>", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameGreaterThan(String value) {
            addCriterion("OUTBANKNAME >", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("OUTBANKNAME >=", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLessThan(String value) {
            addCriterion("OUTBANKNAME <", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLessThanOrEqualTo(String value) {
            addCriterion("OUTBANKNAME <=", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameLike(String value) {
            addCriterion("OUTBANKNAME like", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotLike(String value) {
            addCriterion("OUTBANKNAME not like", value, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameIn(List<String> values) {
            addCriterion("OUTBANKNAME in", values, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotIn(List<String> values) {
            addCriterion("OUTBANKNAME not in", values, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameBetween(String value1, String value2) {
            addCriterion("OUTBANKNAME between", value1, value2, "outbankname");
            return (Criteria) this;
        }

        public Criteria andOutbanknameNotBetween(String value1, String value2) {
            addCriterion("OUTBANKNAME not between", value1, value2, "outbankname");
            return (Criteria) this;
        }

        public Criteria andInaccountIsNull() {
            addCriterion("INACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInaccountIsNotNull() {
            addCriterion("INACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInaccountEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT =", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT <>", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThan(BigDecimal value) {
            addCriterion("INACCOUNT >", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT >=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThan(BigDecimal value) {
            addCriterion("INACCOUNT <", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INACCOUNT <=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountIn(List<BigDecimal> values) {
            addCriterion("INACCOUNT in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotIn(List<BigDecimal> values) {
            addCriterion("INACCOUNT not in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INACCOUNT between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INACCOUNT not between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInbanknameIsNull() {
            addCriterion("INBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andInbanknameIsNotNull() {
            addCriterion("INBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInbanknameEqualTo(String value) {
            addCriterion("INBANKNAME =", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameNotEqualTo(String value) {
            addCriterion("INBANKNAME <>", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameGreaterThan(String value) {
            addCriterion("INBANKNAME >", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("INBANKNAME >=", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameLessThan(String value) {
            addCriterion("INBANKNAME <", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameLessThanOrEqualTo(String value) {
            addCriterion("INBANKNAME <=", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameLike(String value) {
            addCriterion("INBANKNAME like", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameNotLike(String value) {
            addCriterion("INBANKNAME not like", value, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameIn(List<String> values) {
            addCriterion("INBANKNAME in", values, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameNotIn(List<String> values) {
            addCriterion("INBANKNAME not in", values, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameBetween(String value1, String value2) {
            addCriterion("INBANKNAME between", value1, value2, "inbankname");
            return (Criteria) this;
        }

        public Criteria andInbanknameNotBetween(String value1, String value2) {
            addCriterion("INBANKNAME not between", value1, value2, "inbankname");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeIsNull() {
            addCriterion("AGGREGATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeIsNotNull() {
            addCriterion("AGGREGATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeEqualTo(String value) {
            addCriterion("AGGREGATETYPE =", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeNotEqualTo(String value) {
            addCriterion("AGGREGATETYPE <>", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeGreaterThan(String value) {
            addCriterion("AGGREGATETYPE >", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("AGGREGATETYPE >=", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeLessThan(String value) {
            addCriterion("AGGREGATETYPE <", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeLessThanOrEqualTo(String value) {
            addCriterion("AGGREGATETYPE <=", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeLike(String value) {
            addCriterion("AGGREGATETYPE like", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeNotLike(String value) {
            addCriterion("AGGREGATETYPE not like", value, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeIn(List<String> values) {
            addCriterion("AGGREGATETYPE in", values, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeNotIn(List<String> values) {
            addCriterion("AGGREGATETYPE not in", values, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeBetween(String value1, String value2) {
            addCriterion("AGGREGATETYPE between", value1, value2, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatetypeNotBetween(String value1, String value2) {
            addCriterion("AGGREGATETYPE not between", value1, value2, "aggregatetype");
            return (Criteria) this;
        }

        public Criteria andAggregatedateIsNull() {
            addCriterion("AGGREGATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andAggregatedateIsNotNull() {
            addCriterion("AGGREGATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAggregatedateEqualTo(String value) {
            addCriterion("AGGREGATEDATE =", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateNotEqualTo(String value) {
            addCriterion("AGGREGATEDATE <>", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateGreaterThan(String value) {
            addCriterion("AGGREGATEDATE >", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateGreaterThanOrEqualTo(String value) {
            addCriterion("AGGREGATEDATE >=", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateLessThan(String value) {
            addCriterion("AGGREGATEDATE <", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateLessThanOrEqualTo(String value) {
            addCriterion("AGGREGATEDATE <=", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateLike(String value) {
            addCriterion("AGGREGATEDATE like", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateNotLike(String value) {
            addCriterion("AGGREGATEDATE not like", value, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateIn(List<String> values) {
            addCriterion("AGGREGATEDATE in", values, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateNotIn(List<String> values) {
            addCriterion("AGGREGATEDATE not in", values, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateBetween(String value1, String value2) {
            addCriterion("AGGREGATEDATE between", value1, value2, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andAggregatedateNotBetween(String value1, String value2) {
            addCriterion("AGGREGATEDATE not between", value1, value2, "aggregatedate");
            return (Criteria) this;
        }

        public Criteria andBalanceupperIsNull() {
            addCriterion("BALANCEUPPER is null");
            return (Criteria) this;
        }

        public Criteria andBalanceupperIsNotNull() {
            addCriterion("BALANCEUPPER is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceupperEqualTo(BigDecimal value) {
            addCriterion("BALANCEUPPER =", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperNotEqualTo(BigDecimal value) {
            addCriterion("BALANCEUPPER <>", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperGreaterThan(BigDecimal value) {
            addCriterion("BALANCEUPPER >", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCEUPPER >=", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperLessThan(BigDecimal value) {
            addCriterion("BALANCEUPPER <", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCEUPPER <=", value, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperIn(List<BigDecimal> values) {
            addCriterion("BALANCEUPPER in", values, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperNotIn(List<BigDecimal> values) {
            addCriterion("BALANCEUPPER not in", values, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCEUPPER between", value1, value2, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalanceupperNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCEUPPER not between", value1, value2, "balanceupper");
            return (Criteria) this;
        }

        public Criteria andBalancelowerIsNull() {
            addCriterion("BALANCELOWER is null");
            return (Criteria) this;
        }

        public Criteria andBalancelowerIsNotNull() {
            addCriterion("BALANCELOWER is not null");
            return (Criteria) this;
        }

        public Criteria andBalancelowerEqualTo(BigDecimal value) {
            addCriterion("BALANCELOWER =", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerNotEqualTo(BigDecimal value) {
            addCriterion("BALANCELOWER <>", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerGreaterThan(BigDecimal value) {
            addCriterion("BALANCELOWER >", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCELOWER >=", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerLessThan(BigDecimal value) {
            addCriterion("BALANCELOWER <", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCELOWER <=", value, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerIn(List<BigDecimal> values) {
            addCriterion("BALANCELOWER in", values, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerNotIn(List<BigDecimal> values) {
            addCriterion("BALANCELOWER not in", values, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCELOWER between", value1, value2, "balancelower");
            return (Criteria) this;
        }

        public Criteria andBalancelowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCELOWER not between", value1, value2, "balancelower");
            return (Criteria) this;
        }

        public Criteria andAggregateruleIsNull() {
            addCriterion("AGGREGATERULE is null");
            return (Criteria) this;
        }

        public Criteria andAggregateruleIsNotNull() {
            addCriterion("AGGREGATERULE is not null");
            return (Criteria) this;
        }

        public Criteria andAggregateruleEqualTo(String value) {
            addCriterion("AGGREGATERULE =", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleNotEqualTo(String value) {
            addCriterion("AGGREGATERULE <>", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleGreaterThan(String value) {
            addCriterion("AGGREGATERULE >", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleGreaterThanOrEqualTo(String value) {
            addCriterion("AGGREGATERULE >=", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleLessThan(String value) {
            addCriterion("AGGREGATERULE <", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleLessThanOrEqualTo(String value) {
            addCriterion("AGGREGATERULE <=", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleLike(String value) {
            addCriterion("AGGREGATERULE like", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleNotLike(String value) {
            addCriterion("AGGREGATERULE not like", value, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleIn(List<String> values) {
            addCriterion("AGGREGATERULE in", values, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleNotIn(List<String> values) {
            addCriterion("AGGREGATERULE not in", values, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleBetween(String value1, String value2) {
            addCriterion("AGGREGATERULE between", value1, value2, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andAggregateruleNotBetween(String value1, String value2) {
            addCriterion("AGGREGATERULE not between", value1, value2, "aggregaterule");
            return (Criteria) this;
        }

        public Criteria andSigningstatusIsNull() {
            addCriterion("SIGNINGSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSigningstatusIsNotNull() {
            addCriterion("SIGNINGSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSigningstatusEqualTo(String value) {
            addCriterion("SIGNINGSTATUS =", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusNotEqualTo(String value) {
            addCriterion("SIGNINGSTATUS <>", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusGreaterThan(String value) {
            addCriterion("SIGNINGSTATUS >", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNINGSTATUS >=", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusLessThan(String value) {
            addCriterion("SIGNINGSTATUS <", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusLessThanOrEqualTo(String value) {
            addCriterion("SIGNINGSTATUS <=", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusLike(String value) {
            addCriterion("SIGNINGSTATUS like", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusNotLike(String value) {
            addCriterion("SIGNINGSTATUS not like", value, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusIn(List<String> values) {
            addCriterion("SIGNINGSTATUS in", values, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusNotIn(List<String> values) {
            addCriterion("SIGNINGSTATUS not in", values, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusBetween(String value1, String value2) {
            addCriterion("SIGNINGSTATUS between", value1, value2, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andSigningstatusNotBetween(String value1, String value2) {
            addCriterion("SIGNINGSTATUS not between", value1, value2, "signingstatus");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNull() {
            addCriterion("DELETETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNotNull() {
            addCriterion("DELETETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeEqualTo(String value) {
            addCriterion("DELETETYPE =", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotEqualTo(String value) {
            addCriterion("DELETETYPE <>", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThan(String value) {
            addCriterion("DELETETYPE >", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DELETETYPE >=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThan(String value) {
            addCriterion("DELETETYPE <", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("DELETETYPE <=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLike(String value) {
            addCriterion("DELETETYPE like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotLike(String value) {
            addCriterion("DELETETYPE not like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIn(List<String> values) {
            addCriterion("DELETETYPE in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotIn(List<String> values) {
            addCriterion("DELETETYPE not in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeBetween(String value1, String value2) {
            addCriterion("DELETETYPE between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotBetween(String value1, String value2) {
            addCriterion("DELETETYPE not between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("UPTIME like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("UPTIME not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("UPTIME in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("UPTIME not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("UPTIME not between", value1, value2, "uptime");
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