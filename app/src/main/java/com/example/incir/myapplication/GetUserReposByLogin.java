package com.example.incir.myapplication;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubUserReposRecyclerAdapter;
import com.example.incir.myapplication.model.GithubUserReposStrong;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class GetUserReposByLogin extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getuserreposblogin);

        final RecyclerView recyclerViewUserRepos=(RecyclerView)findViewById(R.id.recyclerViewUserRepos);
        recyclerViewUserRepos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        String userName="githubmet";

        Call<List<GithubUserReposStrong>> githubUserReposStrongCall= getNetworkMy().getUserReposByLogin(userName);
        githubUserReposStrongCall.enqueue(new Callback<List<GithubUserReposStrong>>() {
            @Override
            public void onResponse(Response<List<GithubUserReposStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubUserReposRecyclerAdapter(GetUserReposByLogin.this,response.body());
                recyclerViewUserRepos.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}
