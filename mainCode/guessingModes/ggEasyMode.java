package mainCode.guessingModes;

import java.util.Random;
import java.util.Scanner;

public class ggEasyMode {

    private int ramNum;

    // Generate the random number
    public void randomNumberGenerator() {
        Random random = new Random();
        this.ramNum = random.nextInt(10) + 1;
        System.out.println("Número aleatório: " + this.ramNum);
        playEasyMode();
    }

    // Mode logic
    private void playEasyMode() {
        Scanner scanner = new Scanner(System.in);



// FIX THIS SHIT

/*
        int currentTry = 0;

        do {
            System.out.println("Adivinhe o número:");
            int userGuess = scanner.nextInt();
            if (userGuess == this.ramNum) {
                System.out.println("Parabéns, você acertou! O número sorteado foi: " + this.ramNum);
                break;
            } else {
                currentTry++;
                int remainingTries = 5 - currentTry;
                if (currentTry == 0) {
                    System.out.println("Você errou na primeira tentativa, " + remainingTries + " tentativas restantes!");
                } else {
                    System.out.println("Você errou, tente novamente! " + remainingTries + " tentativas restantes!");
                }
            }
        } while (currentTry < 5);
*/


// FIX THIS SHIT



        scanner.close();
    }
}