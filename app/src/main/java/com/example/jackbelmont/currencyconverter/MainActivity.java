package com.example.jackbelmont.currencyconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


//Main public class which contains all the Main Activity
public class MainActivity extends AppCompatActivity
{


    //Defines button which we will use, this button is what appears on the main
    //screen when the app starts
    Button buttonMain;

    //Back button for going back to main screen


    //This onCreate sets up the layout view on the app and creates a listener
    //for input from the button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listens for button
        //creates the listener on the button
        //the button will lead to another screen, and also link the data being sent to
        //second screen

        buttonMain = (Button) findViewById(R.id.button);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final EditText editText = (EditText) findViewById(R.id.editText2);
        buttonMain.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String value = editText.getText().toString();
                String choice = spinner.getSelectedItem().toString();
                intent.putExtra("VALUE", value);
                intent.putExtra("CHOICE", choice);
                startActivity(intent);
            }
        });
    }


}
