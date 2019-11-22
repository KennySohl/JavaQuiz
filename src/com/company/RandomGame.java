package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomGame extends Game {

    public RandomGame(ArrayList<Question> quizArray, Scanner input) {
        super(quizArray, input);
    }

    public void startGame() {
        int scoreOne = 0;

        System.out.println("-= Random Quiz =-");
        int quizIndex = (int) (Math.random() * quizArray.size());
        Question quiz = quizArray.get(quizIndex);
        String[] questionAndAnswers = quiz.toString().split(",");
        System.out.println(questionAndAnswers[0]);
        for (int i = 1; i < questionAndAnswers.length; i++) {
            System.out.println(questionAndAnswers[i]);
        }
        String answer = input.nextLine().toLowerCase().trim();
        if (answer.equals(quiz.getQuizAnswer())) {
            scoreOne++;
        } else {
            // fel
        }

        printScore(scoreOne);
    }
}
