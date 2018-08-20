package com.example.newu.exa_ui.Pending;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newu.exa_ui.Pending.PendingDetails;
import com.example.newu.exa_ui.R;

import org.w3c.dom.Text;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<PendingDetails> mdata;

    public RecyclerViewAdapter(Context mcontext, List<PendingDetails> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        v=mInflater.inflate(R.layout.pending_list,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.consignment.setText(mdata.get(position).getConsignment());
        holder.date.setText(mdata.get(position).getDate());
        holder.dedicated.setText(mdata.get(position).getDedicated());
        holder.key.setText(mdata.get(position).getKeywords());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView consignment;
        TextView date;
        TextView dedicated;
        TextView key;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            key=itemView.findViewById(R.id.textView_key);
            consignment=itemView.findViewById(R.id.textView_con);
            date=itemView.findViewById(R.id.textView_date);
            dedicated=itemView.findViewById(R.id.textView_ded);
            cardView=itemView.findViewById(R.id.cardview_id_pending);
        }
    }


}
