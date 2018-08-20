package com.example.newu.exa_ui.Working;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.newu.exa_ui.R;

/**
 * Created by nEW u on 22/03/2018.
 */

public class WorkParentViewHolder extends ParentViewHolder {

    public TextView title_text;


    public WorkParentViewHolder(View itemView) {
        super(itemView);
        title_text=itemView.findViewById(R.id.parentworking);
    }

}
