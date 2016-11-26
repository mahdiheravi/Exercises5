package com.example.hp.exercise5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtname = (TextView) findViewById(R.id.txtname);
        Button btnenter = (Button) findViewById(R.id.btnenter);
        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("name",txtname.getText().toString());
                startActivity(myintent);
            }
        });

    }
}
