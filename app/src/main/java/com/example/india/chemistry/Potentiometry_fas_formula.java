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

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


/**
 * A simple {@link Fragment} subclass.
 */
public class Potentiometry_fas_formula extends android.support.v4.app.Fragment {


    private Double r2, r3, r4, r5, r6, r7, r8, r9, r10, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;


    public Potentiometry_fas_formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_potentiometry_fas_formula, container, false);
        Button button = (Button) v.findViewById(R.id.graph2_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_graph_2(v);
            }
        });
        return v;
    }

    public void create_graph_2(View view) {
        EditText vol1 = (EditText) getActivity().findViewById(R.id.volume_1);
        EditText vol2 = (EditText) getActivity().findViewById(R.id.volume_2);
        EditText vol3 = (EditText) getActivity().findViewById(R.id.volume_3);
        EditText vol4 = (EditText) getActivity().findViewById(R.id.volume_4);
        EditText vol5 = (EditText) getActivity().findViewById(R.id.volume_5);
        EditText vol6 = (EditText) getActivity().findViewById(R.id.volume_6);
        EditText vol7 = (EditText) getActivity().findViewById(R.id.volume_7);
        EditText vol8 = (EditText) getActivity().findViewById(R.id.volume_8);
        EditText vol9 = (EditText) getActivity().findViewById(R.id.volume_9);
        EditText vol10 = (EditText) getActivity().findViewById(R.id.volume_10);

        EditText pot1 = (EditText) getActivity().findViewById(R.id.potential_1);
        EditText pot2 = (EditText) getActivity().findViewById(R.id.potential_2);
        EditText pot3 = (EditText) getActivity().findViewById(R.id.potential_3);
        EditText pot4 = (EditText) getActivity().findViewById(R.id.potential_4);
        EditText pot5 = (EditText) getActivity().findViewById(R.id.potential_5);
        EditText pot6 = (EditText) getActivity().findViewById(R.id.potential_6);
        EditText pot7 = (EditText) getActivity().findViewById(R.id.potential_7);
        EditText pot8 = (EditText) getActivity().findViewById(R.id.potential_8);
        EditText pot9 = (EditText) getActivity().findViewById(R.id.potential_9);
        EditText pot10 = (EditText) getActivity().findViewById(R.id.potential_10);

        TextView deltaE2 = (TextView) getActivity().findViewById(R.id.deltaE_2);
        TextView deltaE3 = (TextView) getActivity().findViewById(R.id.deltaE_3);
        TextView deltaE4 = (TextView) getActivity().findViewById(R.id.deltaE_4);
        TextView deltaE5 = (TextView) getActivity().findViewById(R.id.deltaE_5);
        TextView deltaE6 = (TextView) getActivity().findViewById(R.id.deltaE_6);
        TextView deltaE7 = (TextView) getActivity().findViewById(R.id.deltaE_7);
        TextView deltaE8 = (TextView) getActivity().findViewById(R.id.deltaE_8);
        TextView deltaE9 = (TextView) getActivity().findViewById(R.id.deltaE_9);
        TextView deltaE10 = (TextView) getActivity().findViewById(R.id.deltaE_10);

        TextView deltaV2 = (TextView) getActivity().findViewById(R.id.deltaV_2);
        TextView deltaV3 = (TextView) getActivity().findViewById(R.id.deltaV_3);
        TextView deltaV4 = (TextView) getActivity().findViewById(R.id.deltaV_4);
        TextView deltaV5 = (TextView) getActivity().findViewById(R.id.deltaV_5);
        TextView deltaV6 = (TextView) getActivity().findViewById(R.id.deltaV_6);
        TextView deltaV7 = (TextView) getActivity().findViewById(R.id.deltaV_7);
        TextView deltaV8 = (TextView) getActivity().findViewById(R.id.deltaV_8);
        TextView deltaV9 = (TextView) getActivity().findViewById(R.id.deltaV_9);
        TextView deltaV10 = (TextView) getActivity().findViewById(R.id.deltaV_10);

        TextView V2byE2 = (TextView) getActivity().findViewById(R.id.ratio_2);
        TextView V3byE3 = (TextView) getActivity().findViewById(R.id.ratio_3);
        TextView V4byE4 = (TextView) getActivity().findViewById(R.id.ratio_4);
        TextView V5byE5 = (TextView) getActivity().findViewById(R.id.ratio_5);
        TextView V6byE6 = (TextView) getActivity().findViewById(R.id.ratio_6);
        TextView V7byE7 = (TextView) getActivity().findViewById(R.id.ratio_7);
        TextView V8byE8 = (TextView) getActivity().findViewById(R.id.ratio_8);
        TextView V9byE9 = (TextView) getActivity().findViewById(R.id.ratio_9);
        TextView V10byE10 = (TextView) getActivity().findViewById(R.id.ratio_10);
        try {
            v1 = Double.parseDouble(vol1.getText().toString());
            v2 = Double.parseDouble(vol2.getText().toString());
            v3 = Double.parseDouble(vol3.getText().toString());
            v4 = Double.parseDouble(vol4.getText().toString());
            v5 = Double.parseDouble(vol5.getText().toString());
            v6 = Double.parseDouble(vol6.getText().toString());
            v7 = Double.parseDouble(vol7.getText().toString());
            v8 = Double.parseDouble(vol8.getText().toString());
            v9 = Double.parseDouble(vol9.getText().toString());
            v10 = Double.parseDouble(vol10.getText().toString());

            Double p1 = Double.parseDouble(pot1.getText().toString());
            Double p2 = Double.parseDouble(pot2.getText().toString());
            Double p3 = Double.parseDouble(pot3.getText().toString());
            Double p4 = Double.parseDouble(pot4.getText().toString());
            Double p5 = Double.parseDouble(pot5.getText().toString());
            Double p6 = Double.parseDouble(pot6.getText().toString());
            Double p7 = Double.parseDouble(pot7.getText().toString());
            Double p8 = Double.parseDouble(pot8.getText().toString());
            Double p9 = Double.parseDouble(pot9.getText().toString());
            Double p10 = Double.parseDouble(pot10.getText().toString());

            Double dE2 = p2 - p1;

            Double dE3 = p3 - p2;

            Double dE4 = p4 - p3;

            Double dE5 = p5 - p4;

            Double dE6 = p6 - p5;

            Double dE7 = p7 - p6;

            Double dE8 = p8 - p7;

            Double dE9 = p9 - p8;

            Double dE10 = p10 - p9;


            deltaE2.setText(String.format("%.2f", dE2));
            deltaE3.setText(String.format("%.2f", dE3));
            deltaE3.setText(String.format("%.2f", dE3));
            deltaE4.setText(String.format("%.2f", dE4));
            deltaE5.setText(String.format("%.2f", dE5));
            deltaE6.setText(String.format("%.2f", dE6));
            deltaE7.setText(String.format("%.2f", dE7));
            deltaE8.setText(String.format("%.2f", dE8));
            deltaE9.setText(String.format("%.2f", dE9));
            deltaE9.setText(String.format("%.2f", dE9));
            deltaE10.setText(String.format("%.2f", dE10));

            Double dV2 = v2 - v1;
            deltaV2.setText(String.format("%.2f", dV2));
            Double dV3 = v3 - v2;
            deltaV3.setText(String.format("%.2f", dV3));
            Double dV4 = v4 - v3;
            deltaV4.setText(String.format("%.2f", dV4));
            Double dV5 = v5 - v4;
            deltaV5.setText(String.format("%.2f", dV5));
            Double dV6 = v6 - v5;
            deltaV6.setText(String.format("%.2f", dV6));
            Double dV7 = v7 - v6;
            deltaV7.setText(String.format("%.2f", dV7));
            Double dV8 = v8 - v7;
            deltaV8.setText(String.format("%.2f", dV8));
            Double dV9 = v9 - v8;
            deltaV9.setText(String.format("%.2f", dV9));
            Double dV10 = v10 - v9;
            deltaV10.setText(String.format("%.2f", dV10));

            r2 = dE2 / dV2;
            V2byE2.setText(String.format("%.2f", r2));
            r3 = dE3 / dV3;
            V3byE3.setText(String.format("%.2f", r3));
            r4 = dE4 / dV4;
            V4byE4.setText(String.format("%.2f", r4));
            r5 = dE5 / dV5;
            V5byE5.setText(String.format("%.2f", r5));
            r6 = dE6 / dV6;
            V6byE6.setText(String.format("%.2f", r6));
            r7 = dE7 / dV7;
            V7byE7.setText(String.format("%.2f", r7));
            r8 = dE8 / dV8;
            V8byE8.setText(String.format("%.2f", r8));
            r9 = dE9 / dV9;
            V9byE9.setText(String.format("%.2f", r9));
            r10 = dE10 / dV10;
            V10byE10.setText(String.format("%.2f", r10));


        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter the required values for the graph.", Toast.LENGTH_SHORT);
            toast.show();
        }

        GraphView graph2 = (GraphView) getActivity().findViewById(R.id.potentiometry_graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 0),
                new DataPoint(v2, r2),
                new DataPoint(v3, r3),
                new DataPoint(v4, r4),
                new DataPoint(v5, r5),
                new DataPoint(v6, r6),
                new DataPoint(v7, r7),
                new DataPoint(v8, r8),
                new DataPoint(v9, r9),
                new DataPoint(v10, r10)
        });
        graph2.addSeries(series);

    }


}
