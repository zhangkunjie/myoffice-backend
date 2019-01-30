package com.myoffice.dao;

import com.myoffice.model.ActivityModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2018/1/8.
 */
public interface ReportDao extends BaseDao<HashMap, Long> {
    public List<Map> findAvgImplementRate(Map hashMap);
}
