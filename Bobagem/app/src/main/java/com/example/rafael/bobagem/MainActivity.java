package com.example.rafael.bobagem;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView tvTexto, tvLarge;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTexto = (TextView) findViewById(R.id.tvTexto);
        tvLarge = (TextView) findViewById(R.id.tvLarge);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        tvTexto.setText("onSingleTapConfirmed");
        tvLarge.setText("hehe");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        tvTexto.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        tvTexto.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        tvTexto.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        tvTexto.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        tvTexto.setText("onSingleTapUp");
        tvLarge.setText("I just got tapped.");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        tvTexto.setText("onScroll");
        tvLarge.setText("I just got scrolled.");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        tvTexto.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        tvTexto.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
