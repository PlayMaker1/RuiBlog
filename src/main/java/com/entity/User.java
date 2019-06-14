package com.entity;

import java.io.Serializable;
/**
 * 
 * @author Lurui
 * @since 2019/5/6
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private String userPassword;
	private String userToken;

	public User() {
		super();
	}

	public User(Integer id, String userName, String userPassword, String userToken) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userToken = userToken;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userToken="
				+ userToken + "]";
	}

}
