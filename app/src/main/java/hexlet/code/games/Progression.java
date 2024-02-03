package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.winGamesCount;

public class Progression {
    public static void play(Scanner scan) {
        int progressionInitNumber = 0;
        int progressionIterationNumber = 0;
        int progressionLength = 0;
        int progressionQuestionNumber = 0;
        String question;
        String answer = null;
        String[][] answers = new String[winGamesCount][2];
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < winGamesCount; i++) {
            question = "";
            progressionInitNumber = getRandomNumberUsingNextInt(0, 100);
            progressionIterationNumber = getRandomNumberUsingNextInt(0, 100);
            progressionLength = getRandomNumberUsingNextInt(5, 10);
            progressionQuestionNumber = getRandomNumberUsingNextInt(0, progressionLength);
            for (int j = 0; j < progressionLength; j++) {
                progressionInitNumber += progressionIterationNumber;
                if (j == progressionQuestionNumber) {
                    question += " ..";
                    answer = String.valueOf(progressionInitNumber);
                } else {
                    question += " " + progressionInitNumber;
                }
            }
            answers[i][0] = "Question:" + question;
            answers[i][1] = answer;
        }
        Engine.run(scan, answers);
    }
}
