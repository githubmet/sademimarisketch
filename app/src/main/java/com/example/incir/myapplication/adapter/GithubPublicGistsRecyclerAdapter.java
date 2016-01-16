package com.example.incir.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.incir.myapplication.R;
import com.example.incir.myapplication.model.GithubPublicGistsStrong;

import java.util.List;
import java.util.Map;

import java.lang.StringBuilder;

public class GithubPublicGistsRecyclerAdapter  extends RecyclerView.Adapter<GithubPublicGistsRecyclerAdapter.MyViewHolderGists>  { //<VH> ViewHolder. This is a hint

    LayoutInflater  layoutInflater;
    List<GithubPublicGistsStrong> githubPublicGistsStrongList;
    public GithubPublicGistsRecyclerAdapter(Context context,List<GithubPublicGistsStrong> githubPublicGistsStrongList) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.githubPublicGistsStrongList=githubPublicGistsStrongList;
    }

    @Override
    public MyViewHolderGists onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.githubpublicgistscustomrow,parent,false);

        MyViewHolderGists myViewHolderGists=new MyViewHolderGists(view);
        return myViewHolderGists;
    }

    @Override
    public void onBindViewHolder(MyViewHolderGists holder, int position) {
        GithubPublicGistsStrong githubPublicGistsStrongTek= githubPublicGistsStrongList.get(position);

        Map<String, GithubPublicGistsStrong.FilesStrong> filesStrongMap= githubPublicGistsStrongTek.getFiles();
        StringBuilder sb=new StringBuilder();
        for(GithubPublicGistsStrong.FilesStrong gex :  filesStrongMap.values()){
            sb.append("FileName="+gex.getFilename()+"\nFileType="+gex.getType()+"\nFileLanguage="+gex.getLanguage());
        }

        holder.textViewPublicGists.setText("GistsId="+githubPublicGistsStrongTek.getId()+"\n"+sb+"\n");
    }

    @Override
    public int getItemCount() {
        return githubPublicGistsStrongList.size();  //dikkat
    }

    public class MyViewHolderGists extends RecyclerView.ViewHolder {
        TextView textViewPublicGists;  //bunu buraya tasimaz isen yukarida yakalayamazsin.
        public MyViewHolderGists(View itemView) {
            super(itemView);
            textViewPublicGists= (TextView)itemView.findViewById(R.id.textViewPublicGists);
        }
    }
}
