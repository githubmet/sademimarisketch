package com.example.incir.myapplication.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.util.Log;

import com.example.incir.myapplication.R;

public class MyFragment extends Fragment {

    @Override
    public void onAttach(Context context) { //Called when a fragment is first attached to its context.
        super.onAttach(context);
        Log.i("fragment","onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {  // burada Activity elemanlari yakalanamaz. Fakat diger fragmentlardan veri yakalamak icin bir firsat
        super.onCreate(savedInstanceState);
        Log.i("fragment","onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  //Fragment xml ve java birbiri ile iliskilendirilir.
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {   //burada Activity elemanlari artik yakalanabilir
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment","onActivityCreated");
    }

    @Override
    public void onStart() {  //ve artik normal Activity lifecycle
        super.onStart();
        Log.i("fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment","onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {  //currently selected item in the listView on fragment. you want push this data to Activity
        super.onSaveInstanceState(outState);
        Log.i("fragment","onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment","onDetach");
    }
}






