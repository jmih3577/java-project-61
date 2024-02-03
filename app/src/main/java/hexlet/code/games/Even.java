package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.winGamesCount;

public class Even {
    public static void play(Scanner scan) {
        int evenNumber = 0;
        String[][] answers = new String[winGamesCount][1];
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < winGamesCount; i++) {
            evenNumber = getRandomNumberUsingNextInt(0, 100);
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
