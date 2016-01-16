package com.example.incir.myapplication;

import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubUsersRecyclerAdapter;
import com.example.incir.myapplication.model.GithubUserStrong;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class GetGithubUsers extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getgithubusers);

        final RecyclerView recyclerViewGithubUsers=(RecyclerView)findViewById(R.id.recyclerViewGithubUsers);
        recyclerViewGithubUsers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

         Call<List<GithubUserStrong>> githubUserStrongCall= getNetworkMy().getGithubAllUsers();
        githubUserStrongCall.enqueue(new Callback<List<GithubUserStrong>>() {
            @Override
            public void onResponse(Response<List<GithubUserStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubUsersRecyclerAdapter(GetGithubUsers.this,response.body());
                recyclerViewGithubUsers.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}
