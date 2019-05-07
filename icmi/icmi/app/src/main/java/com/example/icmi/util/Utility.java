package com.example.icmi.util;

import android.text.TextUtils;

import com.example.icmi.db.City;
import com.example.icmi.db.County;
import com.example.icmi.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析和处理服务器返回的数据
 */
public class Utility {
    /**
     * 处理省级数据
     */
    public static boolean handleProvinceResponse(String response){
        //返回数据不为空时
        if (!TextUtils.isEmpty(response)){
            try {
                //将返回的数据格式转化成JSONArray格式
                JSONArray allProvince = new JSONArray(response);
                //将返回的数据逐条进行解析
                for (int i = 0;i < allProvince.length();i++){
                    //将JSONArray格式转化成JSONObject类型
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    //将JSONObject解析好的省级数据封装到Province实体类中
                    //1.实例化省级类
                    Province province = new Province();
                    //2.封装值
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    //3.存储到数据库
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities =  new JSONArray(response);
                for (int i = 0;i < allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
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


    /**
     * 解析和处理县级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0;i < allCounties.length();i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountName(countyObject.getString("name"));
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
