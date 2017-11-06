package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Notification_fragment extends Fragment {
    TextView notification_text,text1,text2,text3,text4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notification_fragment_layout,
                container, false);
        notification_text=(TextView)view.findViewById(R.id.notification_text);
        text1=(TextView)view.findViewById(R.id.text1);
        text2=(TextView)view.findViewById(R.id.text2);
        text3=(TextView)view.findViewById(R.id.text3);
        text4=(TextView)view.findViewById(R.id.text4);
        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        notification_text.setTypeface(face_book);
        text1.setTypeface(face_book);
        text2.setTypeface(face_book);
        text3.setTypeface(face_book);
        text4.setTypeface(face_book);
        return view;
    }

}
