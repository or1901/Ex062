package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button btn;
    Switch switch1;
    View mainView;

    int checkedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        rg = findViewById(R.id.rg);
        btn = findViewById(R.id.btn);
        mainView = findViewById(R.id.mainView);
    }

    public void btnClick(View view) {
        checkedId = rg.getCheckedRadioButtonId();

        switch (checkedId) {
            case R.id.rb1:
                mainView.setBackgroundColor(Color.RED);
                break;
            case R.id.rb2:
                mainView.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rb3:
                mainView.setBackgroundColor(Color.GREEN);
                break;
            case R.id.rb4:
                mainView.setBackgroundColor(Color.CYAN);
                break;
        }
    }

    public void redClick(View view) {
        if(switch1.isChecked()){
            mainView.setBackgroundColor(Color.RED);
        }
    }

    public void blueClick(View view) {
        if(switch1.isChecked()){
            mainView.setBackgroundColor(Color.BLUE);
        }
    }

    public void greenClick(View view) {
        if(switch1.isChecked()){
            mainView.setBackgroundColor(Color.GREEN);
        }
    }

    public void cyanClick(View view) {
        if(switch1.isChecked()){
            mainView.setBackgroundColor(Color.CYAN);
        }
    }

}