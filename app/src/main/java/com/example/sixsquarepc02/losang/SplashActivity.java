package com.example.sixsquarepc02.losang;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        isStoragePermissionGranted();

    }




    public  boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {

                Log.i("PERMISSION","Permission is granted");
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {

                        Intent i=new Intent(SplashActivity.this,Sign_in_Activity.class);
                        startActivity(i);

                    }
                }, 2000);

                return true;
            } else {

                Log.i("PERMISSION","Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                return false;
            }
        }
        else {

            Log.i("PERMISSION","Permission is granted");
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {

                    Intent i=new Intent(SplashActivity.this,Sign_in_Activity.class);
                    startActivity(i);

                }
            }, 2000);

            return true;
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
            Log.i("PERMISSION","Permission: "+permissions[0]+ "was "+grantResults[0]);
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {

                    Intent i=new Intent(SplashActivity.this,Sign_in_Activity.class);
                    startActivity(i);

                }
            }, 100);

            //resume tasks needing this permission
        }
    }
}
