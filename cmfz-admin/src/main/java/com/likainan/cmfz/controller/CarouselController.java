package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.Carousel;
import com.likainan.cmfz.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ASUS on 2018/7/5.
 */
@Controller
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;
    @RequestMapping("/showCarousel")
    @ResponseBody
    public List<Carousel> showAllPic(){
        return  carouselService.queryAllPic();
    }

    @RequestMapping("/modifyStatus")
    @ResponseBody
    public int modifyStatus(String picId){
        return  carouselService.modifyStatus(picId);
    }
}
