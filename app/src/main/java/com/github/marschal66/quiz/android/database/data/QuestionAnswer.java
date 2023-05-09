package com.github.marschal66.quiz.android.database.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Question.class, parentColumns = "id", childColumns = "questionID"), @ForeignKey(entity = Answer.class, parentColumns = "id", childColumns = "answerID")})
public class QuestionAnswer {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "questionID")
    private int questionID;

    @ColumnInfo(name = "answerID")
    private int answerID;
}
