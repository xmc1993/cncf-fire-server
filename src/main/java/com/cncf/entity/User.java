package com.cncf.entity;
import lombok.Data;

@Data
public class User {
    private Integer userid;
    private String nickname;
    private String email;
    private String qq;
    private String homepage;

    public User(Integer userid, String nickname, String email, String qq, String homepage) {
        this.userid = userid;
        this.nickname = nickname;
        this.email = email;
        this.qq = qq;
        this.homepage = homepage;
    }

    public User() {
        super();
    }
}