package Jobsheet8;
import java.util.Scanner;
import java.util.Random;

public class Quizgame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = scanner.nextInt();
                scanner.nextLine();

                if (answer == number) {
                    System.out.println("Correct! Good job!");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Too small! Try again!");
                } else {
                    System.out.println("Too large! Try again!");
                }

            } while (!success);

            System.out.print("Do you want to repeat the game (y/n): ");
            menu = scanner.next().charAt(0);
            scanner.nextLine();

        } while (menu == 'y' || menu == 'Y');

        System.out.println("Game Over. Thanks for playing!");
    }
}

// 1. . Explain the program flow in Experiment 4! 

//         ✅ Simple Explanation of the Quiz Game Program
//        a. The program picks a random number between 1 and 10.
//       b.  The user must guess the number.
//        c. If the guess is wrong, the program asks again.
//        d. If the guess is correct, the program asks:
//        d. "Do you want to play again?"
//        e.  If the user answers 'y', the game repeats with a new random number.
//        f.  If the user answers 'n', the program stops.


// 2. What must be done to discontinue (not repeat) the game? 

// ✅ To discontinue (not repeat) the game, the user must type 'n' or 'N' when the program asks:
// "Do you want to repeat the game (y/n):"


