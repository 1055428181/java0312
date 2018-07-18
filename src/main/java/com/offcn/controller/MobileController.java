package com.offcn.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	private MobileService service;
	ModelAndView mv = null;
	@RequestMapping("/up")
	public ModelAndView getMobile(String MobileNumber){
		mv = new ModelAndView("index");
		
		Mobile mobile = service.getMobile(Integer.parseInt(MobileNumber));
		List<Mobile> list = new ArrayList<>();
		list.add(mobile);
		
		System.out.println(mobile);
		String area = mobile.getMobileArea();
		
		mv.addObject("list", list);
		mv.addObject("area", area);
		mv.addObject("mobile", mobile);
	
		return mv;
	}
}
