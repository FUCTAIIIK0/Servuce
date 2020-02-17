package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_runService)
    Button runServicebtn;

    @BindView(R.id.main_stopService)
    Button stopServiceBtn;

    @BindView(R.id.main_bindService)
    Button bindBtn;

    @BindView(R.id.main_unbindService)
    Button unbindBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        runServicebtn.setOnClickListener(v -> {
            startService();
        });

        stopServiceBtn.setOnClickListener(v -> {
            stopService();
        });
    }




    void startService(){
        startService(new Intent(this,MyService.class));
    }

    void stopService(){
        stopService(new Intent(this,MyService.class));
    }
}
