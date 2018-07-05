package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

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
    private  String menuCode;
    private  int menuLevel;
    private List<Menu> menuList;

    public Menu() {
    }

    public Menu(String menuId, String menuName, String menuIcon, String menuUrl, String menuCode, int menuLevel, List<Menu> menuList) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuIcon = menuIcon;
        this.menuUrl = menuUrl;
        this.menuCode = menuCode;
        this.menuLevel = menuLevel;
        this.menuList = menuList;
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

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public int getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuCode='" + menuCode + '\'' +
                ", menuLevel=" + menuLevel +
                ", menuList=" + menuList +
                '}';
    }
}
