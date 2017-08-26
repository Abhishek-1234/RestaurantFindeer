package com.example.abhishek.restaurantfindeer.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantBean;
import com.example.abhishek.restaurantfindeer.datamodel.ReviewsModel;
import com.example.abhishek.restaurantfindeer.events.DemoEvent;
import com.example.abhishek.restaurantfindeer.resultretreival.ApiRequester;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.abhishek.restaurantfindeer.views.HomeActivity.api_key;

public class RestaurantDetailedFragment extends Fragment {

    private static final String RESTAURANTDETAILEDFRAGMENT=RestaurantDetailedFragment.class.getSimpleName();

    private RestaurantBean restaurantDetailed;

    @BindView(R.id.detailedImage)
    ImageView RestaurantImage;
    @BindView(R.id.RestaurantName)
    TextView RestaurantName;
    @BindView(R.id.RestaurantAddress)
    TextView RestaurantAddress;
    @BindView(R.id.RestaurantCuisines)
    TextView RestaurantCuisines;
    @BindView(R.id.RestaurantCostForTwo)
    TextView RestaurantCostForTwo;
    @BindView(R.id.online_delivery)
    TextView RestaurantOnlineDelivery;
    @BindView(R.id.reviews)
    Button Reviews;
    @BindView(R.id.map)
    Button Map;
    @BindView(R.id.contact)
    Button Contact;


    public RestaurantDetailedFragment() {
        // Required empty public constructor
    }

    public static RestaurantDetailedFragment newInstance(RestaurantBean restaurantDetailed) {
        RestaurantDetailedFragment fragment = new RestaurantDetailedFragment();
        Bundle args = new Bundle();
        args.putSerializable(RESTAURANTDETAILEDFRAGMENT, restaurantDetailed);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setArguments(Bundle args) {
        if (args.containsKey(RESTAURANTDETAILEDFRAGMENT)){
            restaurantDetailed=(RestaurantBean) args.get(RESTAURANTDETAILEDFRAGMENT);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // do nothing
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_restaurant_detailed, container, false);

        ButterKnife.bind(this,view);

        if (!TextUtils.isEmpty(restaurantDetailed.getName())){
            RestaurantName.setText(restaurantDetailed.getName());
            Toast.makeText(getActivity(), "restaurant details are working fine", Toast.LENGTH_SHORT).show();
        }
        if (!TextUtils.isEmpty(restaurantDetailed.getLocation().getAddress())){
            RestaurantAddress.append(restaurantDetailed.getLocation().getAddress());
        }
        if (!TextUtils.isEmpty(restaurantDetailed.getCuisines())){
            RestaurantCuisines.append(restaurantDetailed.getCuisines());
        }
        if (!TextUtils.isEmpty(Integer.toString(restaurantDetailed.getAverage_cost_for_two())+restaurantDetailed.getCurrency())){
            RestaurantCostForTwo.append(Integer.toString(restaurantDetailed.getAverage_cost_for_two())+restaurantDetailed.getCurrency());
        }
        if (!TextUtils.isEmpty(restaurantDetailed.getThumb())){
            Picasso.with(this.getActivity()).load(restaurantDetailed.getThumb()).
                    error(R.mipmap.ic_launcher_round).placeholder(R.mipmap.ic_launcher_round).
                    into(RestaurantImage);
        }else
        {
            RestaurantImage.setImageResource(R.mipmap.ic_launcher_round);
        }
        if (restaurantDetailed.getHas_online_delivery()==0){
            RestaurantOnlineDelivery.append("Yes");
        }
        else
        {
            RestaurantOnlineDelivery.append("No");
        }

        return view;

    }



    @OnClick(R.id.reviews)
    public void GetReviews(){

        Fragment fragment=new RestaurantReviews().newInstance(restaurantDetailed.getId());
        getFragmentManager().beginTransaction().replace(R.id.restaurant_frame_layout_container,fragment,"Reviews_Fragment").addToBackStack(null).commit();

    }

    @OnClick(R.id.map)
    public void GetMap(){
        Fragment fragment=new MapFragment().newInstance(restaurantDetailed.getLocation().getLatitude(),restaurantDetailed.getLocation().getLongitude());
        getFragmentManager().beginTransaction().replace(R.id.restaurant_frame_layout_container,fragment,"Map Fragment").addToBackStack(null).commit();

    }

    @OnClick(R.id.contact)
    public void GetContact(){
        new ApiRequester().getRestaurantDetail(api_key,restaurantDetailed.getId());
        }




    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessage(DemoEvent event) {


        if (event.ACTION.equals(DemoEvent.Action.RESTAURANTDETAILS)) {
            Fragment frament = new ContactFragment().newInstance(event.getModel().getPhone_numbers());
            getFragmentManager().beginTransaction().replace(R.id.restaurant_frame_layout_container, frament, "contact details").addToBackStack(null).commit();

        }/*else if (event.ACTION.equals(DemoEvent.Action.ERROR))
        {
            Toast.makeText(this.getActivity(), "this is error", Toast.LENGTH_SHORT).show();
        }
        else if (event.ACTION.equals(DemoEvent.Action.ERROR1)){
            Toast.makeText(this.getActivity(), "this is error two", Toast.LENGTH_SHORT).show();
        */
    }

}

