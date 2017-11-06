package com.example.sixsquarepc02.losang;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_in_Activity extends Activity {
    TextView name_text,password_text,forgot_text,signin_text,dont_text,signup_text;
    EditText name_edit,password_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        name_text=(TextView)findViewById(R.id.usernametext);
        password_text=(TextView)findViewById(R.id.passwordtext);
        forgot_text=(TextView)findViewById(R.id.forgotpasswordtext);
        signin_text=(TextView)findViewById(R.id.signintext);
        dont_text=(TextView)findViewById(R.id.usernametext);
        signup_text=(TextView)findViewById(R.id.signuptext);
        name_edit=(EditText)findViewById(R.id.usernameedit);
        password_edit=(EditText)findViewById(R.id.passwordedit);
        Typeface face_book = Typeface.createFromAsset(getAssets(), "fonts/book.ttf");
        Typeface face_light = Typeface.createFromAsset(getAssets(), "fonts/light.ttf");

        name_text.setTypeface(face_light);
        password_text.setTypeface(face_light);
        forgot_text.setTypeface(face_light);

        signin_text.setTypeface(face_book);
        dont_text.setTypeface(face_book);
        signin_text.setTypeface(face_book);
        name_edit.setTypeface(face_book);
        password_edit.setTypeface(face_book);



    }
    public void signup(View v)
    {
        Intent i=new Intent(this,Sign_up_Activity.class);
        startActivity(i);
    }
    public void signin(View v)
    {
        Intent i=new Intent(this,Home_Activity.class);
        startActivity(i);
    }
}
