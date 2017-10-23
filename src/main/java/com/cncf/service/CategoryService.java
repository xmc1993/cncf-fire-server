package com.cncf.service;

import com.cncf.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> selectAllCategory();
}
