package com.lab.labbe.mapper;
import com.lab.labbe.entity.Log;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LogMapper {
    @Select("SELECT * from log")
    List<Log> findAll();
    @Insert("INSERT into log(operate) VALUES (#{operate})")
    int insert(Log log);

    //更新记录
    //int update(Log log);
//    @Delete("delete from sys_user where id = #{id}")
//    int deleteById(@Param("id") Integer id);
}
