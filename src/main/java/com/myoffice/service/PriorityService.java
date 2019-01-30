package com.myoffice.service;

import com.myoffice.model.CategoryModel;
import com.myoffice.model.PriorityModel;

import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
public interface PriorityService {
    /*public void insert(ActivityModel activityModel);

    public void insertBatch(List<ActivityModel> activityModelList);

    public void delete(ActivityModel activityModel);

    public void update(ActivityModel activityModel);

    public ActivityModel getById(ActivityModel activityModel);



    public PageInfo<ActivityModel> findPage(ActivityModel activityModel, int pageSize, int pageNo);
*/
    public List<PriorityModel> findAll(PriorityModel priorityModel);


}
