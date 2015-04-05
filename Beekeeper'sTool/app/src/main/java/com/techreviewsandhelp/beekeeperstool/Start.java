package com.techreviewsandhelp.beekeeperstool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by crua9 on 4/3/2015.
 */
public class Start extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);


        /**
         * ID Buttons
         */

        Button back = (Button)findViewById(R.id.back1);
        Button help = (Button)findViewById(R.id.bhelp);

        final Context c = this;


        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, MainActivity.class));
                finish();
            }
        });
           help.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Help.class));
            }});}}
