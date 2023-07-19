package com.example.quizzes.main.view;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.quizzes.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutFather;
    private Button buttonJava;
    private Button buttonAndroid;
    private TextView textViewAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutFather = findViewById(R.id.layoutFather);
        buttonJava=findViewById(R.id.buttonJava);
        buttonAndroid=findViewById(R.id.buttonAndroid);
        textViewAnswers=findViewById(R.id.textViewAnswers);

        animation();

        buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Java_Screen.class);
                startActivity(intent);
            }
        });

        buttonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Android_Screen.class);
                startActivity(intent2);
            }
        });

        textViewAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Answers_Screen.class);
                startActivity(intent3);
            }
        });
    }

    public void animation(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(layoutFather, "alpha", 0f, 1f);
        animator.setDuration(1000);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.start();
    }
}
