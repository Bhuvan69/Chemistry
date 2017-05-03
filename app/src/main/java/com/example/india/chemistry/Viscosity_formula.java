package com.example.india.chemistry;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Viscosity_formula extends android.support.v4.app.Fragment {
    private double result;


    public Viscosity_formula() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_viscosity_formula, container, false);
        Button button = (Button) v.findViewById(R.id.viscosityResultText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viscosity(v);
            }
        });

        return v;
    }

    public void viscosity(View v) {
        EditText Tl = (EditText) v.findViewById(R.id.timeOfLiquidInput);
        EditText Tw = (EditText) v.findViewById(R.id.timeOfWaterInput);
        EditText Dl = (EditText) v.findViewById(R.id.liquidDensityInput);
        EditText Dw = (EditText) v.findViewById(R.id.waterDensityInput);
        EditText Vw = (EditText) v.findViewById(R.id.waterViscosityInput);
        TextView Vr = (TextView) v.findViewById(R.id.viscosityResult);
        try {
            Double time_liquid = Double.parseDouble(Tl.getText().toString());
            Double time_water = Double.parseDouble(Tw.getText().toString());
            Double density_liquid = Double.parseDouble(Dl.getText().toString());
            Double density_water = Double.parseDouble(Dw.getText().toString());
            Double viscosity_water = Double.parseDouble(Vw.getText().toString());
            result = ((time_liquid * density_liquid) / (time_water * density_water)) / viscosity_water;
            Vr.setText(String.format("%.4f", result));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter all the fields", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
