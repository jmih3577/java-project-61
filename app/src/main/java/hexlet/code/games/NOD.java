package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.winGamesCount;

public class NOD {

    public static void play(Scanner scan) {
        int firstNumber;
        int nextNumber;
        String[][] answers = new String[winGamesCount][2];
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < winGamesCount; i++) {
            firstNumber = getRandomNumberUsingNextInt(10, 100);
            nextNumber = getRandomNumberUsingNextInt(10, 100);
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
