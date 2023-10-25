import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int attempts = 10;
        int roundscore=0;
        int totalscore=0;
        boolean win = false;
        roundscore=attempts;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number  between 1 and 100.");
        System.out.println("You have " + attempts + "attempts  to find it.");
        while (attempts > 0 && !win) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else {
                attempts--;
                if (guess == number) {
                    win = true;
                    System.out.println("Congratulations! You guessed the number in " + (10 - attempts) + " tries.");
                } else {
                    if (guess > number) {
                        System.out.println("Your guess is too high.");
                    } else {
                        System.out.println("Your guess is too low.");
                    }

                    if (attempts > 0) {
                        System.out.println("You have " + attempts + " attempts left.");
                    } else {
                        System.out.println("Sorry, you have no more attempts. The number was " + number + ".");
                    }
                }
            }
        }
        totalscore += roundscore;
        System.out.println("Game over. Your total score is: " + totalscore);

        scanner.close();
    }
}  
