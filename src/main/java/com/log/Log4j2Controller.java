package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2Controller {
	private  static final Logger logger = LoggerFactory.getLogger(Log4j2Controller.class);
	@RequestMapping("/printLog")
	public String printLog(){
		logger.error("Error级别日志");
		logger.warn("Info日志");
		return "success";
	}
}
