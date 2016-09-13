package com.boulio.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle data = getIntent().getExtras();
        if(data == null){
            return;
        }
        String msg = data.getString("msg");

        final TextView appleTextView = (TextView) findViewById(R.id.appleEditText);
        appleTextView.setText(msg);
    }

    public void onClick(View view) {

        Intent i = new Intent(this, Bacon.class);
        startActivity(i);
    }
}
