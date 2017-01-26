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
        Button frag = (Button) findViewById(R.id.frag);
        frag.setOnClickListener(this);
        Button ofm = (Button) findViewById(R.id.ofm);
        ofm.setOnClickListener(this);
        Button ani = (Button) findViewById(R.id.ani);
        ani.setOnClickListener(this);
        Button brd = (Button) findViewById(R.id.brd);
        brd.setOnClickListener(this);
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

            case (R.id.frag):
                Intent f_intent = new Intent("android.intent.action.FRAGMENT");
                startActivity(f_intent);
                break;

            case (R.id.ofm):
                Intent ofm_intent = new Intent("android.intent.action.OFMENU");
                startActivity(ofm_intent);
                break;

            case (R.id.ani):
                Intent ani_intent = new Intent("android.intent.action.ANIMATE");
                startActivity(ani_intent);
                break;

            case (R.id.brd):
                Intent brd_intent = new Intent("android.intent.action.BROADCAST");
                startActivity(brd_intent);
                break;

        }

    }
}
