// Import
import java.util.Scanner; // Import Scanner utility
import guessing.guessingGameLogic; // Import .java file from the guessing package


// Code
public class guessingGameApp {
    private Scanner scanner = new Scanner(System.in); // Create a Scanner object to collect user input
    public static void main(String[] args) {
        System.out.println("Qual sua idade?");

        int userAge = new guessingGameApp().scanner.nextInt(); // Read user input

        System.out.println("Your age is: " + userAge); // Display the user's age for verification

        guessingGameLogic gameLogic; // Declare a variable to hold guessingGameLogic connection

        if (userAge < 12) { // Check the user's age and select the appropriate game version
            gameLogic = new guessingGameLogic(5, 10); // Set the "young" version with the propper parameters
        } else {
            gameLogic = new guessingGameLogic(10, 1000); // Set the "old" version with the propper parameters
        }

        gameLogic.playGame(); // Call "playGame" method from guessing.guessingGameLogic
        gameLogic.closeScanner(); // Clean up: close the scanner object
    }
}
