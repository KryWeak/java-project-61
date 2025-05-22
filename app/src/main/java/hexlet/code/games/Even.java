package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] questionAndCorrectAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.randomNum();
            questionAndCorrectAnswer[i][0] = String.valueOf(number);
            questionAndCorrectAnswer[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.runGame(DESCRIPTION, questionAndCorrectAnswer);
    }
}
