package com.cncf.dao;

import com.cncf.entity.Article;
import com.cncf.response.ResponseData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 */
@Repository
public interface ArticleDao {
    boolean deleteById(int id);

    boolean insertArticle(Article article);

    Article selectArticleInfoById(Integer id);

    List<Article> selectAllArticleInfo();

    Article selectArticleById(Integer id);

    List<Article> selectAllArticle();

    //List<Article> selectArticleInfoByCategoryAndPage(@Param("categoryId") Integer categoryId, @Param("offset") int offset, @Param("limit") int limit);

    List<Article> selectArticleByCategoryId(Integer categoryId);

    List<Article> selectArticleInfoByCategoryId(@Param("categoryId") Integer categoryId);

    boolean updateTitleById(int id,String title);

    boolean updateContentById(int id,String content);

    boolean updateArticle(Article article);
}