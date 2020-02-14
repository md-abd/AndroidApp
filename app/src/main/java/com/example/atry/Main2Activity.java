package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {
    SearchView mySearchView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String[] tStory = getResources().getStringArray(R.array.title_story);
        final String[] dStory = getResources().getStringArray(R.array.details_story);

        listView = findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row,R.id.rowTxt, tStory);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t = dStory[position];
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("story", t);
                startActivity(i);
            }
        });
        mySearchView=(SearchView)findViewById(R.id.searchView);
        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
