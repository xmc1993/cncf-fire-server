package com.cncf.entity;

public class PactWithBLOBs extends Pact {
    private String memo;

    private String criterionName;

    private String sampleCounts;

    private String updateContent;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCriterionName() {
        return criterionName;
    }

    public void setCriterionName(String criterionName) {
        this.criterionName = criterionName == null ? null : criterionName.trim();
    }

    public String getSampleCounts() {
        return sampleCounts;
    }

    public void setSampleCounts(String sampleCounts) {
        this.sampleCounts = sampleCounts == null ? null : sampleCounts.trim();
    }

    public String getUpdateContent() {
        return updateContent;
    }

    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent == null ? null : updateContent.trim();
    }
}