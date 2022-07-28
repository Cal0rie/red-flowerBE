package com.lab.labbe.controller;

import com.lab.labbe.entity.Wish;
import com.lab.labbe.mapper.WishMapper;
import com.lab.labbe.service.WishService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/wish")
@Mapper
public class WishController {
    @Resource
    private WishMapper wishMapper;

    @Resource
    private WishService wishService;
    @PostMapping
    public Integer save(@RequestBody Wish wish){
        return wishService.save(wish);
    }
    @GetMapping("")
    public List<Wish> index(){

        return wishMapper.findAll();
    }
    @DeleteMapping("/{wishID}")
    public Integer delete(@PathVariable Integer wishID){
        return wishMapper.deleteById(wishID);
    }
}
