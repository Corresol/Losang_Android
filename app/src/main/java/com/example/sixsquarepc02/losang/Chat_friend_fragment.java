package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Chat_friend_fragment extends Fragment {
    FragmentManager fm;
    RelativeLayout back;
    TextView send;
    EditText msg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_friend_layout,
                container, false);
        send=(TextView)view.findViewById(R.id.send);
        msg=( EditText)view.findViewById(R.id.msg_text);

        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        send.setTypeface(face_book);
        msg.setTypeface(face_book);


        fm = getFragmentManager();
        back=(RelativeLayout)view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft1 = fm.beginTransaction();
                ft1.replace(R.id.home_container, new Chat_Fragment());
                ft1.commit();
            }
        });
        return view;
    }

}
