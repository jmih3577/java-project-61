package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.WIN_GAMES_COUNT;

public class Prime {

    private static final int MIN_RANGE_RANDOM = 10;
    private static final int MAX_RANGE_RANDOM = 100;
    
    public static void play(Scanner scan) {
        int checkNumber;
        String[][] answers = new String[WIN_GAMES_COUNT][2];
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < WIN_GAMES_COUNT; i++) {
            checkNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            answers[i][0] = "Question: " + checkNumber;
            answers[i][1] = checkPrime(checkNumber);
        }
        Engine.run(scan, answers);
    }

    public static String checkPrime(int n1) {
        String isPrime = "yes";
        for (int i = 2; i <= n1 / 2; i++) {
            if ((n1 % i) == 0) {
                isPrime = "no";
                break;
            }
        }
        return isPrime;
    }
}
