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

public class RecursionProgram extends AppCompatActivity {
    ListView recursionListView;
    String[] list={
            "Write a program to print 1 to 10 using recursion.",
            "Write a program to calculate the factorial of the number using the recursion.",
            "Write a program to calculate the sum of the natural number.",
            "Write a program to convert the decimal to binary.",
            "Write a program to convert the decimal to octal.",
            "Write a program to convert the decimal to hexadecimal.",
            "Write a program to print Fibonacci series."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursion_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.recursionToolbar);
        toolbar.setTitle("Recursion Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderRecursionList();


    }

    private void renderRecursionList() {
        recursionListView= (ListView) findViewById(R.id.recursionListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.resursion_list_item,R.id.recursionTextView,list);
        recursionListView.setAdapter(adapter);

        recursionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position==0)
                    fileToStringConversion("recursion0.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("recursion1.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("recursion2.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("recursion3.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("recursion4.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("recursion5.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("recursion6.java",NumberSystemContainer.class);
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
