package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.User;

import java.util.List;

/**
 * Created by ASUS on 2018/7/9.
 */
public interface UserDao {
    List<User> findAllUser();
}
