import java.util.Scanner;
import guessing.guessingGameLogic;

public class guessingGameApp {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual sua idade?");
        
        int userAge = new guessingGameApp().scanner.nextInt(); // Read user input using the shared scanner

        if (userAge < 12) {
            guessingGameLogic gameLogic = new guessingGameLogic();
            gameLogic.playYoungMode();
        }

        if (userAge >= 12) {
            // Handle adult mode if needed
        }
    }
}

