package com.example.rafael.threads;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHello;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            tvHello = (TextView) findViewById(R.id.tvHello);
            tvHello.setText("Bye.");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = (Button) findViewById(R.id.btClick);
        assert btClick != null;
        btClick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                long futureTime = System.currentTimeMillis() + 10000;
                                while(System.currentTimeMillis() < futureTime){
                                    synchronized (this){
                                        try{
                                            wait(futureTime - System.currentTimeMillis());
                                        }catch (Exception e){

                                        }
                                    }
                                }
                                handler.sendEmptyMessage(0);
                            }
                        };
                        Thread myThread = new Thread(r);
                        myThread.start();

                    }
                }
        );

    }
}
