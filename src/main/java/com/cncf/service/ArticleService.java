package com.cncf.service;

import com.cncf.entity.Article;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ArticleService {
    boolean deleteById(int id);

    boolean insertArticle(Article article);

    String selectTitleById(int id);

    List selectArticleByCategoryAndPage(Integer categoryId, int page, int pageSize);

    boolean updateTitleById(int id,String title);

    boolean updateContentById(int id,String content);

    boolean updateArticle(Article article);
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException, InterruptedException;
}
