package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Desctiption  管理员实体类
 * Author 李凯楠
 * Created by ASUS on 2018/7/4.
 */
@Component
public class Manager  implements Serializable{
    private String mgrId;
    private String mgrName;
    private String mgrPassword;
    private String salt;
    private int status;
    public Manager() {
    }

    public Manager(String mgrId, String mgrName, String mgrPassword, String salt, int status) {
        this.mgrId = mgrId;
        this.mgrName = mgrName;
        this.mgrPassword = mgrPassword;
        this.salt = salt;
        this.status = status;
    }

    public String getMgrId() {
        return mgrId;
    }

    public void setMgrId(String mgrId) {
        this.mgrId = mgrId;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getMgrPassword() {
        return mgrPassword;
    }

    public void setMgrPassword(String mgrPassword) {
        this.mgrPassword = mgrPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgrId='" + mgrId + '\'' +
                ", mgrName='" + mgrName + '\'' +
                ", mgrPassword='" + mgrPassword + '\'' +
                ", salt='" + salt + '\'' +
                ", status=" + status +
                '}';
    }
}
