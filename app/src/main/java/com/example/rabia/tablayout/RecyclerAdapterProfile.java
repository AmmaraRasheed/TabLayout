package com.example.rabia.tablayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapterProfile extends RecyclerView.Adapter<RecyclerAdapterProfile.ViewHolder> {
    private List<String> data;
    private Context context;
    private LayoutInflater layoutInflater;

    public RecyclerAdapterProfile(List<String> data, Context context) {
        this.context = context;
        this.data=data;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=layoutInflater.inflate(R.layout.recycler_layout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String name=data.get(i);
        viewHolder.textView.setText(name);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.name);

        }
    }
}
