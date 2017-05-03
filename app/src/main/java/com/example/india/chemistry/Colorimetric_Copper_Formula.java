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
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;


/**
 * A simple {@link Fragment} subclass.
 */
public class Colorimetric_Copper_Formula extends android.support.v4.app.Fragment {


    private double W, res, amount;
    private double w1, w2, w3, w4, w5, w6, w7, OD1, OD2, OD3, OD4, OD5, OD6, OD7;

    public Colorimetric_Copper_Formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_colorimetric__copper__formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.weight_1cm_CUSO4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight_1cm3(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.copper_1cm3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copper_1cm3(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.graph_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_graph(v);
            }
        });
        return v;
    }

    public void weight_1cm3(View view) {
        EditText weight = (EditText) getActivity().findViewById(R.id.weight_input_CUSO4);
        TextView weight_result = (TextView) getActivity().findViewById(R.id.weight_1cm3_result);
        try {
            W = Double.parseDouble(weight.getText().toString());
            res = W / 100;
            weight_result.setText(String.format("%.4f", res));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter the weight ", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void copper_1cm3(View view) {
        TextView copper_result = (TextView) getActivity().findViewById(R.id.copper_1cm3_result);
        try {
            amount = (W * 63.54) / (100 * 249.54);
            copper_result.setText(String.format("%.4f", amount));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter the weight", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void create_graph(View view) {
        TextView weight1 = (TextView) getActivity().findViewById(R.id.table_weight_1);
        TextView weight2 = (TextView) getActivity().findViewById(R.id.table_weight_2);
        TextView weight3 = (TextView) getActivity().findViewById(R.id.table_weight_3);
        TextView weight4 = (TextView) getActivity().findViewById(R.id.table_weight_4);
        TextView weight5 = (TextView) getActivity().findViewById(R.id.table_weight_5);
        TextView weight6 = (TextView) getActivity().findViewById(R.id.table_weight_6);
        EditText weight7 = (EditText) getActivity().findViewById(R.id.table_weight_7);

        EditText od1 = (EditText) getActivity().findViewById(R.id.table_od_1);
        EditText od2 = (EditText) getActivity().findViewById(R.id.table_od_2);
        EditText od3 = (EditText) getActivity().findViewById(R.id.table_od_3);
        EditText od4 = (EditText) getActivity().findViewById(R.id.table_od_4);
        EditText od5 = (EditText) getActivity().findViewById(R.id.table_od_5);
        EditText od6 = (EditText) getActivity().findViewById(R.id.table_od_6);
        EditText od7 = (EditText) getActivity().findViewById(R.id.table_od_7);
        GraphView graph1 = (GraphView) getActivity().findViewById(R.id.graph);
        try {
            w1 = W * 2;
            w2 = W * 4;
            w3 = W * 6;
            w4 = W * 8;
            w5 = W * 10;
            w7 = Double.parseDouble(weight7.getText().toString());
            weight1.setText(String.format("%.2f", w1));
            weight2.setText(String.format("%.2f", w2));
            weight3.setText(String.format("%.2f", w3));
            weight4.setText(String.format("%.2f", w4));
            weight5.setText(String.format("%.2f", w5));

            OD1 = Double.parseDouble(od1.getText().toString());
            OD2 = Double.parseDouble(od2.getText().toString());
            OD3 = Double.parseDouble(od3.getText().toString());
            OD4 = Double.parseDouble(od4.getText().toString());
            OD5 = Double.parseDouble(od5.getText().toString());
            OD6 = Double.parseDouble(od6.getText().toString());
            OD7 = Double.parseDouble(od7.getText().toString());
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please fill in all the values for the table.", Toast.LENGTH_SHORT);
            toast.show();
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 0),
                new DataPoint(2, OD1),
                new DataPoint(4, OD2),
                new DataPoint(6, OD3),
                new DataPoint(8, OD4),
                new DataPoint(10, OD5),

        });
        graph1.getViewport().setScrollable(true);
        graph1.getViewport().setXAxisBoundsManual(true);
        graph1.getViewport().setMinX(0.00);
        graph1.getViewport().setMaxX(14);
        series.setDrawDataPoints(true);
        graph1.addSeries(series);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(getActivity(), "Series1: On Data Point clicked: " + dataPoint, Toast.LENGTH_SHORT).show();
            }
        });


    }


}
