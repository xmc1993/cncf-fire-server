package com.cncf.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zj
 */
@Data
public class ReportFileInfo {
    private String rid;

    private String reportId;

    private String fileName;

    private String path;

    private String flag;

    private String creater;

    private Date createDateTime;

    private String memo;
}