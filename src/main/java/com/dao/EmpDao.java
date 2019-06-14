package com.dao;

import org.apache.ibatis.annotations.Mapper;

import com.entity.Emp;

import java.util.List;

@Mapper
public interface EmpDao {
    public List<Emp> findAll();
}