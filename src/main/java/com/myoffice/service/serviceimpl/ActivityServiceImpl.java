package com.myoffice.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myoffice.dao.ActivityDao;
import com.myoffice.model.ActivityModel;
import com.myoffice.service.ActivityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Resource
    private ActivityDao activityDao;


    @Override
    public void insert(ActivityModel activityModel) {

    }

    @Override
    public void insertBatch(List<ActivityModel> activityModelList) {
        activityDao.insertBatch(activityModelList);
    }

    @Override
    public void delete(ActivityModel activityModel) {
        activityDao.delete(activityModel);
    }

    @Override
    public void update(ActivityModel activityModel) {
             activityDao.update(activityModel);
    }

    @Override
    public ActivityModel getById(ActivityModel activityModel) {
        return null;
    }

    @Override
    public List<ActivityModel> findAll(ActivityModel activityModel) {
        return null;
    }

    @Override
    public PageInfo<ActivityModel> findPage(ActivityModel activityModel, int pageSize, int pageNo) {
        PageHelper.startPage(pageNo, pageSize);
        List<ActivityModel> list = activityDao.findPage(activityModel);
        PageInfo<ActivityModel> pageInfo = new PageInfo<ActivityModel>(list);
        return pageInfo;
    }


}
