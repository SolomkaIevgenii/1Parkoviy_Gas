package com.example.john.a1parkoviy_gas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Gas1_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas1_1);

        PhotoView photoView = findViewById(R.id.imageView6_1);
        photoView.setImageResource(R.drawable.apart1_2);
    }
}
