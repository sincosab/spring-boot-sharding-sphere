package com.oujiong.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Log implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.id
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.log
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    private String log;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.created_time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_log
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.id
     *
     * @return the value of t_log.id
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.id
     *
     * @param id the value for t_log.id
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.log
     *
     * @return the value of t_log.log
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public String getLog() {
        return log;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.log
     *
     * @param log the value for t_log.log
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.time
     *
     * @return the value of t_log.time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.time
     *
     * @param time the value for t_log.time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.created_time
     *
     * @return the value of t_log.created_time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.created_time
     *
     * @param createdTime the value for t_log.created_time
     *
     * @mbg.generated Mon Nov 07 10:03:08 UTC 2022
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

}