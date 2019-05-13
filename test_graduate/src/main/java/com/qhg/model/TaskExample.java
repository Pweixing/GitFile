package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNull() {
            addCriterion("task_description is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNotNull() {
            addCriterion("task_description is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionEqualTo(String value) {
            addCriterion("task_description =", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotEqualTo(String value) {
            addCriterion("task_description <>", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThan(String value) {
            addCriterion("task_description >", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("task_description >=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThan(String value) {
            addCriterion("task_description <", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThanOrEqualTo(String value) {
            addCriterion("task_description <=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLike(String value) {
            addCriterion("task_description like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotLike(String value) {
            addCriterion("task_description not like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIn(List<String> values) {
            addCriterion("task_description in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotIn(List<String> values) {
            addCriterion("task_description not in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionBetween(String value1, String value2) {
            addCriterion("task_description between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotBetween(String value1, String value2) {
            addCriterion("task_description not between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeIsNull() {
            addCriterion("task_starttime is null");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeIsNotNull() {
            addCriterion("task_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeEqualTo(String value) {
            addCriterion("task_starttime =", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeNotEqualTo(String value) {
            addCriterion("task_starttime <>", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeGreaterThan(String value) {
            addCriterion("task_starttime >", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_starttime >=", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeLessThan(String value) {
            addCriterion("task_starttime <", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeLessThanOrEqualTo(String value) {
            addCriterion("task_starttime <=", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeLike(String value) {
            addCriterion("task_starttime like", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeNotLike(String value) {
            addCriterion("task_starttime not like", value, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeIn(List<String> values) {
            addCriterion("task_starttime in", values, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeNotIn(List<String> values) {
            addCriterion("task_starttime not in", values, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeBetween(String value1, String value2) {
            addCriterion("task_starttime between", value1, value2, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskStarttimeNotBetween(String value1, String value2) {
            addCriterion("task_starttime not between", value1, value2, "taskStarttime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeIsNull() {
            addCriterion("task_endtime is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeIsNotNull() {
            addCriterion("task_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeEqualTo(String value) {
            addCriterion("task_endtime =", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeNotEqualTo(String value) {
            addCriterion("task_endtime <>", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeGreaterThan(String value) {
            addCriterion("task_endtime >", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_endtime >=", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeLessThan(String value) {
            addCriterion("task_endtime <", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeLessThanOrEqualTo(String value) {
            addCriterion("task_endtime <=", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeLike(String value) {
            addCriterion("task_endtime like", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeNotLike(String value) {
            addCriterion("task_endtime not like", value, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeIn(List<String> values) {
            addCriterion("task_endtime in", values, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeNotIn(List<String> values) {
            addCriterion("task_endtime not in", values, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeBetween(String value1, String value2) {
            addCriterion("task_endtime between", value1, value2, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTaskEndtimeNotBetween(String value1, String value2) {
            addCriterion("task_endtime not between", value1, value2, "taskEndtime");
            return (Criteria) this;
        }

        public Criteria andTutoridIsNull() {
            addCriterion("tutorid is null");
            return (Criteria) this;
        }

        public Criteria andTutoridIsNotNull() {
            addCriterion("tutorid is not null");
            return (Criteria) this;
        }

        public Criteria andTutoridEqualTo(String value) {
            addCriterion("tutorid =", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotEqualTo(String value) {
            addCriterion("tutorid <>", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridGreaterThan(String value) {
            addCriterion("tutorid >", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridGreaterThanOrEqualTo(String value) {
            addCriterion("tutorid >=", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridLessThan(String value) {
            addCriterion("tutorid <", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridLessThanOrEqualTo(String value) {
            addCriterion("tutorid <=", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridLike(String value) {
            addCriterion("tutorid like", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotLike(String value) {
            addCriterion("tutorid not like", value, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridIn(List<String> values) {
            addCriterion("tutorid in", values, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotIn(List<String> values) {
            addCriterion("tutorid not in", values, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridBetween(String value1, String value2) {
            addCriterion("tutorid between", value1, value2, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTutoridNotBetween(String value1, String value2) {
            addCriterion("tutorid not between", value1, value2, "tutorid");
            return (Criteria) this;
        }

        public Criteria andTaskTatusIsNull() {
            addCriterion("task_tatus is null");
            return (Criteria) this;
        }

        public Criteria andTaskTatusIsNotNull() {
            addCriterion("task_tatus is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTatusEqualTo(Integer value) {
            addCriterion("task_tatus =", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusNotEqualTo(Integer value) {
            addCriterion("task_tatus <>", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusGreaterThan(Integer value) {
            addCriterion("task_tatus >", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_tatus >=", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusLessThan(Integer value) {
            addCriterion("task_tatus <", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_tatus <=", value, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusIn(List<Integer> values) {
            addCriterion("task_tatus in", values, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusNotIn(List<Integer> values) {
            addCriterion("task_tatus not in", values, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusBetween(Integer value1, Integer value2) {
            addCriterion("task_tatus between", value1, value2, "taskTatus");
            return (Criteria) this;
        }

        public Criteria andTaskTatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_tatus not between", value1, value2, "taskTatus");
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