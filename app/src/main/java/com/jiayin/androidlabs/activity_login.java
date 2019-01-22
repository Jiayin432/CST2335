package com.jiayin.androidlabs;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


       //SharedPreferences sharedPreferences = getSharedPreferences()
    }
}
//    SharedPreferences sharedPref = getSharedPreferences(
//            "LoginFile", Context.MODE_PRIVATE);
//    int numTimeRun = sharedPref.getInt("TIMES_RUN", 0);
 //   EditText loginName = (EditText) findViewById(R.id.editTextLogin);
//loginName.setText( sharedPref.getString("DefaultEmail",""));
//
//        Log.i(ACTIVITY_NAME, "In onCreate()");