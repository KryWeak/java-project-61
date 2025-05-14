package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Even {

    private Even() {
        throw new IllegalStateException("Utility class");
    }

    public static void gameEven() {
        Engine.greetingUser();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var count = 0;
        var finalCount = 3;


        for (int i = 0; i < finalCount; i++) {
            int rundomNum = Engine.randomNum();
            System.out.println("\nQuestion: " + rundomNum);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            String even = "";

            if (rundomNum % 2 == 0) {
                even = "yes";
            } else {
                even = "no";
            }

            if (userAnswer.equals(even)) {
                Engine.trueAns();
                count++;
            } else {
                Engine.falseWord(userAnswer, even);
                break;
            }

        }
        if (count == finalCount) {
            Engine.userWin();
        }

    }
}
