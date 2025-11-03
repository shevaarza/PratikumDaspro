package Jobsheet8;
import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N :");
        int n = scanner.nextInt();

        for(int i=0 ; i <=n ;i++ ){
            for(int j = 0 ; j<= n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}


// 3. What is the difference between outer loop and inner loop?
//     answer : 

//     ✅ Outer Loop
//     The main loop on the outside.
//     It runs first, and controls how many times the inner loop repeats.

//     ✅ Inner Loop
//     A loop inside the outer loop.
//     It repeats many times for every one time the outer loop runs.