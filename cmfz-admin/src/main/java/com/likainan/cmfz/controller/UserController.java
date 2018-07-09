package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ASUS on 2018/7/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/showUser1")
    @ResponseBody
    public List<User> showAllUser1(){
        List<User>list=new ArrayList<User>();
        list.add(new User("河南",(int)(Math.random()*1000000)));
        list.add(new User("北京",(int)(Math.random()*1000000)));
        list.add(new User("上海",(int)(Math.random()*1000000)));
        list.add(new User("河北",(int)(Math.random()*10000)));
        list.add(new User("四川",(int)(Math.random()*10000)));
        list.add(new User("广东",(int)(Math.random()*10000)));
        list.add(new User("西藏",(int)(Math.random()*10000)));
        list.add(new User("内蒙古",(int)(Math.random()*10000)));
        list.add(new User("新疆",(int)(Math.random()*10000)));
        list.add(new User("浙江",(int)(Math.random()*10000)));
        list.add(new User("安徽",(int)(Math.random()*10000)));
        list.add(new User("湖北",(int)(Math.random()*10000)));
        return list;
    }
    @RequestMapping("/showUser2")
    @ResponseBody
    public List<User> showAllUser2(){
        List<User>list=new ArrayList<User>();
        list.add(new User("河南",(int)(Math.random()*10000)));
        list.add(new User("北京",(int)(Math.random()*10000)));
        list.add(new User("上海",(int)(Math.random()*10000)));
        list.add(new User("河北",(int)(Math.random()*10000)));
        list.add(new User("四川",(int)(Math.random()*10000)));
        list.add(new User("广东",(int)(Math.random()*10000)));
        list.add(new User("西藏",(int)(Math.random()*10000)));
        list.add(new User("内蒙古",(int)(Math.random()*10000)));
        list.add(new User("安徽",(int)(Math.random()*10000)));
        list.add(new User("湖北",(int)(Math.random()*10000)));
        list.add(new User("新疆",(int)(Math.random()*10000)));
        list.add(new User("浙江",(int)(Math.random()*10000)));
        return list;
    }

}
