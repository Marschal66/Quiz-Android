package com.github.marschal66.quiz.android.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.github.marschal66.quiz.android.database.data.Answer;
import com.github.marschal66.quiz.android.database.data.QuestionAnswer;

@Dao
public interface QuestionAnswerDao {
    @Insert
    void insert(QuestionAnswer questionAnswer);

    @Update
    void update(QuestionAnswer questionAnswer);

    @Query("SELECT * FROM Answer as a INNER JOIN QuestionAnswer as qa ON a.id = qa.answerID WHERE qa.questionID = :questionID")
    Answer[] getAnswers(int questionID);
}
