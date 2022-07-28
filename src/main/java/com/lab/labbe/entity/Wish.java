package com.lab.labbe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Wish {
    private Integer wishID;
    private String condition;
    private String content;
    private Date createdAt;

    public Integer getId() {
        return wishID;
    }
}
