package com.example.newu.exa_ui.Working;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 14/04/2018.
 */

public class TitleCreator {

    static TitleCreator titleCreator;
    List<TitleParent> titleParents;

    public TitleCreator(Context context){

        titleParents=new ArrayList<>();
        for(int i=0;i<4;i++)
            titleParents.add(new TitleParent("TITLE"+ i));

    }

    public static TitleCreator get(Context context){

        if(titleCreator==null)
            titleCreator=new TitleCreator(context);
        return titleCreator;

    }

    public List<TitleParent> getAll() {
        return titleParents;
    }
}