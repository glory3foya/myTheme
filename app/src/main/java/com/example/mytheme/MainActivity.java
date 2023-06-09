package com.example.mytheme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView, textview2;
    private RadioButton radioDark;
    private RadioButton radioLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
        radioDark = findViewById(R.id.radioDark);
        radioLight = findViewById(R.id.radioLight);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioDark:
                        setDarkTheme();
                        break;
                    case R.id.radioLight:
                        setLightTheme();
                        break;
                }
            }
        });
                }
    private void setDarkTheme() {
        setTheme(R.style.AppTheme_Dark);
        recreate();
    }

    private void setLightTheme() {
        setTheme(R.style.AppTheme_Light);
        recreate();
    }
}