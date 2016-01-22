package com.example.incir.myapplication.omurgaBackbone;


import android.app.Application;

import retrofit.Retrofit;
import retrofit.GsonConverterFactory;

public class AddObjectToApp extends Application {  //dikkat app bir obje ekleyecegiz  //manifest dosyasina eklemeyi unutma hemde ilginc bir sekilde

    Retrofit retrofit;
    @Override
    public void onCreate() {
        super.onCreate();

        String baseUrl="https://api.github.com";
        retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();  //retrofit Builder hazir
    }
    public Retrofit getRetrofit(){
        return retrofit;
    }
}













