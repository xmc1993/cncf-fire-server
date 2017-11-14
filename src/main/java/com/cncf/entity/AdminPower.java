package com.cncf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zj
 */
@Data
public class AdminPower {
    private Integer id;
    private Integer adminId;
    private Integer codeId;
    private Date createTime;
    private Date updateTime;
}
