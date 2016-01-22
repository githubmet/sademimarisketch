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

public class P005MyFragment extends Fragment {

    @Override
    public void onAttach(Context context) { //Called when a p005fragment is first attached to its context.
        super.onAttach(context);
        Log.i("p005fragment","onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {  // burada Activity elemanlari yakalanamaz. Fakat diger fragmentlardan veri yakalamak icin bir firsat
        super.onCreate(savedInstanceState);
        Log.i("p005fragment","onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  //Fragment xml ve java birbiri ile iliskilendirilir.
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.p005fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {   //burada Activity elemanlari artik yakalanabilir
        super.onActivityCreated(savedInstanceState);
        Log.i("p005fragment","onActivityCreated");
    }

    @Override
    public void onStart() {  //ve artik normal Activity lifecycle
        super.onStart();
        Log.i("p005fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("p005fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("p005fragment","onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {  //currently selected item in the listView on p005fragment. you want push this data to Activity
        super.onSaveInstanceState(outState);
        Log.i("p005fragment","onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("p005fragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("p005fragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("p005fragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("p005fragment","onDetach");
    }
}






