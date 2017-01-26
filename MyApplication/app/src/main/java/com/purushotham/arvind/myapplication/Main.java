package com.purushotham.arvind.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alc = (Button) findViewById(R.id.alc);
        alc.setOnClickListener(this);
        Button g = (Button) findViewById(R.id.g);
        g.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case(R.id.alc):
                Intent alc_intent = new Intent("android.intent.action.APPLIFECYCLE");
                startActivity(alc_intent);
                break;

            case(R.id.g):
                Intent g_intent = new Intent("android.intent.action.GESTURE");
                startActivity(g_intent);
                break;

            case(R.id.frag):
                Intent frag_intent = new Intent("android.intent.action.GESTURE");
                startActivity(frag_intent);
                break;

        }

    }
}
