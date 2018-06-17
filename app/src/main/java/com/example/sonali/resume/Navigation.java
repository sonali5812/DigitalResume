package com.example.sonali.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Navigation extends AppCompatActivity{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            Toast.makeText(getApplicationContext(),"activity selected home",Toast.LENGTH_LONG).show();
            Intent home=new Intent(getApplicationContext(),HomeActivity.class);
            startActivity(home);
            return true;
        }
        if (id == R.id.action_education) {
            Toast.makeText(getApplicationContext(),"activity selected education",Toast.LENGTH_LONG).show();
            Intent education=new Intent(getApplicationContext(),Education_Qualification.class);
            startActivity(education);
            return true;
        }


        if (id == R.id.action_extra) {
            Toast.makeText(getApplicationContext(),"activity selected extra",Toast.LENGTH_LONG).show();
            Intent extra_activities=new Intent(getApplicationContext(),Extra_Activities.class);
            startActivity(extra_activities);
            return true;
        }
        if (id == R.id.action_internship) {
            Toast.makeText(getApplicationContext(),"activity selected Internships and Projects",Toast.LENGTH_LONG).show();
            Intent internship=new Intent(getApplicationContext(),Intenships_and_Projects.class);
            startActivity(internship);
            return true;
        }

        if (id == R.id.action_contactdetails) {
            Toast.makeText(getApplicationContext(),"activity selected contact",Toast.LENGTH_LONG).show();
            Intent contactdetails=new Intent(getApplicationContext(),Contact_Details.class);
            startActivity(contactdetails);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}


