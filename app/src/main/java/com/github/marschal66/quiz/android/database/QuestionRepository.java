package com.github.marschal66.quiz.android.database;

import android.app.Application;

import com.github.marschal66.quiz.android.database.dao.AnswerDao;
import com.github.marschal66.quiz.android.database.dao.QuestionAnswerDao;
import com.github.marschal66.quiz.android.database.dao.QuestionDao;
import com.github.marschal66.quiz.android.database.data.Answer;
import com.github.marschal66.quiz.android.database.data.Question;
import com.github.marschal66.quiz.android.database.data.QuestionAnswer;
import com.github.marschal66.quiz.android.database.data.Quiz;

public class QuestionRepository {
    private final QuestionDao questionDao;
    private final AnswerDao answerDao;
    private final QuestionAnswerDao questionAnswerDao;

    public QuestionRepository(Application application) {
        QuestionDatabase db = QuestionDatabase.getInstance(application);
        questionDao = db.questionDao();
        answerDao = db.answerDao();
        questionAnswerDao = db.questionAnswerDao();
    }

    public Quiz getQuiz(int questionID){
        return new Quiz(questionDao.getQuestion(questionID),questionAnswerDao.getAnswers(questionID));
    }

    public void insertQuestion(Question question) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> questionDao.insert(question));
    }

    public void insertAnswer(Answer answer) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> answerDao.insert(answer));
    }

    public void insertQuestionAnswer(QuestionAnswer questionAnswer) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> questionAnswerDao.insert(questionAnswer));
    }

    public void updateQuestion(Question question) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> questionDao.update(question));
    }

    public void updateAnswer(Answer answer) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> answerDao.update(answer));
    }

    public void updateQuestionAnswer(QuestionAnswer questionAnswer) {
        QuestionDatabase.databaseWriteExecutor.execute(() -> questionAnswerDao.update(questionAnswer));
    }

}
