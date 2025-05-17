package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc {
    private static final int ROUNDS = 3;

    public static void gameCalc() {
        String description = "What is the result of the expression?";
        String[][] questionAndCorrectAnswer = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int num1 = Engine.randomNum();
            int num2 = Engine.randomNum();
            char operator = Engine.randomOperation();
            int result = switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                default -> throw new IllegalStateException("Unexpected operator: " + operator);
            };
            questionAndCorrectAnswer[i][0] = num1 + " " + operator + " " + num2;
            questionAndCorrectAnswer[i][1] = String.valueOf(result);
        }

        Engine.game(description, questionAndCorrectAnswer);
    }
}
