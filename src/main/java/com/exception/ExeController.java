package com.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExeController {
	@RequestMapping("/exception01")
	public String exception01() throws ServiceException{
		throw new ServiceException("业务异常：ID不能为空");
	}
	@RequestMapping("/exception02")
	public String exception02() throws Exception{
		throw new Exception("系统异常，快撤,不，快来");
	}
}
