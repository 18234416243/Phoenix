package com.huanshuo.phoenix.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@RequiredArgsConstructor
public class User {

    //用户属性12
    private Integer id;
    private String name;
    private Integer sex;
    private Integer age;
    private Date createTim;

}
