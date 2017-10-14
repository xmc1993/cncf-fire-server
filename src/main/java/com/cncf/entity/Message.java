package com.cncf.entity;

import lombok.Data;

@Data
public class Message {
    private Integer mid;
    private Integer setId;
    private String author;
    private String createTime;
    private Integer valid;
    private String content;
}