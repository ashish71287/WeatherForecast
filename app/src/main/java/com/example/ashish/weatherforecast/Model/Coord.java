package com.example.ashish.weatherforecast.Model;

/**
 * Created by Ashish on 2018-05-16.
 */

public class Coord {
    private double lat;
    private double lon;
    public Coord(double lat,double lon){
        this.lat=lat;
        this.lon=lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
