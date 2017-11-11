package com.cncf.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable{
    private Integer id;
    private String nickname = "游客";//用户名
    private String realName;//用户名
    private String sex;//性别
    private String headImgUrl;//头像
    private String mobile;//手机号
    private String password;//密码
    private String company;//公司
    private String detailAddress;
    private String email;//邮箱
    private String qq;//qq
    private String homepage;//主页
    private String accessToken;//token
    private String verifyCode;//验证码
    private Date expireTime;//验证码的过期事件
    private int identification = 0;//是否通过了手机验证
    private Integer valid = 1;//用于软删除
    private Date createTime;
    private Date updateTime;
}