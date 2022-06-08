package com.bdqn.dao;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from User")
    List<User> list();

    @Insert("insert into User(username,password,sex,address) values (#{username},#{password},#{sex},#{address})")
    void addUser(User user);

    @Delete("delete from User where id=#{id}")
    void delete(int id);

    @Select("select * from User where id=#{id}")
    User findUserById(int id);

    @Update("update user set username=#{username},password=#{password},sex=#{sex},address=#{address} where id=#{id}")
    void update(User user);
}
