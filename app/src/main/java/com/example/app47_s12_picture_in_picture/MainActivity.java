package com.example.app47_s12_picture_in_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Rational;
import android.view.Display;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void goPIP(View view){

        Display display = getWindowManager().getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        int width = p.x;
        int height = p.y;
        Rational rational = new Rational(width, height);
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        builder.setAspectRatio(rational).build();
        enterPictureInPictureMode(builder.build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}