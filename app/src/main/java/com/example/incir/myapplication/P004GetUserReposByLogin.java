package com.example.incir.myapplication;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubUserReposRecyclerAdapter;
import com.example.incir.myapplication.model.GithubUserReposStrong;
import com.example.incir.myapplication.omurgaBackbone.MainActivity;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class P004GetUserReposByLogin extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p004getuserreposblogin);

        final RecyclerView recyclerViewUserReposP004=(RecyclerView)findViewById(R.id.recyclerViewUserReposP004);
        recyclerViewUserReposP004.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        String userName="githubmet";

        Call<List<GithubUserReposStrong>> githubUserReposStrongCall= getNetwork().getUserReposByLogin(userName);
        githubUserReposStrongCall.enqueue(new Callback<List<GithubUserReposStrong>>() {
            @Override
            public void onResponse(Response<List<GithubUserReposStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubUserReposRecyclerAdapter(P004GetUserReposByLogin.this,response.body());
                recyclerViewUserReposP004.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}
