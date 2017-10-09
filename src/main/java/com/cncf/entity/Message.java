package com.cncf.entity;

import lombok.Data;

@Data
public class Message {
    private Integer mid;
    private Integer leaveid;
    private String author;
    private String createtime;
    private Integer valid;
    private String content;

    public Message(Integer mid, Integer leaveid, String author, String createtime, Integer valid, String content) {
        this.mid = mid;
        this.leaveid = leaveid;
        this.author = author;
        this.createtime = createtime;
        this.valid = valid;
        this.content = content;
    }

    public Message() {
        super();
    }
}