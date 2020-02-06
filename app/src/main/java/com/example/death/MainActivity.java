package com.example.death;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView selectedImage;
    Button cameraBtn,galleryBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedImage = (ImageView)findViewById(R.id.person_image);
        cameraBtn = (Button)findViewById(R.id.capture);
        galleryBtn = (Button)findViewById(R.id.gallery);

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Camera Button is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        galleryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gallery Button is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
