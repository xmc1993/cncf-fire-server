package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private Integer articleId;
    private String title;
    private Date publishTime;
    private String source;
    private Integer click;
    private String wordSize;
    private String type;
    private String content;

    public Article() {
    }

    public Article(String title, Date publishTime, String source, Integer click, String wordSize, String type, String content) {
        this.title = title;
        this.publishTime = publishTime;
        this.source = source;
        this.click = click;
        this.wordSize = wordSize;
        this.type = type;
        this.content = content;
    }
}