package com.example.solvihecletracking;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView roadMap,carImage;
    TextView text1,text2;
    Animation topAnim,bottomAnim,leftAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screens);
        roadMap = findViewById(R.id.roadmap);
        carImage = findViewById(R.id.car);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);


        topAnim = AnimationUtils.loadAnimation(this,R.anim.topanim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottomanim);
        leftAnim = AnimationUtils.loadAnimation(this,R.anim.leftanim);

        roadMap.setAnimation(topAnim);
        carImage.setAnimation(leftAnim);
        text1.setAnimation(bottomAnim);
        text2.setAnimation(bottomAnim);

    }
}