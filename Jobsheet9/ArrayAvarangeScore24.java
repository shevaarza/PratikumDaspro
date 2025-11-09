package Jobsheet9;
import java.util.Scanner;

public class ArrayAvarangeScore24 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        int[] score = new int[10];
        int total = 0;
        double avarage ;

        for(int i = 1 ; i <= score.length; i++){
            System.out.print("Enter the final score " +i+ ": " );
            score[i] = scanner.nextInt();
        }

        for(int i = 1 ; i <= score.length ; i++){
            System.out.println("final score :"+ score[i]);

            total = total + score[i];
        }

        System.out.println("the total final result is " + total);

        avarage = total / score.length;

        System.out.println("---------- avarage total result -----------");
        System.out.println("the result is " + avarage);
    }
}
