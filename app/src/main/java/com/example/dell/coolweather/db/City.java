package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2019/3/6.
 */

public class City extends DataSupport {
    private int id;

    private String cityName;

    private int cityCode;

    public int provinceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

