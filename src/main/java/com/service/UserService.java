package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {
	//查询所有用户
	public List<User> findAllUsers();
	//根据用户名user查找用户
	public List<User> findUser(User user);
	//增
	public User addUser(User user);
	//删
	public String deleteUser(User user);
	//改
	public User updateUser(User user);
}
