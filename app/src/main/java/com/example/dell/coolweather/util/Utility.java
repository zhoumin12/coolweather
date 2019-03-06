package com.example.dell.coolweather.util;

import android.text.TextUtils;

import com.example.dell.coolweather.db.City;
import com.example.dell.coolweather.db.County;
import com.example.dell.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by DELL on 2019/3/6.
 */

public class Utility {
    /*
    * 解析和处理服务器返回的省服数据
    */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i < allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    解析和处理服务器返回的市级数据
    */
    public static boolean handleCityResponse(String response, int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCites = new JSONArray(response);
                for (int i = 0; i < allCites.length(); i++) {
                    JSONObject cityObject = allCites.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allcounties = new JSONArray(response);
                for (int i = 0;i < allcounties.length();i++){
                    JSONObject countyObject = allcounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
