package com.example.icmi.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    //数据库对应的id，也就是每个省份在数据库中的序号
    private int id;
    //省份名称
    private String provinceName;
    //省份编码
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
