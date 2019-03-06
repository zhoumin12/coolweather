package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2019/3/6.
 */

public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
