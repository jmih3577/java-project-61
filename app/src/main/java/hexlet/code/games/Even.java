package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.winGamesCount;

public class Even {
    private static final int MIN_RANGE_RANDOM = 0;
    private static final int MAX_RANGE_RANDOM = 100;
    public static void play(Scanner scan) {
        int evenNumber = 0;
        String[][] answers = new String[winGamesCount][2];
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < winGamesCount; i++) {
            evenNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            answers[i][0] = "Question: " + evenNumber;
            if (evenNumber % 2 == 0) {
                answers[i][1] = "yes";
            } else {
                answers[i][1] = "no";
            }
        }
        Engine.run(scan, answers);
    }
}
