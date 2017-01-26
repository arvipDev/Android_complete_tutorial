package com.purushotham.arvind.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TopFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    private View mainView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView =  inflater.inflate(R.layout.top_fragment, container, true);

        Spinner spinner = (Spinner) mainView.findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        Button top_f_b = (Button) mainView.findViewById(R.id.top_f_b);
        top_f_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Clicked...", Toast.LENGTH_SHORT).show();
            }
        });

        return mainView;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        TextView workout = (TextView) mainView.findViewById(R.id.workout_tv);
        workout.setText(adapterView.getItemAtPosition(i).toString());

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this.getContext(), "Nothing selected", Toast.LENGTH_SHORT).show();
    }
}
