package com.cncf.service.impl;

import com.cncf.dao.CategoryDao;
import com.cncf.entity.Category;
import com.cncf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> selectAllCategory() {
        return categoryDao.selectAllCategory();
    }
}
