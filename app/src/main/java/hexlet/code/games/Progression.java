package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public final class Progression {
    private static final int FINAL_COUNT = 3;
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    private static final int MIN_DIFFERENCE = 1;
    private static final int MAX_DIFFERENCE = 10;

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameProgression() {
        Scanner scanner = new Scanner(System.in);
        Engine.greetingUser();
        System.out.println("What number is missing in the progression?");

        int count = 0;


        for (int i = 0; i < FINAL_COUNT; i++) {

            int firstNum = Engine.randomNum();
            int length = Engine.randomNum(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int difference = Engine.randomNum(MIN_DIFFERENCE, MAX_DIFFERENCE);
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

        if (count == FINAL_COUNT) {
            Engine.userWin();
        }

    }
}
