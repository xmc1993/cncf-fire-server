package com.cncf.service;

import com.cncf.entity.Article;
import com.cncf.response.ResponseData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ArticleService {
    boolean deleteById(int id);

    boolean insertArticle(Article article);

    Article selectArticleInfoById(Integer id);

    List<Article> selectAllArticleInfo();

    Article selectArticleById(Integer id);

    List<Article> selectAllArticle();

    //ResponseData<List<Article>> selectArticleInfoByCategoryAndPage(Integer categoryId, Integer page, Integer pageSize);

    List<Article> selectArticleByCategoryId(Integer categoryId);

    List<Article> selectArticleInfoByCategoryId(Integer categoryId);

    boolean updateTitleById(int id,String title);

    boolean updateContentById(int id,String content);

    boolean updateArticle(Article article);
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException, InterruptedException;
}
