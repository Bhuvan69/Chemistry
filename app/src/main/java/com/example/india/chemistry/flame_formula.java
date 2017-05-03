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

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;


/**
 * A simple {@link Fragment} subclass.
 */
public class flame_formula extends android.support.v4.app.Fragment {


    private double W1, res1, W2, res2;
    private double nr1, nr2, nr3, nr4, nr5, kr1, kr2, kr3, kr4, kr5;

    public flame_formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_flame_formula, container, false);
        Button button1 = (Button) v.findViewById(R.id.nacl_1cm);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWeightSodium(v);
            }
        });
        Button button2 = (Button) v.findViewById(R.id.kcl_1cm);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayWeightPotassium(v);
            }
        });
        Button button3 = (Button) v.findViewById(R.id.graph_button1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flameGraph1(v);
            }
        });
        Button button4 = (Button) v.findViewById(R.id.graph_button2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flameGraph2(v);
            }
        });
        return v;
    }

    public void displayWeightSodium(View v) {

        try {
            EditText weight = (EditText) getActivity().findViewById(R.id.nacl_100_input);
            TextView result = (TextView) getActivity().findViewById(R.id.nacl_1cm_result);
            W1 = Double.parseDouble(weight.getText().toString());
            res1 = (W1 * 23) / (100 * 58.5);
            result.setText(String.format("%.4f", res1));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter the weight ", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void displayWeightPotassium(View v) {
        EditText weight = (EditText) getActivity().findViewById(R.id.kcl_100_input);
        TextView result = (TextView) getActivity().findViewById(R.id.kcl_1cm_result);
        try {
            W2 = Double.parseDouble(weight.getText().toString());
            res2 = (W2 * 23) / (100 * 58.5);
            result.setText(String.format("%.4f", res2));
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter the weight ", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void flameGraph1(View v) {
        EditText NaReading1 = (EditText) getActivity().findViewById(R.id.NaReading_1);
        EditText NaReading2 = (EditText) getActivity().findViewById(R.id.NaReading_2);
        EditText NaReading3 = (EditText) getActivity().findViewById(R.id.NaReading_3);
        EditText NaReading4 = (EditText) getActivity().findViewById(R.id.NaReading_4);
        EditText NaReading5 = (EditText) getActivity().findViewById(R.id.NaReading_5);


        GraphView graph1 = (GraphView) getActivity().findViewById(R.id.graph1);

        try {
            nr1 = Double.parseDouble(NaReading1.getText().toString());
            nr2 = Double.parseDouble(NaReading2.getText().toString());
            nr3 = Double.parseDouble(NaReading3.getText().toString());
            nr4 = Double.parseDouble(NaReading4.getText().toString());
            nr5 = Double.parseDouble(NaReading5.getText().toString());
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please fill all the values for Sodium", Toast.LENGTH_SHORT);
            toast.show();
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 0),
                new DataPoint(10, nr1),
                new DataPoint(20, nr2),
                new DataPoint(30, nr3),
                new DataPoint(40, nr4),
                new DataPoint(50, nr5),

        });
        graph1.getViewport().setScrollable(true);
        graph1.getViewport().setXAxisBoundsManual(true);
        graph1.getViewport().setMinX(0.00);
        graph1.getViewport().setMaxX(60);
        series.setDrawDataPoints(true);
        graph1.addSeries(series);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(getActivity(), "Series1: On Data Point clicked: " + dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void flameGraph2(View v) {
        EditText KReading1 = (EditText) getActivity().findViewById(R.id.KReading_1);
        EditText KReading2 = (EditText) getActivity().findViewById(R.id.KReading_2);
        EditText KReading3 = (EditText) getActivity().findViewById(R.id.KReading_3);
        EditText KReading4 = (EditText) getActivity().findViewById(R.id.KReading_4);
        EditText KReading5 = (EditText) getActivity().findViewById(R.id.KReading_5);

        GraphView graph2 = (GraphView) getActivity().findViewById(R.id.graph2);
        try {
            kr1 = Double.parseDouble(KReading1.getText().toString());
            kr2 = Double.parseDouble(KReading2.getText().toString());
            kr3 = Double.parseDouble(KReading3.getText().toString());
            kr4 = Double.parseDouble(KReading4.getText().toString());
            kr5 = Double.parseDouble(KReading5.getText().toString());
        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please fill all the values for Potassium", Toast.LENGTH_SHORT);
            toast.show();
        }
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 0),
                new DataPoint(10, kr1),
                new DataPoint(20, kr2),
                new DataPoint(30, kr3),
                new DataPoint(40, kr4),
                new DataPoint(50, kr5),

        });
        graph2.getViewport().setScrollable(true);
        graph2.getViewport().setXAxisBoundsManual(true);
        graph2.getViewport().setMinX(0.00);
        graph2.getViewport().setMaxX(60);
        series2.setDrawDataPoints(true);
        graph2.addSeries(series2);
        series2.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(getActivity(), "Series1: On Data Point clicked: " + dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
