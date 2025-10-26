package Jobsheet7;

import java.util.Scanner;

public class formultiples24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.println("===== For Multiples =====");
        System.out.print("Input multiples: ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }
        
    //    double average = (double) sum / counter;
    //     System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50.\n", counter, multiple);
    //     System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
    //     System.out.printf("The average of all multiples of %d is %.2f\n", multiple, average);
    //     input.close();

    System.out.println(sum);
        System.out.println(counter);
    }
}
