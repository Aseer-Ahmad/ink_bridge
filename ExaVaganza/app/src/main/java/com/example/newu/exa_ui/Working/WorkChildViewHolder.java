package com.example.newu.exa_ui.Working;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.newu.exa_ui.R;

/**
 * Created by nEW u on 22/03/2018.
 */

public class WorkChildViewHolder extends ChildViewHolder {

    public EditText editText;
    public Button btn;
    public ScrollView s;

    public WorkChildViewHolder(View itemView) {
        super(itemView);
        btn=itemView.findViewById(R.id.button_add_template);
        editText=itemView.findViewById(R.id.edit_work);
        s=itemView.findViewById(R.id.ScrollView01);
    }


}
