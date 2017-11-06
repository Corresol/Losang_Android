package com.example.sixsquarepc02.losang;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_up_Activity extends Activity {

    TextView name_text,email_text,password_text,birthday_text,create_text,already_text,signin_text,close_text,signup_text;
    EditText name_edit,email_edit,password_edit,birthday_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        name_text=(TextView)findViewById(R.id.usernametext);
        password_text=(TextView)findViewById(R.id.passwordtext);
        email_text=(TextView)findViewById(R.id.emailtext);
        signin_text=(TextView)findViewById(R.id.signintext);
        birthday_text=(TextView)findViewById(R.id.birthdaytext);
        create_text=(TextView)findViewById(R.id.craetetext);
        already_text=(TextView)findViewById(R.id.alreadytext);
        name_edit=(EditText)findViewById(R.id.usernameedit);
        password_edit=(EditText)findViewById(R.id.passwordedit);
        email_edit=(EditText)findViewById(R.id.emailedit);
        birthday_edit=(EditText)findViewById(R.id.birthdayedit);

        close_text=(TextView) findViewById(R.id.close);
        signup_text=(TextView)findViewById(R.id.signuptoolbar);
        Typeface face_book = Typeface.createFromAsset(getAssets(), "fonts/book.ttf");
        Typeface face_light = Typeface.createFromAsset(getAssets(), "fonts/light.ttf");

        name_text.setTypeface(face_light);
        password_text.setTypeface(face_light);
        password_text.setTypeface(face_light);
        birthday_text.setTypeface(face_light);


        signin_text.setTypeface(face_book);
        already_text.setTypeface(face_book);
        create_text.setTypeface(face_book);
        name_edit.setTypeface(face_book);
        password_edit.setTypeface(face_book);
        birthday_edit.setTypeface(face_book);
        email_edit.setTypeface(face_book);
        close_text.setTypeface(face_book);
        signup_text.setTypeface(face_book);

    }
    public void close(View v)
    {
        Intent i=new Intent(this,Sign_in_Activity.class);
        startActivity(i);
    }
}
