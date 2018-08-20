package com.example.newu.exa_ui.Template;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newu.exa_ui.R;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<Templates> mdata;

    public RecyclerViewAdapter(Context mcontext, List<Templates> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        v=mInflater.inflate(R.layout.template_list,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.template_title.setText(mdata.get(position).getTitle());
        holder.template.setImageResource(mdata.get(position).getTemplate());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView template_title;
        ImageView template;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            template_title=itemView.findViewById(R.id.textView_template);
            template=itemView.findViewById(R.id.imageView_template);
            cardView=itemView.findViewById(R.id.cardview_id_template);
        }
    }


}
