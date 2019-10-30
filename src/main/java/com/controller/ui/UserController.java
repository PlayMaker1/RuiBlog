package com.controller.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

// 跳转页面，RestController会返回值，不能识别页面
@Controller
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/show")
	public String show(Model model){
		List<User> users = userService.findAllUsers();
		model.addAttribute("users",users);
		return "show";
	}
	@RequestMapping(value="/login")
	@ResponseBody
	public Map<String,String> login(HttpServletRequest request){
		String u = request.getParameter("username");
		String p = request.getParameter("password");
		List<User> users = userService.findAllUsers();
		Map<String,String> data = new HashMap<>();
		for(User user :users){
			if(u.equals(user.getUserName()) && p.equals(user.getUserPassword())){
				data.put("msg", "ok");
			}
		}
		return data;
	}
}
