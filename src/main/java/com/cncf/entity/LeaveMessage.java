package com.cncf.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author zj
 */
@Data
public class LeaveMessage {
    private Integer id;

    private Integer userId;

    private String theme;

    private Date createTime;

    private Date replyTime;

    private Byte pass=0;

    private Byte valid=1;
}