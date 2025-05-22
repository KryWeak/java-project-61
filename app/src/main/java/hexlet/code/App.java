package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

class App {
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 5 - Progression"
                + "\n 6 - Prime"
                + "\n 0 - Exit"
                + "\n Your choice: ");
        int numGame = scanner.nextInt();

        switch (numGame) {
            case CLI -> Cli.greeting();
            case EVEN -> Even.runGame();
            case CALC -> Calc.runGame();
            case GCD_GAME -> GCD.runGame();
            case PROGRESSION -> Progression.runGame();
            case PRIME -> Prime.runGame();

            default -> {
                System.out.println("Unknown game number");
            }
        }

    }
}
