package com.example.rafael.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewGroup mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = (ViewGroup) findViewById(R.id.mainView);
        mainView.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );
    }


    public void moveButton() {
        View btTransition = findViewById(R.id.btTransition);


            TransitionManager.beginDelayedTransition(mainView);


        //Change the position
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        btTransition.setLayoutParams(positionRules);

        //Change the size
        ViewGroup.LayoutParams sizeRules = btTransition.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        btTransition.setLayoutParams(sizeRules);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout mainView = (RelativeLayout) findViewById(R.id.mainView);

        switch(item.getItemId()){
            case R.id.menuRed:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainView.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuBlue:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainView.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.menuGreen:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainView.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
