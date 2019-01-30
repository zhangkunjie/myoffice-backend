package com.myoffice.service;

import com.github.pagehelper.PageInfo;
import com.myoffice.model.ActivityModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2018/1/8.
 */
public interface ReportService {
    public List<Map> findAvgImplementRate(Map param);

}
