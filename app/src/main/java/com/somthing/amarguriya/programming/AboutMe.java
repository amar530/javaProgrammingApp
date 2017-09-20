package com.somthing.amarguriya.programming;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {
    ListView aboutMeListView;
    private  String[] aboutMeList={
            "Hi everyone myself Raghu GB,I am a corporate technical programming aptitude trainer with an experience of more than 4 years.",
            "I am capable of writing one program in multiple ways with minimum number of lines.",
            "I have a faith in myself that I can train students who can be good developer in corporate world.",
            "So far I have solved all interview question asked in MNCs and start up  which helped most of the students to crack the interview."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        TextView t1 = (TextView) findViewById(R.id.aboutMeTv);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/androidnation_b.ttf");
        t1.setTypeface(typeface);
        Toolbar toolbar= (Toolbar) findViewById(R.id.aboutMeToolbar);
        toolbar.getDrawingCacheBackgroundColor();
        toolbar.setTitle("About Me");
//        toolbar.setTitleTextColor(Color.parseColor("#7b1fa2"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        renderAboutMeList();

    }

    private void renderAboutMeList() {
        aboutMeListView= (ListView) findViewById(R.id.aboutMeListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.aboutus_list_item,R.id.aboutusTextView,aboutMeList);
        aboutMeListView.setAdapter(adapter);


    }
}
