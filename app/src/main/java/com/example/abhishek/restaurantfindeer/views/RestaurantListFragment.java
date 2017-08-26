package com.example.abhishek.restaurantfindeer.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.adapters.AlbumsAdapter;
import com.example.abhishek.restaurantfindeer.datamodel.RestaurantsBean;
import com.example.abhishek.restaurantfindeer.events.DemoEvent;
import com.example.abhishek.restaurantfindeer.resultretreival.ApiRequester;
import com.example.abhishek.restaurantfindeer.resultretreival.RecyclerOnItemClickListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class RestaurantListFragment extends Fragment implements YourFragmentInterface {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    RecyclerView recyclerView;

    public static final RestaurantListFragment newInstance(String message) {
        RestaurantListFragment f = new RestaurantListFragment();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_MESSAGE, message);
        f.setArguments(bdl);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //String message = getArguments().getString(EXTRA_MESSAGE);
        View v = inflater.inflate(R.layout.myfragment_layout, container, false);
        recyclerView=(RecyclerView)v.findViewById(R.id.recycler_view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
       // fragmentInitialCondition();
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(DemoEvent event) {
        if (event.ACTION.equals(DemoEvent.Action.RESTAURANTSBEAN)){
            //LocationSuggestionsBean suggestion=event.getLocationDetails().getLocation_suggestions().get(0);
            Toast.makeText(this.getActivity(), "update tab one restaurant details", Toast.LENGTH_SHORT).show();
            final List<RestaurantsBean> mList=event.getmList();

            recyclerView.setAdapter(new AlbumsAdapter(this.getActivity(),mList));
            recyclerView.addOnItemTouchListener(new RecyclerOnItemClickListener(this.getActivity(), recyclerView, new RecyclerOnItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Toast.makeText(getActivity(), "clicked :"+position, Toast.LENGTH_SHORT).show();
                    Fragment fragment=RestaurantDetailedFragment.newInstance(mList.get(position).getRestaurant());
                    getFragmentManager().beginTransaction().replace(R.id.restaurant_frame_layout_container,fragment,"SelectedRestraurantDetails").addToBackStack(null).commit();

                }

                @Override
                public void onItemLongClick(View view, int position) {

                }
            }));
            //Toast.makeText(this.getActivity(), ""+suggestion.getCity_name()+" "+suggestion.getCountry_name()+" "+suggestion.getLatitude()+" "+suggestion.getEntity_type(), Toast.LENGTH_SHORT).show();
        }
        else if (event.ACTION.equals(DemoEvent.Action.ERROR)){
            Toast.makeText(this.getActivity(), "Zomato is not yet available in your city", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this.getActivity(), "Check your internet connection", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void fragmentBecameVisible(String query) {
        //not using Query currently but you can use query string
        new ApiRequester().getLocationDetails("9d2944162894f32711911d556083025a",query);
    }

    @Override
    public void fragmentInitialCondition() {
       // new ApiRequester().getRestaurants("9d2944162894f32711911d556083025a","rating","desc");
    }


}
