package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.Manager;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ASUS on 2018/7/4.
 */
public interface ManagerDao {
    Manager findManager(@Param("MGR_NAME") String mgrName);
}
