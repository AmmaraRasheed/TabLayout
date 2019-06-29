package com.example.rabia.tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerProfile);
        ArrayList<String>  name=new ArrayList<>();
        name.add("Ammara Rasheed");
        name.add("Sara Khan");
        name.add("Maham Saleem");
        name.add("Ayesha Bibi");
        RecyclerAdapterProfile recyclerAdapterProfile=new RecyclerAdapterProfile(name,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapterProfile);
        return view;
    }

}
