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
		}
		if (header.contains("filefox")) {
			m.addObject("b	rowser", "火狐浏览器");
		}
		if (header.contains("msie")) {
			m.addObject("browser", "IE浏览器，我服");
		}
		if (header.contains("qq")) {
			m.addObject("browser", "QQ浏览器");
		}
		m.setViewName("/exemsg");
		return m;
	}

}
