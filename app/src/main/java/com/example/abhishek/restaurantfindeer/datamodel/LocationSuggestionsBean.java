package com.example.abhishek.restaurantfindeer.datamodel;

/**
 * Created by ABHISHEK on 20-08-2017.
 */

public class LocationSuggestionsBean {
    /**
     * entity_type : city
     * entity_id : 8
     * title : Lucknow
     * latitude : 26.864
     * longitude : 80.95
     * city_id : 8
     * city_name : Lucknow
     * country_id : 1
     * country_name : India
     */

    private String entity_type;
    private int entity_id;
    private String title;
    private double latitude;
    private double longitude;
    private int city_id;
    private String city_name;
    private int country_id;
    private String country_name;



    public String getEntity_type() {
        return entity_type;
    }

    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type;
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}