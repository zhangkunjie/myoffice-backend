package com.myoffice.controller;

import com.github.pagehelper.PageInfo;
import com.myoffice.common.utils.JsonCallBack;
import com.myoffice.model.ActivityModel;
import com.myoffice.model.BookModel;
import com.myoffice.service.ActivityService;
import com.myoffice.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Created by user on 2018/1/8.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    private Logger logger = LoggerFactory.getLogger(BookController.class);
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack insertBatch(@RequestBody  BookModel bookModel) {
        logger.info("insertBatch called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            bookService.insert(bookModel);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack delete(@RequestBody BookModel  bookModel) {
        logger.info("delete called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            bookService.delete(bookModel);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack update(@RequestBody BookModel  bookModel) {
        logger.info("findAllStudents called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            bookService.update(bookModel);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack getById(@RequestBody BookModel book){
        logger.info("getById called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            book = bookService.getById(book);
            pairs.put("dat", book);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
    @RequestMapping(value = "/findPage/{pageNo}/{pageSize}", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack findPage(@RequestBody BookModel  bookModel,
                                 @PathVariable int pageNo, @PathVariable int pageSize) {
        logger.info("findPage called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            PageInfo<BookModel> pageInfo = bookService.findPage(bookModel, pageNo, pageSize);
            pairs.put("data", pageInfo);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
}
