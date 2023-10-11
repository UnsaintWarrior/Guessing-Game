package mainCode;

// Imports
import java.util.Scanner;
import mainCode.guessingModes.ggEasyMode;
import mainCode.guessingModes.ggHardMode;

//Code
public class guessingGameApp {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo de adivinha, aqui você irá, em 5 tentativas, acertar o número aleatório que eu escolhi!");

        System.out.println("Antes de começarmos, pode me dizer seu nome?");
        String userName = new guessingGameApp().scanner.next();
        System.out.println("ótimo, é um prazer em conhecelo: " + userName);
        
        try {
            // Wait for 5 seconds (5000 milliseconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle any exceptions that may occur
        }

        System.out.println("Antes de começarmos preciso que digite sua idade:");
        int userAge = new guessingGameApp().scanner.nextInt();
        System.out.println("Sua idade é: " + userAge + " anos!");
        
        try {
            // Wait for 5 seconds (5000 milliseconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle any exceptions that may occur
        }

        if (userAge < 12) {
            //Run easyMode code
            System.out.println("Você é jovem, portanto irá jogar no modo easy!");
            ggEasyMode easyMode = new ggEasyMode();
            easyMode.randomNumberGenerator();
        } else {
            //Run hardMode code
            System.out.println("Você é mais velho, portanto irá jogar no modo hard!");
            ggHardMode hardMode = new ggHardMode();
            hardMode.randomNumberGenerator();
        }
    }
}