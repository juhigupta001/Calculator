package com.example.hrsh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclicked(View v) {
        EditText editTextweight = (EditText) findViewById(R.id.userweight);
        EditText editTextheight = (EditText) findViewById(R.id.userheight);
        TextView result = (TextView) findViewById(R.id.userbmi);
        double height=Double.parseDouble(editTextheight.getText().toString());

        double weight=Double.parseDouble(editTextweight.getText().toString());
        double BMI=weight/(height*height);
        result.setText(Double.toString(BMI));

    }
}

