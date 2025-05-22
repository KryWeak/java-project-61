package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS = 3;

    public static void runGame(String description, String[][] questionAndCorrectAnswer) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

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

}
