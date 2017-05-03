package com.example.india.chemistry;


import android.app.Fragment;
import android.os.Bundle;
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
public class CementCaoFormula extends android.support.v4.app.Fragment {


    private double mol, calcium;


    public CementCaoFormula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cement_cao_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.compute_molarity_Cao);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                molarity_of_edta_Cao(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.CaO_calculation_text);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount_of_cao(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.CaO_percent_compute);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cao_percent(v);
            }
        });
        return v;
    }
    //Usage of Exceptions to handle nul input entry.

    public void molarity_of_edta_Cao(View view) {
        EditText weight = (EditText) getActivity().findViewById(R.id.saltWeightInput_Cao);
        TextView result = (TextView) getActivity().findViewById(R.id.molarity_result_Cao);
        try {
            Double W = Double.parseDouble(weight.getText().toString());
            mol = (W * 4) / 372.24;
            result.setText(String.format("%.4f", mol));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter salt weight", Toast.LENGTH_SHORT);
            toast.show();
        }


    }

    public void amount_of_cao(View view) {
        EditText edta_vol = (EditText) getActivity().findViewById(R.id.CaO_titration_volume_value);
        try {
            Double vol = Double.parseDouble((edta_vol.getText().toString()));
            calcium = (mol * vol * 56.08) / 1000;

            TextView result = (TextView) getActivity().findViewById(R.id.CaO_calculation_result);
            result.setText(String.format("%.4f", calcium));
            TextView cao_in_25cm3 = (TextView) getActivity().findViewById(R.id.CaO_for_25cm3);
            String string = getResources().getString(R.string.CaO_in_25cm3);
            String string2 = getResources().getString(R.string.CaO_in_25cm3_2);
            cao_in_25cm3.setText(string + String.format("%.4f", calcium) + string2);
            TextView cao_in_250cm3 = (TextView) getActivity().findViewById(R.id.CaO_for_250cm3);
            String string3 = getResources().getString(R.string.CaO_in_250cm3);
            String string4 = getResources().getString(R.string.CaO_in_250cm3_2);
            cao_in_250cm3.setText(string3 + String.format("%.4f", (calcium * 10)) + string4);
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please calculate molarity first then enter the volume of EDTA ", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void cao_percent(View view) {
        EditText cement_weight = (EditText) getActivity().findViewById(R.id.Cement_weight_in_Cao_value);
        try {
            Double weight = Double.parseDouble(cement_weight.getText().toString());
            Double percent = ((calcium * 10) * 100) / weight;
            TextView result = (TextView) getActivity().findViewById(R.id.CaO_result);
            result.setText(String.format("%.4f", percent));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter wight of cement dissolved ", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
