package com.example.android.justjava;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by windog on 2016/4/28.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardviewtest);

        ImageView ivYasuo;

        ivYasuo = (ImageView) findViewById(R.id.iv_yasuo);

        Picasso.with(this)
                .load("http://ossweb-img.qq.com/images/lol/web201310/skin/big157000.jpg")
                .placeholder(null)   //图片没加载之前，先用一张本地图片占着位置
                .error(null)        //如果因为未联网或者网络不畅没能加载，用一张图片占住。
                .into(ivYasuo);

    }
}

