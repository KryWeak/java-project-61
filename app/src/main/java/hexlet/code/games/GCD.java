package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class GCD {
    private static final int ROUNDS = 3;

    public static void gameGCD() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionAndCorrectAnswer = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int a = Engine.randomNum();
            int b = Engine.randomNum();
            int gcd = findGCD(a, b);

            questionAndCorrectAnswer[i][0] = a + " " + b;
            questionAndCorrectAnswer[i][1] = String.valueOf(gcd);
        }

        Engine.game(description, questionAndCorrectAnswer);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;

    }
}
