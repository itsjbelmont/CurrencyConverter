package com.example.jackbelmont.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Patrick on 12/8/2017.
 */

public class MainActivity2 extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Gets whatever was inputted into main text box
        EditText editText = (EditText) findViewById(R.id.editText2);
        String string1 = editText.getText().toString();

        setContentView(R.layout.activity_main2);

        //Puts value into text box 8
        TextView textView = (TextView) findViewById(R.id.textView8);
        textView.setText("Hi");

        //Puts value into text box 9
        TextView textView1 = (TextView) findViewById(R.id.textView9);
        textView1.setText(string1);

        //puts value into box 10
        TextView textView2 = (TextView) findViewById(R.id.textView10);
        textView2.setText(string1);

        //puts value into box 11
        TextView textView3 = (TextView) findViewById(R.id.textView11);
        textView3.setText(string1);

        //puts view into box 12
        TextView textView4 = (TextView) findViewById(R.id.textView12);
        textView4.setText(string1);


        addListenerOnButton2();
    }



    public void addListenerOnButton2()
    {


        //collects all the buttons
        Button US_button = (Button) findViewById(R.id.USD);

        US_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(getApplicationContext(),MainActivity3.class);

                startActivity(intent2);
            }
        });
    }





}
