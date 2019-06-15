package com.mrlonewolfer.example34;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubFragment extends Fragment {

    TextView tvMessage;
    public SubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_sub, container, false);
        // Inflate the layout for this fragment
        tvMessage=view.findViewById(R.id.tvMessage);
        return view;
    }
    public void setMessage(String msg) {
        tvMessage.setText(msg);
    }

}
