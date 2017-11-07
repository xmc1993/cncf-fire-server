package com.cncf.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PowerCode implements Serializable{
    private Integer id;
    private String name;
    private String description;
    private Date createTime;
    private Date updateTime;
}
