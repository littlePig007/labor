package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZjDwzpdjbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjDwzpdjbExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andZpbhIsNull() {
            addCriterion("ZPBH is null");
            return (Criteria) this;
        }

        public Criteria andZpbhIsNotNull() {
            addCriterion("ZPBH is not null");
            return (Criteria) this;
        }

        public Criteria andZpbhEqualTo(Integer value) {
            addCriterion("ZPBH =", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotEqualTo(Integer value) {
            addCriterion("ZPBH <>", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThan(Integer value) {
            addCriterion("ZPBH >", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZPBH >=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThan(Integer value) {
            addCriterion("ZPBH <", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThanOrEqualTo(Integer value) {
            addCriterion("ZPBH <=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhIn(List<Integer> values) {
            addCriterion("ZPBH in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotIn(List<Integer> values) {
            addCriterion("ZPBH not in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhBetween(Integer value1, Integer value2) {
            addCriterion("ZPBH between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotBetween(Integer value1, Integer value2) {
            addCriterion("ZPBH not between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andDwbhIsNull() {
            addCriterion("DWBH is null");
            return (Criteria) this;
        }

        public Criteria andDwbhIsNotNull() {
            addCriterion("DWBH is not null");
            return (Criteria) this;
        }

        public Criteria andDwbhEqualTo(Integer value) {
            addCriterion("DWBH =", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotEqualTo(Integer value) {
            addCriterion("DWBH <>", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhGreaterThan(Integer value) {
            addCriterion("DWBH >", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhGreaterThanOrEqualTo(Integer value) {
            addCriterion("DWBH >=", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhLessThan(Integer value) {
            addCriterion("DWBH <", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhLessThanOrEqualTo(Integer value) {
            addCriterion("DWBH <=", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhIn(List<Integer> values) {
            addCriterion("DWBH in", values, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotIn(List<Integer> values) {
            addCriterion("DWBH not in", values, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhBetween(Integer value1, Integer value2) {
            addCriterion("DWBH between", value1, value2, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotBetween(Integer value1, Integer value2) {
            addCriterion("DWBH not between", value1, value2, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwlxrIsNull() {
            addCriterion("DWLXR is null");
            return (Criteria) this;
        }

        public Criteria andDwlxrIsNotNull() {
            addCriterion("DWLXR is not null");
            return (Criteria) this;
        }

        public Criteria andDwlxrEqualTo(String value) {
            addCriterion("DWLXR =", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrNotEqualTo(String value) {
            addCriterion("DWLXR <>", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrGreaterThan(String value) {
            addCriterion("DWLXR >", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrGreaterThanOrEqualTo(String value) {
            addCriterion("DWLXR >=", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrLessThan(String value) {
            addCriterion("DWLXR <", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrLessThanOrEqualTo(String value) {
            addCriterion("DWLXR <=", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrLike(String value) {
            addCriterion("DWLXR like", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrNotLike(String value) {
            addCriterion("DWLXR not like", value, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrIn(List<String> values) {
            addCriterion("DWLXR in", values, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrNotIn(List<String> values) {
            addCriterion("DWLXR not in", values, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrBetween(String value1, String value2) {
            addCriterion("DWLXR between", value1, value2, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andDwlxrNotBetween(String value1, String value2) {
            addCriterion("DWLXR not between", value1, value2, "dwlxr");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmIsNull() {
            addCriterion("LXRSFZHM is null");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmIsNotNull() {
            addCriterion("LXRSFZHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmEqualTo(String value) {
            addCriterion("LXRSFZHM =", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmNotEqualTo(String value) {
            addCriterion("LXRSFZHM <>", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmGreaterThan(String value) {
            addCriterion("LXRSFZHM >", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXRSFZHM >=", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmLessThan(String value) {
            addCriterion("LXRSFZHM <", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmLessThanOrEqualTo(String value) {
            addCriterion("LXRSFZHM <=", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmLike(String value) {
            addCriterion("LXRSFZHM like", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmNotLike(String value) {
            addCriterion("LXRSFZHM not like", value, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmIn(List<String> values) {
            addCriterion("LXRSFZHM in", values, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmNotIn(List<String> values) {
            addCriterion("LXRSFZHM not in", values, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmBetween(String value1, String value2) {
            addCriterion("LXRSFZHM between", value1, value2, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsfzhmNotBetween(String value1, String value2) {
            addCriterion("LXRSFZHM not between", value1, value2, "lxrsfzhm");
            return (Criteria) this;
        }

        public Criteria andLxrsjIsNull() {
            addCriterion("LXRSJ is null");
            return (Criteria) this;
        }

        public Criteria andLxrsjIsNotNull() {
            addCriterion("LXRSJ is not null");
            return (Criteria) this;
        }

        public Criteria andLxrsjEqualTo(String value) {
            addCriterion("LXRSJ =", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjNotEqualTo(String value) {
            addCriterion("LXRSJ <>", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjGreaterThan(String value) {
            addCriterion("LXRSJ >", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjGreaterThanOrEqualTo(String value) {
            addCriterion("LXRSJ >=", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjLessThan(String value) {
            addCriterion("LXRSJ <", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjLessThanOrEqualTo(String value) {
            addCriterion("LXRSJ <=", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjLike(String value) {
            addCriterion("LXRSJ like", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjNotLike(String value) {
            addCriterion("LXRSJ not like", value, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjIn(List<String> values) {
            addCriterion("LXRSJ in", values, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjNotIn(List<String> values) {
            addCriterion("LXRSJ not in", values, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjBetween(String value1, String value2) {
            addCriterion("LXRSJ between", value1, value2, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andLxrsjNotBetween(String value1, String value2) {
            addCriterion("LXRSJ not between", value1, value2, "lxrsj");
            return (Criteria) this;
        }

        public Criteria andSfdjIsNull() {
            addCriterion("SFDJ is null");
            return (Criteria) this;
        }

        public Criteria andSfdjIsNotNull() {
            addCriterion("SFDJ is not null");
            return (Criteria) this;
        }

        public Criteria andSfdjEqualTo(String value) {
            addCriterion("SFDJ =", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotEqualTo(String value) {
            addCriterion("SFDJ <>", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjGreaterThan(String value) {
            addCriterion("SFDJ >", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjGreaterThanOrEqualTo(String value) {
            addCriterion("SFDJ >=", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLessThan(String value) {
            addCriterion("SFDJ <", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLessThanOrEqualTo(String value) {
            addCriterion("SFDJ <=", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjLike(String value) {
            addCriterion("SFDJ like", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotLike(String value) {
            addCriterion("SFDJ not like", value, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjIn(List<String> values) {
            addCriterion("SFDJ in", values, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotIn(List<String> values) {
            addCriterion("SFDJ not in", values, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjBetween(String value1, String value2) {
            addCriterion("SFDJ between", value1, value2, "sfdj");
            return (Criteria) this;
        }

        public Criteria andSfdjNotBetween(String value1, String value2) {
            addCriterion("SFDJ not between", value1, value2, "sfdj");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNull() {
            addCriterion("DJYXQ is null");
            return (Criteria) this;
        }

        public Criteria andDjyxqIsNotNull() {
            addCriterion("DJYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andDjyxqEqualTo(Integer value) {
            addCriterion("DJYXQ =", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotEqualTo(Integer value) {
            addCriterion("DJYXQ <>", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThan(Integer value) {
            addCriterion("DJYXQ >", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqGreaterThanOrEqualTo(Integer value) {
            addCriterion("DJYXQ >=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThan(Integer value) {
            addCriterion("DJYXQ <", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqLessThanOrEqualTo(Integer value) {
            addCriterion("DJYXQ <=", value, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqIn(List<Integer> values) {
            addCriterion("DJYXQ in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotIn(List<Integer> values) {
            addCriterion("DJYXQ not in", values, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqBetween(Integer value1, Integer value2) {
            addCriterion("DJYXQ between", value1, value2, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjyxqNotBetween(Integer value1, Integer value2) {
            addCriterion("DJYXQ not between", value1, value2, "djyxq");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNull() {
            addCriterion("DJSJ is null");
            return (Criteria) this;
        }

        public Criteria andDjsjIsNotNull() {
            addCriterion("DJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjsjEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ =", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ <>", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("DJSJ >", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ >=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThan(Date value) {
            addCriterionForJDBCDate("DJSJ <", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJSJ <=", value, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjIn(List<Date> values) {
            addCriterionForJDBCDate("DJSJ in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("DJSJ not in", values, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJSJ between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andDjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJSJ not between", value1, value2, "djsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNull() {
            addCriterion("GDSJ is null");
            return (Criteria) this;
        }

        public Criteria andGdsjIsNotNull() {
            addCriterion("GDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGdsjEqualTo(Date value) {
            addCriterionForJDBCDate("GDSJ =", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("GDSJ <>", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThan(Date value) {
            addCriterionForJDBCDate("GDSJ >", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GDSJ >=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThan(Date value) {
            addCriterionForJDBCDate("GDSJ <", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GDSJ <=", value, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjIn(List<Date> values) {
            addCriterionForJDBCDate("GDSJ in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("GDSJ not in", values, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GDSJ between", value1, value2, "gdsj");
            return (Criteria) this;
        }

        public Criteria andGdsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GDSJ not between", value1, value2, "gdsj");
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