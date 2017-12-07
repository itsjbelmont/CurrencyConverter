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
import android.widget.TextView;


//Main public class which contains all the Main Activity
public class MainActivity extends AppCompatActivity
{


    //Defines button which we will use, this button is what appears on the main
    //screen when the app starts
    Button buttonMain;

    //This onCreate sets up the layout view on the app and creates a listener
    //for input from the button
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listens for button
        addListenerOnButton();
    }



    //creates the listener on the button
    //the button will lead to another screen, and also link the data being sent to
    //second screen
    public void addListenerOnButton()
    {

            final Context context = this;

            buttonMain = (Button) findViewById(R.id.button);



        //sets the button once clicked
        buttonMain.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {


                //will take in the value put in by the edit text space
                EditText editText = (EditText) findViewById(R.id.editText2);
                String value = editText.getText().toString();

                //outputs the value in activity_main2
                setContentView(R.layout.activity_main2);

                TextView textView = (TextView) findViewById(R.id.textView4);
                textView.setText(value);

                //This gives a feature for returning to the main page but there is also
                //a bug so until it is fixed we will keep it this way
                /*
                Intent intent = new Intent(context,MainActivity2.class);

                startActivity(intent);
                */
            }


        });
    }

}
