package com.myoffice.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myoffice.dao.BookDao;
import com.myoffice.model.BookModel;
import com.myoffice.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
@Service
public class BookServiceImpl implements  BookService {

    @Resource
    private BookDao bookDao;


    @Override
    public void insert(BookModel activityModel) {
    }

    @Override
    public void delete(BookModel bookModel) {
        bookDao.delete(bookModel);
    }

    @Override
    public void update(BookModel activityModel) {
             bookDao.update(activityModel);
    }

    @Override
    public BookModel getById(BookModel activityModel) {
        return null;
    }

    @Override
    public List<BookModel> findAll(BookModel activityModel) {
        return null;
    }

    @Override
    public PageInfo<BookModel> findPage(BookModel bookModel, int pageSize, int pageNo) {
        PageHelper.startPage(pageNo, pageSize);
        List<BookModel> list = bookDao.findPage(bookModel);
        PageInfo<BookModel> pageInfo = new PageInfo<BookModel>(list);
        return pageInfo;
    }


}
