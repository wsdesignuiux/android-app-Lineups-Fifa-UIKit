package e.wolfsoft1.lineups_fifa_uikit;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import fragment.JapanFragment;

public class Lineups extends AppCompatActivity implements View.OnClickListener {


    TextView txt_near_by_you, txt_toprated;

    FrameLayout fragment;


    LinearLayout linear1, linear2, linear3, linear4, linear5;
    TextView text1, text2, text3, text4, text5;
    ImageView image1, image2, image3, image4, image5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineups);

        txt_near_by_you = findViewById(R.id.txt_near_by_you);
        txt_toprated = findViewById(R.id.txt_toprated);

        fragment = findViewById(R.id.fragment);
        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);


        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);

        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);

        txt_near_by_you.setBackground(getDrawable(R.drawable.left_half_fill_mustered_rect));
        txt_near_by_you.setTextColor(Color.parseColor("#383838"));
        txt_toprated.setBackground(getDrawable(R.drawable.right_white_half_round));
        txt_toprated.setTextColor(Color.parseColor("#383838"));

        FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();

        android.support.v4.app.Fragment brandNameFragment = new JapanFragment();
        fragmentTransaction.replace(R.id.fragment, brandNameFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

//fragment code
        txt_near_by_you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                txt_near_by_you.setBackground(getDrawable(R.drawable.left_half_fill_mustered_rect));
                txt_near_by_you.setTextColor(Color.parseColor("#383838"));
                txt_toprated.setBackground(getDrawable(R.drawable.right_white_half_round));
                txt_toprated.setTextColor(Color.parseColor("#383838"));

                FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();

                android.support.v4.app.Fragment brandNameFragment = new JapanFragment();
                fragmentTransaction.replace(R.id.fragment, brandNameFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        txt_toprated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                txt_toprated.setBackground(getDrawable(R.drawable.right_half_round1));
                txt_toprated.setTextColor(Color.parseColor("#383838"));
                txt_near_by_you.setBackground(getDrawable(R.drawable.left_white_half_round));
                txt_near_by_you.setTextColor(Color.parseColor("#383838"));


                FragmentManager fm1 = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();

                android.support.v4.app.Fragment brandNameFragment1 = new JapanFragment();
                fragmentTransaction1.replace(R.id.fragment, brandNameFragment1);
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();

            }
        });

    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(Lineups.this, FIFA_list.class);
//        startActivity(intent);
//    }

    //code of onclick event

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.linear1:

                text1.setTextColor(Color.parseColor("#d0be94"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

//                image1.setColorFilter(Color.parseColor("#d0be94"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear2:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#d0be94"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#d0be94"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear3:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#d0be94"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));


                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#d0be94"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear4:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#d0be94"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#d0be94"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear5:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#d0be94"));


                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#d0be94"));

                break;

        }
    }
}
