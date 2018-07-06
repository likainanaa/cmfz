package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.CarouselDao;
import com.likainan.cmfz.entity.Carousel;
import com.likainan.cmfz.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/7/5.
 */
@Service
@Transactional
public class CarouselServiceImpl  implements CarouselService{
    @Autowired
    private CarouselDao carouselDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Map<String,Object> queryAllPic(int offset,int rows) {
        List<Carousel> list=carouselDao.findAllPic(offset,rows);
        int counts=carouselDao.count();
        if(list!=null){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("total",counts);
            map.put("rows",list);
            return  map;
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int modifyStatus(String picId) {
       int n= carouselDao.updateStatus(picId);
       if(n!=0){
           return n;
       }
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addPic(Carousel carousel) {
        int n=carouselDao.insertPic(carousel);
        return n;
    }
}
