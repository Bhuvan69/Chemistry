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
public class Conductometry_Formula extends android.support.v4.app.Fragment {


    private double v1, v2, v3, v4, v5, v, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20;


    public Conductometry_Formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_conductometry__formula, container, false);
        Button button = (Button) v.findViewById(R.id.graph3_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_graph_3(v);
            }
        });
        return v;
    }

    public void create_graph_3(View view) {

        TextView vol1 = (TextView) getActivity().findViewById(R.id.vol1);
        TextView vol2 = (TextView) getActivity().findViewById(R.id.vol2);
        TextView vol3 = (TextView) getActivity().findViewById(R.id.vol3);
        TextView vol4 = (TextView) getActivity().findViewById(R.id.vol4);
        TextView vol5 = (TextView) getActivity().findViewById(R.id.vol5);
        TextView vol6 = (TextView) getActivity().findViewById(R.id.vol6);
        TextView vol7 = (TextView) getActivity().findViewById(R.id.vol7);
        TextView vol8 = (TextView) getActivity().findViewById(R.id.vol8);
        TextView vol9 = (TextView) getActivity().findViewById(R.id.vol9);
        TextView vol10 = (TextView) getActivity().findViewById(R.id.vol10);
        TextView vol11 = (TextView) getActivity().findViewById(R.id.vol11);
        TextView vol12 = (TextView) getActivity().findViewById(R.id.vol12);
        TextView vol13 = (TextView) getActivity().findViewById(R.id.vol13);
        TextView vol14 = (TextView) getActivity().findViewById(R.id.vol14);
        TextView vol15 = (TextView) getActivity().findViewById(R.id.vol15);
        TextView vol16 = (TextView) getActivity().findViewById(R.id.vol16);
        TextView vol17 = (TextView) getActivity().findViewById(R.id.vol17);
        TextView vol18 = (TextView) getActivity().findViewById(R.id.vol18);
        TextView vol19 = (TextView) getActivity().findViewById(R.id.vol19);
        TextView vol20 = (TextView) getActivity().findViewById(R.id.vol20);

        EditText conductance1 = (EditText) getActivity().findViewById(R.id.conductance1);
        EditText conductance2 = (EditText) getActivity().findViewById(R.id.conductance2);
        EditText conductance3 = (EditText) getActivity().findViewById(R.id.conductance3);
        EditText conductance4 = (EditText) getActivity().findViewById(R.id.conductance4);
        EditText conductance5 = (EditText) getActivity().findViewById(R.id.conductance5);
        EditText conductance6 = (EditText) getActivity().findViewById(R.id.conductance6);
        EditText conductance7 = (EditText) getActivity().findViewById(R.id.conductance7);
        EditText conductance8 = (EditText) getActivity().findViewById(R.id.conductance8);
        EditText conductance9 = (EditText) getActivity().findViewById(R.id.conductance9);
        EditText conductance10 = (EditText) getActivity().findViewById(R.id.conductance10);
        EditText conductance11 = (EditText) getActivity().findViewById(R.id.conductance11);
        EditText conductance12 = (EditText) getActivity().findViewById(R.id.conductance12);
        EditText conductance13 = (EditText) getActivity().findViewById(R.id.conductance13);
        EditText conductance14 = (EditText) getActivity().findViewById(R.id.conductance14);
        EditText conductance15 = (EditText) getActivity().findViewById(R.id.conductance15);
        EditText conductance16 = (EditText) getActivity().findViewById(R.id.conductance16);
        EditText conductance17 = (EditText) getActivity().findViewById(R.id.conductance17);
        EditText conductance18 = (EditText) getActivity().findViewById(R.id.conductance18);
        EditText conductance19 = (EditText) getActivity().findViewById(R.id.conductance19);
        EditText conductance20 = (EditText) getActivity().findViewById(R.id.conductance20);


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
            v11 = Double.parseDouble(vol11.getText().toString());
            v12 = Double.parseDouble(vol12.getText().toString());
            v13 = Double.parseDouble(vol13.getText().toString());
            v14 = Double.parseDouble(vol14.getText().toString());
            v15 = Double.parseDouble(vol15.getText().toString());
            v16 = Double.parseDouble(vol16.getText().toString());
            v17 = Double.parseDouble(vol17.getText().toString());
            v18 = Double.parseDouble(vol18.getText().toString());
            v19 = Double.parseDouble(vol19.getText().toString());
            v20 = Double.parseDouble(vol20.getText().toString());

            c1 = Double.parseDouble(conductance1.getText().toString());
            c2 = Double.parseDouble(conductance2.getText().toString());
            c3 = Double.parseDouble(conductance3.getText().toString());
            c4 = Double.parseDouble(conductance4.getText().toString());
            c5 = Double.parseDouble(conductance5.getText().toString());
            c6 = Double.parseDouble(conductance6.getText().toString());
            c7 = Double.parseDouble(conductance7.getText().toString());
            c8 = Double.parseDouble(conductance8.getText().toString());
            c9 = Double.parseDouble(conductance9.getText().toString());
            c10 = Double.parseDouble(conductance10.getText().toString());
            c11 = Double.parseDouble(conductance11.getText().toString());
            c12 = Double.parseDouble(conductance12.getText().toString());
            c13 = Double.parseDouble(conductance13.getText().toString());
            c14 = Double.parseDouble(conductance14.getText().toString());
            c15 = Double.parseDouble(conductance15.getText().toString());
            c16 = Double.parseDouble(conductance16.getText().toString());
            c17 = Double.parseDouble(conductance17.getText().toString());
            c18 = Double.parseDouble(conductance18.getText().toString());
            c19 = Double.parseDouble(conductance19.getText().toString());
            c20 = Double.parseDouble(conductance20.getText().toString());


        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please fill all the values", Toast.LENGTH_SHORT);
            toast.show();
        }
        GraphView graph3 = (GraphView) getActivity().findViewById(R.id.conductometry_graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(v1, c1),
                new DataPoint(v2, c2),
                new DataPoint(v3, c3),
                new DataPoint(v4, c4),
                new DataPoint(v5, c5),
                new DataPoint(v6, c6),
                new DataPoint(v7, c7),
                new DataPoint(v8, c8),
                new DataPoint(v9, c9),
                new DataPoint(v10, c10),
                new DataPoint(v11, c11),
                new DataPoint(v12, c12),
                new DataPoint(v13, c13),
                new DataPoint(v14, c14),
                new DataPoint(v15, c15),
                new DataPoint(v16, c16),
                new DataPoint(v17, c17),
                new DataPoint(v18, c18),
                new DataPoint(v19, c19),
                new DataPoint(v20, c20)
        });
        graph3.addSeries(series);
    }


}
