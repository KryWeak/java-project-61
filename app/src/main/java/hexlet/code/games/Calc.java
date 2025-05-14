package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Calc {

    private Calc() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameCalc() {
        Engine.greetingUser();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        var count = 0;
        var finalCount = 3;

        for (int i = 0; i < finalCount; i++) {

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
        if (count == finalCount) {
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
