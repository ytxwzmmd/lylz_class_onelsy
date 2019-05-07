package com.example.icmi.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    //区县在本地数据库中存在的id
    private int id;
    //区县名称
    private String countName;
    //天气id
    private String weatherId;
    //区县id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
