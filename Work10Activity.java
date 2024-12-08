package com.example.labs.Work10;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.labs.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Work10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work10);
        ViewPager2 viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_fragment1) {
                viewPager.setCurrentItem(0);
                return true;
            } else if (itemId == R.id.nav_fragment2) {
                viewPager.setCurrentItem(1);
                return true;
            } else if (itemId == R.id.nav_fragment3) {
                viewPager.setCurrentItem(2);
                return true;
            }
            return false;
        });


        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position) {
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.nav_fragment1);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.nav_fragment2);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.nav_fragment3);
                        break;
                }
            }
        });
    }
}


