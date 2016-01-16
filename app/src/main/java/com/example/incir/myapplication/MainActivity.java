package com.example.incir.myapplication;


import android.support.v7.app.AppCompatActivity;
import com.example.incir.myapplication.network.GithubInterface;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    public Retrofit getRetrofit(){
        String baseUrl="https://api.github.com";
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();  //retrofit Builder hazir

        return retrofit;
    }

    public GithubInterface getNetworkMy(){
        return getRetrofit().create(GithubInterface.class);
    }
}
