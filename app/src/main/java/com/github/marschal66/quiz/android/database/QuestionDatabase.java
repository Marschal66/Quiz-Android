package com.github.marschal66.quiz.android.database;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.github.marschal66.quiz.android.database.dao.AnswerDao;
import com.github.marschal66.quiz.android.database.dao.CorrectAnswerDao;
import com.github.marschal66.quiz.android.database.dao.QuestionAnswerDao;
import com.github.marschal66.quiz.android.database.dao.QuestionDao;
import com.github.marschal66.quiz.android.database.data.Answer;
import com.github.marschal66.quiz.android.database.data.CorrectAnswer;
import com.github.marschal66.quiz.android.database.data.Question;
import com.github.marschal66.quiz.android.database.data.QuestionAnswer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Question.class, Answer.class, QuestionAnswer.class, CorrectAnswer.class}, version = 1, exportSchema = false)
public abstract class QuestionDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "quiz_database.db";
    private static volatile QuestionDatabase instance;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };

    public static synchronized QuestionDatabase getInstance(android.content.Context context) {
        if (instance == null) {
            instance = androidx.room.Room.databaseBuilder(context.getApplicationContext(), QuestionDatabase.class, DATABASE_NAME).addCallback(sRoomDatabaseCallback).build();
        }
        return instance;
    }

    private QuestionDatabase() {
    }

    public abstract QuestionDao questionDao();
    public abstract AnswerDao answerDao();
    public abstract QuestionAnswerDao questionAnswerDao();

    public abstract CorrectAnswerDao correctAnswerDao();
}
