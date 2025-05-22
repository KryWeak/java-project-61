package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    private static final int MIN_DIFFERENCE = 1;
    private static final int MAX_DIFFERENCE = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void runGame() {
        String[][] questionAndCorrectAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int firstNum = Utils.randomNum();
            int length = Utils.randomNum(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int difference = Utils.randomNum(MIN_DIFFERENCE, MAX_DIFFERENCE);
            int hiddenIndex = Utils.randomNum(0, length - 1);

            String question = "";
            int correctAnswer = 0;

            for (int j = 0; j < length; j++) {
                if (j == hiddenIndex) {
                    question += "..";
                    correctAnswer = firstNum + j * difference;
                } else {
                    question += (firstNum + j * difference);
                }

                if (j < length - 1) {
                    question += " ";
                }
            }

            questionAndCorrectAnswer[i][0] = question;
            questionAndCorrectAnswer[i][1] = String.valueOf(correctAnswer);

        }

        Engine.runGame(DESCRIPTION, questionAndCorrectAnswer);

    }
}
