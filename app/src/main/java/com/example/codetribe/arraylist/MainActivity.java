
package com.example.codetribe.arraylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText stock;
    Button send;
    Button disp;

    MyArray myarr = new MyArray();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stock = (EditText) findViewById(R.id.editText);
        send = (Button) findViewById(R.id.button);
        disp = (Button) findViewById(R.id.button2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stock.length() == 0) {
                    stock.setError("This Field cant be empty");
                    stock.requestFocus();
                } else {
                   myarr.saveArray(stock.getText().toString());
                    Toast.makeText(getApplicationContext(), "Saved Successfully", Toast.LENGTH_LONG).show();
                    stock.setText(null);
                }
            }
        });
        disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display();
            }
        });

    }


    public void Display(){
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
}