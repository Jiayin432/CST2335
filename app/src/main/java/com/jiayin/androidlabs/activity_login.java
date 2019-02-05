package com.jiayin.androidlabs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity {
    protected static final String ACTIVITY_NAME = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginB = (Button) findViewById(R.id.button2);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(
                        "LoginFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                EditText loginName = (EditText) findViewById(R.id.loginEmail);
                editor.commit();
                Intent intent = new Intent(activity_login.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        Log.e(ACTIVITY_NAME, "In onCreate()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences(
                "LoginFile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        EditText loginName = (EditText) findViewById(R.id.loginEmail);
        editor.putString("loginEmail", loginName.getText().toString());
        editor.commit();
        Log.e(ACTIVITY_NAME, "In onPause()");
    }

    @Override
    public void onStart(){
        super.onStart();
        Button loginButton = (Button)findViewById(R.id.button2);
    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences(
                "LoginFile", Context.MODE_PRIVATE);
        //int numTimeRun = sharedPreferences.getInt("Times_run",0);
        EditText loginName = (EditText) findViewById(R.id.loginEmail);
        loginName.setText( sharedPreferences.getString("DefaultEmail",""));
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.e(ACTIVITY_NAME, "In onStop()");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.e(ACTIVITY_NAME, "In onDestroy()");
    }

}