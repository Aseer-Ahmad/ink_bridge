package com.example.newu.exa_ui.Completed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.newu.exa_ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 09/03/2018.
 */

public class fragmentcompleted extends Fragment {
    View v;

    List<complete> listcomplete;
    RecyclerView myrv;
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
//   private ViewPageAdapter adapter;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.complete, container, false);

    /*    tabLayout = v.findViewById(R.id.tab_layoutC);
        viewPager = v.findViewById(R.id.viewpager_idC);
        adapter = new ViewPageAdapter(getFragmentManager());


        adapter.addFragment(new fragmentAllPosts(), "");
        adapter.addFragment(new fragmentPosts(), "");


        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home);
        tabLayout.getTabAt(1).setIcon(R.drawable.setting);
        */

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

       listcomplete = new ArrayList<>();
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.vegetariancover));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.asdasd));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.dfvdfv));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.ertrg));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.images));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.pen));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.readymade));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.sdfasd));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.va));
        listcomplete.add(new complete( "CHAL NIKALL", "#asda", R.drawable.we));

        myrv=getView().findViewById(R.id.recycler_id_complete);

        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this.getContext(), listcomplete);
        myrv.setLayoutManager(new GridLayoutManager(this.getContext(),1));

        myrv.setAdapter(myAdapter);



    }
}
