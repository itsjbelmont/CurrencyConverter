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
    int tester;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        //load button
        addListenerOnButton0();

        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        addListenerOnButton6();
        addListenerOnButton7();
        addListenerOnButton8();
        addListenerOnButton9();
        addListenerOnButton10();
        addListenerOnButton11();
        addListenerOnButton12();


    }



    public void addListenerOnButton0()
    {
        final Button load = (Button) findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                
                //Gets whatever was inputted into main text box
                double newValue = Double.parseDouble(getIntent().getStringExtra("VALUE"));
                String newChoice = getIntent().getStringExtra("CHOICE");
                String str = String.valueOf(newValue);


                //Puts value into text box 8
                TextView textView = (TextView) findViewById(R.id.textView8);
                textView.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "US Dollar"))) * 100) / 100));

                //Puts value into text box 9
                TextView textView1 = (TextView) findViewById(R.id.textView9);
                textView1.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "British Pound"))) * 100) / 100));

                //puts value into box 10
                TextView textView2 = (TextView) findViewById(R.id.textView10);
                textView2.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Japanese Yen"))) * 100) / 100));

                //puts value into box 11
                TextView textView3 = (TextView) findViewById(R.id.textView11);
                textView3.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Australian Dollar"))) * 100) / 100));

                //puts view into box 12
                TextView textView4 = (TextView) findViewById(R.id.textView12);
                textView4.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Swiss Franc"))) * 100) / 100));

                TextView textView5 = (TextView) findViewById(R.id.textView15);
                textView5.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Canadian Dollar"))) * 100) / 100));

                TextView textView6 = (TextView) findViewById(R.id.textView16);
                textView6.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Chinese Yuan"))) * 100) / 100));

                TextView textView7 = (TextView) findViewById(R.id.textView17);
                textView7.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Hong Kong Dollar"))) * 100) / 100));

                TextView textView8 = (TextView) findViewById(R.id.textView14);
                textView8.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Mexican Peso"))) * 100) / 100));

                TextView textView9 = (TextView) findViewById(R.id.textView13);
                textView9.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Brazilian Real"))) * 100) / 100));

                TextView textView10 = (TextView) findViewById(R.id.textView18);
                textView10.setText(String.valueOf(Math.floor((newValue * (ExchangeRate.getSpecificRate(newChoice, "Euro"))) * 100) / 100));

            }
        });
    }

    //Button for US Dollar
    public void addListenerOnButton2()
    {

        tester = 1;

        //collects all the buttons
        final Button US_button = (Button) findViewById(R.id.USD);

        US_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(getApplicationContext(),us_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for British Pound
    public void addListenerOnButton3()
    {
        tester = 2;

        Button Britain_button = (Button) findViewById(R.id.Britain);

        Britain_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),britain_activity.class);

                startActivity(intent);
            }
        });
    }


    //Button for Japanese Yen Dollar
    public void addListenerOnButton4()
    {
        tester = 3;

        Button Japan_button = (Button) findViewById(R.id.Japan);

        Japan_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),japan_activity.class);

                startActivity(intent);
            }
        });
    }


    //Button for Australian Dollar
    public void addListenerOnButton5()
    {
        tester = 4;

        Button Australia_button = (Button) findViewById(R.id.Australia);

        Australia_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),australia_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Swiss Frac
    public void addListenerOnButton6()
    {
        tester = 5;

        Button Swiss_button = (Button) findViewById(R.id.Switzerland);

        Swiss_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),swiss_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Canadian Dollar
    public void addListenerOnButton7()
    {
        tester = 6;

        Button Canada_button = (Button) findViewById(R.id.Canada);

        Canada_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),canada_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for China Yuan
    public void addListenerOnButton8()
    {
        tester = 7;

        Button China_button = (Button) findViewById(R.id.China);

        China_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),china_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Hong Kong Money
    public void addListenerOnButton9()
    {
        tester = 8;

        Button Hong_button = (Button) findViewById(R.id.Hong_Kong);

        Hong_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),hong_kong_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Mexican Peso
    public void addListenerOnButton10()
    {
        tester = 9;

        Button Mexico_button = (Button) findViewById(R.id.Mexico);

        Mexico_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),mexico_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Brazilian Real
    public void addListenerOnButton11()
    {
        tester = 10;

        Button Brazil_button = (Button) findViewById(R.id.Brazil);

        Brazil_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),brazil_activity.class);

                startActivity(intent);
            }
        });
    }

    //Button for Euro
    public void addListenerOnButton12()
    {
        tester = 11;

        Button Euro_button = (Button) findViewById(R.id.Euro);

        Euro_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),euro_activity.class);

                startActivity(intent);
            }
        });
    }
}
