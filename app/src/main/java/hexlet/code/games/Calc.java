package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Calc {
    private static final int FINAL_COUNT = 3;

    private Calc() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameCalc() {
        Engine.greetingUser();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        var count = 0;

        for (int i = 0; i < FINAL_COUNT; i++) {

            var firstNum = Engine.randomNum();
            var secondNum = Engine.randomNum();
            var operation = Engine.randomOperation();
            var correctAnswer = calculate(firstNum, secondNum, operation);

            System.out.println("Question: " + firstNum + " " + operation + " " + secondNum);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (correctAnswer == userAnswer) {
                count++;
                Engine.trueAns();
            } else {
                Engine.falseNums(userAnswer, correctAnswer);
                break;
            }

        }
        if (count == FINAL_COUNT) {
            Engine.userWin();
        }
    }

    private static int calculate(int a, int b, char operation) {
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

}
