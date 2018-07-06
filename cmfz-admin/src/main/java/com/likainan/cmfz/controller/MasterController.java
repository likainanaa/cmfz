package com.likainan.cmfz.controller;

import com.likainan.cmfz.dao.MasterDao;
import com.likainan.cmfz.entity.Master;
import com.likainan.cmfz.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Map<String,Object> showMaster(int page,int rows){
        return  masterService.queryAllMaster((page-1)*rows,rows);
    }
}
