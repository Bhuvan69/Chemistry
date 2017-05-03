package com.example.india.chemistry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class nernst_activity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nernst_activity);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nernst_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void compute_nernst(View view) {
        EditText E0 = (EditText) findViewById(R.id.nernst_input1);
        EditText n = (EditText) findViewById(R.id.nernst_input2);
        EditText T = (EditText) findViewById(R.id.nernst_input3);
        EditText CP = (EditText) findViewById(R.id.nernst_input4);
        EditText CR = (EditText) findViewById(R.id.nernst_input5);
        TextView Result = (TextView) findViewById(R.id.nernst_result);
        Float srp = Float.parseFloat(E0.getText().toString());
        Float moles = Float.parseFloat(n.getText().toString());
        Float temp = Float.parseFloat(T.getText().toString());
        Float products = Float.parseFloat(CP.getText().toString());
        Float reactants = Float.parseFloat(CR.getText().toString());

        double result = srp - (0.0000861733 * temp / moles) * (Math.log10((products / reactants)));

        Result.setText(String.valueOf(result));


    }

}


