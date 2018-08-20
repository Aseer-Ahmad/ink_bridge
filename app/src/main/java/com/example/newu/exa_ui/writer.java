package com.example.newu.exa_ui;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newu.exa_ui.Arrivals.fragmentarr;
import com.example.newu.exa_ui.Completed.fragmentcompleted;
import com.example.newu.exa_ui.Working.fragmentwork;

public class writer extends Fragment {
    View v;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.activity_writer,container,false);


        tabLayout=v.findViewById(R.id.tab_layoutW);
        viewPager=v.findViewById(R.id.viewpager_idW);
        adapter=new ViewPageAdapter(getFragmentManager());

        //add fragment

        adapter.addFragment(new fragmentarr(),"NEWS FEED");
        adapter.addFragment(new fragmentwork(),"WORKING");
        adapter.addFragment(new fragmentcompleted(),"CREATED");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return v;
    }
}
