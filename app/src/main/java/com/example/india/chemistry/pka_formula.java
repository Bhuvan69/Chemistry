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
public class pka_formula extends android.support.v4.app.Fragment {


    private double v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20;
    private double ph1, ph2, ph3, ph4, ph5, ph6, ph7, ph8, ph9, ph10, ph11, ph12, ph13, ph14, ph15, ph16, ph17, ph18;
    private double dph1, dph2, dph3, dph4, dph5, dph6, dph7, dph8, dph9, dph10, dph11, dph12, dph13, dph14, dph15, dph16, dph17, dph18;
    private double r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18;

    public pka_formula() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pka_formula, container, false);
        Button button = (Button) v.findViewById(R.id.graph4_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_graph_4(v);
            }
        });
        return v;
    }

    public void create_graph_4(View view) {

        TextView pka_vol1 = (TextView) getActivity().findViewById(R.id.pka_vol1);
        TextView pka_vol2 = (TextView) getActivity().findViewById(R.id.pka_vol2);
        TextView pka_vol3 = (TextView) getActivity().findViewById(R.id.pka_vol3);
        TextView pka_vol4 = (TextView) getActivity().findViewById(R.id.pka_vol4);
        TextView pka_vol5 = (TextView) getActivity().findViewById(R.id.pka_vol5);
        TextView pka_vol6 = (TextView) getActivity().findViewById(R.id.pka_vol6);
        TextView pka_vol7 = (TextView) getActivity().findViewById(R.id.pka_vol7);
        TextView pka_vol8 = (TextView) getActivity().findViewById(R.id.pka_vol8);
        TextView pka_vol9 = (TextView) getActivity().findViewById(R.id.pka_vol9);
        TextView pka_vol10 = (TextView) getActivity().findViewById(R.id.pka_vol10);
        TextView pka_vol11 = (TextView) getActivity().findViewById(R.id.pka_vol11);
        TextView pka_vol12 = (TextView) getActivity().findViewById(R.id.pka_vol12);
        TextView pka_vol13 = (TextView) getActivity().findViewById(R.id.pka_vol13);
        TextView pka_vol14 = (TextView) getActivity().findViewById(R.id.pka_vol14);
        TextView pka_vol15 = (TextView) getActivity().findViewById(R.id.pka_vol15);
        TextView pka_vol16 = (TextView) getActivity().findViewById(R.id.pka_vol16);
        TextView pka_vol17 = (TextView) getActivity().findViewById(R.id.pka_vol17);
        TextView pka_vol18 = (TextView) getActivity().findViewById(R.id.pka_vol18);

        EditText ph_value1 = (EditText) getActivity().findViewById(R.id.ph_value1);
        EditText ph_value2 = (EditText) getActivity().findViewById(R.id.ph_value2);
        EditText ph_value3 = (EditText) getActivity().findViewById(R.id.ph_value3);
        EditText ph_value4 = (EditText) getActivity().findViewById(R.id.ph_value4);
        EditText ph_value5 = (EditText) getActivity().findViewById(R.id.ph_value5);
        EditText ph_value6 = (EditText) getActivity().findViewById(R.id.ph_value6);
        EditText ph_value7 = (EditText) getActivity().findViewById(R.id.ph_value7);
        EditText ph_value8 = (EditText) getActivity().findViewById(R.id.ph_value8);
        EditText ph_value9 = (EditText) getActivity().findViewById(R.id.ph_value9);
        EditText ph_value10 = (EditText) getActivity().findViewById(R.id.ph_value10);
        EditText ph_value11 = (EditText) getActivity().findViewById(R.id.ph_value11);
        EditText ph_value12 = (EditText) getActivity().findViewById(R.id.ph_value12);
        EditText ph_value13 = (EditText) getActivity().findViewById(R.id.ph_value13);
        EditText ph_value14 = (EditText) getActivity().findViewById(R.id.ph_value14);
        EditText ph_value15 = (EditText) getActivity().findViewById(R.id.ph_value15);
        EditText ph_value16 = (EditText) getActivity().findViewById(R.id.ph_value16);
        EditText ph_value17 = (EditText) getActivity().findViewById(R.id.ph_value17);
        EditText ph_value18 = (EditText) getActivity().findViewById(R.id.ph_value18);

        TextView delta_ph1 = (TextView) getActivity().findViewById(R.id.delta_ph1);
        TextView delta_ph2 = (TextView) getActivity().findViewById(R.id.delta_ph2);
        TextView delta_ph3 = (TextView) getActivity().findViewById(R.id.delta_ph3);
        TextView delta_ph4 = (TextView) getActivity().findViewById(R.id.delta_ph4);
        TextView delta_ph5 = (TextView) getActivity().findViewById(R.id.delta_ph5);
        TextView delta_ph6 = (TextView) getActivity().findViewById(R.id.delta_ph6);
        TextView delta_ph7 = (TextView) getActivity().findViewById(R.id.delta_ph7);
        TextView delta_ph8 = (TextView) getActivity().findViewById(R.id.delta_ph8);
        TextView delta_ph9 = (TextView) getActivity().findViewById(R.id.delta_ph9);
        TextView delta_ph10 = (TextView) getActivity().findViewById(R.id.delta_ph10);
        TextView delta_ph11 = (TextView) getActivity().findViewById(R.id.delta_ph11);
        TextView delta_ph12 = (TextView) getActivity().findViewById(R.id.delta_ph12);
        TextView delta_ph13 = (TextView) getActivity().findViewById(R.id.delta_ph13);
        TextView delta_ph14 = (TextView) getActivity().findViewById(R.id.delta_ph14);
        TextView delta_ph15 = (TextView) getActivity().findViewById(R.id.delta_ph15);
        TextView delta_ph16 = (TextView) getActivity().findViewById(R.id.delta_ph16);
        TextView delta_ph17 = (TextView) getActivity().findViewById(R.id.delta_ph17);
        TextView delta_ph18 = (TextView) getActivity().findViewById(R.id.delta_ph18);

        TextView delta_volume1 = (TextView) getActivity().findViewById(R.id.delta_volume1);
        TextView delta_volume2 = (TextView) getActivity().findViewById(R.id.delta_volume2);
        TextView delta_volume3 = (TextView) getActivity().findViewById(R.id.delta_volume3);
        TextView delta_volume4 = (TextView) getActivity().findViewById(R.id.delta_volume4);
        TextView delta_volume5 = (TextView) getActivity().findViewById(R.id.delta_volume5);
        TextView delta_volume6 = (TextView) getActivity().findViewById(R.id.delta_volume6);
        TextView delta_volume7 = (TextView) getActivity().findViewById(R.id.delta_volume7);
        TextView delta_volume8 = (TextView) getActivity().findViewById(R.id.delta_volume8);
        TextView delta_volume9 = (TextView) getActivity().findViewById(R.id.delta_volume9);
        TextView delta_volume10 = (TextView) getActivity().findViewById(R.id.delta_volume10);
        TextView delta_volume11 = (TextView) getActivity().findViewById(R.id.delta_volume11);
        TextView delta_volume12 = (TextView) getActivity().findViewById(R.id.delta_volume12);
        TextView delta_volume13 = (TextView) getActivity().findViewById(R.id.delta_volume13);
        TextView delta_volume14 = (TextView) getActivity().findViewById(R.id.delta_volume14);
        TextView delta_volume15 = (TextView) getActivity().findViewById(R.id.delta_volume15);
        TextView delta_volume16 = (TextView) getActivity().findViewById(R.id.delta_volume16);
        TextView delta_volume17 = (TextView) getActivity().findViewById(R.id.delta_volume17);
        TextView delta_volume18 = (TextView) getActivity().findViewById(R.id.delta_volume18);

        TextView pka_ratio1 = (TextView) getActivity().findViewById(R.id.pka_ratio1);
        TextView pka_ratio2 = (TextView) getActivity().findViewById(R.id.pka_ratio2);
        TextView pka_ratio3 = (TextView) getActivity().findViewById(R.id.pka_ratio3);
        TextView pka_ratio4 = (TextView) getActivity().findViewById(R.id.pka_ratio4);
        TextView pka_ratio5 = (TextView) getActivity().findViewById(R.id.pka_ratio5);
        TextView pka_ratio6 = (TextView) getActivity().findViewById(R.id.pka_ratio6);
        TextView pka_ratio7 = (TextView) getActivity().findViewById(R.id.pka_ratio7);
        TextView pka_ratio8 = (TextView) getActivity().findViewById(R.id.pka_ratio8);
        TextView pka_ratio9 = (TextView) getActivity().findViewById(R.id.pka_ratio9);
        TextView pka_ratio10 = (TextView) getActivity().findViewById(R.id.pka_ratio10);
        TextView pka_ratio11 = (TextView) getActivity().findViewById(R.id.pka_ratio11);
        TextView pka_ratio12 = (TextView) getActivity().findViewById(R.id.pka_ratio12);
        TextView pka_ratio13 = (TextView) getActivity().findViewById(R.id.pka_ratio13);
        TextView pka_ratio14 = (TextView) getActivity().findViewById(R.id.pka_ratio14);
        TextView pka_ratio15 = (TextView) getActivity().findViewById(R.id.pka_ratio15);
        TextView pka_ratio16 = (TextView) getActivity().findViewById(R.id.pka_ratio16);
        TextView pka_ratio17 = (TextView) getActivity().findViewById(R.id.pka_ratio17);
        TextView pka_ratio18 = (TextView) getActivity().findViewById(R.id.pka_ratio18);

        try {
            v1 = Double.parseDouble(pka_vol1.getText().toString());
            v2 = Double.parseDouble(pka_vol2.getText().toString());
            v3 = Double.parseDouble(pka_vol3.getText().toString());
            v4 = Double.parseDouble(pka_vol4.getText().toString());
            v5 = Double.parseDouble(pka_vol5.getText().toString());
            v6 = Double.parseDouble(pka_vol6.getText().toString());
            v7 = Double.parseDouble(pka_vol7.getText().toString());
            v8 = Double.parseDouble(pka_vol8.getText().toString());
            v9 = Double.parseDouble(pka_vol9.getText().toString());
            v10 = Double.parseDouble(pka_vol10.getText().toString());
            v11 = Double.parseDouble(pka_vol11.getText().toString());
            v12 = Double.parseDouble(pka_vol12.getText().toString());
            v13 = Double.parseDouble(pka_vol13.getText().toString());
            v14 = Double.parseDouble(pka_vol14.getText().toString());
            v15 = Double.parseDouble(pka_vol15.getText().toString());
            v16 = Double.parseDouble(pka_vol16.getText().toString());
            v17 = Double.parseDouble(pka_vol17.getText().toString());
            v18 = Double.parseDouble(pka_vol18.getText().toString());


            ph1 = Double.parseDouble((ph_value1.getText().toString()));
            ph2 = Double.parseDouble((ph_value2.getText().toString()));
            ph3 = Double.parseDouble((ph_value3.getText().toString()));
            ph4 = Double.parseDouble((ph_value4.getText().toString()));
            ph5 = Double.parseDouble((ph_value5.getText().toString()));
            ph6 = Double.parseDouble((ph_value6.getText().toString()));
            ph7 = Double.parseDouble((ph_value7.getText().toString()));
            ph8 = Double.parseDouble((ph_value8.getText().toString()));
            ph9 = Double.parseDouble((ph_value9.getText().toString()));
            ph10 = Double.parseDouble((ph_value10.getText().toString()));
            ph11 = Double.parseDouble((ph_value11.getText().toString()));
            ph12 = Double.parseDouble((ph_value12.getText().toString()));
            ph13 = Double.parseDouble((ph_value13.getText().toString()));
            ph14 = Double.parseDouble((ph_value14.getText().toString()));
            ph15 = Double.parseDouble((ph_value15.getText().toString()));
            ph16 = Double.parseDouble((ph_value16.getText().toString()));
            ph17 = Double.parseDouble((ph_value17.getText().toString()));
            ph18 = Double.parseDouble((ph_value18.getText().toString()));

            dph1 = 0.0;
            dph2 = ph2 - ph1;
            dph3 = ph3 - ph2;
            dph4 = ph4 - ph3;
            dph5 = ph5 - ph6;
            dph6 = ph6 - ph5;
            dph7 = ph7 - ph6;
            dph8 = ph8 - ph7;
            dph9 = ph9 - ph8;
            dph10 = ph10 - ph9;
            dph11 = ph11 - ph10;
            dph12 = ph12 - ph11;
            dph13 = ph13 - ph12;
            dph14 = ph14 - ph13;
            dph15 = ph15 - ph14;
            dph16 = ph16 - ph15;
            dph17 = ph17 - ph16;
            dph18 = ph18 - ph17;

            delta_ph1.setText(String.format("%.2f", dph1));
            delta_ph2.setText(String.format("%.2f", dph2));
            delta_ph3.setText(String.format("%.2f", dph3));
            delta_ph4.setText(String.format("%.2f", dph4));
            delta_ph5.setText(String.format("%.2f", dph5));
            delta_ph6.setText(String.format("%.2f", dph6));
            delta_ph7.setText(String.format("%.2f", dph7));
            delta_ph8.setText(String.format("%.2f", dph8));
            delta_ph9.setText(String.format("%.2f", dph9));
            delta_ph10.setText(String.format("%.2f", dph10));
            delta_ph11.setText(String.format("%.2f", dph11));
            delta_ph12.setText(String.format("%.2f", dph12));
            delta_ph13.setText(String.format("%.2f", dph13));
            delta_ph14.setText(String.format("%.2f", dph14));
            delta_ph15.setText(String.format("%.2f", dph15));
            delta_ph16.setText(String.format("%.2f", dph16));
            delta_ph17.setText(String.format("%.2f", dph17));
            delta_ph18.setText(String.format("%.2f", dph18));

            pka_vol1.setText("0.5");
            pka_vol2.setText("0.5");
            pka_vol3.setText("0.5");
            pka_vol4.setText("0.5");
            pka_vol5.setText("0.5");
            pka_vol6.setText("0.5");
            pka_vol7.setText("0.5");
            pka_vol8.setText("0.5");
            pka_vol9.setText("0.5");
            pka_vol10.setText("0.5");
            pka_vol11.setText("0.5");
            pka_vol12.setText("0.5");
            pka_vol13.setText("0.5");
            pka_vol14.setText("0.5");
            pka_vol15.setText("0.5");
            pka_vol16.setText("0.5");
            pka_vol17.setText("0.5");
            pka_vol18.setText("0.5");

            r2 = dph2 / 0.5;
            r3 = dph3 / 0.5;
            r4 = dph4 / 0.5;
            r5 = dph5 / 0.5;
            r6 = dph6 / 0.5;
            r7 = dph7 / 0.5;
            r8 = dph8 / 0.5;
            r9 = dph9 / 0.5;
            r10 = dph10 / 0.5;
            r11 = dph11 / 0.5;
            r12 = dph12 / 0.5;
            r13 = dph13 / 0.5;
            r14 = dph14 / 0.5;
            r15 = dph15 / 0.5;
            r16 = dph16 / 0.5;
            r17 = dph17 / 0.5;
            r18 = dph18 / 0.5;

            pka_ratio1.setText("0");
            pka_ratio2.setText(String.format("%.2f", r2));
            pka_ratio3.setText(String.format("%.2f", r3));
            pka_ratio4.setText(String.format("%.2f", r4));
            pka_ratio5.setText(String.format("%.2f", r5));
            pka_ratio6.setText(String.format("%.2f", r6));
            pka_ratio7.setText(String.format("%.2f", r7));
            pka_ratio8.setText(String.format("%.2f", r8));
            pka_ratio9.setText(String.format("%.2f", r9));
            pka_ratio10.setText(String.format("%.2f", r10));
            pka_ratio11.setText(String.format("%.2f", r11));
            pka_ratio12.setText(String.format("%.2f", r12));
            pka_ratio13.setText(String.format("%.2f", r13));
            pka_ratio14.setText(String.format("%.2f", r14));
            pka_ratio15.setText(String.format("%.2f", r15));
            pka_ratio16.setText(String.format("%.2f", r16));
            pka_ratio17.setText(String.format("%.2f", r17));
            pka_ratio18.setText(String.format("%.2f", r18));


        } catch (NumberFormatException e) {
            Toast toast = Toast.makeText(getActivity(), "Please enter all the values", Toast.LENGTH_SHORT);
            toast.show();

        }

        GraphView graph1 = (GraphView) getActivity().findViewById(R.id.pka_graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(v1, r1),
                new DataPoint(v2, r2),
                new DataPoint(v3, r3),
                new DataPoint(v4, r4),
                new DataPoint(v5, r5),
                new DataPoint(v6, r6),
                new DataPoint(v7, r7),
                new DataPoint(v8, r8),
                new DataPoint(v9, r9),
                new DataPoint(v10, r10),
                new DataPoint(v11, r11),
                new DataPoint(v12, r12),
                new DataPoint(v13, r13),
                new DataPoint(v14, r14),
                new DataPoint(v15, r15),
                new DataPoint(v16, r16),
                new DataPoint(v17, r17),
                new DataPoint(v18, r18)

        });
        graph1.addSeries(series);

    }


}
