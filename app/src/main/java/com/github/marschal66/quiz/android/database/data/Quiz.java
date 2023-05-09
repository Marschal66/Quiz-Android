package com.github.marschal66.quiz.android.database.data;

public class Quiz {
    private Question question;
    private Answer[] answers;

    public Quiz(Question question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public void update(Question question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer[] getAnswers() {
        return answers;
    }
}
