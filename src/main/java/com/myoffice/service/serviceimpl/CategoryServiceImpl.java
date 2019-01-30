package com.myoffice.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myoffice.dao.ActivityDao;
import com.myoffice.dao.CategoryDao;
import com.myoffice.model.ActivityModel;
import com.myoffice.model.CategoryModel;
import com.myoffice.service.ActivityService;
import com.myoffice.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    /**
     * @param categoryModel
     * @return F
     */
    @Override
    public List<CategoryModel> findAll(CategoryModel categoryModel) {
        return categoryDao.findAll(categoryModel);
    }


}
