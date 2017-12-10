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
        String rates[][] = new String[11][2];
        rates[0][0] = "US Dollar";
        rates[1][0] = "British Pound";
        rates[2][0] = "Japanese Yen";
        rates[3][0] = "Australian Dollar";
        rates[4][0] = "Swiss Franc";
        rates[5][0] = "Canadian Dollar";
        rates[6][0] = "Chinese Yuan";
        rates[7][0] = "Hong Kong Dollar";
        rates[8][0] = "Mexican Peso";
        rates[9][0] = "Brazilian Real";
        rates[10][0] = "Euro";

        rates[0][1] = "0.8499";
        rates[1][1] = "1.1377";
        rates[2][1] = "0.0075";
        rates[3][1] = "0.6381";
        rates[4][1] = "0.8560";
        rates[5][1] = "0.6616";
        rates[6][1] = "0.1284";
        rates[7][1] = "0.1089";
        rates[8][1] = "0.0449";
        rates[9][1] = "0.2584";
        rates[10][1] = "1.0000";
        //Gets whatever was inputted into main text box
        double newValue = Double.parseDouble(getIntent().getStringExtra("VALUE"));
        String newChoice = getIntent().getStringExtra("CHOICE");
        String str = String.valueOf(newValue);
        setContentView(R.layout.activity_main2);

        //Puts value into text box 8
        TextView textView = (TextView) findViewById(R.id.textView8);
        textView.setText(str);

        //Puts value into text box 9
        TextView textView1 = (TextView) findViewById(R.id.textView9);
        textView1.setText(str);

        //puts value into box 10
        TextView textView2 = (TextView) findViewById(R.id.textView10);
        textView2.setText(str);

        //puts value into box 11
        TextView textView3 = (TextView) findViewById(R.id.textView11);
        textView3.setText(str);

        //puts view into box 12
        TextView textView4 = (TextView) findViewById(R.id.textView12);
        textView4.setText(str);

        TextView textView5 = (TextView) findViewById(R.id.textView15);
        textView5.setText(str);

        TextView textView6 = (TextView) findViewById(R.id.textView16);
        textView6.setText(str);

        TextView textView7 = (TextView) findViewById(R.id.textView17);
        textView7.setText(str);

        TextView textView8 = (TextView) findViewById(R.id.textView14);
        textView8.setText(str);

        TextView textView9 = (TextView) findViewById(R.id.textView13);
        textView9.setText(str);

        TextView textView10 = (TextView) findViewById(R.id.textView18);
        textView10.setText(str);

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
