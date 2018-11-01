package com.example.uzzal.quizapp;

import android.provider.BaseColumns;
import android.widget.BaseAdapter;

public final class QuizContract {


    private QuizContract(){

    }

    public static class QuestionTable implements BaseColumns {

              //** Table Name...
        public static final String TABLE_NAME = "quiz_questions";
           //** column gula
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

        public static final String COLUMN_DIFFICULTY = "difficulty";







    }
}
