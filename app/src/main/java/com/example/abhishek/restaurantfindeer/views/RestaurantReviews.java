package com.example.abhishek.restaurantfindeer.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.adapters.ReviewsAdapter;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;
import com.example.abhishek.restaurantfindeer.events.DemoEvent;
import com.example.abhishek.restaurantfindeer.resultretreival.ApiRequester;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import static com.example.abhishek.restaurantfindeer.views.HomeActivity.api_key;


public class RestaurantReviews extends Fragment {

    public static String RESTAURANT_REVIEWS=RestaurantReviews.class.getSimpleName();
    public ReviewsModel reviewsModel;
    public RecyclerView recyclerView;
    String resId;
    List<ReviewsModel.UserReviewsBean> mList=new ArrayList<>();
    public RestaurantReviews() {
        // Required empty public constructor
    }

    public static RestaurantReviews newInstance(String resId) {
        RestaurantReviews fragment = new RestaurantReviews();
        Bundle args = new Bundle();
        args.putString(RESTAURANT_REVIEWS,resId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setArguments(Bundle args) {
        if (!args.isEmpty()){
            resId= args.getString(RESTAURANT_REVIEWS);
            //mList=reviewsModel.getUser_reviews();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_restaurant_reviews, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.review_recycler);
        new ApiRequester().getRestaurantReviews(api_key,resId);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       // recyclerView.setAdapter(new ReviewsAdapter(this.getActivity(),mList));

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessage(DemoEvent event){
        if (event.ACTION.equals(DemoEvent.Action.REVIEWSMODEL)){
            ReviewsModel reviewsModel=(ReviewsModel) event.getReviewsBean();
            recyclerView.setAdapter(new ReviewsAdapter(this.getActivity(),reviewsModel.getUser_reviews()));

        }else if (event.ACTION.equals(DemoEvent.Action.ERROR))
        {
            Toast.makeText(this.getActivity(), "this is error", Toast.LENGTH_SHORT).show();
        }
        else if (event.ACTION.equals(DemoEvent.Action.ERROR1)){
            Toast.makeText(this.getActivity(), "this is error two", Toast.LENGTH_SHORT).show();
        }

    }
}

