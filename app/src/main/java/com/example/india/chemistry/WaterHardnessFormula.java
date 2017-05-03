package com.example.india.chemistry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class WaterHardnessFormula extends android.support.v4.app.Fragment {
    private double mol, carbonate, result;

    public WaterHardnessFormula() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_water_hardness_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.compute_molarity);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                molarity_of_edta(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.CACO3_calculation_text);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                amount_of_caco3(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.hardness_calculation);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                total_hardness(v);
            }
        });
        return v;
    }
    //Use of if-else block to manage null input to edit text view.

    public void molarity_of_edta(View v) {
        EditText weight = (EditText) getActivity().findViewById(R.id.saltWeightInput_WH);
        TextView result = (TextView) getActivity().findViewById(R.id.molarity_result);
        if (!(weight.getText().toString().equals(""))) {
            Double W = Double.parseDouble(weight.getText().toString());
            mol = (W * 4) / 372.24;
            result.setText(String.format("%.4f", mol));
        } else {
            Toast toast = Toast.makeText(getActivity(), "Please enter salt weight", Toast.LENGTH_SHORT);
            toast.show();
        }


    }

    public void amount_of_caco3(View view) {
        EditText edta_vol = (EditText) getActivity().findViewById(R.id.titration_volume_value);
        if (!(edta_vol.getText().toString().equals(""))) {
            Double vol = Double.parseDouble((edta_vol.getText().toString()));
            carbonate = (mol * vol * 100) / 1000;
            TextView result = (TextView) getActivity().findViewById(R.id.CACO3_calculation_result);
            result.setText(String.format("%.4f", carbonate));
            TextView caco3_in_25cm3 = (TextView) getActivity().findViewById(R.id.CACO3_for_25cm3);
            String string = getResources().getString(R.string.CACO3_in_25cm3);
            String string2 = getResources().getString(R.string.CACO3_in_25cm3_2);
            caco3_in_25cm3.setText(string + String.format("%.4f", carbonate) + string2);
        } else {
            Toast toast = Toast.makeText(getActivity(), "Please calculate molarity first then enter the volume of EDTA ", Toast.LENGTH_SHORT);
            toast.show();
        }


    }

    public void total_hardness(View view) {
        if (carbonate != 0) {
            result = (carbonate * 1000000) / 25;
            TextView display = (TextView) getActivity().findViewById(R.id.display_result);
            display.setText(String.format("%.4f", result));
        } else {
            Toast toast = Toast.makeText(getActivity(), "Please calculate the amount of calcium carbonate", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}

