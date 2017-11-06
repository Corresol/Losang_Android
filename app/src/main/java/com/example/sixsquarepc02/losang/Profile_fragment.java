package com.example.sixsquarepc02.losang;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Profile_fragment extends Fragment {

    TextView profile_text,name_text,phonenumber_text,address_text,postal_text,city_text;
    EditText name_edit,phone_edit,address_edit,postal_edit,city_edit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_fragment_layout,
                container, false);
        profile_text=(TextView)view.findViewById(R.id.profile_text);
        name_text=(TextView)view.findViewById(R.id.usernametext);
        phonenumber_text=(TextView)view.findViewById(R.id.phonenumber_text);
        address_text=(TextView)view.findViewById(R.id.address_text);
        postal_text=(TextView)view.findViewById(R.id.postal_text);
        city_text=(TextView)view.findViewById(R.id.city_text);

        name_edit=(EditText)view.findViewById(R.id.usernameedit);
        phone_edit=(EditText)view.findViewById(R.id.phonenumber_edit);
        address_edit=(EditText)view.findViewById(R.id.address_edit);
        postal_edit=(EditText)view.findViewById(R.id.postal_edit);
        city_edit=(EditText)view.findViewById(R.id.city_edit);

        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        Typeface face_light = Typeface.createFromAsset(getActivity().getAssets(), "fonts/light.ttf");

        name_text.setTypeface(face_light);
        phonenumber_text.setTypeface(face_light);
        address_text.setTypeface(face_light);
        postal_text.setTypeface(face_light);
        city_text.setTypeface(face_light);

        city_edit.setTypeface(face_book);
        profile_text.setTypeface(face_book);
        phone_edit.setTypeface(face_book);
        address_edit.setTypeface(face_book);
        postal_edit.setTypeface(face_book);
        name_edit.setTypeface(face_book);
        return view;
    }
}
