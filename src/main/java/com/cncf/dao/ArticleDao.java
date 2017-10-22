package com.cncf.dao;

import com.cncf.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 */
@Repository
public interface ArticleDao {
    boolean deleteById(int id);

    boolean insertArticle(Article article);

    String selectTitleById(int id);

    List selectArticleByCategoryAndPage(Integer categoryId, int offset, int limit);

    boolean updateTitleById(int id,String title);

    boolean updateContentById(int id,String content);

    boolean updateArticle(Article article);
}