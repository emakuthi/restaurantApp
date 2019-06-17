package io.github.emakuthi.restaurant.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import io.github.emakuthi.restaurant.models.Restaurant;
import io.github.emakuthi.restaurant.ui.RestaurantDetailFragment;

public class RestaurantPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Restaurant> mRestaurants;
    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants){
        super(fm);
        mRestaurants = restaurants;
    }
@Override
    public Fragment getItem(int position){
        return RestaurantDetailFragment.newInstance(mRestaurants.get(position));

}

@Override
    public int getCount(){
        return  mRestaurants.size();
}
@Override
    public CharSequence getPageTitle(int position){
        return mRestaurants.get(position).getName();
}

}
