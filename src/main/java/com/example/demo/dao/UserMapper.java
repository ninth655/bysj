package com.example.demo.dao;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Select("select * from salary where id=#{id}")
    public User getName(long id);
}
