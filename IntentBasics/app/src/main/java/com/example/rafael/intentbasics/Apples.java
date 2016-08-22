package com.example.rafael.intentbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    private static final String TAG = "com.example.rafael.intentbasics";
    Button btApples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);

        Intent intent = new Intent(this, MyService.class);
        startService(intent);

        btApples = (Button) findViewById(R.id.btApples);
        btApples.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Apples.this, Bacon.class);

                        final EditText etApples = (EditText) findViewById(R.id.etApples);
                        String info = etApples.getText().toString();
                        i.putExtra("appleMessage", info);

                        startActivity(i);
                    }
                }
        );


    }




}
