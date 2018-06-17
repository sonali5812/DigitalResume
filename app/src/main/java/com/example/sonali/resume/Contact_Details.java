package com.example.sonali.resume;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contact_Details extends Navigation {
    Button b1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactdetails);
        tv=(TextView)findViewById(R.id.tv2);
        b1 = (Button) findViewById(R.id.b1);
    }


    public void call(View view) {
       // String str = b1.getText().toString();
        String str="9691162531";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + str));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(intent);
                }



                public void email(View view){
                String[] to={""};
                String[] cc={""};

                Intent intent1=new Intent(Intent.ACTION_SEND);

                intent1.setData(Uri.parse("mail to:"));
                intent1.setType("text/plain");
                    intent1.putExtra(Intent.EXTRA_EMAIL,to);
                    intent1.putExtra(Intent.EXTRA_CC,cc);
                    intent1.putExtra(Intent.EXTRA_SUBJECT,"subject:");
                    intent1.putExtra(Intent.EXTRA_TEXT,"Email message..");

                    startActivity(intent1);
                    finish();
                }


        }
