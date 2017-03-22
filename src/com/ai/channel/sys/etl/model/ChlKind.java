package com.ai.channel.sys.etl.model;

public class ChlKind {
    private String kindId;

    private String kindName;

    private String parentKindId;

    private String kindLevel;

    private String firstKindId;

    private String secondKindId;

    private String thirdKindId;

    private String forthKindId;

    private String provinceCode;

    private String state;

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public String getParentKindId() {
        return parentKindId;
    }

    public void setParentKindId(String parentKindId) {
        this.parentKindId = parentKindId == null ? null : parentKindId.trim();
    }

    public String getKindLevel() {
        return kindLevel;
    }

    public void setKindLevel(String kindLevel) {
        this.kindLevel = kindLevel == null ? null : kindLevel.trim();
    }

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId == null ? null : firstKindId.trim();
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId == null ? null : secondKindId.trim();
    }

    public String getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(String thirdKindId) {
        this.thirdKindId = thirdKindId == null ? null : thirdKindId.trim();
    }

    public String getForthKindId() {
        return forthKindId;
    }

    public void setForthKindId(String forthKindId) {
        this.forthKindId = forthKindId == null ? null : forthKindId.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}