package com.cncf.entity;

public class BtcWithBLOBs extends Btc {
    private String btcBrief;

    private String connection;

    private String cms;

    private String crs;

    public String getBtcBrief() {
        return btcBrief;
    }

    public void setBtcBrief(String btcBrief) {
        this.btcBrief = btcBrief == null ? null : btcBrief.trim();
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection == null ? null : connection.trim();
    }

    public String getCms() {
        return cms;
    }

    public void setCms(String cms) {
        this.cms = cms == null ? null : cms.trim();
    }

    public String getCrs() {
        return crs;
    }

    public void setCrs(String crs) {
        this.crs = crs == null ? null : crs.trim();
    }
}