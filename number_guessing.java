import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args){
        //records the attempts of the player
        int attempts = 0;
        Random random = new Random();
        int storedNumber = random.nextInt(100)+1;
        //ask guest to enter a number
        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();
        //compares the players guessed numbers with the actual number
        while(guessNumber != storedNumber){
            if(guessNumber > storedNumber){
                System.out.println("too big");
                attempts++;
            }
            else {
                System.out.println("too small");
                attempts++;
            }
            //ask the player to re-enter a new number, if not there would be a bug
            guessNumber = scanner.nextInt();
         }
        System.out.println("Congratulations! You guessed the right Number");
        System.out.println("Attempts" + ":" + " "+ attempts);
    }
}

