package com.example.adettoastt174barcos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDisplay(View v){
        edit = (EditText) findViewById(R.id.PersonName);
        String message = edit.getText().toString();
        Toast.makeText(MainActivity.this,"Hello " + message, Toast.LENGTH_LONG).show();
    }
}