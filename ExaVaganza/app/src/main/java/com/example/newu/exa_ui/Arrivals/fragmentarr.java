package com.example.newu.exa_ui.Arrivals;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class fragmentarr extends Fragment {
    RecyclerView recyclerView;
    View v;
    List<Arrival> news;
    public fragmentarr() {
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.arrival,container,false);
        return v;
    }



    @Override
    public void onStart() {
        super.onStart();

        news=new ArrayList<>();

        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 1));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 12));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 20));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 89));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 1));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 12));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 56));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 87));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 65));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 89));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 56));
        news.add(new Arrival("Aseer", "monday" ,R.drawable.vegetariancover  , "#asdasda", 90));


        recyclerView=getView().findViewById(R.id.recyclerview_news);

        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this.getContext(), news);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),1));

        recyclerView.setAdapter(myAdapter);



    }



}
