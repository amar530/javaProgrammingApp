package com.somthing.amarguriya.programming;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;

public class DataStructureProgram extends AppCompatActivity {
    ListView dsListview;
    String[] dsItem={
            "Write a program for Linear Search",
            "Write a program for Binary Search",
            "Write a program for Bubble Sort",
            "Write a program for Reverse of linkedlist",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structure_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.dataStructureToolbar);
        toolbar.setTitle("Data Structure Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderDsListView();
    }

    private void renderDsListView() {

        dsListview= (ListView) findViewById(R.id.dsListview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.ds_list_item,R.id.dsTextView,dsItem);
        dsListview.setAdapter(adapter);
        dsListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                    fileToStringConversion("dsProgram/Linearsearch",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("dsProgram/Binarysearch",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("dsProgram/Bubblesort",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("dsProgram/reverserLinkedList",NumberSystemContainer.class);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.details)
            startActivity(new Intent(this,Details.class));
        if (item.getItemId()==R.id.profile)
            startActivity(new Intent(this,MainActivity.class));
        if (item.getItemId()==R.id.index)
            startActivity(new Intent(this,Learn.class));
        if (item.getItemId()==android.R.id.home)
            NavUtils.navigateUpFromSameTask(this);

        return super.onOptionsItemSelected(item);
    }

    private String fileToStringConversion(String filePath, Class<?> className ){
        String txt="";
        InputStream inputStream=null;
        Intent intent=new Intent(this,className);
        try {
            inputStream=getAssets().open(filePath);
            int size=inputStream.available();
            byte[] buffer=new byte[size];
            inputStream.read(buffer);
            txt=new String(buffer);
            intent.putExtra("data",txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            if(inputStream!=null)
            {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            startActivity(intent);
        }

        return null;
    }
}
