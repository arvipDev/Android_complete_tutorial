package com.purushotham.arvind.myapplication;

import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Animation extends AppCompatActivity {

    private ViewGroup activity_animation;
    private View animate_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        animate_b = findViewById(R.id.animate_b);
        animate_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveButtonBack();
            }
        });

        activity_animation = (ViewGroup) findViewById(R.id.activity_animation);
        activity_animation.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("","Inside");
                moveButton();
                return true;
            }
        });
    }

    private void moveButtonBack() {
        TransitionManager.beginDelayedTransition(activity_animation);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        animate_b.setLayoutParams(params);

        ViewGroup.LayoutParams size = animate_b.getLayoutParams();
        size.height=200;
        size.width=1600;
        animate_b.setLayoutParams(size);
    }

    private void moveButton() {
        TransitionManager.beginDelayedTransition(activity_animation);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        animate_b.setLayoutParams(params);

        ViewGroup.LayoutParams size = animate_b.getLayoutParams();
        size.height=600;
        size.width=1500;
        animate_b.setLayoutParams(size);

    }
}
