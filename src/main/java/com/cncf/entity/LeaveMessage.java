package com.cncf.entity;

import lombok.Data;

@Data
public class LeaveMessage {
    private Integer leaveid;
    private String nickname;
    private String theme;
    private String createtime;

    public LeaveMessage(Integer leaveid, String nickname, String theme, String createtime) {
        this.leaveid = leaveid;
        this.nickname = nickname;
        this.theme = theme;
        this.createtime = createtime;
    }

    public LeaveMessage() {
        super();
    }
}