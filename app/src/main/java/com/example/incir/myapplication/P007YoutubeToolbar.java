package com.example.incir.myapplication;

import android.os.Bundle;

import com.example.incir.myapplication.fragmentInterface.P007Interface;
import com.example.incir.myapplication.omurgaBackbone.MainActivity;
import com.example.incir.myapplication.fragment.P007FragmentRight;

import android.app.FragmentManager;

public class P007YoutubeToolbar extends MainActivity implements P007Interface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007youtubetoolbar);
    }

    @Override
    public void pushLoginToRightFragment(String LoginName) {
        FragmentManager fragmentManager=getFragmentManager();
        P007FragmentRight p007FragmentRight=(P007FragmentRight)fragmentManager.findFragmentById(R.id.fragmentRightP007);

        p007FragmentRight.ShowDetailsOfUser(LoginName);
    }
}

