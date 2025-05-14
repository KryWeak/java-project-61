package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Prime {
    private static final int FINAL_COUNT = 3;

    private Prime() {
        throw new IllegalStateException("Utility class");
    }

    public static void gamePrime() {
        Scanner scanner = new Scanner(System.in);
        Engine.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 0;

        for (int i = 0; i < FINAL_COUNT; i++) {
            int numRandom = Engine.randomNum();
            System.out.print("Question: " + numRandom);
            String correctAnswer = checkPrime(numRandom);
            System.out.print("\nYour answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                Engine.trueAns();
                count++;
            } else {
                Engine.falseWord(userAnswer, correctAnswer);
                break;
            }

        }

        if (count == FINAL_COUNT) {
            Engine.userWin();
        }

    }

    public static String checkPrime(int num) {
        if (num <= 1) {
            return "no";
        }
        if (num == 2) {
            return "yes";
        }
        if (num % 2 == 0) {
            return "no";
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
