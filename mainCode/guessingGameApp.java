package mainCode;

// Imports
import java.util.Scanner;
import mainCode.guessingModes.ggEasyMode;

//Code
public class guessingGameApp {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pronto para jogar? digite sua idade!");
        int userAge = new guessingGameApp().scanner.nextInt();
        System.out.println("Sua idade é: " + userAge + " anos!");

        if (userAge < 12) {
            //Run easyMode code
            System.out.println("Você é jovem, portanto irá jogar no modo easy!");
            ggEasyMode easyMode = new ggEasyMode();
            easyMode.randomNumberGenerator();
        } else {
            //Run hardMode code
            System.out.println("Você é mais velho, portanto irá jogar no modo hard!");
        }
    }
}