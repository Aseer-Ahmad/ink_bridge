package com.example.newu.exa_ui.Template;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.newu.exa_ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 16/04/2018.
 */

public class Template extends AppCompatActivity {

    List<Templates> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template);

        list=new ArrayList<>();

        list.add(new Templates(R.drawable.template1, "Template 1"));
        list.add(new Templates(R.drawable.template2, "Template 2"));
        list.add(new Templates(R.drawable.template3, "Template 3"));
        list.add(new Templates(R.drawable.template1, "Template 1"));
        list.add(new Templates(R.drawable.template2, "Template 2"));
        list.add(new Templates(R.drawable.template3, "Template 3"));
        list.add(new Templates(R.drawable.template1, "Template 1"));
        list.add(new Templates(R.drawable.template2, "Template 2"));
        list.add(new Templates(R.drawable.template3, "Template 3"));
        list.add(new Templates(R.drawable.template1, "Template 1"));
        list.add(new Templates(R.drawable.template2, "Template 2"));
        list.add(new Templates(R.drawable.template3, "Template 3"));



        recyclerView=findViewById(R.id.recyclerview_template);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
