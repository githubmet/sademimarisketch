package com.example.incir.myapplication;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubPublicGistsRecyclerAdapter;
import com.example.incir.myapplication.model.GithubPublicGistsStrong;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class GetGithubPublicGists extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getgithubpublicgists);

        final RecyclerView recyclerViewPublicGists=(RecyclerView)findViewById(R.id.recyclerViewPublicGists);

        recyclerViewPublicGists.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        Call<List<GithubPublicGistsStrong>> githubPublicGistsStrongCall=getNetworkMy().getGithubPublicGists();

        githubPublicGistsStrongCall.enqueue(new Callback<List<GithubPublicGistsStrong>>() {
            @Override
            public void onResponse(Response<List<GithubPublicGistsStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubPublicGistsRecyclerAdapter(GetGithubPublicGists.this,response.body());
                recyclerViewPublicGists.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });


    }
}
