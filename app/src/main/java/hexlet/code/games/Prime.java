package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static final int SMALLEST_ODD_PRIME = 3;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] questionAndCorrectAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.randomNum();
            questionAndCorrectAnswer[i][0] = String.valueOf(number);
            questionAndCorrectAnswer[i][1] = checkPrime(number) ? "yes" : "no";
        }

        Engine.runGame(DESCRIPTION, questionAndCorrectAnswer);
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = SMALLEST_ODD_PRIME; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
