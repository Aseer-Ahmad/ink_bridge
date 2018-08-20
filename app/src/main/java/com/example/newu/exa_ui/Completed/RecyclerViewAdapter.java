package com.example.newu.exa_ui.Completed;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newu.exa_ui.R;

import org.w3c.dom.Text;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<complete> mdata;

    public RecyclerViewAdapter(Context mcontext, List<complete> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        v=mInflater.inflate(R.layout.complete_gal,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.complete_title.setText(mdata.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mdata.get(position).getThumbnail());
        holder.complete_hash.setText(mdata.get(position).getHash());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView complete_title;
        TextView complete_hash;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            complete_hash=itemView.findViewById(R.id.complete_gal_hash);
            complete_title=itemView.findViewById(R.id.complete_gal_title);
            img_book_thumbnail=itemView.findViewById(R.id.complete_gal_id);
            cardView=itemView.findViewById(R.id.cardview_id_complete);
        }
    }


}
