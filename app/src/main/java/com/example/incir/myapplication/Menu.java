package com.example.incir.myapplication;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] activityName=getResources().getStringArray(R.array.activity_name);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,activityName);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        try {
            Class className= Class.forName("com.example.incir.myapplication."+l.getItemAtPosition(position));
            Intent intent=new Intent(this,className);
            startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
