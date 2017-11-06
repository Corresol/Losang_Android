package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 21/2/17.
 */
public class Calendar_Fragment  extends Fragment {

    TextView calendar_text,calendar_name,calendar_date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calendarfragment_layout,
                container, false);
        calendar_text=(TextView)view.findViewById(R.id.calendar_text);
        calendar_name=(TextView)view.findViewById(R.id.calendar_name);
        calendar_date=(TextView)view.findViewById(R.id.calendar_date);

        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        Typeface face_light = Typeface.createFromAsset(getActivity().getAssets(), "fonts/light.ttf");
        calendar_text.setTypeface(face_book);
        calendar_name.setTypeface(face_book);
        calendar_date.setTypeface(face_light);

        return view;
    }
}
