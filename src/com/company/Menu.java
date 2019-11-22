package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Menu.Menu;

public class Menu {
    public static void Menu() {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("-= Welcome to The Quiz =-");
        System.out.println("1. JavaQuiz");
        System.out.println("2. High score");
        System.out.println("3. Exit");
        option = input.nextInt();

        switch (option) {
            case 1:
                new QuizMenu();
                break;
            case 2:
                System.out.println("-= High Score =-");
                break;
            case 3:
                System.out.println("-= Exit =-");
                System.exit(0);
                break;
        }
    }
}

class QuizMenu {
    public QuizMenu() {
        QuizCsv quizCsv = new QuizCsv();
        Scanner input = new Scanner(System.in);
        ArrayList<Question> quizArray = quizCsv.readAllQuiz();
        String option;

        System.out.println("-= Choose your chapter =-");
        System.out.println("1. Chapter 1, Getting started with Java ");
        System.out.println("2. Chapter 2, Java - Objected Oriented Programing (OOP)");
        System.out.println("3. Chapter 3, Java - Fundamentals");
        System.out.println("4. Random Question");
        System.out.println("5. Main Menu");
        option = input.nextLine();

        switch (option) {
            case "1":
                Game game = new Game(quizArray, input);
                game.startGame();

                new QuizMenu();
                break;
            case "2":
                System.out.println("-= Chapter 2  =-");
                break;
            case "3":
                System.out.println("-= Chapter 3  =-");
                break;
            case "4":
                RandomGame randomGame = new RandomGame(quizArray, input);
                randomGame.startGame();

                new QuizMenu();
                break;
            case "5":
                Menu();
                break;
        }
    }
}