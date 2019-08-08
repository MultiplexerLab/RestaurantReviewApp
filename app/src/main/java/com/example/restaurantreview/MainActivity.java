package com.example.restaurantreview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.restaurantreview.Fragment.AboutusFragment;
import com.example.restaurantreview.Fragment.MapFragment;
import com.example.restaurantreview.Fragment.ReviewFragment;
import com.example.restaurantreview.Fragment.MerchantFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;
    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleFrameLayout = (FrameLayout) findViewById(R.id.simpleFrameLayout);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        setTab();
        setInitFragment();
        setListener();
    }



    private void setTab() {
        TabLayout.Tab mapTab = tabLayout.newTab();
        mapTab.setText("Map");
        tabLayout.addTab(mapTab);

        TabLayout.Tab reviewTab = tabLayout.newTab();
        reviewTab.setText("Review");
        tabLayout.addTab(reviewTab);

        TabLayout.Tab merchantTab = tabLayout.newTab();
        merchantTab.setText("Merchant");
        tabLayout.addTab(merchantTab);

        TabLayout.Tab aboutusTab = tabLayout.newTab();
        aboutusTab.setText("About Us");
        tabLayout.addTab(aboutusTab);
    }

    private void setInitFragment() {
        getSupportActionBar().setTitle("Map");
        fragment = new MapFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.simpleFrameLayout, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

    private void setListener() {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            Fragment fragment = null;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new MapFragment();
                        getSupportActionBar().setTitle("Map");
                        break;
                    case 1:
                        fragment = new ReviewFragment();
                        getSupportActionBar().setTitle("Review");
                        break;
                    case 2:
                        fragment = new MerchantFragment();
                        getSupportActionBar().setTitle("Merchant");
                        break;
                    case 3:
                        fragment = new AboutusFragment();
                        getSupportActionBar().setTitle("About Us");
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.simpleFrameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
