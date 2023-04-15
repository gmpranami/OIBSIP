import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int lower, upper, x, guess, count = 0;
        double logChances;
        
        System.out.print("Enter Lower bound:- ");
        lower = input.nextInt();
        
        System.out.print("Enter Upper bound:- ");
        upper = input.nextInt();
        
        x = rand.nextInt(upper - lower + 1) + lower;
        logChances = Math.log(upper - lower + 1) / Math.log(2);
        System.out.println("\n\tYou've only " + Math.round(logChances) + " chances to guess the integer!\n");
        
        while (count < logChances) {
            count++;
            System.out.print("Guess a number:- ");
            guess = input.nextInt();
            
            if (x == guess) {
                System.out.println("Congratulations you did it in " + count + " try");
                break;
            } else if (x > guess) {
                System.out.println("You guessed too small!");
            } else if (x < guess) {
                System.out.println("You Guessed too high!");
            }
        }
        
        if (count >= logChances) {
            System.out.println("\nThe number is " + x);
            System.out.println("\tBetter Luck Next time!");
        }
    }
}
