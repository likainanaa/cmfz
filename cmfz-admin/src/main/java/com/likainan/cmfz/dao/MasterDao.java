package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.Master;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ASUS on 2018/7/6.
 */
public interface MasterDao {
    List<Master> findAllMaster(@Param("offset") int page,@Param("rows") int rows);
    int count();

}
