package com.example.sixsquarepc02.losang;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Home_Activity extends Activity {
    FragmentManager fm;
    TextView home_bottom,profile_bottom,chat_bottom,projects_bottom,calendar_bottom;
    TextView home,profile,chat,projects,calendar;
    String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        Intent i=getIntent();
        status=i.getStringExtra("status");


        home_bottom=(TextView)findViewById(R.id.home_bootom);
        profile_bottom=(TextView)findViewById(R.id.profile_bottom);
        chat_bottom=(TextView)findViewById(R.id.chat_bottom);
        projects_bottom=(TextView)findViewById(R.id.projects_bottom);
       calendar_bottom=(TextView)findViewById(R.id.calendar_bottom);

        home=(TextView)findViewById(R.id.home_img);
        profile=(TextView)findViewById(R.id.profile_img);
        chat=(TextView)findViewById(R.id.chat_img);
        projects=(TextView)findViewById(R.id.projects_img);
        calendar=(TextView)findViewById(R.id.calendar_img);



        Typeface face_book = Typeface.createFromAsset(getAssets(), "fonts/book.ttf");



        home_bottom.setTypeface(face_book);
        profile_bottom.setTypeface(face_book);
        chat_bottom.setTypeface(face_book);
        projects_bottom.setTypeface(face_book);
        calendar_bottom.setTypeface(face_book);



        if(status!=null)
        {
            if(status.equals("home"))
            {
                fm = getFragmentManager();
                home_bottom.setTextColor(Color.parseColor("#C8393F"));
                profile_bottom.setTextColor(Color.parseColor("#ffffff"));
                chat_bottom.setTextColor(Color.parseColor("#ffffff"));
                projects_bottom.setTextColor(Color.parseColor("#ffffff"));
                calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
                home.setBackgroundResource(R.drawable.home_icon_red);
                profile.setBackgroundResource(R.drawable.profile_icon_white);
                chat.setBackgroundResource(R.drawable.chaticon_white);
                projects.setBackgroundResource(R.drawable.projrcticon_white);
                calendar.setBackgroundResource(R.drawable.calendar_icon_white);
                fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.home_container, new Home_fragment());
                ft.commit();
            }

            else if(status.equals("profile"))
            {
                fm = getFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                ft1.replace(R.id.home_container, new Profile_fragment());
                ft1.commit();
                profile_bottom.setTextColor(Color.parseColor("#C8393F"));
                home_bottom.setTextColor(Color.parseColor("#ffffff"));
                chat_bottom.setTextColor(Color.parseColor("#ffffff"));
                projects_bottom.setTextColor(Color.parseColor("#ffffff"));
                calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
                home.setBackgroundResource(R.drawable.home_icon_white);
                profile.setBackgroundResource(R.drawable.profile_icon_red);
                chat.setBackgroundResource(R.drawable.chaticon_white);
                projects.setBackgroundResource(R.drawable.projrcticon_white);
                calendar.setBackgroundResource(R.drawable.calendar_icon_white);
            }

            else if(status.equals("chat"))
            {
                fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.home_container, new Chat_Fragment());
                ft.commit();
                chat_bottom.setTextColor(Color.parseColor("#C8393F"));
                home_bottom.setTextColor(Color.parseColor("#ffffff"));
                profile_bottom.setTextColor(Color.parseColor("#ffffff"));
                projects_bottom.setTextColor(Color.parseColor("#ffffff"));
                calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
                home.setBackgroundResource(R.drawable.home_icon_white);
                profile.setBackgroundResource(R.drawable.profile_icon_white);
                chat.setBackgroundResource(R.drawable.chat_icon_red);
                projects.setBackgroundResource(R.drawable.projrcticon_white);
                calendar.setBackgroundResource(R.drawable.calendar_icon_white);
            }

            else if(status.equals("projects"))
            {
                fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.home_container, new Projects_Fragment());
                ft.commit();
                projects_bottom.setTextColor(Color.parseColor("#C8393F"));
                home_bottom.setTextColor(Color.parseColor("#ffffff"));
                chat_bottom.setTextColor(Color.parseColor("#ffffff"));
                profile_bottom.setTextColor(Color.parseColor("#ffffff"));
                calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
                home.setBackgroundResource(R.drawable.home_icon_white);
                profile.setBackgroundResource(R.drawable.profile_icon_white);
                chat.setBackgroundResource(R.drawable.chaticon_white);
                projects.setBackgroundResource(R.drawable.project_icon_red);
                calendar.setBackgroundResource(R.drawable.calendar_icon_white);
            }

            else if(status.equals("calendar"))
            {
                fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.home_container, new Calendar_Fragment());
                ft.commit();
                calendar_bottom.setTextColor(Color.parseColor("#C8393F"));
                home_bottom.setTextColor(Color.parseColor("#ffffff"));
                chat_bottom.setTextColor(Color.parseColor("#ffffff"));
                projects_bottom.setTextColor(Color.parseColor("#ffffff"));
                profile_bottom.setTextColor(Color.parseColor("#ffffff"));
                home.setBackgroundResource(R.drawable.home_icon_white);
                profile.setBackgroundResource(R.drawable.profile_icon_white);
                chat.setBackgroundResource(R.drawable.chaticon_white);
                projects.setBackgroundResource(R.drawable.projrcticon_white);
                calendar.setBackgroundResource(R.drawable.calendar_icon_red);
            }
        }
        else
        {
            home_bottom.setTextColor(Color.parseColor("#C8393F"));
            profile_bottom.setTextColor(Color.parseColor("#ffffff"));
            chat_bottom.setTextColor(Color.parseColor("#ffffff"));
            projects_bottom.setTextColor(Color.parseColor("#ffffff"));
            calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
            home.setBackgroundResource(R.drawable.home_icon_red);
            profile.setBackgroundResource(R.drawable.profile_icon_white);
            chat.setBackgroundResource(R.drawable.chaticon_white);
            projects.setBackgroundResource(R.drawable.projrcticon_white);
            calendar.setBackgroundResource(R.drawable.calendar_icon_white);
            fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.home_container, new Home_fragment());
            ft.commit();
        }


    }

    public  void profile(View v)
    {
        // replace

        FragmentTransaction ft1 = fm.beginTransaction();
        ft1.replace(R.id.home_container, new Profile_fragment());
        ft1.commit();
        profile_bottom.setTextColor(Color.parseColor("#C8393F"));
        home_bottom.setTextColor(Color.parseColor("#ffffff"));
        chat_bottom.setTextColor(Color.parseColor("#ffffff"));
        projects_bottom.setTextColor(Color.parseColor("#ffffff"));
        calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
        home.setBackgroundResource(R.drawable.home_icon_white);
        profile.setBackgroundResource(R.drawable.profile_icon_red);
        chat.setBackgroundResource(R.drawable.chaticon_white);
        projects.setBackgroundResource(R.drawable.projrcticon_white);
        calendar.setBackgroundResource(R.drawable.calendar_icon_white);
    }

    public void home(View v)
    {
        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.home_container, new Home_fragment());
        ft.commit();

        home_bottom.setTextColor(Color.parseColor("#C8393F"));
        profile_bottom.setTextColor(Color.parseColor("#ffffff"));
        chat_bottom.setTextColor(Color.parseColor("#ffffff"));
        projects_bottom.setTextColor(Color.parseColor("#ffffff"));
        calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
        home.setBackgroundResource(R.drawable.home_icon_red);
        profile.setBackgroundResource(R.drawable.profile_icon_white);
        chat.setBackgroundResource(R.drawable.chaticon_white);
        projects.setBackgroundResource(R.drawable.projrcticon_white);
        calendar.setBackgroundResource(R.drawable.calendar_icon_white);
    }

    public void chat(View v)
    {
        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.home_container, new Chat_Fragment());
        ft.commit();
        chat_bottom.setTextColor(Color.parseColor("#C8393F"));
        home_bottom.setTextColor(Color.parseColor("#ffffff"));
        profile_bottom.setTextColor(Color.parseColor("#ffffff"));
        projects_bottom.setTextColor(Color.parseColor("#ffffff"));
        calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
        home.setBackgroundResource(R.drawable.home_icon_white);
        profile.setBackgroundResource(R.drawable.profile_icon_white);
        chat.setBackgroundResource(R.drawable.chat_icon_red);
        projects.setBackgroundResource(R.drawable.projrcticon_white);
        calendar.setBackgroundResource(R.drawable.calendar_icon_white);

    }
    public void projects(View v)
    {
        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.home_container, new Projects_Fragment());
        ft.commit();
        projects_bottom.setTextColor(Color.parseColor("#C8393F"));
        home_bottom.setTextColor(Color.parseColor("#ffffff"));
        chat_bottom.setTextColor(Color.parseColor("#ffffff"));
        profile_bottom.setTextColor(Color.parseColor("#ffffff"));
        calendar_bottom.setTextColor(Color.parseColor("#ffffff"));
        home.setBackgroundResource(R.drawable.home_icon_white);
        profile.setBackgroundResource(R.drawable.profile_icon_white);
        chat.setBackgroundResource(R.drawable.chaticon_white);
        projects.setBackgroundResource(R.drawable.project_icon_red);
        calendar.setBackgroundResource(R.drawable.calendar_icon_white);
    }
 public  void calendar(View v)
 {
     fm = getFragmentManager();
     FragmentTransaction ft = fm.beginTransaction();
     ft.add(R.id.home_container, new Calendar_Fragment());
     ft.commit();
     calendar_bottom.setTextColor(Color.parseColor("#C8393F"));
     home_bottom.setTextColor(Color.parseColor("#ffffff"));
     chat_bottom.setTextColor(Color.parseColor("#ffffff"));
     projects_bottom.setTextColor(Color.parseColor("#ffffff"));
     profile_bottom.setTextColor(Color.parseColor("#ffffff"));
     home.setBackgroundResource(R.drawable.home_icon_white);
     profile.setBackgroundResource(R.drawable.profile_icon_white);
     chat.setBackgroundResource(R.drawable.chaticon_white);
     projects.setBackgroundResource(R.drawable.projrcticon_white);
     calendar.setBackgroundResource(R.drawable.calendar_icon_red);
 }

    public void drawer(View v)
    {
      Intent i=new Intent(this,Drawer_Activity.class);
        startActivity(i);
    }

    public void notification(View v)
    {
        FragmentTransaction ft1 = fm.beginTransaction();
        ft1.replace(R.id.home_container, new Notification_fragment());
        ft1.commit();
    }

    public void close(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        startActivity(i);
    }


}
