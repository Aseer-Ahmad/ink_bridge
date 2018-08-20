package com.example.newu.exa_ui;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newu.exa_ui.Gallery.fragmentgallery;
import com.example.newu.exa_ui.New.fragmentnew;
import com.example.newu.exa_ui.Pending.fragmentpending;


public class client extends Fragment {
    View v;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.activity_client,container,false);
        tabLayout=v.findViewById(R.id.tab_layoutC);
        viewPager=v.findViewById(R.id.viewpager_idC);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter=new ViewPageAdapter(getFragmentManager());   //getSupportFragmentManager()

        adapter.addFragment(new fragmentnew(),"NEW");
        adapter.addFragment(new fragmentgallery(),"MY GALLERY");
        adapter.addFragment(new fragmentpending(),"PENDING");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    /*   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        tabLayout=findViewById(R.id.tab_layoutC);
        viewPager=findViewById(R.id.viewpager_idC);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment

        adapter.addFragment(new fragmentnew(),"NEW");
        adapter.addFragment(new fragmentgallery(),"MY GALLERY");
        adapter.addFragment(new fragmentpending(),"PENDING");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
    */
}
