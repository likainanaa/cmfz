package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 轮播图实体类
 * Author likainan
 * Created by ASUS on 2018/7/5.
 */
@Component
public class Carousel implements Serializable {
    private String picId;
    private String picPath;
    private Date picDate;
    private String picDescription;
    private int picStatus;

    public Carousel() {
    }

    public Carousel(String picId, String picPath, Date picDate, String picDescription, int picStatus) {
        this.picId = picId;
        this.picPath = picPath;
        this.picDate = picDate;
        this.picDescription = picDescription;
        this.picStatus = picStatus;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Date getPicDate() {
        return picDate;
    }

    public void setPicDate(Date picDate) {
        this.picDate = picDate;
    }

    public String getPicDescription() {
        return picDescription;
    }

    public void setPicDescription(String picDescription) {
        this.picDescription = picDescription;
    }

    public int getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(int picStatus) {
        this.picStatus = picStatus;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "picId='" + picId + '\'' +
                ", picPath='" + picPath + '\'' +
                ", picDate=" + picDate +
                ", picDescription='" + picDescription + '\'' +
                ", picStatus=" + picStatus +
                '}';
    }
}