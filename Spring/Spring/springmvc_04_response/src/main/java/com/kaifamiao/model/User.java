package com.kaifamiao.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
@lombok.Data
public class User {
    @NotNull(message = "id不能为空")
    private int id;

    @NotNull(message = "name不能为空")
    private String name;

    @NotNull(message = "生日不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday;

}
