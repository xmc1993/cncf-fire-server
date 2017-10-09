package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private Integer articleId;
    private String title;
    private Date publishTime;
    private String source;
    private int click;
    private String wordSize;
    private String type;
    private String content;
}