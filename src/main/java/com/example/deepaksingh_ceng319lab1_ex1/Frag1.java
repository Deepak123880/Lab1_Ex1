package com.example.deepaksingh_ceng319lab1_ex1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Frag1 extends Fragment {



    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;


    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_frag1, container, false);
        lv = (ListView) v.findViewById(R.id.list1);
        al = new ArrayList<String>();
        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, al);
        lv.setAdapter(aa);
        al.add("AlActivity");
        al.add("VRActivity");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String s=al.get (position);
              MainActivity mnl= (MainActivity) getActivity();
              mnl.fl(s);
            }
        });
        return v;
        }

    }
