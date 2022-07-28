package com.lab.labbe.service;

import com.lab.labbe.entity.Log;
import com.lab.labbe.mapper.LogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogService {
    @Resource
    private LogMapper logMapper;
    public int save(Log log){
       // if(log.getId() == null){
            return logMapper.insert(log);
        //} else {
        //    return logMapper.update(log);
        //}
    }
}
