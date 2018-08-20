package com.example.newu.exa_ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 12/04/2018.
 */

public class Setting extends Fragment {
    ListView l;
    List<String> set;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.setting, container, false);
        return v;


    }


    @Override
    public void onStart() {
        super.onStart();
        l=v.findViewById(R.id.listsetting);
        set=new ArrayList<>();

        set.add("Account");
        set.add("Views");
        set.add("Notifications");
        set.add("Data and storage usage");
        set.add("Invite a friend");
        set.add("Help");
        set.add("Log Out");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_list_item_1, set);

        l.setAdapter(adapter);




    }
}
