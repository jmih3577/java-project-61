package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.App.gameNum;

public class Engine {
    public static int winGamesCount = 3;
    public static String answer = null;
    public static void run(Scanner scan, String[][] answers) {
        boolean errFlag = false;
        String userName = greet(gameNum, scan);
        for (int i = 0; i < winGamesCount; i++) {
            System.out.println(answers[i][0]);
            answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(answers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                errFlag = true;
                break;
            }
        }
        if (!errFlag) {
            System.out.println("Congratulations, " + userName);
        }
    }
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static String greet(String game, Scanner scan) {
        System.out.println("Your choice: " + game);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        return Cli.greeting(scan);
    }

}
