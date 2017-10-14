package com.cncf.service.impl;

import com.cncf.dao.ArticleDao;
import com.cncf.entity.Article;
import com.cncf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public boolean deleteById(int id) {
        return articleDao.deleteById(id);
    }

    public boolean insertArticle(Article article) {
        return articleDao.insertArticle(article);
    }

    public String selectTitleById(int id) {
        return articleDao.selectTitleById(id);
    }

    public List selectByType(String type) {
        return articleDao.selectByType(type);
    }

    public boolean updateTitleById(int id, String title) {
        return articleDao.updateTitleById(id,title);
    }

    public boolean updateContentById(int id, String content) {
        return articleDao.updateContentById(id,content);
    }

    public boolean updateArticle(Article article) {
        return articleDao.updateArticle(article);
    }
}
