package com.example.incir.myapplication.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.incir.myapplication.P007YoutubeToolbar;
import com.example.incir.myapplication.R;
import com.example.incir.myapplication.model.GithubUserStrong;

import java.util.List;

import com.example.incir.myapplication.transformation.P007Transform;
import com.squareup.picasso.Picasso;

public class P007RecyclerViewAdapter extends RecyclerView.Adapter<P007RecyclerViewAdapter.LeftViewHolder>{  //<VH>
    LayoutInflater latLayoutInflater;
    List<GithubUserStrong> GithubUserStrongList;
    Context context;
    public P007RecyclerViewAdapter(Context context,List<GithubUserStrong> GithubUserStrongList) {
        latLayoutInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.GithubUserStrongList=GithubUserStrongList;

        this.context=context;


    }

    @Override
    public LeftViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= latLayoutInflater.inflate(R.layout.p007fragmentleftcustomrow,parent,false);
        LeftViewHolder leftViewHolder=new LeftViewHolder(view);

        return leftViewHolder;  //packet is done
    }

    @Override
    public void onBindViewHolder(LeftViewHolder holder, int position) {

        GithubUserStrong GithubUserStrongTek= GithubUserStrongList.get(position);
        Context context= holder.imageViewCustomRowP007.getContext();
        Picasso.with(context)
                .load(GithubUserStrongTek.getAvatar_url())
                .resize(50,50)
                .transform(new P007Transform())
                .into(holder.imageViewCustomRowP007);
    }

    @Override
    public int getItemCount() {
        return GithubUserStrongList.size();  //sakincali
    }

    public class LeftViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        ImageView imageViewCustomRowP007;
        public LeftViewHolder(View itemView) {
            super(itemView);

            imageViewCustomRowP007=(ImageView)itemView.findViewById(R.id.imageViewCustomRowP007);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            GithubUserStrong GithubUserStrongTek2= GithubUserStrongList.get(getPosition());
            String loginName=GithubUserStrongTek2.getLogin();
            P007YoutubeToolbar p007YoutubeToolbar=(P007YoutubeToolbar)context;
            p007YoutubeToolbar.pushLoginToRightFragment(loginName);
        }
    }
}
