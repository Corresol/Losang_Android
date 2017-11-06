package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Chat_Fragment extends Fragment {
    FragmentManager fm;
    RelativeLayout searchbar,searchimg,cancel,recent_parent,all_parent;
    LinearLayout recent,recent_under,all,all_under;
    TextView chat_text,recent_text,all_text,recent_name,recent_msg,recent_time,recent_date,all_name,all_msg;
    EditText search_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_fragment_layout,
                container, false);
        fm = getFragmentManager();
        searchbar=(RelativeLayout)view.findViewById(R.id.searchbar);
        recent_parent=(RelativeLayout)view.findViewById(R.id.recent_parent);
        all_parent=(RelativeLayout)view.findViewById(R.id.all_parent);
        searchimg=(RelativeLayout)view.findViewById(R.id.searchimag);
        cancel=(RelativeLayout)view.findViewById(R.id.cancel);
        recent=(LinearLayout)view.findViewById(R.id.recent);
        recent_under=(LinearLayout)view.findViewById(R.id.recent_under);
        all=(LinearLayout)view.findViewById(R.id.allcontacts);
        all_under=(LinearLayout)view.findViewById(R.id.all_under);

        chat_text=(TextView)view.findViewById(R.id.chat_text);
        recent_text=(TextView)view.findViewById(R.id.recent_text);
        all_text=(TextView)view.findViewById(R.id.allcontacts_text);
        recent_name=(TextView)view.findViewById(R.id.recent_name);
        recent_msg=(TextView)view.findViewById(R.id.recent_mesg);
        recent_time=(TextView)view.findViewById(R.id.recent_time);
        recent_date=(TextView)view.findViewById(R.id.recent_date);
        all_name=(TextView)view.findViewById(R.id.all_name);
        all_msg=(TextView)view.findViewById(R.id.all_msg);
        search_text=(EditText)view.findViewById(R.id.search_text);
        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");

        chat_text.setTypeface(face_book);
        recent_text.setTypeface(face_book);
        all_text.setTypeface(face_book);
        recent_name.setTypeface(face_book);
        recent_msg.setTypeface(face_book);

        recent_time.setTypeface(face_book);
        recent_date.setTypeface(face_book);
        all_name.setTypeface(face_book);
        all_msg.setTypeface(face_book);
        search_text.setTypeface(face_book);

        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recent_under.setBackgroundColor(Color.parseColor("#ffffff"));
                all_under.setBackgroundColor(Color.parseColor("#AAAAAA"));
                all_parent.setVisibility(View.GONE);
                recent_parent.setVisibility(View.VISIBLE);
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                all_parent.setVisibility(View.VISIBLE);
                recent_parent.setVisibility(View.GONE);
                recent_under.setBackgroundColor(Color.parseColor("#AAAAAA"));
                all_under.setBackgroundColor(Color.parseColor("#ffffff"));
            }
        });


recent_parent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        FragmentTransaction ft1 = fm.beginTransaction();
        ft1.replace(R.id.home_container, new Chat_friend_fragment());
        ft1.commit();
    }
});

        all_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft1 = fm.beginTransaction();
                ft1.replace(R.id.home_container, new Chat_friend_fragment());
                ft1.commit();
            }
        });


        searchimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchbar.setVisibility(View.VISIBLE);
                searchimg.setVisibility(View.GONE);
                cancel.setVisibility(View.VISIBLE);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchbar.setVisibility(View.GONE);
                searchimg.setVisibility(View.VISIBLE);
                cancel.setVisibility(View.GONE);
            }
        });

        return view;
    }


}
