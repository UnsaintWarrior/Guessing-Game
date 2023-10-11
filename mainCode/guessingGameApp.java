package mainCode;

// Imports
import java.util.Scanner;
import mainCode.guessingModes.ggEasyMode;
import mainCode.guessingModes.ggHardMode;

//Code
public class guessingGameApp {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Bem vindo ao jogo! Aqui você irá, em 5 tentativas, tentar acertar o número aleatório que eu escolhi!");
        System.out.println(" ");
        System.out.println("Antes de começarmos, pode me dizer seu nome?");
        System.out.println(" ");
        String userName = new guessingGameApp().scanner.next();
        System.out.println(" ");
        System.out.println("ótimo, é um prazer em conhece-lo: " + userName);
        System.out.println(" ");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        System.out.println("Antes de começarmos preciso que digite sua idade:");
        System.out.println(" ");
        int userAge = new guessingGameApp().scanner.nextInt();
        System.out.println(" ");
        System.out.println("Você tem " + userAge + " anos!");
        System.out.println(" ");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        if (userAge < 12) {
            //Run easyMode code
            System.out.println("Você é jovem, portanto irá jogar no modo easy!");
            System.out.println(" ");
            ggEasyMode easyMode = new ggEasyMode(userName); 
            easyMode.randomNumberGenerator();
        } else {
            //Run hardMode code
            System.out.println("Você é mais experiente, portanto irá jogar no modo difícil!");
            System.out.println(" ");
            ggHardMode hardMode = new ggHardMode(userName);
            hardMode.randomNumberGenerator();
        }

    }
}