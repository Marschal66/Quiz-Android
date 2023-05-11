package com.github.marschal66.quiz.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.marschal66.quiz.android.R;

public class EditQuizActivity extends AppCompatActivity {
    private final Button mainmenuButton = findViewById(R.id.btnToMainmenu);
    private final Button saveButton = findViewById(R.id.btnNext);
    private final Intent mainmenuIntent = new Intent(this, MainActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editquiz);
        init();
    }

    protected void init() {

//        following line is needed if you want any extra code on button click
//        editQuizButton.setOnClickListener(e -> {});
        mainmenuButton.setOnClickListener(newActivity(mainmenuIntent));
//        saveButton.setOnClickListener(e -> {});
    }

    private View.OnClickListener newActivity(Intent intent) {
        return v -> {
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        };
    }
}
