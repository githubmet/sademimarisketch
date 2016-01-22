package com.example.incir.myapplication.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.incir.myapplication.P007YoutubeToolbar;
import com.example.incir.myapplication.R;
import com.example.incir.myapplication.adapter.P007RecyclerViewAdapter;
import com.example.incir.myapplication.model.GithubUserStrong;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

import java.util.List;

public class P007FragmentLeft extends Fragment {
    RecyclerView recyclerViewFragmentLeftP007;
    P007YoutubeToolbar p007YoutubeToolbar;   //dikkat sorun olabilir!
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.p007fragmentleft,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerViewFragmentLeftP007=(RecyclerView)getActivity().findViewById(R.id.recyclerViewFragmentLeftP007);

        p007YoutubeToolbar=(P007YoutubeToolbar)getActivity();

        getGithubUserToRecyclerView();

    }

    public void getGithubUserToRecyclerView(){
        final Context context =recyclerViewFragmentLeftP007.getContext();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);
        recyclerViewFragmentLeftP007.setLayoutManager(linearLayoutManager);

        Call<List<GithubUserStrong>> GithubUserStrongCall= p007YoutubeToolbar.getNetwork().getGithubAllUsers();
        GithubUserStrongCall.enqueue(new Callback<List<GithubUserStrong>>() {
            @Override
            public void onResponse(Response<List<GithubUserStrong>> response, Retrofit retrofit) {

                RecyclerView.Adapter adapter=new P007RecyclerViewAdapter(context,response.body() );
                recyclerViewFragmentLeftP007.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}






















































