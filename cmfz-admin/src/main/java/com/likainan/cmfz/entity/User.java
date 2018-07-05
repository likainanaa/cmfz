package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Description 用户实体类
 * @Author  李凯楠
 * @Time    2018-07-04 15:47
 */
@Component
public class User implements Serializable{
    private String userId;
    private String userName;
    private String password;
    private String userBuddhishName;
    private String userSex;
    private String userHeadPic;
    private String userAddress;
    private String userPhone;
    private String userSignature;
    private String  masterld;
    private int userStatus;

    public User() {
    }
    public User(String userId, String userName, String password, String userBuddhishName, String userSex, String userHeadPic, String userAddress, String userPhone, String userSignature, String masterld, int userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userBuddhishName = userBuddhishName;
        this.userSex = userSex;
        this.userHeadPic = userHeadPic;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userSignature = userSignature;
        this.masterld = masterld;
        this.userStatus = userStatus;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserBuddhishName() {
        return userBuddhishName;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserHeadPic() {
        return userHeadPic;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public String getMasterld() {
        return masterld;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserBuddhishName(String userBuddhishName) {
        this.userBuddhishName = userBuddhishName;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserHeadPic(String userHeadPic) {
        this.userHeadPic = userHeadPic;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public void setMasterld(String masterld) {
        this.masterld = masterld;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userBuddhishName='" + userBuddhishName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userHeadPic='" + userHeadPic + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSignature='" + userSignature + '\'' +
                ", masterld='" + masterld + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
