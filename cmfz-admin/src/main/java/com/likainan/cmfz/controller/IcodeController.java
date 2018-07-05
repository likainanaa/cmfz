package com.likainan.cmfz.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.likainan.cmfz.untils.CreateValidateCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IcodeController {
	
	@RequestMapping("/getVcode")
	public void create(HttpSession session,HttpServletResponse response) throws IOException{
		CreateValidateCode vCode=new CreateValidateCode(100,30,4,10);
		session.setAttribute("code", vCode.getCode());
		System.out.println(vCode.getCode());
		vCode.write(response.getOutputStream());
	}
}
