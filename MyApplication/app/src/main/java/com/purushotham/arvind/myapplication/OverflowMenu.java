package com.purushotham.arvind.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class OverflowMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overflow_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout activity_overflow_menu = (RelativeLayout) findViewById(R.id.activity_overflow_menu);

        switch(item.getItemId()){
            case R.id.one:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                activity_overflow_menu.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.two:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                activity_overflow_menu.setBackgroundColor(Color.DKGRAY);
                return true;
            case R.id.three:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                activity_overflow_menu.setBackgroundColor(Color.GRAY);
                return true;
            default:
                if(item.isChecked())item.setChecked(false);
                else item.setChecked(true);
                activity_overflow_menu.setBackgroundColor(Color.WHITE);
                return true;
        }
    }
}
