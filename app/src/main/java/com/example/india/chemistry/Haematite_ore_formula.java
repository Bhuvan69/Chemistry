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
public class Haematite_ore_formula extends android.support.v4.app.Fragment {


    private double n, v, v10, p;


    public Haematite_ore_formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_haematite_ore_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.iron_normality);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normality_iron(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.iron_amount);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iron_amount(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.iron_percentage);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentage_iron(v);
            }
        });
        return v;
    }

    public void normality_iron(View view) {
        EditText weight = (EditText) getActivity().findViewById(R.id.iron_saltweight_input);
        TextView norm_result = (TextView) getActivity().findViewById(R.id.iron_normality_result);
        try {
            Double w = Double.parseDouble(weight.getText().toString());
            n = (w * 4) / 49;
            norm_result.setText(String.format("%.4f", n));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter salt weight", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void iron_amount(View view) {
        EditText volume = (EditText) getActivity().findViewById(R.id.iron_volume_input);
        TextView amount_result = (TextView) getActivity().findViewById(R.id.iron_amount_display);
        TextView amount_25cm3 = (TextView) getActivity().findViewById(R.id.iron_25cm3);
        TextView amount_250cm3 = (TextView) getActivity().findViewById(R.id.iron_250cm3);
        try {
            Double vol = Double.parseDouble(volume.getText().toString());
            v = (n * vol * 55.85) / 1000;
            v10 = v * 10;
            amount_result.setText(String.format("%.4f", v) + "g");
            amount_25cm3.setText(getText(R.string.iron_25cm3_text) + String.format("%.4f", v) + getText(R.string.iron_25cm3_text_2));
            amount_250cm3.setText(getText(R.string.iron_250cm3_text) + String.format("%.4f", (v10)) + getText(R.string.iron_250cm3_text_2));

        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter volume", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void percentage_iron(View view) {
        EditText H_weight = (EditText) getActivity().findViewById(R.id.iron_haemetiteweight_input);
        TextView percent = (TextView) getActivity().findViewById(R.id.iron_percentage_display);
        try {
            Double h_weight = Double.parseDouble(H_weight.getText().toString());
            p = (v10 * 100) / h_weight;
            percent.setText(String.format("%.4f", p) + "%");
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter haemetite weight", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
