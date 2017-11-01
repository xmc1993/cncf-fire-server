package com.cncf.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zj
 * @date 2017/10/27 3:33
 */
@Data
public class Btcm implements Serializable {

    private Integer id;
    private String code;
    private String password;
    private String realName;
    private String accessToken;
    private Date registTime;
    private Integer btcId;
}
