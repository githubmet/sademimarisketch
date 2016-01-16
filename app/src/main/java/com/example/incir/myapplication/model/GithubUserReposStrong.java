package com.example.incir.myapplication.model;


import java.util.Map;

public class GithubUserReposStrong {

    private String id;
    private String name;
    private Map<String,String> owner;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getOwner() {
        return owner;
    }

}
