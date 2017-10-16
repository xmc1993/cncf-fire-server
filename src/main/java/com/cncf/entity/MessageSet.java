package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MessageSet {
    private Integer setId;
    private Integer userId;
    private String theme;
    private Date createTime;
    private int valid;
}