package com.lab.labbe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer id;
    private Integer count;

    public Integer getId() {
        return id;
    }
}
