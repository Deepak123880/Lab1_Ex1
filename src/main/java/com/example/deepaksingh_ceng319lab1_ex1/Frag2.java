package com.example.deepaksingh_ceng319lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag2 extends Fragment {

    TextView t;

    public Frag2() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_frag2, container, false);
        t = (TextView) v.findViewById(R.id.tex1);
        Bundle b = getArguments();
        if (b != null) {
            String s=b.getString("s");
            t.setText(s);
        }
        return v;
    }
}