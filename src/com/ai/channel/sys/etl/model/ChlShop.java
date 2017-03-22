package com.ai.channel.sys.etl.model;

import java.math.BigDecimal;
import java.util.Date;

public class ChlShop {
    private Long channelId;

    private Date openTime;

    private BigDecimal businessArea;

    private BigDecimal backgroundArea;

    private Integer shopRoomNum;

    private BigDecimal shopArea;

    private Integer floorNum;

    private Long businessDeskNum;

    private Long businessPersonNum;

    private String panoramaPicMongodbId;

    private String backgroundPicMongodbId;

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

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public BigDecimal getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(BigDecimal businessArea) {
        this.businessArea = businessArea;
    }

    public BigDecimal getBackgroundArea() {
        return backgroundArea;
    }

    public void setBackgroundArea(BigDecimal backgroundArea) {
        this.backgroundArea = backgroundArea;
    }

    public Integer getShopRoomNum() {
        return shopRoomNum;
    }

    public void setShopRoomNum(Integer shopRoomNum) {
        this.shopRoomNum = shopRoomNum;
    }

    public BigDecimal getShopArea() {
        return shopArea;
    }

    public void setShopArea(BigDecimal shopArea) {
        this.shopArea = shopArea;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public Long getBusinessDeskNum() {
        return businessDeskNum;
    }

    public void setBusinessDeskNum(Long businessDeskNum) {
        this.businessDeskNum = businessDeskNum;
    }

    public Long getBusinessPersonNum() {
        return businessPersonNum;
    }

    public void setBusinessPersonNum(Long businessPersonNum) {
        this.businessPersonNum = businessPersonNum;
    }

    public String getPanoramaPicMongodbId() {
        return panoramaPicMongodbId;
    }

    public void setPanoramaPicMongodbId(String panoramaPicMongodbId) {
        this.panoramaPicMongodbId = panoramaPicMongodbId == null ? null : panoramaPicMongodbId.trim();
    }

    public String getBackgroundPicMongodbId() {
        return backgroundPicMongodbId;
    }

    public void setBackgroundPicMongodbId(String backgroundPicMongodbId) {
        this.backgroundPicMongodbId = backgroundPicMongodbId == null ? null : backgroundPicMongodbId.trim();
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