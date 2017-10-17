package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    private Integer adminId;
    private String adminName;
    private String password;
    private Date registTime;
}