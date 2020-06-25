package com.henry.picassoslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String[] imagesUrls = new String[]{
            "https://upload.wikimedia.org/wikipedia/commons/a/a3/June_odd-eyed-cat.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg/800px-Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg/800px-Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg/800px-Dogs_like_cucumbers_%26_cucumbers_like_dogs.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/a/a3/June_odd-eyed-cat.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imagesUrls);
        viewPager.setAdapter(adapter);
    }
}