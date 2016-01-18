package com.example.incir.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.incir.myapplication.communication.P006Interface;
import com.example.incir.myapplication.fragment.P006FragmentBottom;

import android.app.FragmentManager;

public class P006TwoFragment extends Activity implements P006Interface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.p006twofragment);  //bize 2 fragment lazim
    }

    @Override
    public void getFragmentTopDataMtd(String fragmentTopData) {
        //burada fragmentTop dan bir event yakaladigizda olmasi gereken buradan fragmentBottom a gidecek

        P006FragmentBottom p006FragmentBottom=(P006FragmentBottom)getFragmentManager().findFragmentById(R.id.fragmentBottomP006);
        p006FragmentBottom.setFragmentTopDataToTextView(fragmentTopData);


    }
}
