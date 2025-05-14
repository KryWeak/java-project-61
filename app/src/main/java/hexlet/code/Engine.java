package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static String userName;
    private static final int DEFAULT_MAX_RANDOM = 99;
    private static final int START_BOUND = 0;
    private static final int END_BOUND = 3;
    private static Random random = new Random();

    private Engine() {
        throw new IllegalStateException("Utility class");
    }


    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

    }

    public static void trueAns() {
        System.out.println("Correct!");
    }

    public static void falseNums(int  userNum, int trueNum) {
        System.out.println(userNum + " is wrong answer ;(. Correct answer was " + trueNum + ".");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void falseWord(String userWord, String trueWord) {
        System.out.println("'" + userWord + "' is wrong answer ;(. Correct answer was '" + trueWord + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void userWin() {
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
