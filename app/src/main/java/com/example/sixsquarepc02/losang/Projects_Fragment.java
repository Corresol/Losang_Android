package com.example.sixsquarepc02.losang;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Projects_Fragment  extends Fragment {

    TextView project_text,project_name,project_title;
    RelativeLayout project_parent;
    FragmentManager fm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment_layout,
                container, false);
        fm = getFragmentManager();
        project_text=(TextView)view.findViewById(R.id.project_text);
        project_name=(TextView)view.findViewById(R.id.projrct_name);
        project_title=(TextView)view.findViewById(R.id.project_title);
        project_parent=(RelativeLayout)view.findViewById(R.id.single_project_parent);

        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        project_text.setTypeface(face_book);
        project_name.setTypeface(face_book);
        project_title.setTypeface(face_book);

        project_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.home_container, new Project_detail_Fragment());
                ft.commit();
            }
        });

        return view;
    }
}
