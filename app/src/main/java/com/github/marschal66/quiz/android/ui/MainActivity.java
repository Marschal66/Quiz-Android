package com.github.marschal66.quiz.android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.marschal66.quiz.android.R;

public class MainActivity extends AppCompatActivity {

    private final Button editQuizButton = findViewById(R.id.btnEditQuiz);
    private final Button playQuizButton = findViewById(R.id.btnPlayQuiz);
    private final Intent editQuizIntent = new Intent(this, EditQuizActivity.class);
    private final Intent playQuizIntent = new Intent(this, PlayQuizActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init() {

//        following line is needed if you want any extra code on button click
//        editQuizButton.setOnClickListener(e -> {});
        editQuizButton.setOnClickListener(newActivity(editQuizIntent));
        playQuizButton.setOnClickListener(newActivity(playQuizIntent));
    }

    private View.OnClickListener newActivity(Intent intent) {
        return v -> {
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        };
    }

}