package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {
    private static final int ROUNDS = 3;

    public static void gameEven() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndCorrectAnswer = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int number = Engine.randomNum();
            questionAndCorrectAnswer[i][0] = String.valueOf(number);
            questionAndCorrectAnswer[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.game(description, questionAndCorrectAnswer);

    }
}
