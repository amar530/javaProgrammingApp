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

public class TwoDimensionalProgram extends AppCompatActivity {
    ListView twoDListView;
    String[] list={
            "Write a program to display matrix.",
            "Write a program to add two matrix.",
            "Write a program to transpose the matrix.",
            "Write a program to reverse the row elements.",
            "Write a program to reverse the column elements.",
            "Write a program to reverse the diagonal elements.",
            "Write a program to calculate the row and col by sum.",
            "Write a program to rotate matrix to 90 degree left.",
            "Write a program to rotate matrix to 90 degree right."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dimensional_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.twoDimensionalToolbar);
        toolbar.setTitle("Two Dimensional Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderTwoDList();


    }

    private void renderTwoDList() {
        twoDListView= (ListView) findViewById(R.id.twoDListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.twodimensional_list_item,R.id.twoDTextView,list);
        twoDListView.setAdapter(adapter);
        twoDListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                    fileToStringConversion("twodimensional/DisplayMatrix.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("twodimensional/Addition",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("twodimensional/TranposeTheMatrix.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("twodimensional/ReverseRow.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("twodimensional/ReverseCol.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("twodimensional/ReverseDiagonalELement.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("twodimensional/SumOfEleInRowAndCol.java",NumberSystemContainer.class);
                if(position==7)
                    fileToStringConversion("twodimensional/Rotate90DegLeft.java",NumberSystemContainer.class);
                if(position==8)
                    fileToStringConversion("twodimensional/Rotate90DegRight.java",NumberSystemContainer.class);
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
