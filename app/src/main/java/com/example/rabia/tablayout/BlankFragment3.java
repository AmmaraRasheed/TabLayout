package com.example.rabia.tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {


    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
        List<Integer> pic=new ArrayList<>();
        pic.add(R.drawable.colg9);
        pic.add(R.drawable.colg10);
        pic.add(R.drawable.colg12);
        pic.add(R.drawable.event5);
        RecyclerView recyclerView=view.findViewById(R.id.recycler2);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(pic,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);
        return  view;
    }

}
