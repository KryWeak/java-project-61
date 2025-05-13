package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 0 - Exit"
                + "\n Your choice: ");
        int numGame = scanner.nextInt();

        switch (numGame) {
            case 1 -> Cli.greeting();
            case 2 -> Even.gameEven();
            case 3 -> Calc.gameCalc();
            case 4 -> GCD.gameGCD();

            default -> { }
        }

    }
}
