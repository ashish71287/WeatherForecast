package com.example.ashish.weatherforecast.common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ashish on 2018-05-15.
 */

public class Common {
    public static String API_KEY="7e2704edb956cfb3811f9dfda8f61de3";
    public static String API_LINK="http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb=new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat=new SimpleDateFormat("HH:mm");
        Date date=new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.com/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat=new SimpleDateFormat("dd MMMM yyyy hh:mm");
        Date date=new Date();
        return dateFormat.format(date);
    }
}
