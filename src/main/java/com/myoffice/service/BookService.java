package com.myoffice.service;

import com.github.pagehelper.PageInfo;
import com.myoffice.model.ActivityModel;
import com.myoffice.model.BookModel;

import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
public interface BookService {
    public void insert(BookModel bookModel);

    public void delete(BookModel  bookModel);

    public void update(BookModel  bookModel);

    public BookModel getById(BookModel bookModel);

    public List<BookModel> findAll(BookModel bookModel);

    public PageInfo<BookModel> findPage(BookModel bookModel, int pageSize, int pageNo);


}
