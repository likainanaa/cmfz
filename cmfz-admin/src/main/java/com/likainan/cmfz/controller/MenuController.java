package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.Menu;
import com.likainan.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ASUS on 2018/7/5.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/showMenu")
    public  @ResponseBody List<Menu> showAllMenu(){
        List<Menu> list =menuService.queryAllMenu();
        return  list;
    }
}
