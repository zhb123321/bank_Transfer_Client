package com.zl.bts.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeRateExample() {
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

        public Criteria andExchangeyidIsNull() {
            addCriterion("EXCHANGEYID is null");
            return (Criteria) this;
        }

        public Criteria andExchangeyidIsNotNull() {
            addCriterion("EXCHANGEYID is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeyidEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID =", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID <>", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEYID >", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID >=", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidLessThan(BigDecimal value) {
            addCriterion("EXCHANGEYID <", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEYID <=", value, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEYID in", values, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEYID not in", values, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEYID between", value1, value2, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andExchangeyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEYID not between", value1, value2, "exchangeyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNull() {
            addCriterion("CURRENCYID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("CURRENCYID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(BigDecimal value) {
            addCriterion("CURRENCYID >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(BigDecimal value) {
            addCriterion("CURRENCYID <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENCYID <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<BigDecimal> values) {
            addCriterion("CURRENCYID in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<BigDecimal> values) {
            addCriterion("CURRENCYID not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYID between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENCYID not between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyIsNull() {
            addCriterion("HOLDINGCURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyIsNotNull() {
            addCriterion("HOLDINGCURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyEqualTo(String value) {
            addCriterion("HOLDINGCURRENCY =", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyNotEqualTo(String value) {
            addCriterion("HOLDINGCURRENCY <>", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyGreaterThan(String value) {
            addCriterion("HOLDINGCURRENCY >", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDINGCURRENCY >=", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyLessThan(String value) {
            addCriterion("HOLDINGCURRENCY <", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyLessThanOrEqualTo(String value) {
            addCriterion("HOLDINGCURRENCY <=", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyLike(String value) {
            addCriterion("HOLDINGCURRENCY like", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyNotLike(String value) {
            addCriterion("HOLDINGCURRENCY not like", value, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyIn(List<String> values) {
            addCriterion("HOLDINGCURRENCY in", values, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyNotIn(List<String> values) {
            addCriterion("HOLDINGCURRENCY not in", values, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyBetween(String value1, String value2) {
            addCriterion("HOLDINGCURRENCY between", value1, value2, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andHoldingcurrencyNotBetween(String value1, String value2) {
            addCriterion("HOLDINGCURRENCY not between", value1, value2, "holdingcurrency");
            return (Criteria) this;
        }

        public Criteria andMoneychangingIsNull() {
            addCriterion("MONEYCHANGING is null");
            return (Criteria) this;
        }

        public Criteria andMoneychangingIsNotNull() {
            addCriterion("MONEYCHANGING is not null");
            return (Criteria) this;
        }

        public Criteria andMoneychangingEqualTo(String value) {
            addCriterion("MONEYCHANGING =", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingNotEqualTo(String value) {
            addCriterion("MONEYCHANGING <>", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingGreaterThan(String value) {
            addCriterion("MONEYCHANGING >", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingGreaterThanOrEqualTo(String value) {
            addCriterion("MONEYCHANGING >=", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingLessThan(String value) {
            addCriterion("MONEYCHANGING <", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingLessThanOrEqualTo(String value) {
            addCriterion("MONEYCHANGING <=", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingLike(String value) {
            addCriterion("MONEYCHANGING like", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingNotLike(String value) {
            addCriterion("MONEYCHANGING not like", value, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingIn(List<String> values) {
            addCriterion("MONEYCHANGING in", values, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingNotIn(List<String> values) {
            addCriterion("MONEYCHANGING not in", values, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingBetween(String value1, String value2) {
            addCriterion("MONEYCHANGING between", value1, value2, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andMoneychangingNotBetween(String value1, String value2) {
            addCriterion("MONEYCHANGING not between", value1, value2, "moneychanging");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(BigDecimal value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
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