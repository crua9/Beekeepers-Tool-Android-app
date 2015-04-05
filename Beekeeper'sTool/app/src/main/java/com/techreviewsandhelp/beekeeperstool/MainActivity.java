package com.techreviewsandhelp.beekeeperstool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.b_youtube);

        Button start = (Button)findViewById(R.id.menu);
        Button help = (Button)findViewById(R.id.help);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt = new Intent(Intent.ACTION_VIEW);
                yt.setData(Uri.parse("https://www.youtube.com/playlist?list=PLioOFeHwQV5zxRaDpN-hFzvCqrWnSnADt"));
                startActivity(yt);
            }
        });



        final Context c = this;


        help.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Help.class));
                finish();
            }
        });



        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Start.class));
                finish();
            }
        });

    }





}
