package com.controller.ui;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetGoogleController {
	@RequestMapping("/header")
	public ModelAndView getGoogle(HttpServletRequest request) {
		ModelAndView m = new ModelAndView();
		// 获取请求头
		String header = request.getHeader("user-Agent").toLowerCase();
		if (header.contains("chrome")) {
			m.addObject("browser", "chrome浏览器");
		} else if (header.contains("filefox")) {
			m.addObject("browser", "火狐浏览器");
		} else if (header.contains("msie")) {
			m.addObject("browser", "IE浏览器，我服");
		} else if (header.contains("qq")) {
			m.addObject("browser", "QQ浏览器");
		} else {
			m.addObject("browser", "其他浏览器");
		}
		m.setViewName("/exemsg");
		return m;
	}

}
