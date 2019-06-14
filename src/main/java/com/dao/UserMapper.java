package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.User;

@Mapper
public interface UserMapper {
	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	@Select("select id,userName,userPassword from user")
	List<User> findAllUsers();

	/***
	 * 查询指定用户
	 * 
	 * @param user
	 * @return
	 */
	@Select("select id,userName,userPassword from user where userName = #{user.userName} and userPassword = #{user.userPassword}")
	List<User> findUser(User user);
}
