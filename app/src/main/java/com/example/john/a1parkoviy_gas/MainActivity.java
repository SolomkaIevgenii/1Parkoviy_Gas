package com.example.john.a1parkoviy_gas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button6 = findViewById(R.id.Button6);

        View.OnClickListener clickListener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas1_1Activity.class);
                startActivity(intent);
            }
        };
        button6.setOnClickListener(clickListener6);

        View button2 = findViewById(R.id.Button2);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(clickListener2);

        View button3 = findViewById(R.id.Button3);

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button3.setOnClickListener(clickListener3);

        View button4 = findViewById(R.id.Button4);

        View.OnClickListener clickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button4.setOnClickListener(clickListener4);

        View button5 = findViewById(R.id.Button5);

        View.OnClickListener clickListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button5.setOnClickListener(clickListener5);

        View button7 = findViewById(R.id.Button7);

        View.OnClickListener clickListener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button7.setOnClickListener(clickListener7);

        View button8 = findViewById(R.id.Button8);

        View.OnClickListener clickListener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas2Activity.class);
                startActivity(intent);
            }
        };
        button8.setOnClickListener(clickListener8);

        View button1 = findViewById(R.id.Button1);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas3Activity.class);
                startActivity(intent);
            }
        };
        button1.setOnClickListener(clickListener1);

        View button9 = findViewById(R.id.Button9);

        View.OnClickListener clickListener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Gas3Activity.class);
                startActivity(intent);
            }
        };
        button9.setOnClickListener(clickListener9);
    }
}
