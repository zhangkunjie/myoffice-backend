package com.myoffice.model;

import java.io.Serializable;
import java.math.BigInteger;

public class CategoryModel implements Serializable {
    private BigInteger id;
    private Short code;
    private String name;
    private Integer status;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CategoryModel{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
