package com.cssl.branches.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Branches {
    private int id;
    private String  name;
    private int cityAreaId;
    private String address;
    private String telephone;
    private int cid;//地区
    private String cname;//地区名

    private Date birth;
    @DateTimeFormat( pattern = "yyyy-MM-dd")
    public Date getBirth() {
        return birth;
    }
    @DateTimeFormat( pattern = "yyyy-MM-dd")
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityAreaId() {
        return cityAreaId;
    }

    public void setCityAreaId(int cityAreaId) {
        this.cityAreaId = cityAreaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
