package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {
    private static final int ROUNDS = 3;
    private static final int SMALLEST_ODD_PRIME = 3;

    public static void gamePrime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndCorrectAnswer = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int number = Engine.randomNum();
            questionAndCorrectAnswer[i][0] = String.valueOf(number);
            questionAndCorrectAnswer[i][1] = checkPrime(number) ? "yes" : "no";
        }

        Engine.game(description, questionAndCorrectAnswer);
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
