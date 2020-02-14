package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abd(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void abd2(View view2)
    {
        Intent i=new Intent(this,Main4Activity.class);
        startActivity(i);
    }
}
