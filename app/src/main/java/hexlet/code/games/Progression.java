package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {
    private static final int ROUNDS = 3;
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    private static final int MIN_DIFFERENCE = 1;
    private static final int MAX_DIFFERENCE = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameProgression() {
        String[][] questionAndCorrectAnswer = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {

            int firstNum = Engine.randomNum();
            int length = Engine.randomNum(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int difference = Engine.randomNum(MIN_DIFFERENCE, MAX_DIFFERENCE);
            int hiddenIndex = Engine.randomNum(0, length - 1);

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

        Engine.game(DESCRIPTION, questionAndCorrectAnswer);

    }
}
