package com.myoffice.model;

import java.io.Serializable;
import java.math.BigInteger;

public class CategoryModel implements Serializable {
    private BigInteger id;
    private Integer   categoryId;
    private Integer   code;
    private String    name;
    private Integer   status;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
                ", categoryId=" + categoryId +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
