package Jobsheet8;
import java.util.Scanner;
public class Experiment1 {
   
    public static void main(String[] args) {
        
       

Scanner scanner = new Scanner(System.in);
        int N;

        // 1. Get user input and validate (must be >= 3)
        do {
            System.out.print("Enter the value for N (minimum 3): ");
            N = scanner.nextInt();

            if (N < 3) {
                System.out.println("Invalid input. N must be 3 or greater.");
            }
        } while (N < 3); // Keep asking if N is less than 3

        System.out.println(); // Add a blank line for better formatting
        System.out.println("Numeric Triangle for N = " + N + ":");

        for(int i = 1 ; i<= N; i++){

            for(int s= 5; s >i ; s--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    
    }
}