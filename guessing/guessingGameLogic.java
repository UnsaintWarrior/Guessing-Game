package guessing;

import java.util.Random;
import java.util.Scanner;

public class guessingGameLogic {
    private int randomYoungNumber; // Declare randomYoungNumber as a class-level field

    public void playYoungMode() {
        Random random = new Random();
        randomYoungNumber = random.nextInt(10) + 1;

        // System.out.println("(DEBUG)Número aleatório: " + randomYoungNumber); // Debug - Random number generator
        youngUserGuess();
    }

    private void youngUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe o número:");

        int userGuess = scanner.nextInt(); // Read user input and store it in a variable

        scanner.close();

        System.out.println("Você adivinhou: " + userGuess); // Print the user's guess

        // Compare the user's guess with the random number
        if (userGuess == randomYoungNumber) {
            System.out.println("Parabéns! Você acertou o número!");
        } else {
            System.out.println("Você errou. O número correto era: " + randomYoungNumber);
        }
    }
}
