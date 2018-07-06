package com.likainan.cmfz.service;

import com.likainan.cmfz.entity.Carousel;

import java.util.List;
import java.util.Map;

/**
 * 轮播图管理业务
 * likainan
 * Created by ASUS on 2018/7/5.
 */
public interface CarouselService {
    Map<String,Object> queryAllPic(int offset, int rows);
    int modifyStatus(String picId);
    int addPic(Carousel carousel);
}
