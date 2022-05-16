package com.javacto.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * liu
 **/
public class User {
    private int tid;
    private String uname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private char sex;
    private String address;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
