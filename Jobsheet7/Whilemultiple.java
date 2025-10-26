package Jobsheet7;

import java.util.Scanner;
public class Whilemultiple {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int multiple , i=1, sum = 0 , counter=0;
        
        System.out.println("===== While multiple =====");
        System.out.print("input multiple :");
        multiple = input.nextInt();

        while (i <=50) {
            if(i % multiple == 0 ){
                System.out.println(i + " ");
                sum += i;
                counter++;
            }
            i++ ;
        }
         double average = (double) sum / counter;
        System.out.println("\nThere are " + counter + " numbers that are multiples of " + multiple + " in range 1 to 50.");
        System.out.println("The sum of all multiples of " + multiple + " is " + sum + ".");
        System.out.println("The average of all multiples is " + average);
    }
}
