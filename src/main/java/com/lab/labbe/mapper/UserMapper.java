package com.lab.labbe.mapper;
import com.lab.labbe.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * from sys_user")
    List<User> findAll();
    @Insert("INSERT into sys_user(username, password ,phone, identity, sex, college, stu_class, name) VALUES (#{username}, #{password}, #{phone}, #{identity}, #{sex}, #{college}, #{stu_class}, #{name})")
    int insert(User user);

    int update(User user);

    @Delete("delete from sys_user where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
