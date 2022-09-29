package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView light;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        light = findViewById(R.id.light);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (light.getBackground() instanceof ColorDrawable){
                ColorDrawable cd = new ColorDrawable();
                cd = (ColorDrawable) light.getBackground();
                int color = cd.getColor();
                // Convert the color into hexcode
                String hexColor = String.format("#%06X", (0xFFFFFF & color));
                if (hexColor.equals("#B81D13")){
                    light.setBackgroundColor(Color.parseColor("#008450"));
                    // change from red to green
                }else if (hexColor.equals("#008450")){
                    light.setBackgroundColor(Color.parseColor("#EFB700"));
                    // change from green to yellow
                }else{
                    light.setBackgroundColor(Color.parseColor("#B81D13"));
                    // change back to red
                }
            }
        });
    }
}