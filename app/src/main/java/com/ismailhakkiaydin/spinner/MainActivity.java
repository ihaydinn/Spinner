package com.ismailhakkiaydin.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spnCountries;

    private void init(){
        spnCountries = findViewById(R.id.spnCountries);
    }

    private void spnCountries_Selection(){
        spnCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selection = spnCountries.getItemAtPosition(position).toString();
                MainActivity.this.setTitle(selection);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void registerHandlers(){
        spnCountries_Selection();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerHandlers();
    }
}
