package com.example.sonali.resume;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends Navigation {
        TextView tv1;
    ImageView iv1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        iv1=(ImageView)findViewById(R.id.iv1);
        tv1.setText("SONALI AGRAWAL \n GENDER: FEMALE \n DOB:15-06-1998\n\n\n\n");
        tv2.setText("\n\n\n\n\n\n\nCARRIER OBJECTIVE: \n\n To work with a company where my knowledge is used as well as enhanced.");
    }


        }
