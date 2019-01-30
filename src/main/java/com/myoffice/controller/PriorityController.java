package com.myoffice.controller;

import com.myoffice.common.utils.JsonCallBack;
import com.myoffice.model.CategoryModel;
import com.myoffice.model.PriorityModel;
import com.myoffice.service.CategoryService;
import com.myoffice.service.PriorityService;
import javafx.scene.layout.Priority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * Created by user on 2018/1/8.
 */
@Controller
@RequestMapping("/priority")
public class PriorityController {
    @Autowired
    private PriorityService priorityService;
    private Logger logger = LoggerFactory.getLogger(PriorityController.class);


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

     @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
     @ResponseBody
     public JsonCallBack insertBatch(@RequestBody List<Student> studentList) {
         logger.info("insertBatch called");
         JsonCallBack jsonCallBack = new JsonCallBack(true);
         try {
             studentService.insertBatch(studentList);
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
     public JsonCallBack delete(@RequestBody Student student) {
         logger.info("delete called");
         JsonCallBack jsonCallBack = new JsonCallBack(true);
         try {
             studentService.delete(student);
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
     public JsonCallBack update(@RequestBody Student student) {
         logger.info("findAllStudents called");
         JsonCallBack jsonCallBack = new JsonCallBack(true);
         try {
             studentService.update(student);
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
    */
    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    @ResponseBody
    public JsonCallBack findAll(@RequestBody PriorityModel priorityModel){
        logger.info("findAll called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            List<PriorityModel> priorityModelList = priorityService.findAll(priorityModel);
            pairs.put("data", priorityModelList);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }
    /*@RequestMapping(value = "/findPage/{pageNo}/{pageSize}", method = RequestMethod.POST)
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
    }*/
}
