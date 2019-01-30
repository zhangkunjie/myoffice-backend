package com.myoffice.controller;

import com.github.pagehelper.PageInfo;
import com.myoffice.common.utils.JsonCallBack;
import com.myoffice.model.ActivityModel;
import com.myoffice.model.Student;
import com.myoffice.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by user on 2018/1/8.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    private Logger logger = LoggerFactory.getLogger(ActivityController.class);


    /* @RequestMapping(value = "/insert", method = RequestMethod.POST)
     @ResponseBody
     public JsonCallBack insert(@RequestBody Student student) {
         logger.info("insert called");
         JsonCallBack jsonCallBack = new JsonCallBack(true);
         try {
             studentService.insert(student);
         } catch (Exception e) {
             jsonCallBack.setSuccess(false);
             jsonCallBack.setMessage(e.getMessage());
             logger.error(e.getMessage());
             e.printStackTrace();
         }
         return jsonCallBack;
     }
  */
    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack insertBatch(@RequestBody List<ActivityModel> activityModelList) {
        logger.info("insertBatch called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            activityService.insertBatch(activityModelList);
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
    public JsonCallBack delete(@RequestBody ActivityModel activityModel) {
        logger.info("delete called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            activityService.delete(activityModel);
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
    public JsonCallBack update(@RequestBody ActivityModel activityModel) {
        logger.info("findAllStudents called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        try {
            activityService.update(activityModel);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
 /*
    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack getById(@RequestBody Student student) {
        logger.info("getById called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            student = studentService.getById(student);
            pairs.put("dat", student);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack findAll(@RequestBody Student student) {
        logger.info("findAllStudents called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            List<Student> studentList = studentService.findAll(student);
            pairs.put("dat", studentList);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
 */

    @RequestMapping(value = "/findPage/{pageNo}/{pageSize}", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack findPage(@RequestBody ActivityModel activityModel,
                                 @PathVariable int pageNo, @PathVariable int pageSize) {
        logger.info("findAllStudents called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            PageInfo<ActivityModel> pageInfo = activityService.findPage(activityModel, pageNo, pageSize);
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
