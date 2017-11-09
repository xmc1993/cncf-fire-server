package com.cncf.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OperationLog implements Serializable{
    private Integer id;
    private Integer adminId;//操作人的id
    private String adminName;//操作人的姓名
    private String operation;//具体的操作
    private String description;//具体的操作
    private String extra;//表单信息
    private Date operationTime;
    private Date createTime;
    private Date updateTime;
}
