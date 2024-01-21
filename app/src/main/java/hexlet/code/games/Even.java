package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void play(String userName, Scanner scan) {
        int evenNumber;
        String answer;
        boolean errFlag = false;
        for (int i = 0; i < 3; i++) {
            evenNumber = getRandomNumberUsingNextInt(0, 100);
            System.out.println("Question: " + evenNumber);
            answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (evenNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    errFlag = true;
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    errFlag = true;
                    break;
                }
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
}
