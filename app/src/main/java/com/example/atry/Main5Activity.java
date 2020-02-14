package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView2=findViewById(R.id.txt2);
        String dStory2= getIntent().getStringExtra("story2");
        textView2.setText(dStory2);
    }
}
