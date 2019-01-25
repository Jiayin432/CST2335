package com.jiayin.androidlabs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected static final String ACTIVITY_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main_grid);
        //setContentView(R.layout.activity_main_linear);
        //setContentView(R.layout.activity_main_relative);

        Button startButton = (Button)findViewById(R.id.button2);
        startButton.setOnClickListener(new view.onClickLinstener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);
            }
        });
        Log.e(ACTIVITY_NAME, "IN onCreate()");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        SharedPreferences sharedPref = getSharedPreferences(
                "LoginFile", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        EditText loginName = (EditText) findViewById(R.id.editText);
        edit.putString("DefaultEmail",loginName.getText().toString());
        edit.commit();
        Log.e(ACTIVITY_NAME, "In onPause()");
    }
}
