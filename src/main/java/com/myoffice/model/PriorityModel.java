package com.myoffice.model;

import java.io.Serializable;
import java.math.BigInteger;
/*
* 优先级实体类
* */
public class PriorityModel implements Serializable {
    private BigInteger id;
    private Integer code;
    private String name;
    private Byte status;
    private String remark;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PriorityModel{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}
