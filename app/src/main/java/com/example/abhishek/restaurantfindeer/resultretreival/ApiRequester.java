package com.example.abhishek.restaurantfindeer.resultretreival;

import android.app.usage.UsageEvents;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.connection.ApiClient;
import com.example.abhishek.restaurantfindeer.dataaccess.ApiInterface;
import com.example.abhishek.restaurantfindeer.datamodel.LocationDetails;
import com.example.abhishek.restaurantfindeer.datamodel.LocationSuggestionsBean;
import com.example.abhishek.restaurantfindeer.datamodel.OnlyRestaurantModel;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantSearch;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantsBean;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;
import com.example.abhishek.restaurantfindeer.events.DemoEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public class ApiRequester {

    public void getLocationDetails(final String api_key, String query){
        ApiInterface client=new ApiClient().getClient().create(ApiInterface.class);

        Call<LocationDetails> call=client.getLocationDetails(api_key,query);
        call.enqueue(new Callback<LocationDetails>() {
            @Override
            public void onResponse(Call<LocationDetails> call, Response<LocationDetails> response) {
                if (response.code()==200){
                    LocationDetails details=(LocationDetails)response.body();
                    //EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.LOCATIONDETAILS,details));
                    LocationSuggestionsBean suggestionsBean=(LocationSuggestionsBean)details.getLocation_suggestions().get(0);
                    getRestaurants(api_key,Integer.toString(suggestionsBean.getEntity_id()),suggestionsBean.getEntity_type());
                    //EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.LOCATIONDETAILS,));

                }
                else
                {
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
                }
            }

            @Override
            public void onFailure(Call<LocationDetails> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
            }
        });
    }

    public  void getRestaurants(String api_key,String entityId,String entityType){
        ApiInterface client=new ApiClient().getClient().create(ApiInterface.class);
        Call<RestaurantSearch> call=client.getRestaurantSearch(api_key,entityId,entityType);
        call.enqueue(new Callback<RestaurantSearch>() {
            @Override
            public void onResponse(Call<RestaurantSearch> call, Response<RestaurantSearch> response) {
                if (response.code()==200){

                    RestaurantSearch restaurantSearch=(RestaurantSearch)response.body();
                    List<RestaurantsBean> restaurantsBean=restaurantSearch.getRestaurants();
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.RESTAURANTSBEAN, restaurantsBean));

                }else
                {
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
                }
            }

            @Override
            public void onFailure(Call<RestaurantSearch> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
            }
        });

    }

    public void getRestaurantsOne(String api_key, String entityId, String entityType, String sort, String order) {
        ApiInterface client=new ApiClient().getClient().create(ApiInterface.class);
        Call<RestaurantSearch> call=client.getRestaurantSearchOne(api_key,entityId,entityType,sort,order);
        call.enqueue(new Callback<RestaurantSearch>() {
            @Override
            public void onResponse(Call<RestaurantSearch> call, Response<RestaurantSearch> response) {
                if (response.code()==200){

                    RestaurantSearch restaurantSearch=(RestaurantSearch)response.body();
                    List<RestaurantsBean> restaurantsBean=restaurantSearch.getRestaurants();
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.RESTAURANTSBEAN,restaurantsBean));

                }else
                {
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
                }
            }

            @Override
            public void onFailure(Call<RestaurantSearch> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
            }
        });
    }





    public  void getRestaurantReviews(String api_key,String resId){
        ApiInterface client=new ApiClient().getClient().create(ApiInterface.class);
        Call<ReviewsModel> call=client.getRestaurantReviews(api_key,resId);
        call.enqueue(new Callback<ReviewsModel>() {
            @Override
            public void onResponse(Call<ReviewsModel> call, Response<ReviewsModel> response) {
                if (response.code()==200){

                    ReviewsModel reviewsModel=(ReviewsModel)response.body();
                    List<ReviewsModel.UserReviewsBean> restaurantsBean=reviewsModel.getUser_reviews();
                    EventBus.getDefault().post(new DemoEvent(reviewsModel,DemoEvent.Action.REVIEWSMODEL));

                }else
                {
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR));
                }
            }

            @Override
            public void onFailure(Call<ReviewsModel> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR1));
            }
        });

    }

    public void getRestaurantDetail(String apikey, String resId){
        ApiInterface client=new ApiClient().getClient().create(ApiInterface.class);
        Call<OnlyRestaurantModel> call=client.getRestaurantDetails(apikey,resId);
        call.enqueue(new Callback<OnlyRestaurantModel>() {
            @Override
            public void onResponse(Call<OnlyRestaurantModel> call, Response<OnlyRestaurantModel> response) {
                if (response.code() == 200) {
                    OnlyRestaurantModel detail=(OnlyRestaurantModel)response.body();
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.RESTAURANTDETAILS,detail));
                } else {
                    EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR1));

                }

            }

            @Override
            public void onFailure(Call<OnlyRestaurantModel> call, Throwable t) {
                EventBus.getDefault().post(new DemoEvent(DemoEvent.Action.ERROR1));

            }

            });

    }

}
