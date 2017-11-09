package com.cncf.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author zj
 */
@Data
public class ReportInfo {
    private String rid;

    private String pactNumber;

    private String reportType;

    private String testAddress;

    private String startDate;

    private String endDate;

    private String resultFlag;

    private String memo;

    private Integer pageCount;

    private String writer;

    private String writerDate;

    private String auditor;

    private String auditDate;

    private String signaturer;

    private String signatureDate;

    private String reportStatus;

    private String sendFlag;

    private String sendDate;

    private String consignee;

    private String consigneeTel;

    private String emsNumber;

    private String sendMemo;

    private String sendPerson;

    private Date sendDateTime;

    private String rangeFlag;

    private String rangeDate;

    private String positionId;

    private String rangeMemo;

    private String creater;

    private Date createDateTime;

    private String attProductName;

    private Integer publishFlag;

    private String publishUserName;

    private Date publishDateTime;
}