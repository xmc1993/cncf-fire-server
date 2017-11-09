package com.cncf.entity;

public class Btc {
    private Integer id;

    private String btcName;

    private String shortName;

    private String serialNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBtcName() {
        return btcName;
    }

    public void setBtcName(String btcName) {
        this.btcName = btcName == null ? null : btcName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }
}