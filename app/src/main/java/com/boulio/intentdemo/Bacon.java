package com.boulio.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
    }


    public void onClick(View view) {

        final EditText baconEditText =(EditText) findViewById(R.id.baconEditText);

        Intent i = new Intent(this, Apple.class);


        String msg = baconEditText.getText().toString();
        i.putExtra("msg", msg);

        startActivity(i);
    }
}
