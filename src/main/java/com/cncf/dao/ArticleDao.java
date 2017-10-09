package com.cncf.dao;

import com.cncf.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {
    public boolean deleteById(int id);

    public boolean insert(Article article);

    public Article selectTitleById(int id);

    public List selectByType(String type);

    public boolean updateTitleById(int id,String title);

    public boolean updateContentById(int id,String content);
}