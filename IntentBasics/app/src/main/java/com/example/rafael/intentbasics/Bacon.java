package com.example.rafael.intentbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    private Button btBacon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        final TextView tvBacon = (TextView) findViewById(R.id.tvBacon);

        Bundle appleData = getIntent().getExtras();
        if(appleData == null){
            return;
        }
        String appleMessage = appleData.getString("appleMessage");

        tvBacon.setText(appleMessage);


        btBacon = (Button) findViewById(R.id.btBacon);
        btBacon.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Bacon.this, Apples.class);
                        startActivity(i);
                    }
                }
        );
    }
}
