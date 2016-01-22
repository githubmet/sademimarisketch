package com.example.incir.myapplication;

import android.app.Activity;
import android.os.Bundle;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.incir.myapplication.fragment.P005MyFragment;

public class P005FragmentLifeCycle extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005fragmentlifecycle);

        //add p005fragment to an activity programatically    dikkat xml dosyasinda surukle birak ile yapmaman gerekir:)
        P005MyFragment p005MyFragment=new P005MyFragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.relativeLayoutFragmentLifeCycleP005,p005MyFragment,"MyFirstFragmentKey"); //Last parameter is all about catch the p005fragment by its own key.
        fragmentTransaction.commit();
    }
}
