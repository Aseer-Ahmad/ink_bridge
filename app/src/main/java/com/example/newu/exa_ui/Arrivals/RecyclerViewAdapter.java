package com.example.newu.exa_ui.Arrivals;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newu.exa_ui.Arrivals.Arrival;
import com.example.newu.exa_ui.R;

import org.w3c.dom.Text;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<Arrival> mdata;

    public RecyclerViewAdapter(Context mcontext, List<Arrival> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        v=mInflater.inflate(R.layout.arrival_news,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.news_name.setText(mdata.get(position).getName());
        holder.news_thumbnail.setImageResource(mdata.get(position).getThumbnail());
        holder.news_date_time.setText(mdata.get(position).getDate_time());
        holder.news_hash.setText(mdata.get(position).getHash());
   //   holder.likes.setText(mdata.get(position).getLikes());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView news_name;
        TextView news_date_time;
        ImageView news_thumbnail;
        TextView news_hash;
        TextView likes;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            cardView=itemView.findViewById(R.id.cardview_id_arr);
            news_name=itemView.findViewById(R.id.textview_news);
            news_date_time=itemView.findViewById(R.id.textview_news_date);
            news_thumbnail=itemView.findViewById(R.id.imageview_news);
            news_hash=itemView.findViewById(R.id.textview_news_hash);
            likes=itemView.findViewById(R.id.textview_news_likes);
        }
    }


}
