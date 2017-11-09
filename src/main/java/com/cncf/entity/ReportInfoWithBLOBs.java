package com.cncf.entity;

public class ReportInfoWithBLOBs extends ReportInfo {
    private String testResult;

    private String auditorRecord;

    private String signaturerRecord;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult == null ? null : testResult.trim();
    }

    public String getAuditorRecord() {
        return auditorRecord;
    }

    public void setAuditorRecord(String auditorRecord) {
        this.auditorRecord = auditorRecord == null ? null : auditorRecord.trim();
    }

    public String getSignaturerRecord() {
        return signaturerRecord;
    }

    public void setSignaturerRecord(String signaturerRecord) {
        this.signaturerRecord = signaturerRecord == null ? null : signaturerRecord.trim();
    }
}