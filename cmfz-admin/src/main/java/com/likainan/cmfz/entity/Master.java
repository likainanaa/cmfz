package com.likainan.cmfz.entity;

/**
 * Created by ASUS on 2018/7/6.
 */
public class Master {
    private String masterId;
    private String masterName;
    private String masterPic;
    private String masterSummary;

    public Master() {
    }

    public Master(String masterId, String masterName, String masterPic, String masterSummary) {
        this.masterId = masterId;
        this.masterName = masterName;
        this.masterPic = masterPic;
        this.masterSummary = masterSummary;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getMasterSummary() {
        return masterSummary;
    }

    public void setMasterSummary(String masterSummary) {
        this.masterSummary = masterSummary;
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterId='" + masterId + '\'' +
                ", masterName='" + masterName + '\'' +
                ", masterPic='" + masterPic + '\'' +
                ", masterSummary='" + masterSummary + '\'' +
                '}';
    }
}
