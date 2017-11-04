package com.cncf.dao;

import com.cncf.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
    Category selectCategoryById(Integer id);
    List<Category> selectAllCategory();
}
