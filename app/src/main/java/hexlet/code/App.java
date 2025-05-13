package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 0 - Exit"
                + "\n Your choice: ");
        int numGame = scanner.nextInt();

        switch (numGame) {
            case 1 -> Cli.greeting();
            case 2 -> Even.gameEven();


            default -> { }
        }

    }
}
