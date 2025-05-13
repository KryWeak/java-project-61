package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String userName;

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
        System.out.println(userWord + " is wrong answer ;(. Correct answer was " + trueWord + ".");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void userWin() {
        System.out.println("Congratulations, " + userName + "!");
    }


    public static int randomNum() {
        Random random = new Random();
        var endRandomNum = 99;
        int randomNums = random.nextInt(endRandomNum);
        return  randomNums;

    }

    public static char randomOperation() {
        Random random = new Random();
        char[] operations = {'+', '-', '*'};
        var startBound = 0;
        var endBound = 3;

        var result = operations[random.nextInt(startBound, endBound)];
        return  result;

    }

}
