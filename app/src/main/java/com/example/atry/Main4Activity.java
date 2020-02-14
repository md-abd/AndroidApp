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

public class Main4Activity extends AppCompatActivity {
    SearchView mySearchView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        String[] tStory2 = getResources().getStringArray(R.array.title_story2);
        final String[] dStory2 = getResources().getStringArray(R.array.details_story2);

        listView = findViewById(R.id.list2);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row2,R.id.rowTxt2, tStory2);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view2, int position, long id) {
                String t = dStory2[position];
                Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                i.putExtra("story2", t);
                startActivity(i);
            }
        });
        mySearchView=(SearchView)findViewById(R.id.searchView2);
        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query2) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText2) {
                adapter.getFilter().filter(newText2);
                return false;
            }
        });
    }
}
