package com.ai.channel.sys.etl.model;

import java.util.Date;

public class ChlManager {
    private Long distId;

    private Long channelId;

    private String recordType;

    private String channelManagerId;

    private String channelManagerName;

    private String channelManagerPhone;

    private String channelManagerCountyCode;

    private String channelManagerCountyName;

    private Date createTime;

    private String createOperId;

    private Date updateTime;

    private String updateOperId;

    private String remark;

    private String extJson;

    public Long getDistId() {
        return distId;
    }

    public void setDistId(Long distId) {
        this.distId = distId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getChannelManagerId() {
        return channelManagerId;
    }

    public void setChannelManagerId(String channelManagerId) {
        this.channelManagerId = channelManagerId == null ? null : channelManagerId.trim();
    }

    public String getChannelManagerName() {
        return channelManagerName;
    }

    public void setChannelManagerName(String channelManagerName) {
        this.channelManagerName = channelManagerName == null ? null : channelManagerName.trim();
    }

    public String getChannelManagerPhone() {
        return channelManagerPhone;
    }

    public void setChannelManagerPhone(String channelManagerPhone) {
        this.channelManagerPhone = channelManagerPhone == null ? null : channelManagerPhone.trim();
    }

    public String getChannelManagerCountyCode() {
        return channelManagerCountyCode;
    }

    public void setChannelManagerCountyCode(String channelManagerCountyCode) {
        this.channelManagerCountyCode = channelManagerCountyCode == null ? null : channelManagerCountyCode.trim();
    }

    public String getChannelManagerCountyName() {
        return channelManagerCountyName;
    }

    public void setChannelManagerCountyName(String channelManagerCountyName) {
        this.channelManagerCountyName = channelManagerCountyName == null ? null : channelManagerCountyName.trim();
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