package com.example.newu.exa_ui.Working;


import android.os.Parcel;


import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

/**
 * Created by nEW u on 22/03/2018.
 */

public class TitleParent implements ParentObject {

        public List<Object> mChildrenList;
        public String title;

    public TitleParent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {
          return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList=list;
    }
}
