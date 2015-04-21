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

        /**
         * Need to add links
         */
        ImageButton americanfoul = (ImageButton)findViewById(R.id.Afoulbrood);
        ImageButton efoul = (ImageButton)findViewById(R.id.Efoulbrood);
        ImageButton chalk = (ImageButton)findViewById(R.id.Chalkbrood);
        ImageButton sacbrood = (ImageButton)findViewById(R.id.Sacbrood);
        ImageButton nosema = (ImageButton)findViewById(R.id.Nosema);
        ImageButton beelouse = (ImageButton)findViewById(R.id.BeeLouse);
        ImageButton ants = (ImageButton)findViewById(R.id.Ants);
        ImageButton hivebeetle = (ImageButton)findViewById(R.id.SmallHiveBeetle);
        ImageButton tmite = (ImageButton)findViewById(R.id.TrachealMite);
        /**
         *
         */


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
        /**
         * Add links to the following
         */
        americanfoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        efoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        chalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        sacbrood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        nosema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        beelouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        ants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        hivebeetle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
        tmite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse("http://en.wikipedia.org/wiki/Varroa_destructor"));
                startActivity(wiki);
            }
        });
    }}


