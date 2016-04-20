package com.example.coder_ben.funfacts3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import javax.xml.xpath.XPathFunction;


public class FunFacts3Activity extends Activity {

    public static final String TAG =FunFacts3Activity.class.getSimpleName();

    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorwheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts3);

        //Declare our view variables and assign Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactbook.getFact();

                //update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorwheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                }


        };
        showFactButton.setOnClickListener(listener);


       //Toast.makeText(this,"Yay! Our Activity was created",Toast.LENGTH_LONG).show();
        Log.d(TAG, "We are logging from the onCreate() method");





    }
}