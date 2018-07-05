package com.likainan.cmfz.service;

import com.likainan.cmfz.entity.Carousel;

import java.util.List;

/**
 * 轮播图管理业务
 * likainan
 * Created by ASUS on 2018/7/5.
 */
public interface CarouselService {
    List<Carousel> queryAllPic();
    int modifyStatus(String picId);
}
