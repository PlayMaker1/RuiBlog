package com.util;

import java.io.Serializable;

public class Page implements Serializable{
	private int pageNo = 1;// 页码，第几页，默认第一页
	private int pageSize = 10;// 一页的长度，每页显示的条数，默认显示10条
	private int totalPages ; // 
	private int totalRecords ;// 总记录数，每页的条数 * 总页数
}
