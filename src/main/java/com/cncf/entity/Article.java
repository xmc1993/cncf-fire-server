package com.cncf.entity;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * @author zj
 */
@Data
public class Article {
    private Integer articleId;
    private String title;
    private Date publishTime;
    private String source;
    private Integer click;
    private String wordSize;
    private Integer categoryId;
    private String content;

    public Article() {
    }

    public Article(String title, Date publishTime, String source, Integer click, String wordSize, Integer categoryId, String content) {
        this.title = title;
        this.publishTime = publishTime;
        this.source = source;
        this.click = click;
        this.wordSize = wordSize;
        this.categoryId = categoryId;
        this.content = content;
    }
}