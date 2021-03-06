package parking.hfq.com.smartparking.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpaceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public ParkingSpaceExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andParkinglotIdIsNull() {
            addCriterion("parkinglot_id is null");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdIsNotNull() {
            addCriterion("parkinglot_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdEqualTo(Integer value) {
            addCriterion("parkinglot_id =", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdNotEqualTo(Integer value) {
            addCriterion("parkinglot_id <>", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdGreaterThan(Integer value) {
            addCriterion("parkinglot_id >", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkinglot_id >=", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdLessThan(Integer value) {
            addCriterion("parkinglot_id <", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdLessThanOrEqualTo(Integer value) {
            addCriterion("parkinglot_id <=", value, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdIn(List<Integer> values) {
            addCriterion("parkinglot_id in", values, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdNotIn(List<Integer> values) {
            addCriterion("parkinglot_id not in", values, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdBetween(Integer value1, Integer value2) {
            addCriterion("parkinglot_id between", value1, value2, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andParkinglotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parkinglot_id not between", value1, value2, "parkinglotId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andInUseIsNull() {
            addCriterion("in_use is null");
            return (Criteria) this;
        }

        public Criteria andInUseIsNotNull() {
            addCriterion("in_use is not null");
            return (Criteria) this;
        }

        public Criteria andInUseEqualTo(Integer value) {
            addCriterion("in_use =", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotEqualTo(Integer value) {
            addCriterion("in_use <>", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseGreaterThan(Integer value) {
            addCriterion("in_use >", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_use >=", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseLessThan(Integer value) {
            addCriterion("in_use <", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseLessThanOrEqualTo(Integer value) {
            addCriterion("in_use <=", value, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseIn(List<Integer> values) {
            addCriterion("in_use in", values, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotIn(List<Integer> values) {
            addCriterion("in_use not in", values, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseBetween(Integer value1, Integer value2) {
            addCriterion("in_use between", value1, value2, "inUse");
            return (Criteria) this;
        }

        public Criteria andInUseNotBetween(Integer value1, Integer value2) {
            addCriterion("in_use not between", value1, value2, "inUse");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNull() {
            addCriterion("park_time is null");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNotNull() {
            addCriterion("park_time is not null");
            return (Criteria) this;
        }

        public Criteria andParkTimeEqualTo(Long value) {
            addCriterion("park_time =", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotEqualTo(Long value) {
            addCriterion("park_time <>", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThan(Long value) {
            addCriterion("park_time >", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("park_time >=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThan(Long value) {
            addCriterion("park_time <", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThanOrEqualTo(Long value) {
            addCriterion("park_time <=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeIn(List<Long> values) {
            addCriterion("park_time in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotIn(List<Long> values) {
            addCriterion("park_time not in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeBetween(Long value1, Long value2) {
            addCriterion("park_time between", value1, value2, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotBetween(Long value1, Long value2) {
            addCriterion("park_time not between", value1, value2, "parkTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parking_space
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 16 21:21:39 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parking_space
     *
     * @mbg.generated Thu Apr 16 21:21:39 CST 2020
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