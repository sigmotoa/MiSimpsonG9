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
        ImageView imgSimpson5 = findViewById(R.id.img_simpson_5);
        ImageView imgSimpson6 = findViewById(R.id.img_simpson_6);
        ImageView imgSimpson7 = findViewById(R.id.img_simpson_7);
        ImageView imgSimpson8 = findViewById(R.id.img_simpson_8);
        ImageView imgSimpson9 = findViewById(R.id.img_simpson_9);
        ImageView imgSimpson10 = findViewById(R.id.img_simpson_10);

        //Imagenes de las card
        ImageView imgCardSimpson1 = findViewById(R.id.img_simpson_dettalle_1);
        ImageView imgCardSimpson2 = findViewById(R.id.img_simpson_detalle_2);





        Glide.with(this)
                .load("https://static.simpsonswiki.com/images/thumb/e/ec/Lisa_Simpson.png/220px-Lisa_Simpson.png")
                .circleCrop()
                .fitCenter()
                .into(imgCardSimpson1);
 Glide.with(this)
                .load("https://static.simpsonswiki.com/images/thumb/1/16/Guy_Incognito.png/200px-Guy_Incognito.png")
                .circleCrop()
                .fitCenter()
                .into(imgCardSimpson2);





        Glide.with(this)
                .load("https://res.cloudinary.com/dglqojivj/image/upload/v1682559693/simpsons/250px-Cletus_Spuckler_rvpr9g.png")
                .sizeMultiplier(0.1f)
                .fitCenter()
                .circleCrop()
                .centerInside()
                .into(imgSimpson1);

        Glide.with(this)
                .load("https://res.cloudinary.com/dglqojivj/image/upload/v1682559693/simpsons/250px-Krusty_the_Clown_nz1z1o.png")
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson2);

        Glide.with(this)
                .load("https://static.simpsonswiki.com/images/thumb/2/2c/Santa%27s_Little_Helper.png/200px-Santa%27s_Little_Helper.png")
                .sizeMultiplier(0.1f)
                .placeholder(R.drawable.parky_001)
                .fitCenter()
                .circleCrop()
                .centerInside()
                .into(imgSimpson3);

        Glide.with(this)
                .load("https://static.simpsonswiki.com/images/thumb/f/f7/Troy_McClure.png/220px-Troy_McClure.png")
                .sizeMultiplier(0.1f)
                .error(R.drawable.twotone_people_outline_24)
                .circleCrop()
                .centerInside()
                .into(imgSimpson4);

        Glide.with(this)
                .load("https://static.simpsonswiki.com/images/thumb/9/9d/Maggie_Simpson.png/250px-Maggie_Simpson.png")
                .error(R.drawable.baseline_live_tv_24)
                .placeholder(R.drawable.twotone_people_outline_24)
                //.sizeMultiplier(0.1f)
                .fitCenter()
                .circleCrop()
                .centerInside()
                .into(imgSimpson5);

        Glide.with(this)
                .load(R.drawable.parky_001)
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson6);

        Glide.with(this)
                .load("https://res.cloudinary.com/dglqojivj/image/upload/v1682559693/simpsons/250px-Cletus_Spuckler_rvpr9g.png")
                .sizeMultiplier(0.1f)
                .fitCenter()
                .circleCrop()
                .centerInside()
                .into(imgSimpson7);

        Glide.with(this)
                .load(R.drawable.parky_001)
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson8);

        Glide.with(this)
                .load("https://res.cloudinary.com/dglqojivj/image/upload/v1682559693/simpsons/250px-Cletus_Spuckler_rvpr9g.png")
                .sizeMultiplier(0.1f)
                .fitCenter()
                .circleCrop()
                .centerInside()
                .into(imgSimpson9);

        Glide.with(this)
                .load(R.drawable.parky_001)
                .sizeMultiplier(0.1f)
                .circleCrop()
                .centerInside()
                .into(imgSimpson10);


    }
}