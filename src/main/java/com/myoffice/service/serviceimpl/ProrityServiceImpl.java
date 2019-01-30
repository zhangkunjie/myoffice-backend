package com.myoffice.service.serviceimpl;

import com.myoffice.dao.PriorityDao;
import com.myoffice.model.PriorityModel;
import com.myoffice.service.PriorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
@Service
public class ProrityServiceImpl implements PriorityService {

    @Resource
    private PriorityDao priorityDao;

    /**
     * @param
     * @return F
     */
    @Override
    public List<PriorityModel> findAll(PriorityModel priorityModel) {
        return priorityDao.findAll(priorityModel);
    }


}
