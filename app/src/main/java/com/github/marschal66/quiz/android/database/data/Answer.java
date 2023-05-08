package com.github.marschal66.quiz.android.database.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Answer {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "answer")
    private String answer;
}
