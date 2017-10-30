package com.cncf.entity;

import lombok.Data;

/**
 * @author zj
 * @date 2017/10/25 18:38
 */
@Data
public class Btc {
    private Integer id;
    private String btcName;
    private String shortName;
    private String serialNumber;
    private String btcBrief;
    private String connection;
    private String moduleId;
}
