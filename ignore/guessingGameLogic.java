package ignore; 

import java.util.Random;
import java.util.Scanner;

public class guessingGameLogic {
    private int randomNumber; // Declare randomNumber as a class-level field
    private int maxTries; // Maximum number of tries
    private Scanner scanner;

    public guessingGameLogic(int maxTries, int maxRange) {
        this.maxTries = maxTries;
        this.scanner = new Scanner(System.in);
        initializeRandomNumber(maxRange);
    }

    private void initializeRandomNumber(int maxRange) {
        Random random = new Random();
        randomNumber = random.nextInt(maxRange) + 1;
        // Uncomment the next line for debugging:
         System.out.println("(DEBUG)Número aleatório: " + randomNumber);
    }

    public void playGame() {
        int currentTries = 0;

        while (currentTries < maxTries) {
            System.out.println("Adivinhe o número:");
            int userGuess = scanner.nextInt();

            System.out.println("Você adivinhou: " + userGuess);

            if (userGuess == randomNumber) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else {
                System.out.println("Você errou. Tente novamente.");
                currentTries++;
            }
        }

        if (currentTries >= maxTries) {
            System.out.println("Você atingiu o limite de tentativas. O número correto era: " + randomNumber);
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
