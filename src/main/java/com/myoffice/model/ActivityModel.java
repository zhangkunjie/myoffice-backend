package com.myoffice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myoffice.common.constant.Constant;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.soap.SAAJResult;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class ActivityModel implements Serializable {
    private BigInteger id;
    private String name;
    private Integer category;
    private Integer priority;
    @DateTimeFormat(pattern = Constant.DATE_FORMAT)
    @JsonFormat(pattern = Constant.DATE_FORMAT, timezone = "GMT+8")
    private Date createDay;
    @DateTimeFormat(pattern = Constant.TIME_FORMAT)
    @JsonFormat(pattern = Constant.TIME_FORMAT, timezone = "GMT+8")
    private Date startTime;
    @DateTimeFormat(pattern = Constant.TIME_FORMAT)
    @JsonFormat(pattern = Constant.TIME_FORMAT, timezone = "GMT+8")
    private Date endTime;
    private Double implementRate;
    private String remark;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getImplementRate() {
        return implementRate;
    }

    public void setImplementRate(Double implementRate) {
        this.implementRate = implementRate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ActivityModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", priority=" + priority +
                ", crateDay=" + createDay +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", implementRate=" + implementRate +
                ", remark='" + remark + '\'' +
                '}';
    }
}
