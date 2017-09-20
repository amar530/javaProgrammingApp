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

public class StringProgram extends AppCompatActivity {
    ListView stringListView;
    String[] list={
            "Write a program to reverse the the sentence.",
            "Write a program to reverse the words of the sentence.",
            "Write a program to calculate how many character digits present in the sentence.",
            "Write a program to calculate how many character digits present in the each words of the sentence.",
            "Write a program to strings are anagram or not.",
            "Write a program to check strings are panagram or not.",
            "Write a program to check string is Palindrome or not.",
            "Write a program to display the enter number in the form of sentence.",
            "Write a program to calculate how many character in each word in the sentence",
            "Write a program to display enter the string in the form of init cap.",
            "Write a program to swap the first and last words.",
            "Write a program to concatenate of the two string.",
            "Write a program to Display different type of the character in the string.",
            "Write a program to Display upper to lower character and vice-versa in the string.",
            "Write a program to find sum of the number in the Alphanumeric string.",
            "Write a program to find Occurrence of character in the string.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.stringToolbar);
        toolbar.setTitle("String Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderStringList();


    }

    private void renderStringList() {
        stringListView= (ListView) findViewById(R.id.stringListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.string_list_item,R.id.stringTextView,list);
        stringListView.setAdapter(adapter);
        stringListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                    fileToStringConversion("string/ReverseOfString.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("string/ReverseTheSentence.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("string/CountCharacter.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("string/NumberOfCharacterInEachWord.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("string/AnagramClass.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("string/PanaGram.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("string/Pallindrom.java.java",NumberSystemContainer.class);
                if(position==7)
                    fileToStringConversion("string/NumberIntoWords.java",NumberSystemContainer.class);
                if(position==8)
                    fileToStringConversion("string/NumberOfCharacterInEachWord.java",NumberSystemContainer.class);
                if(position==9)
                    fileToStringConversion("string/StringInitCap.java",NumberSystemContainer.class);
                if(position==10)
                    fileToStringConversion("string/SwapFirstAndLast.java",NumberSystemContainer.class);
                if(position==11)
                    fileToStringConversion("string/ConcanatingString.java",NumberSystemContainer.class);
                if(position==12)
                    fileToStringConversion("string/DiffTypeCharsSymbols.java",NumberSystemContainer.class);
                if(position==13)
                    fileToStringConversion("string/UpperToLowerAndViceVersa.java",NumberSystemContainer.class);
                if(position==14)
                    fileToStringConversion("string/SumOfNumberInAlphaNumericString.java",NumberSystemContainer.class);
                if(position==15)
                    fileToStringConversion("string/OccurrenceOfCharacter.java",NumberSystemContainer.class);
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
