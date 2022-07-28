package com.lab.labbe.service;

import com.lab.labbe.entity.Wish;
import com.lab.labbe.mapper.WishMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WishService {
    @Resource
    private WishMapper wishMapper;
    public int save(Wish wish) {
        if (wish.getId() == null) {
            return wishMapper.insert(wish);
        } else {
            return wishMapper.update(wish);
        }
    }
}
