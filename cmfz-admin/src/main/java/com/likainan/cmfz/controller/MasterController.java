package com.likainan.cmfz.controller;

import com.likainan.cmfz.dao.MasterDao;
import com.likainan.cmfz.entity.Master;
import com.likainan.cmfz.service.MasterService;
import com.likainan.cmfz.untils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/7/6.
 */
@Controller
@RequestMapping("/master")
public class MasterController {
    @Autowired
    private MasterService masterService;
    @RequestMapping("/showMaster")
    @ResponseBody
    public Object showMaster(int page,int rows,String name){
            return  masterService.queryAllMaster((page-1)*rows,rows,name);

    }
    @RequestMapping("/addMasters")    @ResponseBody
    public int addMasters(@RequestParam(value = "file",required = false) MultipartFile file){
        System.out.println("文件名："+file.getName());
        List<Master> list=ExcelUtil.importExcel(file,1,1,Master.class);
        int n=masterService.addMasters(list);
        if(n!=0){
            System.out.println("插入"+n+"条数据");
            return n;
        }
        return 0;
    }
}
