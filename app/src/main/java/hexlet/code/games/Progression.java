package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.WIN_GAMES_COUNT;

public class Progression {
    private static final int MIN_RANGE_RANDOM = 0;
    private static final int MAX_RANGE_RANDOM = 100;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    public static void play(Scanner scan) {
        int progressionInitNumber = 0;
        int progressionIterationNumber = 0;
        int progressionLength = 0;
        int progressionQuestionNumber = 0;
        String question;
        String answer = null;
        String[][] answers = new String[WIN_GAMES_COUNT][2];
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < WIN_GAMES_COUNT; i++) {
            question = "";
            progressionInitNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            progressionIterationNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            progressionLength = getRandomNumberUsingNextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            progressionQuestionNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, progressionLength);
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
