package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.getRandomNumberUsingNextInt;
import static hexlet.code.Engine.WIN_GAMES_COUNT;

public class Calc {
    private static final int MIN_RANGE_RANDOM = 10;
    private static final int MAX_RANGE_RANDOM = 100;
    private static final int OPERATOR_RANGE = 3;
    private int calcResult;
    private String operand;

    Calc(int calcResult, String operand) {
        this.calcResult = calcResult;
        this.operand = operand;
    }

    public static void play(Scanner scan) {
        int firstNumber;
        int nextNumber;
        String[][] answers = new String[WIN_GAMES_COUNT][2];
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < WIN_GAMES_COUNT; i++) {
            firstNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            nextNumber = getRandomNumberUsingNextInt(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
            Calc calc = Calc.generateExpr(firstNumber, nextNumber);
            answers[i][0] = "Question: " + firstNumber + " " + calc.getOperand() + " " + nextNumber;
            answers[i][1] = String.valueOf(calc.getCalcResult());
        }
        Engine.run(scan, answers);
    }
    public String getOperand() {
        return this.operand;
    }

    public int getCalcResult() {
        return this.calcResult;
    }

    public static Calc generateExpr(int num1, int num2) {
        String operand = null;
        int res = 0;
        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(OPERATOR_RANGE);

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
