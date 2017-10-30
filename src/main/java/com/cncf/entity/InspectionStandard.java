package com.cncf.entity;

import lombok.Data;

@Data
public class InspectionStandard {
    private Integer id;

    private String snumber;

    private String sname;

    private Integer state;

    private Integer btcid;
}