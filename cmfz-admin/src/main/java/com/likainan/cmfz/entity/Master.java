package com.likainan.cmfz.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

/**
 * Created by ASUS on 2018/7/6.
 */
@Component
public class Master {

    private String masterId;
    @Excel(name = "上师法号")
    private String masterName;
    @Excel(name = "头像路径",orderNum = "1")
    private String masterPic;
    @Excel(name = "上师简介",orderNum = "2")
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
