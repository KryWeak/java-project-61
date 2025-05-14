package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class GCD {

    private GCD() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameGCD() {
        Engine.greetingUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        int finalCount = 3;

        for (int i = 0; i < finalCount; i++) {

            int firstNum = Engine.randomNum();
            int secondNum = Engine.randomNum();
            System.out.println("Question: " + firstNum + " " + secondNum);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            while (secondNum != 0) {
                int temp = secondNum;
                secondNum = firstNum % secondNum;
                firstNum = temp;
            }

            int correctAnswer = firstNum;

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
}
