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

public class BasicProgram extends AppCompatActivity {
    ListView basicListView;
    String[] list={"Addition of two Number.",
            "Subtraction of two Number.",
            "Multiplication of two Number.",
            "Area of Circle.",
            "Simple Interest.",
            "write a java program to check year is leap year or not.",
            "Write a program to calculate number of days between date"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.basicToolbar);
        toolbar.setTitle("Basic Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderBasicList();

    }

    private void renderBasicList() {
        basicListView= (ListView) findViewById(R.id.basicListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.basic_list_item,R.id.basicTextView,list);
        basicListView.setAdapter(adapter);

        basicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                    fileToStringConversion("Add.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("Subtraction.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("Multiplication.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("AreaOfCircle.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("SimpleInterest.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("LeapYear.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("date_to_date",NumberSystemContainer.class);
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
