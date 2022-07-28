package com.lab.labbe.controller;

import com.lab.labbe.entity.Log;
import com.lab.labbe.mapper.LogMapper;
import com.lab.labbe.service.LogService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/log")
@Mapper
public class LogController {
    @Resource
    private LogMapper logMapper;

    @Resource
    private LogService logService;
    @PostMapping
    public Integer save(@RequestBody Log log){
        return logService.save(log);
    }
    @GetMapping("")
    public List<Log> index(){

        return logMapper.findAll();
    }
    //@DeleteMapping("/{logID}")
    //public Integer delete(@PathVariable Integer logID){
       // return logMapper.deleteById(logID);
    //}
}
