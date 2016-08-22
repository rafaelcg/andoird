package com.example.rafael.layoutjava;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //creating layout
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.BLUE);
        //Button Container
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        //Button
        Button redButton = new Button(this);
        redButton.setText("Click me!");
        redButton.setBackgroundColor(Color.RED);
        redButton.setTextColor(Color.WHITE);
        redButton.setId(1);
        //Username Input
        EditText etUsername = new EditText(this);
        etUsername.setHint("Username");
        etUsername.setId(2);
        //Username box Container
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        Resources r = getResources();
        int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200, r.getDisplayMetrics());
        etUsername.setWidth(pixels);


        //adding to widget
        layout.addView(redButton, buttonDetails);
        layout.addView(etUsername, usernameDetails);
        //Sets the main layout
        setContentView(layout);
    }
}
