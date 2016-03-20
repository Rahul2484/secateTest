package com.softproject.kartikrahulrajatraman.secatetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

public class ScannerActivity extends AppCompatActivity {

    SurfaceView mCameraView = (SurfaceView)findViewById(R.id.cameraView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);


    }

}
