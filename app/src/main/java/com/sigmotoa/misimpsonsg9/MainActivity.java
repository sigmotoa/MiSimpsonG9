package com.sigmotoa.misimpsonsg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgSimpson1 = findViewById(R.id.img_simpson_1);
        ImageView imgSimpson2 = findViewById(R.id.img_simpson_2);
        ImageView imgSimpson3 = findViewById(R.id.img_simpson_3);
        ImageView imgSimpson4 = findViewById(R.id.img_simpson_4);




        Glide.with(this)
                .load("https://res.cloudinary.com/dglqojivj/image/upload/v1682559693/simpsons/250px-Cletus_Spuckler_rvpr9g.png")
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson1);

        Glide.with(this)
                .load(R.drawable.parky_001)
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson2);



    }
}