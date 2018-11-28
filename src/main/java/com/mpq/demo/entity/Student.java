package com.mpq.demo.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Student {
    @NotNull(message = "不能为空")
    private String name;
    private Integer age;
    private String address;
}
