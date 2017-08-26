package com.example.abhishek.restaurantfindeer.dataaccess;

import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.OnlyRestaurantModel;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantSearch;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public interface ApiInterface {

    @GET("locations")
    Call<LocationDetails> getLocationDetails(@Header("user-key") String api_key, @Query("query") String query);

    @GET("search")
    Call<RestaurantSearch> getRestaurantSearch(@Header("user-key") String apikey,
                                               @Query("entity_id") String entityId,
                                               @Query("entity_type") String entityType);

    @GET("search")
    Call<RestaurantSearch> getRestaurantSearchOne(@Header("user-key") String api_key, @Query("entity_id") String entityId, @Query("entity_type") String entityType, @Query("sort") String sort, @Query("order") String order);

    @GET("reviews")
    Call<ReviewsModel> getRestaurantReviews(@Header("user-key")String apikey,@Query("res_id")String resID);

    @GET("restaurant")
    Call<OnlyRestaurantModel> getRestaurantDetails(@Header("user-key")String apikey,@Query("res_id") String resId);

}
