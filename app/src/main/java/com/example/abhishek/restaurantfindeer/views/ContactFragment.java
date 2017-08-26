package com.example.abhishek.restaurantfindeer.views;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abhishek.restaurantfindeer.R;
import com.example.abhishek.restaurantfindeer.events.DemoEvent;
import com.example.abhishek.restaurantfindeer.resultretreival.ApiRequester;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import static com.example.abhishek.restaurantfindeer.views.HomeActivity.api_key;

public class ContactFragment extends Fragment {


    TextView phoneNumber;
    public static String CONTACT_FRAGMENT=ContactFragment.class.getSimpleName();
    String phoneNum;
    public ContactFragment() {
        // Required empty public constructor
    }

     public static ContactFragment newInstance(String param1) {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();
        args.putString(CONTACT_FRAGMENT, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setArguments(Bundle args) {
        if (!args.isEmpty()){
            phoneNum=args.getString(CONTACT_FRAGMENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_contact, container, false);
        phoneNumber=(TextView)view.findViewById(R.id.phone_number);
        phoneNumber.setText(phoneNum);
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" +  phoneNum));
                if (ActivityCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);

            }
        });

       // new ApiRequester().getRestaurantDetail(api_key,resID);

        return view;
    }

    /*@Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().post(this);

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().post(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessage(final DemoEvent event){

        if (event.ACTION.equals(DemoEvent.Action.RESTAURANTDETAILS)){
            phoneNumber.setText(event.getModel().getPhone_numbers());
            phoneNumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+event.getModel().getPhone_numbers()));
                    if (ActivityCompat.checkSelfPermission(getActivity(),
                            Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    startActivity(callIntent);

                }
            });
        }
        else if (event.ACTION.equals(DemoEvent.Action.ERROR)){
            Toast.makeText(this.getActivity(), "Phone Number not found", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this.getActivity(), "Please check your internet connection !!", Toast.LENGTH_SHORT).show();
        }
    }*/
}

