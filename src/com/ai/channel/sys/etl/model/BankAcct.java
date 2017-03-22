package com.ai.channel.sys.etl.model;

import java.util.Date;

public class BankAcct {
    private Long channelId;

    private String acctType;

    private String acctBank;

    private String acctBranchBank;

    private String acctName;

    private String acctNo;

    private String acctSmsPhone;

    private Integer acctState;

    private String acctChargebacks;

    private String acctBankCode;

    private Date createTime;

    private String createOperId;

    private Date updateTime;

    private String updateOperId;

    private String remark;

    private String provinceCode;

    private String cityCode;

    private String extJson;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getAcctBank() {
        return acctBank;
    }

    public void setAcctBank(String acctBank) {
        this.acctBank = acctBank == null ? null : acctBank.trim();
    }

    public String getAcctBranchBank() {
        return acctBranchBank;
    }

    public void setAcctBranchBank(String acctBranchBank) {
        this.acctBranchBank = acctBranchBank == null ? null : acctBranchBank.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getAcctSmsPhone() {
        return acctSmsPhone;
    }

    public void setAcctSmsPhone(String acctSmsPhone) {
        this.acctSmsPhone = acctSmsPhone == null ? null : acctSmsPhone.trim();
    }

    public Integer getAcctState() {
        return acctState;
    }

    public void setAcctState(Integer acctState) {
        this.acctState = acctState;
    }

    public String getAcctChargebacks() {
        return acctChargebacks;
    }

    public void setAcctChargebacks(String acctChargebacks) {
        this.acctChargebacks = acctChargebacks == null ? null : acctChargebacks.trim();
    }

    public String getAcctBankCode() {
        return acctBankCode;
    }

    public void setAcctBankCode(String acctBankCode) {
        this.acctBankCode = acctBankCode == null ? null : acctBankCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(String createOperId) {
        this.createOperId = createOperId == null ? null : createOperId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(String updateOperId) {
        this.updateOperId = updateOperId == null ? null : updateOperId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson == null ? null : extJson.trim();
    }
}