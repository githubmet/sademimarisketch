package com.example.incir.myapplication.fragment;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.incir.myapplication.P007YoutubeToolbar;
import com.example.incir.myapplication.R;
import com.example.incir.myapplication.model.P007UserDetailStrong;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

import com.squareup.picasso.Picasso;

public class P007FragmentRight extends Fragment {
    P007YoutubeToolbar p007YoutubeToolbar;
    ImageView imageViewFragmentRightP007;
    TextView textViewFragmentRightP007;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.p007fragmentright,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        imageViewFragmentRightP007= (ImageView)getActivity().findViewById(R.id.imageViewFragmentRightP007);   //getActivity() artik bizim fragment ve  Activity nin birlesim kumesidir.
        textViewFragmentRightP007= (TextView)getActivity().findViewById(R.id.textViewFragmentRightP007);

        p007YoutubeToolbar=(P007YoutubeToolbar)getActivity();
    }


    public void ShowDetailsOfUser(String loginName){

        Call<P007UserDetailStrong> p007UserDetailStrongCall= p007YoutubeToolbar.getNetwork().getUserDetailsP007(loginName);
        p007UserDetailStrongCall.enqueue(new Callback<P007UserDetailStrong>() {
            @Override
            public void onResponse(Response<P007UserDetailStrong> response, Retrofit retrofit) {
                Context context= imageViewFragmentRightP007.getContext();
                Picasso.with(context)
                        .load(response.body().getAvatar_url())
                        .resize(200,200)
                        .into(imageViewFragmentRightP007);
                textViewFragmentRightP007.setText(response.body().toString());
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }


}
