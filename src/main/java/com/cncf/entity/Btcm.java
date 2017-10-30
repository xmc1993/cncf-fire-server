package com.cncf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zj
 * @date 2017/10/27 3:33
 */
@Data
public class Btcm {

    private Integer id;
    private String code;
    private String password;
    private String realName;
    private String accessToken;
    private Date registTime;
    private Integer btcId;
}
