package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.User;
import org.springframework.stereotype.Component;

@Mapper
// 加了后 Service实现类 引用时不会提示错误
@Component(value = "UserMapper")

public interface UserMapper {

	@Select("select qlrmc from djjgk.dj_qlr")
	List<User> findAllUsers();

	@Select("select id,userName,userPassword from user where userName = #{user.userName} and userPassword = #{user.userPassword}")
	List<User> findUser(User user);
}
