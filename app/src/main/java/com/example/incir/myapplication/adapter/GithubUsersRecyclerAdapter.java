package com.example.incir.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.incir.myapplication.R;
import com.example.incir.myapplication.model.GithubUserStrong;

import java.util.List;

import com.squareup.picasso.Picasso;

public class GithubUsersRecyclerAdapter extends RecyclerView.Adapter<GithubUsersRecyclerAdapter.MyViewHolder> {  //<VH>  istiyor dikkat

    LayoutInflater layoutInflater;
    List<GithubUserStrong> githubUserStrongList;
    public GithubUsersRecyclerAdapter(Context context,List<GithubUserStrong> githubUserStrongList) {
         layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //bir sonraki adim icin burada arac yoktur
        this.githubUserStrongList=githubUserStrongList;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         View view=layoutInflater.inflate(R.layout.githubusercustomrow,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        GithubUserStrong githubUserStrongTek= githubUserStrongList.get(position);
        holder.textViewGithubCustomRow.setText("Id=" + githubUserStrongTek.getId() + "\nLogin=" + githubUserStrongTek.getLogin() + "\nUrl=" + githubUserStrongTek.getUrl());
        Context context= holder.imageViewGithubUsersCustomRow.getContext();
        Picasso.with(context)
                .load(githubUserStrongTek.getAvatar_url())
                .resize(150,150)
                .into(holder.imageViewGithubUsersCustomRow);

    }

    @Override
    public int getItemCount() {
        return githubUserStrongList.size();  //bu bas agrisi
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{  //asagidaki kurucu method bizden view isteyecek This is a hint :)

        ImageView imageViewGithubUsersCustomRow;
        TextView textViewGithubCustomRow;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageViewGithubUsersCustomRow= (ImageView)itemView.findViewById(R.id.imageViewGithubUsersCustomRow);
            textViewGithubCustomRow= (TextView) itemView.findViewById(R.id.textViewGithubCustomRow);

        }
    }

  }
