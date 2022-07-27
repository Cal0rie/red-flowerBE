package com.lab.labbe.controller;

import com.lab.labbe.entity.User;
import com.lab.labbe.mapper.UserMapper;
import com.lab.labbe.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/user")
@Mapper
public class UserController {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;
    @PostMapping
    public Integer save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("")
    public List<User> index(){

        return userMapper.findAll();
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }
}
