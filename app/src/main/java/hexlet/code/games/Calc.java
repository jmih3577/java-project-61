package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.winGamesCount;

public class Calc {
    private int calcResult;
    private String operand;

    Calc(int calcResult, String operand) {
        this.calcResult = calcResult;
        this.operand = operand;
    }

    public static void play(Scanner scan) {
        int firstNumber;
        int nextNumber;
        String[][] answers = new String[winGamesCount][2];
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < winGamesCount; i++) {
            firstNumber = getRandomNumberUsingNextInt(10, 100);
            nextNumber = getRandomNumberUsingNextInt(10, 100);
            Calc calc = Calc.generateExpr(firstNumber, nextNumber);
            answers[i][0] = "Question: " + firstNumber + " " + calc.getOperand() + " " + nextNumber;
            answers[i][1] = String.valueOf(calc.getCalcResult());
        }
        Engine.run(scan, answers);
    }
    public String getOperand() {
        return this.operand;
    }

    // void потому что ничего не возвращает
    public void setOperand(String operand) {
        this.operand = operand;
    }

    public int getCalcResult() {
        return this.calcResult;
    }

    // void потому что ничего не возвращает
    public void setCalcResult(int calcResult) {
        this.calcResult = calcResult;
    }

    public static Calc generateExpr(int num1, int num2) {
        String operand = null;
        int res = 0;
        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(3);

        switch (operator) {
            case 0: operand = "+";
                res = num1 + num2;
                break;
            case 1: operand = "-";
                res = num1 - num2;
                break;
            case 2: operand = "*";
                res = num1 * num2;
                break;
            default: operand = "";
        }
        return new Calc(res, operand);
    }
}
