package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greeting(Scanner scan) {
        //Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scan.next();
        System.out.println("Hello, " + userName + "!");
        //scan.close();
        return userName;
    }
}
