package com.somthing.amarguriya.programming;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import static android.R.interpolator.linear;

public class NumberProgram extends AppCompatActivity {
    TextView t;
    ListView numberListView;
    String[] list={
            "Write a program to check number is even or odd.",
            "Write a program to check number is even or odd without using if.",
            "Write a program to check number is even or odd without using % sign.",
            "Write a program to print even and odd number within 1 to 100.",
            "Write a program to reverse the number.",
            "Write a program to check number is palindrome or not hints:-121.",
            "Write a program to check number is perfect or not hints:-6=1+2+3.",
            "Write a program to check number is prime or not.",
            "Write a program to print prime number between 1 to 100.",
            "Write a program to calculate the factorial of the number.",
            "Write a program to check number is strong or not. Hints -145=1!+4!+5!.",
            "Write a program to print strong number between 1 to 1000.",
            "Write a program to check number is special two digit or not. Hints – 59=(5*9)+(5+9).",
            "Write a program to print special two digit number between 1 to 100.",
            "Write a program to check the number is Armstrong or not. Hints -153=1^3+5^3+3^3.",
            "Write a program to print Armstrong number between 1 to 1000.",
            "Write a program to check number is disarium or not. Hints – 135=1^1+3^2+5^3.",
            "Write a program to print disarium number between 1 to 1000.",
            "Write a program to check number is happy number or not. Hints – 97.",
            "Write a program to print happy number between 1 to 1000.",
            "Write a program to find the Fibonacci number.",
            "Write a program to convert the decimal to binary.",
            "Write a program to convert the decimal to octal.",
            "Write a program to convert the decimal to hexadecimal.",
            "Write a program to convert the decimal to All.",
            "Write a program to convert the binary to decimal.",
            "Write a program to convert the octal to decimal.",
            "Write a program to convert the hexadecimal to decimal.",
            "Write a program to convert the All to decimal.",
            "Write a program to display Multiplication Table",
            "Write a program to display Power of number.",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.numberProgramToolbar);
        toolbar.setTitle("Number Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderBasicList();
    }

    private void renderBasicList() {
        numberListView = (ListView) findViewById(R.id.numberListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.number_list_item, R.id.numberTextView, list);
        numberListView.setAdapter(adapter);

        numberListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position==0)
                    fileToStringConversion("numbersystem/evenOdd/EvenOddCheck.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("numbersystem/evenOdd/EvenOddUsingString.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("numbersystem/evenOdd/EvenOddWithout.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("numbersystem/evenOdd/HowMany.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("numbersystem/ReverseTheNumber.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("numbersystem/PalindromNumber.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("numbersystem/PerfectNumber.java",NumberSystemContainer.class);
                if(position==7)
                    fileToStringConversion("numbersystem/primeNumber/PrimeChecking.java",NumberSystemContainer.class);
                if(position==8)
                    fileToStringConversion("numbersystem/primeNumber/HowMany.java",NumberSystemContainer.class);
                if(position==9)
                    fileToStringConversion("numbersystem/Factorial.java",NumberSystemContainer.class);
                if(position==10)
                    fileToStringConversion("numbersystem/strongNumber/StrongNumberChecking.java",NumberSystemContainer.class);
                if(position==11)
                    fileToStringConversion("numbersystem/strongNumber/HowMany.java",NumberSystemContainer.class);
                if(position==12)
                    fileToStringConversion("numbersystem/specialTwoDigit/SpecialTwoDigitNumber.java",NumberSystemContainer.class);
                if(position==13)
                    fileToStringConversion("numbersystem/specialTwoDigit/HowMany.java",NumberSystemContainer.class);
                if(position==14)
                    fileToStringConversion("numbersystem/armStrong/ArmStrongChecking.java",NumberSystemContainer.class);
                if(position==15)
                    fileToStringConversion("numbersystem/armStrong/HowMany.java",NumberSystemContainer.class);
                if(position==16)
                    fileToStringConversion("numbersystem/disarium/DisariumNumber.java",NumberSystemContainer.class);
                if(position==17)
                    fileToStringConversion("numbersystem/disarium/HowMany.java",NumberSystemContainer.class);
                if(position==18)
                    fileToStringConversion("numbersystem/HappyNumber.java",NumberSystemContainer.class);
                if(position==19)
                    fileToStringConversion("numbersystem/HowManyHappyNumber.java",NumberSystemContainer.class);
                if(position==20)
                    fileToStringConversion("numbersystem/FabonisSeries.java",NumberSystemContainer.class);
                if(position==21)
                    fileToStringConversion("numbersystem/decimalTo/DtoBinary.java",NumberSystemContainer.class);
                if(position==22)
                    fileToStringConversion("numbersystem/decimalTo/DtoOctal.java",NumberSystemContainer.class);
                if(position==23)
                    fileToStringConversion("numbersystem/decimalTo/DtoHexa.java",NumberSystemContainer.class);
                if(position==24)
                    fileToStringConversion("numbersystem/decimalTo/DToAllInAll.java",NumberSystemContainer.class);
                if(position==25)
                    fileToStringConversion("numbersystem/todecimal/BinaryToDecimal.java",NumberSystemContainer.class);
                if(position==26)
                    fileToStringConversion("numbersystem/todecimal/OctalToDecimal.java",NumberSystemContainer.class);
                if(position==27)
                    fileToStringConversion("numbersystem/todecimal/HexaToDecimal.java",NumberSystemContainer.class);
                if(position==28)
                    fileToStringConversion("numbersystem/todecimal/AllInAll.java",NumberSystemContainer.class);
                if(position==29)
                    fileToStringConversion("multilplicationTable",NumberSystemContainer.class);
                if(position==30)
                    fileToStringConversion("numbersystem/Power.java",NumberSystemContainer.class);

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
