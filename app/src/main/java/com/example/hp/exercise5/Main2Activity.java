package com.example.hp.exercise5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    Random rnd;
    int mykey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtname = (TextView) findViewById(R.id.txtname);
        Intent myintent = getIntent();
        String str = myintent.getStringExtra("name");
        txtname.setText(str);
        rnd = new Random();
        mykey = createrandom();

        final EditText txtnumber  = (EditText) findViewById(R.id.txtnumber);


        Button btnguess = (Button) findViewById(R.id.btnguess);
        btnguess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txtnumber.getText().toString().equals(""))
                {
                    int number = Integer.parseInt(txtnumber.getText().toString());
                    checknumber(number);
                   


                }
                else
                    Toast.makeText(Main2Activity.this, "لطفا عددی وارد نمایید", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private int createrandom()
    {
        return (rnd.nextInt(100));
    }
    private  void checknumber(int number)
    {
        if (number > mykey )
            Toast.makeText(Main2Activity.this, "عدد کوچکتری وارد نمایید", Toast.LENGTH_SHORT).show();
        else if (number < mykey)
            Toast.makeText(Main2Activity.this, "عدد بزرگتری وارد نمایید", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(Main2Activity.this, "شما موفق شدید", Toast.LENGTH_SHORT).show();


    }
}
