package com.somthing.amarguriya.programming;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AboutApp extends AppCompatActivity {
    ListView aboutAppListView;

    private String[] aboutAppList={
            "This app is distributing my solutions for programs which are quite repeatedly asked in different companies.",
            "From the time you download this app I assume you already know what this app is.",
            "I also assume that you are preparing for coding interviews’",
            "I classify the program into different groups and hope this will help you to think about those problems.",
            "Developed this app just for sharing my programming skills to fresher and experience candidates and also to promote myself."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        renderAboutAppListView();
        TextView t1 = (TextView) findViewById(R.id.aboutAppTv);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/androidnation_b.ttf");
        t1.setTypeface(typeface);

        Toolbar toolbar= (Toolbar) findViewById(R.id.aboutAppToolbar);
        toolbar.getDrawingCacheBackgroundColor();
        toolbar.setTitle("About App");
//        toolbar.setTitleTextColor(Color.parseColor("#7b1fa2"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void renderAboutAppListView() {
        aboutAppListView= (ListView) findViewById(R.id.aboutAppListView);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,R.layout.aboutus_list_item,R.id.aboutusTextView,aboutAppList);
        aboutAppListView.setAdapter(adapter2);
    }
}
