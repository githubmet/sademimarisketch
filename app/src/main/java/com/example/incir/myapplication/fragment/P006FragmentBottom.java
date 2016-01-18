package com.example.incir.myapplication.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.incir.myapplication.R;

public class P006FragmentBottom extends Fragment{

    TextView textViewFragmentBottomP006;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.p006fragmentbottom,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textViewFragmentBottomP006=(TextView)getActivity().findViewById(R.id.textViewFragmentBottomP006);
    }
    public void setFragmentTopDataToTextView(String DataComeFromTop){
        textViewFragmentBottomP006.setText(DataComeFromTop);

    }
}
