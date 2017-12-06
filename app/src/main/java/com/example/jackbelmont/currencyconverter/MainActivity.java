package com.example.jackbelmont.currencyconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {


    //Defines button which we will use
    Button buttonMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }


    //creates the listener on the button
    public void addListenerOnButton()
    {
            final Context context = this;

            buttonMain = (Button) findViewById(R.id.button);

        buttonMain.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,MainActivity2.class);

                        startActivity(intent);
            }
        });
    }

}
