package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] questionAndCorrectAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = Utils.randomNum();
            int b = Utils.randomNum();
            int gcd = findGCD(a, b);

            questionAndCorrectAnswer[i][0] = a + " " + b;
            questionAndCorrectAnswer[i][1] = String.valueOf(gcd);
        }

        Engine.runGame(DESCRIPTION, questionAndCorrectAnswer);
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
