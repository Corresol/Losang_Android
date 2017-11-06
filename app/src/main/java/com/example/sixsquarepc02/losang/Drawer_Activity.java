package com.example.sixsquarepc02.losang;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Drawer_Activity extends FragmentActivity {

    TextView home_text,profile_text,chat_text,projects_text,calendar_text,logout_text,close_text;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_);
        home_text=(TextView)findViewById(R.id.home_text);
        profile_text=(TextView)findViewById(R.id.profile_text);
        chat_text=(TextView)findViewById(R.id.chat_text);
        projects_text=(TextView)findViewById(R.id.projects_text);
        calendar_text=(TextView)findViewById(R.id.calendar_text);
        logout_text=(TextView)findViewById(R.id.logout_text);
        close_text=(TextView) findViewById(R.id.close);
        Typeface face_book = Typeface.createFromAsset(getAssets(), "fonts/book.ttf");
        home_text.setTypeface(face_book);
        profile_text.setTypeface(face_book);
        chat_text.setTypeface(face_book);
        projects_text.setTypeface(face_book);
        calendar_text.setTypeface(face_book);
        logout_text.setTypeface(face_book);
        close_text.setTypeface(face_book);


    }
    public void close(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        startActivity(i);
    }
    public void logout(View v)
    {
        Intent i=new Intent(this,Sign_in_Activity.class);
        startActivity(i);
    }
    public void home(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        i.putExtra("status","home");
        startActivity(i);
    }
    public void profile(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        i.putExtra("status","profile");
        startActivity(i);
    }
    public void chat(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        i.putExtra("status","chat");
        startActivity(i);
    }
    public void projects(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        i.putExtra("status","projects");
        startActivity(i);
    }
    public void calendar(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        i.putExtra("status","calendar");
        startActivity(i);
    }
}
