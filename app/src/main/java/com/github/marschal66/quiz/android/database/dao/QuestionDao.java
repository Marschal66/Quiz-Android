package com.github.marschal66.quiz.android.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.github.marschal66.quiz.android.database.data.Question;

@Dao
public interface QuestionDao {
    @Insert
    void insert(Question question);

    @Update
    void update(Question question);

    @Query("SELECT question FROM Question WHERE id = :id")
    Question getQuestion(int id);
}
