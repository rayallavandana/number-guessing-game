package src;

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Let's start the game");
        while (true) {
            System.out.println("Enter your guess (1-100):");
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Correct! you won the game");
                break;
            } else if (playerGuess > randomNumber) {
                System.out.println("The number you entered is greater than the random number,Try agin.");
            } else {
                System.out.println("The number you entered is lower than the random number,Try agin");
            }
        }scanner.close();
    }
}


