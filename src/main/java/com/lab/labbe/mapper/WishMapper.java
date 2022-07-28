package com.lab.labbe.mapper;

import com.lab.labbe.entity.Wish;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface WishMapper {
    @Select("SELECT * from wish")
    List<Wish> findAll();
    @Insert("INSERT into wish(content, `condition`) VALUES (#{content}, '未处理')")
    int insert(Wish wish);

    int update(Wish wish);
    @Delete("delete from wish where wishID = #{wishID}")
    int deleteById(@Param("wishID") Integer wishID);
}
