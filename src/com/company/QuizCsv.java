package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizCsv implements IQuiz{
    public ArrayList<Question> readAllQuiz() {
        File file = new File("./quizChapters/chapterOne.csv");
        ArrayList<Question> quizArray = new ArrayList<Question>();

        try {
            Scanner inFile = new Scanner(file);
            while (inFile.hasNext()) {
                String line = inFile.nextLine();
                String[] lineData = line.split(";");
                Question quiz = new Question(lineData[0], lineData[1]);
                quizArray.add(quiz);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return  quizArray;
    }
}
