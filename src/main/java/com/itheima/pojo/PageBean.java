package com.itheima.pojo;

import lombok.Data;

import java.util.List;
@Data
public class PageBean {
    private long total;
    private List<User> rows;
}
