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

public class PatternProgram extends AppCompatActivity {
    ListView patternListView;

    String[] list={
            "* * * *\n" + "* * * *\n" + "* * * *\n" + "* * * *\n",
            "1 1 1 1 1\n" + "2 2 2 2 2\n" +"3 3 3 3 3 \n" +"4 4 4 4 4\n" +"5 5 5 5 5\n",
            "1 2 3 4 5\n" +
                    "1 2 3 4 5\n" +
                    "1 2 3 4 5\n" +
                    "1 2 3 4 5\n" +
                    "1 2 3 4 5\n",
            " 1  1  1  1  1 \n" +
                    " 3  3  3  3  3 \n" +
                    " 5  5  5  5  5 \n" +
                    " 7  7  7  7  7 \n" +
                    " 9  9  9  9  9 ",
            "1  3  5  7  9 \n" +
                    " 1  3  5  7  9 \n" +
                    " 1  3  5  7  9 \n" +
                    " 1  3  5  7  9 \n" +
                    " 1  3  5  7  9",
            "1\n" +
                    "1 2\n" +
                    "1 2 3\n" +
                    "1 2 3 4\n" +
                    "1 2 3 4 5\n",
            "* \n" +
                    " *  * \n" +
                    " *  *  * \n" +
                    " *  *  *  * \n" +
                    " *  *  *  *  * ",
            "*  *  *  *  * \n" +
                    " *  *  *  * \n" +
                    " *  *  * \n" +
                    " *  * \n" +
                    " * ",
            " 1  2  3  4  5 \n" +
                    " 1  2  3  4 \n" +
                    " 1  2  3 \n" +
                    " 1  2 \n" +
                    " 1 \n",
            " 1  1  1  1  1 \n" +
                    " 2  2  2  2 \n" +
                    " 3  3  3 \n" +
                    " 4  4 \n" +
                    " 5 \n",
            " 5 \n" +
                    " 4  4 \n" +
                    " 3  3  3 \n" +
                    " 2  2  2  2 \n" +
                    " 1  1  1  1  1 \n",
            "*\n" +
                    "* * *\n" +
                    "* * * * *\n" +
                    "* * * * * * *\n" +
                    "* * * * * * * * *\n",

            " 1 \n" +
                    " 0  0 \n" +
                    " 1  1  1 \n" +
                    " 0  0  0  0",
            "1\n" +
                    "2 3\n" +
                    "4 5 6\n" +
                    "7 8 9 10\n",
            "1 \n" +
                    " 0  1 \n" +
                    " 0  1  0 \n" +
                    " 1  0  1  0 \n" +
                    " 1  0  1  0  1 ",
            "1\n" +
                    "3 3 3\n" +
                    "5 5 5 5 5\n" +
                    "7 7 7 7 7 7 7\n" +
                    "9 9 9 9 9 9 9 9 9\n",
            "1\n" +
                    "0 0\n" +
                    "1 1 1\n" +
                    "0 0 0 0\n" +
                    "1 1 1 1 1\n",
            "1 1 1 1 1\n" +
                    "0 0 0 0\n" +
                    "1 1 1\n" +
                    "0 0\n" +
                    "1\n",
            "0 1 0 1 0\n" +
                    "0 1 0 1\n" +
                    "0 1 0\n" +
                    "0 1\n" +
                    "0\n",
            "1  0  1  0  1 \n" +
                    " 1  0  1  0 \n" +
                    " 1  0  1 \n" +
                    " 1  0 \n" +
                    " 1 ",
            "5 4 3 2 1\n" +
                    "5 4 3 2\n" +
                    "5 4 3\n" +
                    "5 4\n" +
                    "5\n",
            "10 9 8 7\n" +
                    "6 5 4\n" +
                    "3 2\n" +
                    "1\n",
            "*\n" +
                    "\n" +
                    "* *\n" +
                    "\n" +
                    "* * *\n" +
                    "\n" +
                    "* * * *\n" +
                    "\n" +
                    "* * * * *\n" +
                    "\n" +
                    "* * * * * *\n" +
                    "\n" +
                    "* * * * * * *",
            "* * * * * * *\n" +
                    "   * * * * *\n" +
                    "      * * *\n" +
                    "        *\n",
            "* ***** *\n" +
                    "*    \t *\n" +
                    "*    \t *\n" +
                    "*     \t *\n" +
                    "*    \t *\n" +
                    "*    \t *\n" +
                    "* ***** *\n",
            " *   *\n" +
                    "  * *\n" +
                    "   *\n" +
                    "  * *\n" +
                    " *   *\n" +
                    "*     *\n",
            "* * * * * *\n" +
                    "   * * * * *\n" +
                    "     * * * *\n" +
                    "       * * *\n" +
                    "         * *\n" +
                    "           *\n",
            "* * * * * *\n" +
                    "* * * * *\n" +
                    "* * * *\n" +
                    "* * *\n" +
                    "* *\n" +
                    "*\n",
                 "      *\n" +
                   "    ***\n" +
                   "  *****\n" +
                   "*******\n" +
                   "  *****\n" +
                   "    ***\n" +
                   "      *\n",
            "      *\n" +
                    "     * *\n" +
                    "    *   *\n" +
                    "   *     *\n" +
                    "  *       *\n" +
                    " *         *\n" +
                    "*           *\n" +
                    " *         *\n" +
                    "  *       *\n" +
                    "   *     *\n" +
                    "    *   *\n" +
                    "     * *\n" +
                    "       *\n",
            "      1\n" +
                    "    121\n" +
                    "  12321\n" +
                    "1234321\n" +
                    "  12321\n" +
                    "    121\n" +
                    "      1\n",
            "      A\n" +
                    "    ABA\n" +
                    "  ABCBA\n" +
                    "ABCDCBA\n" +
                    "  ABCBA\n" +
                    "     ABA\n" +
                    "        A\n"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_program);
        Toolbar toolbar= (Toolbar) findViewById(R.id.patternProgramToolbar);
        toolbar.setTitle("Pattern Program");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderPatternList();
    }


    private void renderPatternList() {
        patternListView= (ListView) findViewById(R.id.patternListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.pattern_list_item,R.id.patternTextView,list);
        patternListView.setAdapter(adapter);
        patternListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                    fileToStringConversion("pattern/Pattern1.java",NumberSystemContainer.class);
                if(position==1)
                    fileToStringConversion("pattern/Pattern2.java",NumberSystemContainer.class);
                if(position==2)
                    fileToStringConversion("pattern/Pattern3.java",NumberSystemContainer.class);
                if(position==3)
                    fileToStringConversion("pattern/Pattern4.java",NumberSystemContainer.class);
                if(position==4)
                    fileToStringConversion("pattern/Pattern5.java",NumberSystemContainer.class);
                if(position==5)
                    fileToStringConversion("pattern/Pattern6.java",NumberSystemContainer.class);
                if(position==6)
                    fileToStringConversion("pattern/Pattern7.java",NumberSystemContainer.class);
                if(position==7)
                    fileToStringConversion("pattern/Pattern8.java",NumberSystemContainer.class);
                if(position==8)
                    fileToStringConversion("pattern/Pattern9.java",NumberSystemContainer.class);
                if(position==9)
                    fileToStringConversion("pattern/Pattern10.java",NumberSystemContainer.class);
                if(position==10)
                    fileToStringConversion("pattern/Pattern11.java",NumberSystemContainer.class);
                if(position==11)
                    fileToStringConversion("pattern/Pattern12.java",NumberSystemContainer.class);
                if(position==12)
                    fileToStringConversion("pattern/Pattern13.java",NumberSystemContainer.class);
                if(position==13)
                    fileToStringConversion("pattern/Pattern14.java",NumberSystemContainer.class);
                if(position==14)
                    fileToStringConversion("pattern/Pattern15.java",NumberSystemContainer.class);
                if(position==15)
                    fileToStringConversion("pattern/Pattern16.java",NumberSystemContainer.class);
                if(position==16)
                    fileToStringConversion("pattern/Pattern17.java",NumberSystemContainer.class);
                if(position==17)
                    fileToStringConversion("pattern/Pattern18.java",NumberSystemContainer.class);
                if(position==18)
                    fileToStringConversion("pattern/Pattern19.java",NumberSystemContainer.class);
                if(position==19)
                    fileToStringConversion("pattern/Pattern20.java",NumberSystemContainer.class);
                if(position==20)
                    fileToStringConversion("pattern/Pattern21.java",NumberSystemContainer.class);
                if(position==21)
                    fileToStringConversion("pattern/Pattern22.java",NumberSystemContainer.class);
                if(position==22)
                    fileToStringConversion("pattern/Pattern23",NumberSystemContainer.class);
                if(position==23)
                    fileToStringConversion("pattern/Pattern24",NumberSystemContainer.class);
                if(position==24)
                    fileToStringConversion("pattern/Pattern25",NumberSystemContainer.class);
                if(position==25)
                    fileToStringConversion("pattern/Pattern26",NumberSystemContainer.class);
                if(position==26)
                    fileToStringConversion("pattern/Pattern27",NumberSystemContainer.class);
                if(position==27)
                    fileToStringConversion("pattern/Pattern28",NumberSystemContainer.class);
                if(position==28)
                    fileToStringConversion("pattern/Pattern29",NumberSystemContainer.class);
                if(position==29)
                    fileToStringConversion("pattern/Pattern30",NumberSystemContainer.class);
                if(position==30)
                    fileToStringConversion("pattern/Pattern31",NumberSystemContainer.class);
                if(position==31)
                    fileToStringConversion("pattern/Pattern32",NumberSystemContainer.class);

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
