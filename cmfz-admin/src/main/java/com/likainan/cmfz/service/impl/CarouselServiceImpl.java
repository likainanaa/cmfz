package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.CarouselDao;
import com.likainan.cmfz.entity.Carousel;
import com.likainan.cmfz.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<Carousel> queryAllPic() {
        List<Carousel> list=carouselDao.findAllPic();
        if(list!=null){
            return  list;
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
}
