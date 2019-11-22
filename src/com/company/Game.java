package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    ArrayList<Question> quizArray;
    Scanner input;

    public Game(ArrayList<Question> quizArray, Scanner input) {
        this.quizArray = quizArray;
        this.input = input;
    }

    public void startGame() {
        int scoreOne = 0;

        System.out.println("-= Chapter 1 =-");
        for(Question quiz : quizArray) {
            String[] questionAndAnswers = quiz.toString().split(",");
            System.out.println(questionAndAnswers[0]);
            for(int i = 1; i < questionAndAnswers.length; i++) {
                System.out.println(questionAndAnswers[i]);
            }
            String answer = input.nextLine().toLowerCase().trim();
            if(answer.equals(quiz.getQuizAnswer())) {
                scoreOne++;
            }
            else {
                // fel
            }
        }
        printScore(scoreOne);
    }

    void printScore(int scoreOne){
        System.out.println("------------------------------");
        System.out.println("------ You got " + scoreOne+" points ------");
        System.out.println("------------------------------\n");
        System.out.println("What do you want to do?");
    }
}
