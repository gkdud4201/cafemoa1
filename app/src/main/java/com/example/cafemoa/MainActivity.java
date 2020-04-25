package com.example.cafemoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //ImageView cafeImage = (ImageView) findViewById(R.id.cafeImage);//
            //TextView cafemoaText = (TextView) findViewById(R.id.cafemoaText);//

            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {

            @Override
            public void run() {
              Intent i = new Intent(MainActivity.this, LoginActivity.class);
              MainActivity.this.startActivity(i);
              finish();
            }
        },3000);

        }


        }


