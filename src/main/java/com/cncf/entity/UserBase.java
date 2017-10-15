package com.cncf.entity;

import lombok.Data;

/**
 * Created by xmc1993 on 2017/10/14.
 */
@Data
public class UserBase {
    private Integer id;
    private String nickname;
    private String realName;
    private String sex;
    private String headImgUrl;
    private String mobile;
    private String company;
    private String city;
    private String email;
    private String qq;
    private String homepage;
}
