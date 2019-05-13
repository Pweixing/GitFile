package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamProjectIsNull() {
            addCriterion("team_project is null");
            return (Criteria) this;
        }

        public Criteria andTeamProjectIsNotNull() {
            addCriterion("team_project is not null");
            return (Criteria) this;
        }

        public Criteria andTeamProjectEqualTo(String value) {
            addCriterion("team_project =", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectNotEqualTo(String value) {
            addCriterion("team_project <>", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectGreaterThan(String value) {
            addCriterion("team_project >", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectGreaterThanOrEqualTo(String value) {
            addCriterion("team_project >=", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectLessThan(String value) {
            addCriterion("team_project <", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectLessThanOrEqualTo(String value) {
            addCriterion("team_project <=", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectLike(String value) {
            addCriterion("team_project like", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectNotLike(String value) {
            addCriterion("team_project not like", value, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectIn(List<String> values) {
            addCriterion("team_project in", values, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectNotIn(List<String> values) {
            addCriterion("team_project not in", values, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectBetween(String value1, String value2) {
            addCriterion("team_project between", value1, value2, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamProjectNotBetween(String value1, String value2) {
            addCriterion("team_project not between", value1, value2, "teamProject");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumIsNull() {
            addCriterion("team_people_num is null");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumIsNotNull() {
            addCriterion("team_people_num is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumEqualTo(Integer value) {
            addCriterion("team_people_num =", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumNotEqualTo(Integer value) {
            addCriterion("team_people_num <>", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumGreaterThan(Integer value) {
            addCriterion("team_people_num >", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_people_num >=", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumLessThan(Integer value) {
            addCriterion("team_people_num <", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("team_people_num <=", value, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumIn(List<Integer> values) {
            addCriterion("team_people_num in", values, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumNotIn(List<Integer> values) {
            addCriterion("team_people_num not in", values, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("team_people_num between", value1, value2, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("team_people_num not between", value1, value2, "teamPeopleNum");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridIsNull() {
            addCriterion("team_tutorId is null");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridIsNotNull() {
            addCriterion("team_tutorId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridEqualTo(String value) {
            addCriterion("team_tutorId =", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridNotEqualTo(String value) {
            addCriterion("team_tutorId <>", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridGreaterThan(String value) {
            addCriterion("team_tutorId >", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridGreaterThanOrEqualTo(String value) {
            addCriterion("team_tutorId >=", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridLessThan(String value) {
            addCriterion("team_tutorId <", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridLessThanOrEqualTo(String value) {
            addCriterion("team_tutorId <=", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridLike(String value) {
            addCriterion("team_tutorId like", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridNotLike(String value) {
            addCriterion("team_tutorId not like", value, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridIn(List<String> values) {
            addCriterion("team_tutorId in", values, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridNotIn(List<String> values) {
            addCriterion("team_tutorId not in", values, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridBetween(String value1, String value2) {
            addCriterion("team_tutorId between", value1, value2, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamTutoridNotBetween(String value1, String value2) {
            addCriterion("team_tutorId not between", value1, value2, "teamTutorid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidIsNull() {
            addCriterion("team_headerId is null");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidIsNotNull() {
            addCriterion("team_headerId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidEqualTo(String value) {
            addCriterion("team_headerId =", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidNotEqualTo(String value) {
            addCriterion("team_headerId <>", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidGreaterThan(String value) {
            addCriterion("team_headerId >", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidGreaterThanOrEqualTo(String value) {
            addCriterion("team_headerId >=", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidLessThan(String value) {
            addCriterion("team_headerId <", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidLessThanOrEqualTo(String value) {
            addCriterion("team_headerId <=", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidLike(String value) {
            addCriterion("team_headerId like", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidNotLike(String value) {
            addCriterion("team_headerId not like", value, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidIn(List<String> values) {
            addCriterion("team_headerId in", values, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidNotIn(List<String> values) {
            addCriterion("team_headerId not in", values, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidBetween(String value1, String value2) {
            addCriterion("team_headerId between", value1, value2, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamHeaderidNotBetween(String value1, String value2) {
            addCriterion("team_headerId not between", value1, value2, "teamHeaderid");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIsNull() {
            addCriterion("team_score is null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIsNotNull() {
            addCriterion("team_score is not null");
            return (Criteria) this;
        }

        public Criteria andTeamScoreEqualTo(Integer value) {
            addCriterion("team_score =", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotEqualTo(Integer value) {
            addCriterion("team_score <>", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreGreaterThan(Integer value) {
            addCriterion("team_score >", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_score >=", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreLessThan(Integer value) {
            addCriterion("team_score <", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("team_score <=", value, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreIn(List<Integer> values) {
            addCriterion("team_score in", values, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotIn(List<Integer> values) {
            addCriterion("team_score not in", values, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("team_score between", value1, value2, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("team_score not between", value1, value2, "teamScore");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeIsNull() {
            addCriterion("team_remake is null");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeIsNotNull() {
            addCriterion("team_remake is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeEqualTo(String value) {
            addCriterion("team_remake =", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeNotEqualTo(String value) {
            addCriterion("team_remake <>", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeGreaterThan(String value) {
            addCriterion("team_remake >", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("team_remake >=", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeLessThan(String value) {
            addCriterion("team_remake <", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeLessThanOrEqualTo(String value) {
            addCriterion("team_remake <=", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeLike(String value) {
            addCriterion("team_remake like", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeNotLike(String value) {
            addCriterion("team_remake not like", value, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeIn(List<String> values) {
            addCriterion("team_remake in", values, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeNotIn(List<String> values) {
            addCriterion("team_remake not in", values, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeBetween(String value1, String value2) {
            addCriterion("team_remake between", value1, value2, "teamRemake");
            return (Criteria) this;
        }

        public Criteria andTeamRemakeNotBetween(String value1, String value2) {
            addCriterion("team_remake not between", value1, value2, "teamRemake");
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