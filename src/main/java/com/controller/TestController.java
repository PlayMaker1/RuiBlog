package com.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Emp;

@Controller
public class TestController {
	
	@RequestMapping("/user_login")
	public String login(Model model){
		model.addAttribute("address1","A");
		model.addAttribute("address2","Z");
		return "index";
	}
	
	@RequestMapping("/user_login1")
	public ModelAndView login1(){
		ModelAndView mv = new ModelAndView();
		//1.存数据
		mv.addObject("name","dd");
		mv.addObject("time",new Date());
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/")
	public String index(ModelMap modelMap){
		modelMap.addAttribute("name","1");
		return "index";
	}
	
	
}