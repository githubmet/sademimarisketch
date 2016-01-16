package com.example.incir.myapplication;

import android.app.Application;
import android.content.Context;

import retrofit.Retrofit;
import retrofit.GsonConverterFactory;

public class AddObjectToApp extends Application {  //dikkat app bir obje ekleyecegiz
   /* private static Context mContext;
    Retrofit retrofit;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext=this;  //special

        String baseUrl="https://api.github.com";
        retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();  //retrofit Builder hazir
    }
    public Retrofit getRetrofit(){
        return retrofit;
    }
    public static Context getContext(){
        return mContext;
    }*/
}













/*import android.app.Application;

import retrofit.Retrofit;
import retrofit.GsonConverterFactory;

public class AddObjectToApp extends Application {  //dikkat app bir obje ekleyecegiz

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
}*/
