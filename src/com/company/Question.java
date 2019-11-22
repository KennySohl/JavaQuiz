package com.company;

public class Question {
    private String quizQuestion;
    private String quizAnswer;

    public Question(String quizQuestion, String quizAnswer) {
        this.quizQuestion = quizQuestion;
        this.quizAnswer = quizAnswer;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public String getQuizAnswer() {
        return quizAnswer;
    }

    public void setQuizAnswer(String quizAnswer) {
        this.quizAnswer = quizAnswer;
    }

    @Override
    public String toString() {
        return quizQuestion + "\n";
    }
}

