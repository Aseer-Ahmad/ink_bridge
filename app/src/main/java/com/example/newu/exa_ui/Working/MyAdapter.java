package com.example.newu.exa_ui.Working;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.newu.exa_ui.R;
import com.example.newu.exa_ui.Template.Template;

import java.util.List;

/**
 * Created by nEW u on 22/03/2018.
 */

public class MyAdapter extends ExpandableRecyclerAdapter<WorkParentViewHolder,WorkChildViewHolder> {

    LayoutInflater inflater;
    Context mcontext;

    public MyAdapter(Context context, List<ParentObject> parentItemList) {

        super(context, parentItemList);
        mcontext=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public WorkParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.workingparent,  viewGroup, false);
        return new WorkParentViewHolder(view);
    }

    @Override
    public WorkChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.workingchild, viewGroup, false);
        return new WorkChildViewHolder(view);

    }

    @Override
    public void onBindParentViewHolder(WorkParentViewHolder workParentViewHolder, int i, Object o) {
        TitleParent titleParent=(TitleParent)o;
        workParentViewHolder.title_text.setText(titleParent.getTitle());

    }

    @Override
    public void onBindChildViewHolder(final WorkChildViewHolder workChildViewHolder, int i, Object o) {

        WriteChild child=(WriteChild) o;
        workChildViewHolder.editText.setText(child.getwriteText());

        workChildViewHolder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(mcontext, Template.class);
                mcontext.startActivity(intent);
            }
        });



    }
}
