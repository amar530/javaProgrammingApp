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

public class OneDimensionalProgram extends AppCompatActivity {
    ListView oneDListView;
    String[] list={
            "Write a program to calculate how many even and odd number in int array.",
            "Write a program to calculate mean value in int array.",
            "Write a program to calculate how many prime number int array.",
            "Write a program to calculate how many special two digit  number present in array.",
            "Write a program to calculate how many Armstrong number.",
            "Write a program to display reverse the array element.",
            "Write a program to find the biggest element in the array.",
            "Write a program to find the smallest element in array.",
            "Write a program to find the nth biggest number in the array.",
            "Write a program to find nth Smallest element in the array.",
            "Write a program to swap to continuous number in the array.",
            "Write a program to calculate highest sum of two continuous number in the array.",
            "Write a program to insert the element in to existing array in the specific index.",
            "Write a program to delete the element from the specific index.",
            "Write a program to insert the one array inside the another array in specific index.",
            "Write a program to merge two arrays in the zig-zag manner.",
            "Write a program to find biggest and second biggest number in the array.",
            "Write a program to find smallest and second smallest number in the array.",
            "Write a program to merge two array.",
            "Write a program to find second occurrence element in the array",
            "Write a program to find common element in two array.",
            "Write a program to find how many time occurs an element in the array."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_dimensional_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.oneDimensionalToolbar);
        toolbar.setTitle("One Dimensional Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderOneDimensionalList();

    }

    private void renderOneDimensionalList() {
        oneDListView = (ListView) findViewById(R.id.oneDListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.onedimensional_list_item, R.id.oneDTextView, list);
        oneDListView.setAdapter(adapter);
        oneDListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                    fileToStringConversion("onedimensional/EvenOddNumber.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("onedimensional/MeanValue.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("onedimensional/HowManyPrimeNumber.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("onedimensional/HowManySpecialTwoDigitNumber.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("onedimensional/HowManyArmStrongNumber.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("onedimensional/ReverseTheArray.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("onedimensional/BiggestElement.java",NumberSystemContainer.class);
                if(position==7)
                    fileToStringConversion("onedimensional/SmallestElement.java",NumberSystemContainer.class);
                if(position==8)
                    fileToStringConversion("onedimensional/NthBiggestNumber.java",NumberSystemContainer.class);
                if(position==9)
                    fileToStringConversion("onedimensional/NthSmallestNumber.java",NumberSystemContainer.class);
                if(position==10)
                    fileToStringConversion("onedimensional/SwappingElement.java",NumberSystemContainer.class);
                if(position==11)
                    fileToStringConversion("onedimensional/SumOfHighestTwoContNumber.java",NumberSystemContainer.class);
                if(position==12)
                    fileToStringConversion("onedimensional/InsertionElementAtIndex.java",NumberSystemContainer.class);
                if(position==13)
                    fileToStringConversion("onedimensional/DeleteEle.java",NumberSystemContainer.class);
                if(position==14)
                    fileToStringConversion("onedimensional/InsertArray.java",NumberSystemContainer.class);
                if(position==15)
                    fileToStringConversion("onedimensional/InsertionInZigZagManner.java",NumberSystemContainer.class);
                if(position==16)
                    fileToStringConversion("onedimensional/FirstBiggestAndSecondBiggest.java",NumberSystemContainer.class);
                if(position==17)
                    fileToStringConversion("onedimensional/FisrtSmallestAndSecondSmallest.java",NumberSystemContainer.class);
                if(position==18)
                    fileToStringConversion("onedimensional/MergTwoArray.java",NumberSystemContainer.class);
                if(position==19)
                    fileToStringConversion("onedimensional/SecondOccurrenceElement.java",NumberSystemContainer.class);
                if(position==20)
                    fileToStringConversion("onedimensional/CommonEleInTwoArray.java",NumberSystemContainer.class);
                if(position==21)
                    fileToStringConversion("onedimensional/HowManyTimeELementOccurrence.java",NumberSystemContainer.class);
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
