package com.example.incir.myapplication.model;

public class P007UserDetailStrong  {

    private String id;
    private String url;
    private String name;
    private String location;
    private String email;
    private String followers;
    private String following;
    private String created_at;
    private String avatar_url;

    @Override
    public String toString() {
        return "\nid=" + id +
                "\nurl=" + url +
                "\nname=" + name +
                "\nlocation='" + location +
                "\nemail='" + email +
                "\nfollowers='" + followers +
                "\nfollowing='" + following +
                "\ncreated_at='" + created_at ;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getFollowers() {
        return followers;
    }

    public String getFollowing() {
        return following;
    }

    public String getCreated_at() {
        return created_at;
    }
}
