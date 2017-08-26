package com.example.abhishek.restaurantfindeer.events;

import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.OnlyRestaurantModel;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantSearch;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantsBean;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;

import java.util.List;

/**
 * Created by ABHISHEK on 20-08-2017.
 */

public class DemoEvent {

    public String ACTION=null;
    public LocationDetails locationDetails=null;
    public List<RestaurantsBean> mList=null;
    public ReviewsModel reviewsBean=null;
    OnlyRestaurantModel model;

    public DemoEvent(String ACTION){
        this.ACTION=ACTION;
    }

    public DemoEvent(String ACTION, LocationDetails locationDetails)
    {
        this.ACTION=ACTION;
        this.locationDetails=locationDetails;
    }

    public DemoEvent(ReviewsModel reviewsBeant, String ACTION)
    {
        this.ACTION=ACTION;
        this.reviewsBean=reviewsBeant;
    }

    public DemoEvent(String ACTION, List<RestaurantsBean> mList){
        this.ACTION=ACTION;
        this.mList=mList;
    }

    public void setACTION(String ACTION) {
        this.ACTION = ACTION;
    }

    public void setLocationDetails(LocationDetails locationDetails) {
        this.locationDetails = locationDetails;
    }

    public DemoEvent(String ACTION, OnlyRestaurantModel model){
        this.ACTION=ACTION;
        this.model=model;
    }

    public OnlyRestaurantModel getModel() {
        return model;
    }

    public String getACTION() {
        return ACTION;
    }

    public LocationDetails getLocationDetails() {
        return locationDetails;
    }

    public List<RestaurantsBean> getmList() {
        return mList;
    }

    public void setReviewsBean(ReviewsModel reviewsBean) {
        this.reviewsBean = reviewsBean;
    }

    public ReviewsModel getReviewsBean() {
        return reviewsBean;
    }




    public static  class Action{
        public static String RESTAURANTDETAILS ="restaurantdetails" ;
        public static String ERROR1="error1";
        public static String ERROR="error";
        public static String LOCATIONDETAILS="locationdetails";
        public static String RESTAURANTSBEAN="restaurantsbean";
        public static String REVIEWSMODEL="reviewsmodel";
    }
}
