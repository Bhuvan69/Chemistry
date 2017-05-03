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
public class COD_formula extends android.support.v4.app.Fragment {


    private double norm, vol1, vol2, amount, res;


    public COD_formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cod_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.Normality_COD);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normality(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.amount_of_oxygen);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oxygen_amount(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.Cod_result);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_cod(v);
            }
        });
        return v;

    }

    public void normality(View view) {
        EditText weight = (EditText) getActivity().findViewById(R.id.salt_weight_input);
        TextView result = (TextView) getActivity().findViewById(R.id.Normality_result_COD);
        try {
            Double W = Double.parseDouble(weight.getText().toString());
            norm = (W * 4) / 392.24;
            result.setText(String.format("%.4f", norm));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter salt weight", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void oxygen_amount(View view) {
        EditText blank_titration = (EditText) getActivity().findViewById(R.id.blank_titration_input);
        EditText fas_volume = (EditText) getActivity().findViewById(R.id.FAS_volume_input);
        try {
            vol1 = Double.parseDouble(blank_titration.getText().toString());
            vol2 = Double.parseDouble(fas_volume.getText().toString());
            TextView result = (TextView) getActivity().findViewById(R.id.amount_of_oxygen_result);
            amount = (norm * (vol1 - vol2) * 8) / 1000;
            result.setText(String.format("%.4f", amount));
            TextView oxygen_25cm3 = (TextView) getActivity().findViewById(R.id.oxygen_for_25cm3);
            String string1 = getString(R.string.oxygen_in_25cm3);
            String string2 = getString(R.string.oxygen_in_25cm3_2);
            oxygen_25cm3.setText(string1 + String.format("%.4f", amount) + string2);

        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter Titration readings.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void result_cod(View view) {
        try {
            TextView result = (TextView) getActivity().findViewById(R.id.cod_result_display);
            res = ((amount * 1000) / 25);
            res = res * 1000;
            result.setText(String.format("%.4f", res));

        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please calculte amount of Oxygen", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
