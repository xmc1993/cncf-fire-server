package com.cncf.entity;

import lombok.Data;

@Data
public class MessageSet {
    private Integer setId;
    private String nickName;
    private String theme;
    private String createTime;
    private int valid;
}