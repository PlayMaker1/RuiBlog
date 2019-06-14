package com.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

// 定义统一的异常处理类
@ControllerAdvice

public class HandleExeption {
	// 自定义业务异常映射，返回json格式提示
	@ExceptionHandler(value = ServiceException.class)
	@ResponseBody
	public ReturnException handle01(HttpServletRequest request, ServiceException e) {
		ReturnException returnException = new ReturnException();
		returnException.setCode(600);
		returnException.setMsg(e.getMessage());
		returnException.setUrl(String.valueOf(request.getRequestURL()));
		return returnException;
	}
	@ExceptionHandler(value = Exception.class)
		public ModelAndView handl02 (HttpServletRequest request,Exception e){
			ModelAndView m = new ModelAndView();
			m.addObject("ExeMsg",e.getMessage());
			m.addObject("uri",request.getRequestURI());
			m.addObject("str",request.getQueryString());
			m.addObject("method",request.getMethod());
			m.addObject("RegUrl",request.getRequestURL());
			m.setViewName("/exemsg");
			return m;
		}
	}
