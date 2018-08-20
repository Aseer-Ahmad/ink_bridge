package com.example.newu.exa_ui.Pending;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newu.exa_ui.Completed.*;
import com.example.newu.exa_ui.ListItem;
import com.example.newu.exa_ui.MyAdapter;
import com.example.newu.exa_ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 08/03/2018.
 */

public class fragmentpending extends Fragment {

    RecyclerView recyclerView;
    View v;
    List<PendingDetails> list;
    public fragmentpending() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.pending,container,false);
        // inflator sets the UI of fragment to new_space

        return v;

    }

     @Override
    public void onStart() {
        super.onStart();

        list=new ArrayList<>();

        list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));
         list.add(new PendingDetails("Niyati Bday","25 Monday", "Niyati" , "curly, deep eyes"));


         recyclerView=getView().findViewById(R.id.recyclerview_pending);

         RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this.getContext(), list);
         recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),1));

         recyclerView.setAdapter(myAdapter);


    }

}



