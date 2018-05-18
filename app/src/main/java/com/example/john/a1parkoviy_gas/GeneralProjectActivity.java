package com.example.john.a1parkoviy_gas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class GeneralProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_project);

        PhotoView photoView = findViewById(R.id.imageViewGeneralProject);
        photoView.setImageResource(R.drawable.general_schema);
    }
}
