package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.Menu;

import java.util.List;

/**
 * 菜单dao层
 * likaiann
 * Created by ASUS on 2018/7/5.
 */
public interface MenuDao {
    List<Menu> findAllMenu();

}
