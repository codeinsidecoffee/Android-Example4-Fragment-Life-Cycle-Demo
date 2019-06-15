package com.mrlonewolfer.example34;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

String TAG="LifeCycle";
Context context;
    EditText etMessage;
    Button btnSend;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        context=getActivity();
        // Inflate the layout for this fragment
        Log.i(TAG, "onCreateView: ");
        Toast.makeText(context, "onCreateView", Toast.LENGTH_SHORT).show();
        etMessage=view.findViewById(R.id.etMessage);
        btnSend=view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
        return view;
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onStop: ");
        Toast.makeText(context, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause: ");
        Toast.makeText(context, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume: ");
        Toast.makeText(context, "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        Toast.makeText(context, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "onDestroyView: ");
        Toast.makeText(context, "onDestroyView", Toast.LENGTH_SHORT).show();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, "onDetach: ");
        Toast.makeText(context, "onDetach", Toast.LENGTH_SHORT).show();
        super.onDetach();
    }

    @Override
    public void onAttach(Context context) {
        Log.i(TAG, "onAttach: ");
        Toast.makeText(context, "onAttach", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onActivityCreated: ");
        Toast.makeText(context, "onActivityCreated", Toast.LENGTH_SHORT).show();
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        String msg=etMessage.getText().toString();
        Toast.makeText(context, msg,Toast.LENGTH_SHORT).show();
        FragmentManager manager=getFragmentManager();
        SubFragment fragment= (SubFragment) manager.findFragmentById(R.id.subFragment);
        fragment.setMessage(msg);
    }
}
