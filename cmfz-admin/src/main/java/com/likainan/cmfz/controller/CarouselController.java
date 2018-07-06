package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.Carousel;
import com.likainan.cmfz.service.CarouselService;
import com.likainan.cmfz.untils.GetUUID;
import com.sun.deploy.net.HttpRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
    public Map<String,Object> showAllPic(@RequestParam("page") int nowPage, @RequestParam("rows") int pageSize){
        return  carouselService.queryAllPic((nowPage-1)*pageSize,pageSize);
    }
    @RequestMapping("/modifyStatus")
    @ResponseBody
    public int modifyStatus(String picId){
        return  carouselService.modifyStatus(picId);
    }

    @RequestMapping("/upPic")
    @ResponseBody
    public int upPic(MultipartFile myPic, HttpSession session, HttpServletRequest request, String description)throws Exception{
        System.out.println(description);
//        1.获得文件夹名
        String  realPath1=request.getRealPath("/");
        String sub =new File(realPath1).getParent();
        System.out.println("sub:"+sub);
        String realPath =sub+"\\carouselImg";
        System.out.println(realPath);
//            2.生成UUID的唯一文件名
            String uuidName= GetUUID.getUUID();
//            3.截取文件本身的后缀的后缀
            String oldName=myPic.getOriginalFilename();
            String suffix =oldName.substring(oldName.indexOf("."));
             File file=new File(realPath+"/"+uuidName+suffix);
            System.out.println(file.getPath());
            Carousel carousel=new Carousel(GetUUID.getUUID(),uuidName+suffix,new Date(),description,0);
            int n=carouselService.addPic(carousel);
            if(n!=0){
                myPic.transferTo(file);
                return n;
             }
              return 0;
    }

}
