package com.ai.channel.sys.etl.model;

import java.util.Date;

public class ChlQuality {
    private Long channelId;

    private Integer legalEntityFlag;

    private String businessLicense;

    private String legalRepresentative;

    private String legalPhone;

    private String legalIdno;

    private Long agentId;

    private String agentName;

    private String registeredCapital;

    private Integer managedInMisFlag;

    private String choosenMethod;

    private Integer currState;

    private Date lastAuditTime;

    private Date nextAuditTime;

    private String businessServiceScope;

    private String btToVatNature;

    private Date createTime;

    private String createOperId;

    private Date updateTime;

    private String updateOperId;

    private String remark;

    private String extJson;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Integer getLegalEntityFlag() {
        return legalEntityFlag;
    }

    public void setLegalEntityFlag(Integer legalEntityFlag) {
        this.legalEntityFlag = legalEntityFlag;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getLegalIdno() {
        return legalIdno;
    }

    public void setLegalIdno(String legalIdno) {
        this.legalIdno = legalIdno == null ? null : legalIdno.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public Integer getManagedInMisFlag() {
        return managedInMisFlag;
    }

    public void setManagedInMisFlag(Integer managedInMisFlag) {
        this.managedInMisFlag = managedInMisFlag;
    }

    public String getChoosenMethod() {
        return choosenMethod;
    }

    public void setChoosenMethod(String choosenMethod) {
        this.choosenMethod = choosenMethod == null ? null : choosenMethod.trim();
    }

    public Integer getCurrState() {
        return currState;
    }

    public void setCurrState(Integer currState) {
        this.currState = currState;
    }

    public Date getLastAuditTime() {
        return lastAuditTime;
    }

    public void setLastAuditTime(Date lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    public Date getNextAuditTime() {
        return nextAuditTime;
    }

    public void setNextAuditTime(Date nextAuditTime) {
        this.nextAuditTime = nextAuditTime;
    }

    public String getBusinessServiceScope() {
        return businessServiceScope;
    }

    public void setBusinessServiceScope(String businessServiceScope) {
        this.businessServiceScope = businessServiceScope == null ? null : businessServiceScope.trim();
    }

    public String getBtToVatNature() {
        return btToVatNature;
    }

    public void setBtToVatNature(String btToVatNature) {
        this.btToVatNature = btToVatNature == null ? null : btToVatNature.trim();
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

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson == null ? null : extJson.trim();
    }
}