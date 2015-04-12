package com.techreviewsandhelp.beekeeperstool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by crua9 on 4/12/2015.
 */
public class Pest extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pest);


        /**
         * ID Buttons
         */

        ImageButton waxmoth = (ImageButton)findViewById(R.id.waxmoth);
        ImageButton mite = (ImageButton)findViewById(R.id.mite);


        final Context c = this;


        waxmoth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Lesser_wax_moth"));
                startActivity(wiki);
            }
        });
        mite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
    }}


