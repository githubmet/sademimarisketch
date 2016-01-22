package com.example.incir.myapplication.omurgaBackbone;

import android.support.v7.app.AppCompatActivity;

import com.example.incir.myapplication.network.GithubInterface;
import com.example.incir.myapplication.omurgaBackbone.AddObjectToApp;

import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity{

    public Retrofit getRetrofit(){

        Retrofit retrofit= ((AddObjectToApp)getApplication()).getRetrofit();  //eger yeni ise uzun yol tut:)

        return retrofit;
    }

    public GithubInterface getNetwork(){
        GithubInterface githubInterface= getRetrofit().create(GithubInterface.class);

        return githubInterface;
    }
}
