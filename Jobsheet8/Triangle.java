package Jobsheet8;
import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print(" enter the number :");
    int n = scanner.nextInt();
    int i = 0;

    while (i<= n) {
        int j = 0;
        while (j<i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    }
    
}
