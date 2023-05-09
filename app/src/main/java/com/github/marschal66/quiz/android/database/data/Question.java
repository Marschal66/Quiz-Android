package com.github.marschal66.quiz.android.database.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Answer.class, parentColumns = "id", childColumns = "correctAnswerID")})
public class Question {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "question")
    private String question;

    @ColumnInfo(name = "correctAnswerID")
    private int correctAnswerID;

}
