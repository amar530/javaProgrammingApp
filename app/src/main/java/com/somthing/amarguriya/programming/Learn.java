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

public class Learn extends AppCompatActivity {
    private static ListView listView;
    private static String[] indexList=new String[]{"Basic Program","Number Program","Pattern Program","One Dimensional Program","Two Dimensional Program","String Program","Recursion Program","Data Structure Program","OCJP Explanation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        Toolbar toolbar= (Toolbar) findViewById(R.id.learnToolbar);
        toolbar.setTitle("Java Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        showListView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.details)
            startActivity(new Intent(this,Details.class));
        if (item.getItemId()==R.id.mainActivity)
            startActivity(new Intent(this,MainActivity.class));
        if (item.getItemId()==android.R.id.home)
            NavUtils.navigateUpFromSameTask(this);
        return super.onOptionsItemSelected(item);
    }

    private void showListView() {

        listView= (ListView) findViewById(R.id.LearnListView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.learn_list_item,R.id.learnTextView,indexList);
            listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                    startActivity(new Intent(view.getContext(),BasicProgram.class));
                if(position==1)
                    startActivity(new Intent(view.getContext(),NumberProgram.class));
                if(position==2)
                    startActivity(new Intent(view.getContext(),PatternProgram.class));
                if(position==3)
                    startActivity(new Intent(view.getContext(),OneDimensionalProgram.class));
                if(position==4)
                    startActivity(new Intent(view.getContext(),TwoDimensionalProgram.class));
                if(position==5)
                    startActivity(new Intent(view.getContext(),StringProgram.class));
                if(position==6)
                    startActivity(new Intent(view.getContext(),RecursionProgram.class));
                if(position==7)
                    startActivity(new Intent(view.getContext(),DataStructureProgram.class));
                if(position==8)
                    startActivity(new Intent(view.getContext(),OcjpExplanation.class));

            }
        });

    }
}
