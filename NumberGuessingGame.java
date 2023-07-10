import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (numberOfTries < 10) {
            System.out.println("Guess a number between 1 and 100:");
            guess = sc.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            }
        }

        if (win) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. The number was " + numberToGuess + ".");
        }
    }
}
