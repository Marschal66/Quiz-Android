package com.github.marschal66.quiz.android.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.github.marschal66.quiz.android.database.data.Answer;
import com.github.marschal66.quiz.android.database.data.CorrectAnswer;

@Dao
public interface CorrectAnswerDao {
    @Insert
    void insert(CorrectAnswer correctAnswer);

    @Update
    void update(CorrectAnswer correctAnswer);

    @Query("SELECT * FROM Answer as a INNER JOIN CorrectAnswer as qa ON a.id = qa.answerID WHERE qa.questionID = :questionID")
    Answer[] getCorrectAnswers(int questionID);
}
