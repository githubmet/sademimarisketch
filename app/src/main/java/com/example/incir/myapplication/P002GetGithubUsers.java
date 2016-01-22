package com.example.incir.myapplication;

import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.example.incir.myapplication.adapter.GithubUsersRecyclerAdapter;
import com.example.incir.myapplication.model.GithubUserStrong;
import com.example.incir.myapplication.omurgaBackbone.MainActivity;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class P002GetGithubUsers extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002getgithubusers);

        final RecyclerView recyclerViewGithubUsersP002=(RecyclerView)findViewById(R.id.recyclerViewGithubUsersP002);
        recyclerViewGithubUsersP002.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

         Call<List<GithubUserStrong>> githubUserStrongCall= getNetwork().getGithubAllUsers();  //amazing
        githubUserStrongCall.enqueue(new Callback<List<GithubUserStrong>>() {
            @Override
            public void onResponse(Response<List<GithubUserStrong>> response, Retrofit retrofit) {
                RecyclerView.Adapter adapter=new GithubUsersRecyclerAdapter(P002GetGithubUsers.this,response.body());
                recyclerViewGithubUsersP002.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}
