package com.lab.labbe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String college;
    private String stu_class;
    private String sex;
    private String phone;
    private String identity;
    private Date create_time;

    public Integer getId() {
        return id;
    }
}
