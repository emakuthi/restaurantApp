package io.github.emakuthi.restaurant;

import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Robolectric;


import io.github.emakuthi.restaurant.ui.RestaurantsActivity;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)

public class RestaurantsActivityTest {
    private RestaurantsActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setUp() throws Exception {
        activity =Robolectric.setupActivity(RestaurantsActivity.class);
        mRestaurantListView=(ListView) activity.findViewById(R.id.listView);
    }

    @Test
    public void restaurantListViewPopulates()  {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(),15);
    }
}