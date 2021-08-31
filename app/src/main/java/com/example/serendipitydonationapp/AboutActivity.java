package com.example.serendipitydonationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.serendipitydonationapp.money.MoneyActivity;

public class AboutActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //Spinner to display Countries
    public Spinner s;
    Intent intent;
    public String c_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // find view by id for spinner
        s = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> s_adapter = ArrayAdapter.createFromResource(this, R.array.c_options, android.R.layout.simple_spinner_item);
        s_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(s_adapter);
        s.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        c_text = parent.getItemAtPosition(position).toString();

        // switch case for country spinner
        switch (c_text) {
            case "Select":
                break;

            case "India":
                Toast.makeText(parent.getContext(), c_text, Toast.LENGTH_SHORT).show();
                intent = new Intent(AboutActivity.this, IndiaMenuActivity.class);
                startActivity(intent);
                break;

            case "UAE":
                Toast.makeText(parent.getContext(), c_text, Toast.LENGTH_SHORT).show();
                intent = new Intent(AboutActivity.this, MenuActivity.class);
                startActivity(intent);
                break;

            case "USA":
                Toast.makeText(parent.getContext(), c_text, Toast.LENGTH_SHORT).show();
                intent = new Intent(AboutActivity.this, UsaMenuActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

