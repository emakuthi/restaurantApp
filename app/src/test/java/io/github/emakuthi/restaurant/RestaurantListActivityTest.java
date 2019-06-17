package io.github.emakuthi.restaurant;

import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Robolectric;


import io.github.emakuthi.restaurant.ui.RestaurantListActivity;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)

public class RestaurantListActivityTest {
    private RestaurantListActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setUp() throws Exception {
        activity =Robolectric.setupActivity(RestaurantListActivity.class);
        mRestaurantListView=(ListView) activity.findViewById(R.id.recyclerView);
    }

    @Test
    public void restaurantListViewPopulates()  {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(),15);
    }
}