package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        Scanner scanner = new Scanner(System.in);
        Engine.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 0;
        int finalCount = 3;

        for (int i = 0; i < finalCount; i++) {
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

        if (count == finalCount) {
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
            return "yes";
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
