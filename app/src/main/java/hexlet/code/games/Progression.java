package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public final class Progression {

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameProgression() {
        Scanner scanner = new Scanner(System.in);
        Engine.greetingUser();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        int finalCount = 3;

        int minLengthProgression = 5;
        int maxLengthProgression = 10;

        int minDifference = 1;
        int maxDifference = 10;


        for (int i = 0; i < finalCount; i++) {

            int firstNum = Engine.randomNum();
            int length = Engine.randomNum(minLengthProgression, maxLengthProgression);
            int difference = Engine.randomNum(minDifference, maxDifference);
            int hiddenIndex = Engine.randomNum(0, length - 1);
            int correctAnswer = firstNum + hiddenIndex * difference;

            System.out.print("Question: ");

            for (int j = 0; j < length; j++) {
                if (j == hiddenIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print((firstNum + j * difference) + " ");
                }
            }
            System.out.print("\nYour answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                Engine.trueAns();
                count++;
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
