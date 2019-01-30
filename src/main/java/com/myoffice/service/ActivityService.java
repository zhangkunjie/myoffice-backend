package com.myoffice.service;

import com.github.pagehelper.PageInfo;
import com.myoffice.model.ActivityModel;
import com.myoffice.model.Student;

import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
public interface ActivityService {
    public void insert(ActivityModel activityModel);

    public void insertBatch(List<ActivityModel> activityModelList);

    public void delete(ActivityModel activityModel);

    public void update(ActivityModel activityModel);

    public ActivityModel getById(ActivityModel activityModel);

    public List<ActivityModel> findAll(ActivityModel activityModel);


    public PageInfo<ActivityModel> findPage(ActivityModel activityModel, int pageSize, int pageNo);


}
