package com.jiayin.androidlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.provider.MediaStore;

public class ProfileActivity extends AppCompatActivity {
    protected static final String ACTIVITY_NAME = "ProfileActivity";
    static final int IMAGE_CAPTURE = 1;

    ImageButton captureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        captureButton = (ImageButton) findViewById(R.id.captureButton1);
        captureButton.setOnClickListener(new View.OnClickListener() {
            final int CAPTURE = 1 ;
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent();
            }
            private void dispatchTakePictureIntent(){
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, IMAGE_CAPTURE);
                }
            }
        });
        Log.e(ACTIVITY_NAME, "In onCreate()");
    }
}
