package com.example.icmi.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    //城市在本地数据库中所对于的id，也就是序号
    private int id;
    //城市名称
    private String cityName;
    //城市编码
    private int cityCode;
    //省份id,也就是省份的id作为城市表中的外键
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
