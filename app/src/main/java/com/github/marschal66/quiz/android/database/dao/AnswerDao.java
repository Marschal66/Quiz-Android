package com.github.marschal66.quiz.android.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

import com.github.marschal66.quiz.android.database.data.Answer;

@Dao
public interface AnswerDao {
    @Insert
    void insert(Answer answer);

    @Update
    void update(Answer answer);
}
