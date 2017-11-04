package com.cncf.service;

import com.cncf.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    Category selectCategoryById(Integer id);
    List<Category> selectAllCategory();
}
