package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.Carousel;

import java.util.List;

/**
 * Created by ASUS on 2018/7/5.
 */
public interface CarouselDao {
    /**
     * 查询轮播图库所有图片
     * @return list
     */
    List<Carousel> findAllPic();
    /**
     * 修改轮播图片的状态
     * @return list
     */
    int updateStatus(String picId);

}
