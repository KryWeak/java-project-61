package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
    private static final int START_BOUND = 0;
    private static final int END_BOUND = 3;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame() {
        String[][] questionAndCorrectAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = Utils.randomNum();
            int num2 = Utils.randomNum();
            char operator = randomOperation();

            int result = calculate(num1, num2, operator);

            questionAndCorrectAnswer[i][0] = num1 + " " + operator + " " + num2;
            questionAndCorrectAnswer[i][1] = String.valueOf(result);
        }

        Engine.runGame(DESCRIPTION, questionAndCorrectAnswer);
    }

    public static int calculate(int num1, int num2, char operator)  {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
    }

    public static char randomOperation() {
        char[] operations = {'+', '-', '*'};
        return operations[Utils.randomNum(START_BOUND, END_BOUND)];

    }
}
