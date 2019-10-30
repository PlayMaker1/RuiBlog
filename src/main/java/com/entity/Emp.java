package com.entity;

import lombok.Getter;

@Getter
public class Emp {
	private String name;
	private String sec;
	public Emp(String name, String sec) {
		super();
		this.name = name;
		this.sec = sec;
	}
	public Emp() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
}
