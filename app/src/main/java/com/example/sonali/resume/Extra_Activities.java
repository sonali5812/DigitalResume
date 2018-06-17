package com.example.sonali.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Extra_Activities extends Navigation {

    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        tv3=(TextView)findViewById(R.id.tv3);


        tv3.setText("EXTRA ACTIVITIES: \n\n\n\n\n1> Participated in KVS National Sports Meet in Chess." +
                "\n \n\n\n2> Participated in Space Awareness Camp IIT Kharagpur held at UIT RGPV,BHOPAL." +
                "\n\n \n\n3> Participated in technorian Nationwide Zonal Competitions of techfest IIT Bombay 2017-18." +
                "\n\n\n\n\n\nSKILLS:-    \nDancing.\n\n\n\n\n\n\n\n\n");
    }
}
