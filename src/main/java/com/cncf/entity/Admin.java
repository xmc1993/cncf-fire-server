package com.cncf.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    private int adminId;
    private String adminName;
    private String password;
}