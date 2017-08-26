package com.example.abhishek.restaurantfindeer.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.abhishek.restaurantfindeer.views.RestaurantListFragment;

/**
 * Created by ABHISHEK on 31-07-2017.
 */

public class MyHomeScreenPagerAdapter extends FragmentStatePagerAdapter {

    int numOfTabs;

    public MyHomeScreenPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                RestaurantListFragment tab1 = new RestaurantListFragment();
                return tab1;
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Restaurants";
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }


}
