package com.example.stringtoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textv);
        String test = "123456789";

        Character [] array= new Character[test.length()];

        for (int i = 0; i < test.length(); i++) {
            array[i] = test.charAt(i);
        }


       String firstChar = ""+array[2];
        String secondChar = ""+array[3];

        int myNum = 0;
        myNum = Integer.parseInt(firstChar)*10;
        int secNum = 0;
        secNum = Integer.parseInt(secondChar)+myNum;

        textView.setText(test+"\n"+secNum);


    }
}