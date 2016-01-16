package com.example.incir.myapplication.network;

import com.example.incir.myapplication.model.GithubPublicGistsStrong;
import com.example.incir.myapplication.model.GithubUserReposStrong;
import com.example.incir.myapplication.model.GithubUserStrong;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

public interface GithubInterface {
    @GET("/users")
    Call<List<GithubUserStrong>> getGithubAllUsers();

    @GET("/gists/public")
    Call<List<GithubPublicGistsStrong>> getGithubPublicGists();

    @GET("/users/{user}/repos")
    Call<List<GithubUserReposStrong>> getUserReposByLogin(@Path("user") String userName);
}
