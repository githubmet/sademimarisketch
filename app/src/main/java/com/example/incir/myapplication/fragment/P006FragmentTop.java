package com.example.incir.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.incir.myapplication.R;
import com.example.incir.myapplication.communication.P006Interface;

public class P006FragmentTop extends Fragment implements View.OnClickListener {

    //biz suan xml ve java dosyalarini tanistirmaliyiz
    P006Interface p006Interface;
    EditText editTextFragmentTopP006;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  //xml dosyasini convert eden java object
        View view=inflater.inflate(R.layout.p006fragmenttop,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        editTextFragmentTopP006=(EditText)getActivity().findViewById(R.id.editTextFragmentTopP006);
        Button buttonFragmentTopP006=(Button)getActivity().findViewById(R.id.buttonFragmentTopP006);  //Reutrn the Activity thi fragment is currently associated with;
        buttonFragmentTopP006.setOnClickListener(this);

        p006Interface= (P006Interface)getActivity();

    }

    @Override
    public void onClick(View v) {
        p006Interface.getFragmentTopDataMtd(editTextFragmentTopP006.getText().toString());
    }
}
