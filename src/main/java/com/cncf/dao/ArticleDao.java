package com.cncf.dao;

import com.cncf.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {
    public boolean deleteById(int id);

    public boolean insertArticle(Article article);

    public String selectTitleById(int id);

    public List selectByType(String type);

    public boolean updateTitleById(int id,String title);

    public boolean updateContentById(int id,String content);

    public boolean updateArticle(Article article);
}