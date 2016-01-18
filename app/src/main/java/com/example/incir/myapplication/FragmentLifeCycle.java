package com.example.incir.myapplication;

import android.app.Activity;
import android.os.Bundle;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.incir.myapplication.fragment.MyFragment;

public class FragmentLifeCycle extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentlifecycle);

        //add fragment to an activity programatically    dikkat xml dosyasinda surukle birak ile yapmaman gerekir:)
        MyFragment myFragment=new MyFragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.relativeLayoutFragmentLifeCycle,myFragment,"FirstFragmentKey"); //Last parameter is all about catch the fragment by its own key.
        fragmentTransaction.commit();
    }
}
