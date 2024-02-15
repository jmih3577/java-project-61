package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.WIN_GAMES_COUNT;

public class NOD {
    private static final int MIN_RANGE_RANDOM = 10;
    private static final int MAX_RANGE_RANDOM = 100;

    public static void play(Scanner scan) {
        int firstNumber;
        int nextNumber;
        String[][] answers = new String[WIN_GAMES_COUNT][2];
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < WIN_GAMES_COUNT; i++) {
            firstNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            nextNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            answers[i][0] = "Question: " + firstNumber + " " + nextNumber;
            answers[i][1] = String.valueOf(getGDC(firstNumber, nextNumber));
        }
        Engine.run(scan, answers);
    }

    public static int getGDC(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGDC(n2, n1 % n2);
    }
}
