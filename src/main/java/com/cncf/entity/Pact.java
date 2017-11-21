package com.cncf.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Pact {
    private String pactId;

    private String rid;

    private String pactYearNumber;

    private String pactFrom;

    private String pactCheckType;

    private String standardFlag;

    private String applyLevel;

    private String productTypeId;

    private String productId;

    private String productAlias;

    private String testCycle;

    private Integer extTestCycle;

    private String extTestCycleInfo;

    private String label;

    private String checkProductType;

    private String consignCustomerId;

    private String consignCustomerName;

    private String productCustomerId;

    private Integer productCustomerFlag;

    private String productCustomerName;

    private String productCustomerLegalPerson;

    private String checkCustomerId;

    private String checkCustomerName;

    private String checkCustomerAddress;

    private String checkCustomerPostalcode;

    private String checkCustomerTel;

    private String checkCustomerFax;

    private String linkMan1;

    private String linkPhone1;

    private String linkMemo1;

    private String sampleAddress;

    private String sampleBaseNumber;

    private String sampleEmployee;

    private String localeCheckFlag;

    private String checkInFlag;

    private String sampleServer;

    private String sampleNumber;

    private Date manufactureDate;

    private Date sampleDate;

    private Date sampleArriveDate;

    private String provideData;

    private String provideOtherData;

    private String drawType;

    private String sampleDisposeType;

    private String mailAddress;

    private String postalcode;

    private String consignee;

    private String consigneeTel;

    private String criterionId;

    private String criterionCode;

    private String criterionMemo;

    private String chargeType;

    private BigDecimal checkItemStandardAccount;

    private BigDecimal checkItemAccount;

    private String dptTestMoneyInfo;

    private String checkItemAccountMemo;

    private BigDecimal otherStandardAccount;

    private BigDecimal otherAccount;

    private String dptOtherMoneyInfo;

    private String otherAccountMemo;

    private BigDecimal extAccount;

    private String extAccountMemo;

    private String accountFlag;

    private String checkDepartmentId;

    private String linkDptId;

    private String pactStatus;

    private String pactFlowStatus;

    private String chargeFlag;

    private String sampleFlag;

    private String sampleStatus;

    private String pactApplyer;

    private String pactCreater;

    private Date pactDate;

    private String creater;

    private Date createTime;

    private String updateFlag;

    private Integer cccFlag;

    private Integer msgFlag;

    public String getPactId() {
        return pactId;
    }

    public void setPactId(String pactId) {
        this.pactId = pactId == null ? null : pactId.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getPactYearNumber() {
        return pactYearNumber;
    }

    public void setPactYearNumber(String pactYearNumber) {
        this.pactYearNumber = pactYearNumber == null ? null : pactYearNumber.trim();
    }

    public String getPactFrom() {
        return pactFrom;
    }

    public void setPactFrom(String pactFrom) {
        this.pactFrom = pactFrom == null ? null : pactFrom.trim();
    }

    public String getPactCheckType() {
        return pactCheckType;
    }

    public void setPactCheckType(String pactCheckType) {
        this.pactCheckType = pactCheckType == null ? null : pactCheckType.trim();
    }

    public String getStandardFlag() {
        return standardFlag;
    }

    public void setStandardFlag(String standardFlag) {
        this.standardFlag = standardFlag == null ? null : standardFlag.trim();
    }

    public String getApplyLevel() {
        return applyLevel;
    }

    public void setApplyLevel(String applyLevel) {
        this.applyLevel = applyLevel == null ? null : applyLevel.trim();
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId == null ? null : productTypeId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductAlias() {
        return productAlias;
    }

    public void setProductAlias(String productAlias) {
        this.productAlias = productAlias == null ? null : productAlias.trim();
    }

    public String getTestCycle() {
        return testCycle;
    }

    public void setTestCycle(String testCycle) {
        this.testCycle = testCycle == null ? null : testCycle.trim();
    }

    public Integer getExtTestCycle() {
        return extTestCycle;
    }

    public void setExtTestCycle(Integer extTestCycle) {
        this.extTestCycle = extTestCycle;
    }

    public String getExtTestCycleInfo() {
        return extTestCycleInfo;
    }

    public void setExtTestCycleInfo(String extTestCycleInfo) {
        this.extTestCycleInfo = extTestCycleInfo == null ? null : extTestCycleInfo.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getCheckProductType() {
        return checkProductType;
    }

    public void setCheckProductType(String checkProductType) {
        this.checkProductType = checkProductType == null ? null : checkProductType.trim();
    }

    public String getConsignCustomerId() {
        return consignCustomerId;
    }

    public void setConsignCustomerId(String consignCustomerId) {
        this.consignCustomerId = consignCustomerId == null ? null : consignCustomerId.trim();
    }

    public String getConsignCustomerName() {
        return consignCustomerName;
    }

    public void setConsignCustomerName(String consignCustomerName) {
        this.consignCustomerName = consignCustomerName == null ? null : consignCustomerName.trim();
    }

    public String getProductCustomerId() {
        return productCustomerId;
    }

    public void setProductCustomerId(String productCustomerId) {
        this.productCustomerId = productCustomerId == null ? null : productCustomerId.trim();
    }

    public Integer getProductCustomerFlag() {
        return productCustomerFlag;
    }

    public void setProductCustomerFlag(Integer productCustomerFlag) {
        this.productCustomerFlag = productCustomerFlag;
    }

    public String getProductCustomerName() {
        return productCustomerName;
    }

    public void setProductCustomerName(String productCustomerName) {
        this.productCustomerName = productCustomerName == null ? null : productCustomerName.trim();
    }

    public String getProductCustomerLegalPerson() {
        return productCustomerLegalPerson;
    }

    public void setProductCustomerLegalPerson(String productCustomerLegalPerson) {
        this.productCustomerLegalPerson = productCustomerLegalPerson == null ? null : productCustomerLegalPerson.trim();
    }

    public String getCheckCustomerId() {
        return checkCustomerId;
    }

    public void setCheckCustomerId(String checkCustomerId) {
        this.checkCustomerId = checkCustomerId == null ? null : checkCustomerId.trim();
    }

    public String getCheckCustomerName() {
        return checkCustomerName;
    }

    public void setCheckCustomerName(String checkCustomerName) {
        this.checkCustomerName = checkCustomerName == null ? null : checkCustomerName.trim();
    }

    public String getCheckCustomerAddress() {
        return checkCustomerAddress;
    }

    public void setCheckCustomerAddress(String checkCustomerAddress) {
        this.checkCustomerAddress = checkCustomerAddress == null ? null : checkCustomerAddress.trim();
    }

    public String getCheckCustomerPostalcode() {
        return checkCustomerPostalcode;
    }

    public void setCheckCustomerPostalcode(String checkCustomerPostalcode) {
        this.checkCustomerPostalcode = checkCustomerPostalcode == null ? null : checkCustomerPostalcode.trim();
    }

    public String getCheckCustomerTel() {
        return checkCustomerTel;
    }

    public void setCheckCustomerTel(String checkCustomerTel) {
        this.checkCustomerTel = checkCustomerTel == null ? null : checkCustomerTel.trim();
    }

    public String getCheckCustomerFax() {
        return checkCustomerFax;
    }

    public void setCheckCustomerFax(String checkCustomerFax) {
        this.checkCustomerFax = checkCustomerFax == null ? null : checkCustomerFax.trim();
    }

    public String getLinkMan1() {
        return linkMan1;
    }

    public void setLinkMan1(String linkMan1) {
        this.linkMan1 = linkMan1 == null ? null : linkMan1.trim();
    }

    public String getLinkPhone1() {
        return linkPhone1;
    }

    public void setLinkPhone1(String linkPhone1) {
        this.linkPhone1 = linkPhone1 == null ? null : linkPhone1.trim();
    }

    public String getLinkMemo1() {
        return linkMemo1;
    }

    public void setLinkMemo1(String linkMemo1) {
        this.linkMemo1 = linkMemo1 == null ? null : linkMemo1.trim();
    }

    public String getSampleAddress() {
        return sampleAddress;
    }

    public void setSampleAddress(String sampleAddress) {
        this.sampleAddress = sampleAddress == null ? null : sampleAddress.trim();
    }

    public String getSampleBaseNumber() {
        return sampleBaseNumber;
    }

    public void setSampleBaseNumber(String sampleBaseNumber) {
        this.sampleBaseNumber = sampleBaseNumber == null ? null : sampleBaseNumber.trim();
    }

    public String getSampleEmployee() {
        return sampleEmployee;
    }

    public void setSampleEmployee(String sampleEmployee) {
        this.sampleEmployee = sampleEmployee == null ? null : sampleEmployee.trim();
    }

    public String getLocaleCheckFlag() {
        return localeCheckFlag;
    }

    public void setLocaleCheckFlag(String localeCheckFlag) {
        this.localeCheckFlag = localeCheckFlag == null ? null : localeCheckFlag.trim();
    }

    public String getCheckInFlag() {
        return checkInFlag;
    }

    public void setCheckInFlag(String checkInFlag) {
        this.checkInFlag = checkInFlag == null ? null : checkInFlag.trim();
    }

    public String getSampleServer() {
        return sampleServer;
    }

    public void setSampleServer(String sampleServer) {
        this.sampleServer = sampleServer == null ? null : sampleServer.trim();
    }

    public String getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(String sampleNumber) {
        this.sampleNumber = sampleNumber == null ? null : sampleNumber.trim();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }

    public Date getSampleArriveDate() {
        return sampleArriveDate;
    }

    public void setSampleArriveDate(Date sampleArriveDate) {
        this.sampleArriveDate = sampleArriveDate;
    }

    public String getProvideData() {
        return provideData;
    }

    public void setProvideData(String provideData) {
        this.provideData = provideData == null ? null : provideData.trim();
    }

    public String getProvideOtherData() {
        return provideOtherData;
    }

    public void setProvideOtherData(String provideOtherData) {
        this.provideOtherData = provideOtherData == null ? null : provideOtherData.trim();
    }

    public String getDrawType() {
        return drawType;
    }

    public void setDrawType(String drawType) {
        this.drawType = drawType == null ? null : drawType.trim();
    }

    public String getSampleDisposeType() {
        return sampleDisposeType;
    }

    public void setSampleDisposeType(String sampleDisposeType) {
        this.sampleDisposeType = sampleDisposeType == null ? null : sampleDisposeType.trim();
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel == null ? null : consigneeTel.trim();
    }

    public String getCriterionId() {
        return criterionId;
    }

    public void setCriterionId(String criterionId) {
        this.criterionId = criterionId == null ? null : criterionId.trim();
    }

    public String getCriterionCode() {
        return criterionCode;
    }

    public void setCriterionCode(String criterionCode) {
        this.criterionCode = criterionCode == null ? null : criterionCode.trim();
    }

    public String getCriterionMemo() {
        return criterionMemo;
    }

    public void setCriterionMemo(String criterionMemo) {
        this.criterionMemo = criterionMemo == null ? null : criterionMemo.trim();
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    public BigDecimal getCheckItemStandardAccount() {
        return checkItemStandardAccount;
    }

    public void setCheckItemStandardAccount(BigDecimal checkItemStandardAccount) {
        this.checkItemStandardAccount = checkItemStandardAccount;
    }

    public BigDecimal getCheckItemAccount() {
        return checkItemAccount;
    }

    public void setCheckItemAccount(BigDecimal checkItemAccount) {
        this.checkItemAccount = checkItemAccount;
    }

    public String getDptTestMoneyInfo() {
        return dptTestMoneyInfo;
    }

    public void setDptTestMoneyInfo(String dptTestMoneyInfo) {
        this.dptTestMoneyInfo = dptTestMoneyInfo == null ? null : dptTestMoneyInfo.trim();
    }

    public String getCheckItemAccountMemo() {
        return checkItemAccountMemo;
    }

    public void setCheckItemAccountMemo(String checkItemAccountMemo) {
        this.checkItemAccountMemo = checkItemAccountMemo == null ? null : checkItemAccountMemo.trim();
    }

    public BigDecimal getOtherStandardAccount() {
        return otherStandardAccount;
    }

    public void setOtherStandardAccount(BigDecimal otherStandardAccount) {
        this.otherStandardAccount = otherStandardAccount;
    }

    public BigDecimal getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(BigDecimal otherAccount) {
        this.otherAccount = otherAccount;
    }

    public String getDptOtherMoneyInfo() {
        return dptOtherMoneyInfo;
    }

    public void setDptOtherMoneyInfo(String dptOtherMoneyInfo) {
        this.dptOtherMoneyInfo = dptOtherMoneyInfo == null ? null : dptOtherMoneyInfo.trim();
    }

    public String getOtherAccountMemo() {
        return otherAccountMemo;
    }

    public void setOtherAccountMemo(String otherAccountMemo) {
        this.otherAccountMemo = otherAccountMemo == null ? null : otherAccountMemo.trim();
    }

    public BigDecimal getExtAccount() {
        return extAccount;
    }

    public void setExtAccount(BigDecimal extAccount) {
        this.extAccount = extAccount;
    }

    public String getExtAccountMemo() {
        return extAccountMemo;
    }

    public void setExtAccountMemo(String extAccountMemo) {
        this.extAccountMemo = extAccountMemo == null ? null : extAccountMemo.trim();
    }

    public String getAccountFlag() {
        return accountFlag;
    }

    public void setAccountFlag(String accountFlag) {
        this.accountFlag = accountFlag == null ? null : accountFlag.trim();
    }

    public String getCheckDepartmentId() {
        return checkDepartmentId;
    }

    public void setCheckDepartmentId(String checkDepartmentId) {
        this.checkDepartmentId = checkDepartmentId == null ? null : checkDepartmentId.trim();
    }

    public String getLinkDptId() {
        return linkDptId;
    }

    public void setLinkDptId(String linkDptId) {
        this.linkDptId = linkDptId == null ? null : linkDptId.trim();
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus == null ? null : pactStatus.trim();
    }

    public String getPactFlowStatus() {
        return pactFlowStatus;
    }

    public void setPactFlowStatus(String pactFlowStatus) {
        this.pactFlowStatus = pactFlowStatus == null ? null : pactFlowStatus.trim();
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag == null ? null : chargeFlag.trim();
    }

    public String getSampleFlag() {
        return sampleFlag;
    }

    public void setSampleFlag(String sampleFlag) {
        this.sampleFlag = sampleFlag == null ? null : sampleFlag.trim();
    }

    public String getSampleStatus() {
        return sampleStatus;
    }

    public void setSampleStatus(String sampleStatus) {
        this.sampleStatus = sampleStatus == null ? null : sampleStatus.trim();
    }

    public String getPactApplyer() {
        return pactApplyer;
    }

    public void setPactApplyer(String pactApplyer) {
        this.pactApplyer = pactApplyer == null ? null : pactApplyer.trim();
    }

    public String getPactCreater() {
        return pactCreater;
    }

    public void setPactCreater(String pactCreater) {
        this.pactCreater = pactCreater == null ? null : pactCreater.trim();
    }

    public Date getPactDate() {
        return pactDate;
    }

    public void setPactDate(Date pactDate) {
        this.pactDate = pactDate;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag == null ? null : updateFlag.trim();
    }

    public Integer getCccFlag() {
        return cccFlag;
    }

    public void setCccFlag(Integer cccFlag) {
        this.cccFlag = cccFlag;
    }

    public Integer getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(Integer msgFlag) {
        this.msgFlag = msgFlag;
    }
}