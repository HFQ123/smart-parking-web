package parking.hfq.com.smartparking.model;

import java.util.ArrayList;
import java.util.List;

public class ParkOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public ParkOrderExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
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
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
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

        public Criteria andCaridIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carId =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carId <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carId >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carId >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carId <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carId <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carId like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carId not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carId in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carId not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carId between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carId not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIsNull() {
            addCriterion("appointTime is null");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIsNotNull() {
            addCriterion("appointTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppointtimeEqualTo(String value) {
            addCriterion("appointTime =", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotEqualTo(String value) {
            addCriterion("appointTime <>", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeGreaterThan(String value) {
            addCriterion("appointTime >", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeGreaterThanOrEqualTo(String value) {
            addCriterion("appointTime >=", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeLessThan(String value) {
            addCriterion("appointTime <", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeLessThanOrEqualTo(String value) {
            addCriterion("appointTime <=", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeLike(String value) {
            addCriterion("appointTime like", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotLike(String value) {
            addCriterion("appointTime not like", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIn(List<String> values) {
            addCriterion("appointTime in", values, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotIn(List<String> values) {
            addCriterion("appointTime not in", values, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeBetween(String value1, String value2) {
            addCriterion("appointTime between", value1, value2, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotBetween(String value1, String value2) {
            addCriterion("appointTime not between", value1, value2, "appointtime");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(Float value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(Float value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(Float value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(Float value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(Float value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<Float> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<Float> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(Float value1, Float value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(Float value1, Float value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startDate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startDate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStarthourIsNull() {
            addCriterion("startHour is null");
            return (Criteria) this;
        }

        public Criteria andStarthourIsNotNull() {
            addCriterion("startHour is not null");
            return (Criteria) this;
        }

        public Criteria andStarthourEqualTo(Integer value) {
            addCriterion("startHour =", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotEqualTo(Integer value) {
            addCriterion("startHour <>", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourGreaterThan(Integer value) {
            addCriterion("startHour >", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourGreaterThanOrEqualTo(Integer value) {
            addCriterion("startHour >=", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourLessThan(Integer value) {
            addCriterion("startHour <", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourLessThanOrEqualTo(Integer value) {
            addCriterion("startHour <=", value, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourIn(List<Integer> values) {
            addCriterion("startHour in", values, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotIn(List<Integer> values) {
            addCriterion("startHour not in", values, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourBetween(Integer value1, Integer value2) {
            addCriterion("startHour between", value1, value2, "starthour");
            return (Criteria) this;
        }

        public Criteria andStarthourNotBetween(Integer value1, Integer value2) {
            addCriterion("startHour not between", value1, value2, "starthour");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("endDate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("endDate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEndhourIsNull() {
            addCriterion("endHour is null");
            return (Criteria) this;
        }

        public Criteria andEndhourIsNotNull() {
            addCriterion("endHour is not null");
            return (Criteria) this;
        }

        public Criteria andEndhourEqualTo(Integer value) {
            addCriterion("endHour =", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotEqualTo(Integer value) {
            addCriterion("endHour <>", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourGreaterThan(Integer value) {
            addCriterion("endHour >", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("endHour >=", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourLessThan(Integer value) {
            addCriterion("endHour <", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourLessThanOrEqualTo(Integer value) {
            addCriterion("endHour <=", value, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourIn(List<Integer> values) {
            addCriterion("endHour in", values, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotIn(List<Integer> values) {
            addCriterion("endHour not in", values, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourBetween(Integer value1, Integer value2) {
            addCriterion("endHour between", value1, value2, "endhour");
            return (Criteria) this;
        }

        public Criteria andEndhourNotBetween(Integer value1, Integer value2) {
            addCriterion("endHour not between", value1, value2, "endhour");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parkorder
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 08 15:47:16 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table parkorder
     *
     * @mbg.generated Wed Apr 08 15:47:16 CST 2020
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