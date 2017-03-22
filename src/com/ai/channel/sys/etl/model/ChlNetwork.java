package com.ai.channel.sys.etl.model;

import java.util.Date;

public class ChlNetwork {
    private Long channelId;

    private String networkCoverage;

    private String systemAccessMode;

    private String internetAccessMode;

    private Integer state;

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

    public String getNetworkCoverage() {
        return networkCoverage;
    }

    public void setNetworkCoverage(String networkCoverage) {
        this.networkCoverage = networkCoverage == null ? null : networkCoverage.trim();
    }

    public String getSystemAccessMode() {
        return systemAccessMode;
    }

    public void setSystemAccessMode(String systemAccessMode) {
        this.systemAccessMode = systemAccessMode == null ? null : systemAccessMode.trim();
    }

    public String getInternetAccessMode() {
        return internetAccessMode;
    }

    public void setInternetAccessMode(String internetAccessMode) {
        this.internetAccessMode = internetAccessMode == null ? null : internetAccessMode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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