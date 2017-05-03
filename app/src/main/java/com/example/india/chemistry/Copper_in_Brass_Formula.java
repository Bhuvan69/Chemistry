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
public class Copper_in_Brass_Formula extends android.support.v4.app.Fragment {


    private double w, n, v, amount, result;


    public Copper_in_Brass_Formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_copper_in__brass__formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.copper_equivalent_vcm3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount_of_copper(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.percentage_of_copper_trial1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentage(v);
            }
        });
        return v;
    }

    public void amount_of_copper(View view) {

        EditText normaity = (EditText) getActivity().findViewById(R.id.CinB_normality_input);
        EditText volume = (EditText) getActivity().findViewById(R.id.NA2SO3_volume_input);
        TextView amount_result = (TextView) getActivity().findViewById(R.id.amount_of_copper_result_trial);
        try {

            n = Double.parseDouble(normaity.getText().toString());
            v = Double.parseDouble(volume.getText().toString());
            amount = (n * v * 63.54) / 1000;
            amount_result.setText(String.format("%.4f", amount));

        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter values for normality and volume", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void percentage(View view) {
        EditText weight = (EditText) getActivity().findViewById(R.id.CinB_trial1_weight_input);
        TextView result_display = (TextView) getActivity().findViewById(R.id.percentage_of_copper_result_trial1);
        try {
            w = Double.parseDouble(weight.getText().toString());
            result = (amount * 100) / w;
            result_display.setText(String.format("%.4f", result));

        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter value for weight", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}



