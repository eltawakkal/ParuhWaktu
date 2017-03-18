package com.example.eltawakkal.paruhwaktu;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.eltawakkal.paruhwaktu.fragment.PagerAdapterQ;

public class MainActivity extends AppCompatActivity{

    ImageView imgProfil, imgChat, imgHome, imgBook, imgSetting;
    ViewPager pager;
    PagerAdapterQ adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new PagerAdapterQ(getSupportFragmentManager(), 5);

        imgProfil = (ImageView) findViewById(R.id.imgProfil);
        imgChat = (ImageView) findViewById(R.id.imgChat);
        imgHome = (ImageView) findViewById(R.id.imgHome);
        imgBook = (ImageView) findViewById(R.id.imgBook);
        imgSetting = (ImageView) findViewById(R.id.imgSetting);
        pager = (ViewPager) findViewById(R.id.viewPager);

        pager.setAdapter(adapter);

        pager.setCurrentItem(2);

        imgProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);
            }
        });

        imgChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);
            }
        });

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(2);
            }
        });

        imgBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(3);
            }
        });

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(4);
            }
        });

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (pager.getCurrentItem()){
                    case 0:
                        clearImg();
                        imgProfil.setImageResource(R.drawable.pro_color);
                        break;
                    case 1:
                        clearImg();
                        imgChat.setImageResource(R.drawable.pesan_color);
                        break;
                    case 2:
                        clearImg();
                        imgHome.setImageResource(R.drawable.paruh_color);
                        break;
                    case 3:
                        clearImg();
                        imgBook.setImageResource(R.drawable.start_color);
                        break;
                    case 4:
                        clearImg();
                        imgSetting.setImageResource(R.drawable.menu_color);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void clearImg(){
        imgProfil.setImageResource(R.drawable.pro);
        imgChat.setImageResource(R.drawable.pesan);
        imgHome.setImageResource(R.drawable.paruh);
        imgBook.setImageResource(R.drawable.start);
        imgSetting.setImageResource(R.drawable.menu);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (pager.getCurrentItem()!=2) {
            pager.setCurrentItem(2);
        } else {
            finish();
        }

    }
}
