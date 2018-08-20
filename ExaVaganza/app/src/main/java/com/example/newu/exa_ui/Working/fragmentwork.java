package com.example.newu.exa_ui.Working;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.newu.exa_ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 09/03/2018.
 */

public class fragmentwork extends Fragment{
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<TitleParent> listTitle;
    View v;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.workingmain,container,false);
        return v;
    }


    @Override
    public void onStart() {
        super.onStart();
        recyclerView=v.findViewById(R.id.recyclerviewwork);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        MyAdapter adapter=new MyAdapter(this.getContext(), initData());
        adapter.setParentClickableViewAnimationDefaultDuration();

        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);

    }

    private List<ParentObject> initData() {

        TitleCreator titleCreator=TitleCreator.get(this.getContext());
        List<TitleParent> t=titleCreator.getAll();
          List<ParentObject> parentObject=new ArrayList<>();

          for(TitleParent title:t){
              List<Object> child=new ArrayList<>();
              child.add(new WriteChild(" " ));
              title.setChildObjectList(child);
              parentObject.add(title);

          }
        return  parentObject;
    }


}
