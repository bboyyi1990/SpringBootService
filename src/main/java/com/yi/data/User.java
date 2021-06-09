package com.yi.data;

import javax.persistence.*;

/**
 * 数据库表
 */
//@Entity
//@Table(name = "tbl_user")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String token;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
