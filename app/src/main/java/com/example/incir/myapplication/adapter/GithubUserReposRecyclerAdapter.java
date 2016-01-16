package com.example.incir.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.incir.myapplication.R;
import com.example.incir.myapplication.model.GithubPublicGistsStrong;
import com.example.incir.myapplication.model.GithubUserReposStrong;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;

import java.lang.StringBuilder;

public class GithubUserReposRecyclerAdapter  extends RecyclerView.Adapter<GithubUserReposRecyclerAdapter.MyViewHolderUserRepos>  { //<VH> ViewHolder. This is a hint

    LayoutInflater  layoutInflater;
    List<GithubUserReposStrong> githubUserReposStrongList;
    public GithubUserReposRecyclerAdapter(Context context,List<GithubUserReposStrong> githubUserReposStrongList) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.githubUserReposStrongList=githubUserReposStrongList;
    }

    @Override
    public MyViewHolderUserRepos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.githubuserreposcustomrow,parent,false);

        MyViewHolderUserRepos myViewHolderUserRepos=new MyViewHolderUserRepos(view);
        return myViewHolderUserRepos;
    }

    @Override
    public void onBindViewHolder(MyViewHolderUserRepos holder, int position) {
        GithubUserReposStrong githubUserReposStrongTek= githubUserReposStrongList.get(position);
        Map<String,String> ownerMap= githubUserReposStrongTek.getOwner();

        String login= String.valueOf(ownerMap.get("login"));
        String id= String.valueOf(ownerMap.get("id"));
        String avatar_url= String.valueOf(ownerMap.get("avatar_url"));

        holder.textViewUserReposCustomRow.setText("ReposId="+githubUserReposStrongTek.getId()+"\nReposName="+githubUserReposStrongTek.getName()+"\nLogin="+login+
       "\nUserId="+id+"\n");

        Context context= holder.imageViewUserReposCustomRow.getContext();
        Picasso.with(context)
                .load(avatar_url)
                .resize(150,150)
                .into(holder.imageViewUserReposCustomRow);

    }

    @Override
    public int getItemCount() {
        return githubUserReposStrongList.size();  //dikkat
    }

    public class MyViewHolderUserRepos extends RecyclerView.ViewHolder {
        TextView textViewUserReposCustomRow; //bunu buraya tasimaz isen yukarida yakalayamazsin.
        ImageView imageViewUserReposCustomRow;
        public MyViewHolderUserRepos(View itemView) {
            super(itemView);
            imageViewUserReposCustomRow=(ImageView)itemView.findViewById(R.id.imageViewUserReposCustomRow);
            textViewUserReposCustomRow= (TextView)itemView.findViewById(R.id.textViewUserReposCustomRow);
        }
    }
}
