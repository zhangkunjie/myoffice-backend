package com.myoffice.model;

import java.io.Serializable;

/**
 * Created by zkj on 2020/3/11.
 */
public class BookModel  implements Serializable {
   private  Integer     id;
   private  String      name;
   private  String      author;
   private  String      category;
   private  Integer     page;
   private  String      note;
   private  Integer     status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", page=" + page +
                ", note='" + note + '\'' +
                ", status=" + status +
                '}';
    }
}
