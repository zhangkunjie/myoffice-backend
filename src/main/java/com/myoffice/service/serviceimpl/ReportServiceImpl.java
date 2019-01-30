package com.myoffice.service.serviceimpl;

import com.myoffice.dao.ReportDao;
import com.myoffice.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportDao reportDao;
    @Override
    public List<Map> findAvgImplementRate(Map param) {
        return reportDao.findAvgImplementRate(param);
    }
}
