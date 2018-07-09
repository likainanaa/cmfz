package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.Manager;
import com.likainan.cmfz.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2018/7/4.
 */
@Controller
@SessionAttributes(value = {"manager"})

public class ManagerController {
    @Autowired
    private ManagerService ms;
    @RequestMapping("/login")
    public String  login(Manager mgr, HttpSession session,String code){
        System.out.println("mgr:"+mgr);
        Manager manager=ms.queryManager(mgr);
        String codee=(String) session.getAttribute("code");
        System.out.println(codee+":"+code);
        if(code.equalsIgnoreCase(codee)){
            System.out.println(manager);
            if(manager!=null){
                return "main";
            }
        }
        return "managerLogin";
    }

}
