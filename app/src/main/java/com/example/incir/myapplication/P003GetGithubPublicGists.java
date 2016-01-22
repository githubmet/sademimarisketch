package com.example.incir.myapplication;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubPublicGistsRecyclerAdapter;
import com.example.incir.myapplication.model.GithubPublicGistsStrong;
import com.example.incir.myapplication.omurgaBackbone.MainActivity;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class P003GetGithubPublicGists extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003getgithubpublicgists);

        final RecyclerView recyclerViewPublicGistsP003=(RecyclerView)findViewById(R.id.recyclerViewPublicGistsP003);

        recyclerViewPublicGistsP003.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        Call<List<GithubPublicGistsStrong>> githubPublicGistsStrongCall=getNetwork().getGithubPublicGists();

        githubPublicGistsStrongCall.enqueue(new Callback<List<GithubPublicGistsStrong>>() {
            @Override
            public void onResponse(Response<List<GithubPublicGistsStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubPublicGistsRecyclerAdapter(P003GetGithubPublicGists.this,response.body());
                recyclerViewPublicGistsP003.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });


    }
}
