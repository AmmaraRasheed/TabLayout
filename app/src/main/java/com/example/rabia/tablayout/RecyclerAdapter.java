package com.example.rabia.tablayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<String> data;
    private List<Integer> pic;
    private Context context;
    private LayoutInflater layoutInflater;

    public RecyclerAdapter( List<Integer> pic, Context context) {
        this.pic = pic;
        this.context = context;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=layoutInflater.inflate(R.layout.recycler_profile,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Integer pic1=pic.get(i);
        viewHolder.c.setImageResource(pic1);

    }

    @Override
    public int getItemCount() {
        return pic.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView c;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            c=itemView.findViewById(R.id.image1);

        }
    }
}
