package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.NOD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - NOD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String gameNum = scan.next();
        System.out.println("Your choice: " + gameNum);
        switch (gameNum) {
            case "0":
                System.out.println("Your choice: " + gameNum);
                break;
            case "1":
                greeting(scan);
                break;
            case "2":
                Even.play(scan);
                break;
            case "3":
                Calc.play(scan);
                break;
            case "4":
                NOD.play(scan);
                break;
            case "5":
                Progression.play(scan);
                break;
            case "6":
                Prime.play(scan);
                break;
            default:
                System.out.println("No game available with this number: " + gameNum);
                break;
        }
        scan.close();
    }
}
