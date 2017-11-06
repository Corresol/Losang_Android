package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Home_fragment extends Fragment {

    TextView home_text,text1,text2,text3,text4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout,
                container, false);
        HorizontalBarChart chart = (HorizontalBarChart) view.findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("");
        chart.animateXY(2000, 2000);
        chart.invalidate();





        home_text=(TextView)view.findViewById(R.id.home_text);
        text1=(TextView)view.findViewById(R.id.text1);
        text2=(TextView)view.findViewById(R.id.text2);
        text3=(TextView)view.findViewById(R.id.text3);
        text4=(TextView)view.findViewById(R.id.text4);
        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        home_text.setTypeface(face_book);
        text1.setTypeface(face_book);
        text2.setTypeface(face_book);
        text3.setTypeface(face_book);
        text4.setTypeface(face_book);
        return view;
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(60.000f, 2); // Mar
        valueSet1.add(v1e3);


        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
        valueSet2.add(v2e3);

        int[] colors = new int[] { Color.parseColor("#F39F50"),Color.parseColor("#6F7AB8"),Color.parseColor("#53A895")};


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColors(colors);
//        BarDataSet barDataSet2 = new BarDataSet(valueSet1, "Brand 2");
//        barDataSet2.setColor(Color.parseColor("#6F7AB8"));
//        BarDataSet barDataSet3 = new BarDataSet(valueSet1, "Brand 3");
//        barDataSet3.setColor(Color.parseColor("#F39F50"));
//        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
//        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        //dataSets.add(barDataSet2);
        //dataSets.add(barDataSet3);
        //dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("");
        xAxis.add("");
        xAxis.add("");

        return xAxis;
    }


}
