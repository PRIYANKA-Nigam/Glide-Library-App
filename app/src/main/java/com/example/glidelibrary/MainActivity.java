package com.example.glidelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=(ImageView)findViewById(R.id.img);
        imageView2=(ImageView)findViewById(R.id.img2);
        Glide.with(MainActivity.this).load("https://i.imgur.com/qpr5LR2.jpg")
                .placeholder(R.drawable.progress_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView1);
        Glide.with(MainActivity.this).load("https://i.imgur.com/Vth6CBz.gif")
                .diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView2);


    }
}