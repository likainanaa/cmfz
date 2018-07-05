package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 菜单实体类
 * Author likainan
 * Created by ASUS on 2018/7/5.
 */
@Component
public class Menu implements Serializable {
    private  String  menuId;
    private  String  menuName;
    private String  menuIcon;
    private  String menuUrl;
    private  int menuLevel;
    private String menuParentId;

    public Menu(String menuId, String menuName, String menuIcon, String menuUrl, int menuLevel, String menuParentId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuIcon = menuIcon;
        this.menuUrl = menuUrl;
        this.menuLevel = menuLevel;
        this.menuParentId = menuParentId;
    }

    public Menu() {
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getmenuIcon() {
        return menuIcon;
    }

    public void setmenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuLevel=" + menuLevel +
                ", menuParentId='" + menuParentId + '\'' +
                '}';
    }
}
