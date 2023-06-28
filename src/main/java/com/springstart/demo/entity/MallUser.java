package com.springstart.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MallUser)实体类
 *
 * @author makejava
 * @since 2023-06-28 13:35:45
 */
public class MallUser implements Serializable {
    private static final long serialVersionUID = -93060168614258782L;
    
    private Integer id;
    
    private String username;
    
    private String sex;
    
    private Date birthday;
    
    private String addr;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

