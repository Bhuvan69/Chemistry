package com.example.india.chemistry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


public class FifthActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView icon1;
    private ScrollView sv;
    private Animation scaleAnimation;
    private float sWidth, sHeight, CenterX, CenterY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sv = (ScrollView) findViewById(R.id.scroll);

        final ViewGroup transitionsContainer = (ViewGroup) findViewById(R.id.linear_layout);
        final TextView tv1 = (TextView) findViewById(R.id.nernst_eqation);
        final TextView tv2 = (TextView) findViewById(R.id.hardnessofwater);
        final TextView tv3 = (TextView) findViewById(R.id.Cao_in_cement_sample);
        final TextView tv4 = (TextView) findViewById(R.id.COD);
        final TextView tv5 = (TextView) findViewById(R.id.copper_in_brass);
        final TextView tv6 = (TextView) findViewById(R.id.alkalinity);
        final TextView tv7 = (TextView) findViewById(R.id.Iron);
        final TextView tv8 = (TextView) findViewById(R.id.cu_colourimetry);
        final TextView tv9 = (TextView) findViewById(R.id.potentiometry);
        final TextView tv10 = (TextView) findViewById(R.id.conductometry);
        final TextView tv11 = (TextView) findViewById(R.id.pka);
        final TextView tv12 = (TextView) findViewById(R.id.flame);
        final TextView tv13 = (TextView) findViewById(R.id.Viscosity);

        TransitionManager.beginDelayedTransition(transitionsContainer);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fifth, menu);
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


    public void nernst(View View) {
        Intent intentf1 = new Intent("com.example.india.chemistry.nernst_activity");
        startActivity(intentf1);
    }

    public void waterhardness(View View) {
        Intent intentf2 = new Intent("com.example.india.chemistry.WaterHardness");
        startActivity(intentf2);

    }

    public void determinationOfCao(View view) {
        Intent intentf3 = new Intent("com.example.india.chemistry.CementCao");
        startActivity(intentf3);
    }

    public void COD_waste_water(View view) {
        Intent intentf4 = new Intent("com.example.india.chemistry.COD");
        startActivity(intentf4);
    }

    public void C_in_B(View view) {
        Intent intentf5 = new Intent("com.example.india.chemistry.Copper_in_Brass");
        startActivity(intentf5);
    }

    public void alkalinity(View view) {
        Intent intentf6 = new Intent("com.example.india.chemistry.Alkalinity");
        startActivity(intentf6);
    }

    public void haematite_ore(View view) {
        Intent intentf7 = new Intent("com.example.india.chemistry.HaemetiteOre");
        startActivity(intentf7);
    }

    public void colourimetry_copper(View view) {
        Intent intentf8 = new Intent("com.example.india.chemistry.Colourimetric_Copper");
        startActivity(intentf8);
    }

    public void potentiometry_fas(View view) {
        Intent intentf9 = new Intent("com.example.india.chemistry.Potentiometry_fas");
        startActivity(intentf9);
    }

    public void conductometry(View view) {
        Intent intentf10 = new Intent("com.example.india.chemistry.Conductometry");
        startActivity(intentf10);
    }

    public void pka(View view) {
        Intent intentf11 = new Intent("com.example.india.chemistry.pka");
        startActivity(intentf11);
    }

    public void flame(View view) {
        Intent intentf12 = new Intent("com.example.india.chemistry.flame_photometry");
        startActivity(intentf12);
    }

    public void viscosity(View view) {
        Intent intent = new Intent("com.example.india.chemistry.Viscosity");
        startActivity(intent);
    }


}
