package com.example.codetribe.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyArray myArray = new MyArray();

        ListView listView= (ListView) findViewById(R.id.list_item);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, myArray.getMyArray());

        listView.setAdapter(stringArrayAdapter);
    }
}
