package com.example.myalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        image=findViewById(R.id.imageView);

        b2.setAlpha(0.3f);
        b3.setAlpha(0.3f);
        b4.setAlpha(0.3f);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p1);
                b1.setAlpha(1.0f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p2);
                b2.setAlpha(1.0f);
                b1.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p3);
                b3.setAlpha(1.0f);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b4.setAlpha(0.3f);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p4);
                b4.setAlpha(1.0f);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
            }
        });
    }
}