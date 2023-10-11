package mainCode.guessingModes;

import java.util.Random;
import java.util.Scanner;

public class ggEasyMode {

    private int ramNum;
    private String userName;

    public ggEasyMode(String userName) {
        this.userName = userName;
    }


    // Generate the random number
    public void randomNumberGenerator() {
        Random random = new Random();
        this.ramNum = random.nextInt(10) + 1;

        //System.out.println("Número aleatório: " + this.ramNum);
        System.out.println(" ");

        playEasyMode();
    }

    // Mode logic
    private void playEasyMode() {
        Scanner scanner = new Scanner(System.in);
        
        int maxTries = 5;
        int currentTry = 0;

        do{
            System.out.println("Adivinhe o número:");
            System.out.println(" ");
            int userGuess = scanner.nextInt();

            if (userGuess == this.ramNum) {
                System.out.println("Parabéns " + userName +", você acertou! O número sorteado foi: " + this.ramNum);
                break;
            } else {
                currentTry++;
                int remainingTries = maxTries - currentTry;

                if (remainingTries == 0) {
                    System.out.println("Opps, " + userName + "! Parece que você esgotou suas tentativas, o número era: " + ramNum + "!");
                    System.out.println(" ");
                } else {
                    System.out.println(" ");
                    System.out.println("Você errou, tente novamente! (" + remainingTries + " tentativas restantes!)");
                    System.out.println(" ");
                }
            }
        } while (currentTry < maxTries);
        scanner.close();
    }
}