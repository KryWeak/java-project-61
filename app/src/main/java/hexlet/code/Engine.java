package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static String userName;
    private static final int DEFAULT_MAX_RANDOM = 99;
    private static final int START_BOUND = 0;
    private static final int END_BOUND = 3;
    private static final int ROUNDS = 3;
    private static Random random = new Random();

    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

    }

    public static void game(String description, String[][] questionAndCorrectAnswer) {
        Scanner scanner = new Scanner(System.in);
        greetingUser();

        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = questionAndCorrectAnswer[i][0];
            String correctAnswer = questionAndCorrectAnswer[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static int randomNum() {
        return random.nextInt(DEFAULT_MAX_RANDOM);

    }

    public static int randomNum(int minNum, int maxNum) {
        return random.nextInt(minNum, maxNum);

    }

    public static char randomOperation() {
        char[] operations = {'+', '-', '*'};
        return operations[random.nextInt(START_BOUND, END_BOUND)];

    }

}
