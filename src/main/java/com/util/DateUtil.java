package com.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//import org.junit.Test;

public class DateUtil {
	public static String getDateByTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String format = now.format(pattern);
		return format;
	}

	public static String getDateBySimpleDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
/*
	@Test
	public void TestTime() {
		System.out.println(LocalDateTime.now());
		System.out.println(DateUtil.getDateByTime());

	}*/
}
