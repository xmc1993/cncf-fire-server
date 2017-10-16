package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private Integer mid;
    private Integer setId;
    private Integer authorId;
    private Date createTime;
    private Integer type;
    private int valid;
    private String content;
}