package com.example.john.a1parkoviy_gas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Gas2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas2);

        PhotoView photoView = findViewById(R.id.imageView2);
        photoView.setImageResource(R.drawable.apart2);
    }
}
