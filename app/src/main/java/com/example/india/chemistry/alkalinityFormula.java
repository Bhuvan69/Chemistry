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
 * Use the {@link alkalinityFormula} factory method to
 * create an instance of this fragment.
 */
public class alkalinityFormula extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private double amount, amount_litre, total;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment alkalinityFormula.
     */
    // TODO: Rename and change types and number of parameters
    public alkalinityFormula() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alkalinity_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.amount_of_CACO3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                caco3_amount(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.CACO3_litre);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                caco3_litre(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.alkalinity_result);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                alkalinity_result(v);
            }
        });
        return v;
    }

    public void caco3_amount(View view) {
        EditText volume = (EditText) getActivity().findViewById(R.id.volume_of_HCL_value);
        EditText normality = (EditText) getActivity().findViewById(R.id.Normality_of_HCL_value);
        try {
            Double vol = Double.parseDouble(volume.getText().toString());
            Double norm = Double.parseDouble(normality.getText().toString());
            amount = (norm * vol * 50) / 1000;
            TextView display_amount = (TextView) getActivity().findViewById(R.id.amount_of_CACO3_result);
            display_amount.setText(String.format("%.4f", amount));
            TextView oxygen_amount = (TextView) getActivity().findViewById(R.id.oxygen_equivalent);
            oxygen_amount.setText(getText(R.string.oxygen_equivalent_text) + String.format("%.4f", amount) + getText(R.string.oxygen_equivalent_text_2));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter values for normality and volume of HCL.", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void caco3_litre(View view) {
        try {
            amount_litre = (amount * 1000) / 25;
            TextView display = (TextView) getActivity().findViewById(R.id.CACO3_litre_result);
            display.setText(String.format("%.4f", amount_litre));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please calculate calcium carbonate for the titrated volume.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void alkalinity_result(View view) {
        try {
            TextView result = (TextView) getActivity().findViewById(R.id.alkalinity_result_display);
            total = amount_litre * 1000;
            result.setText(String.format("%.4f", total));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please calculate all the above values.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
