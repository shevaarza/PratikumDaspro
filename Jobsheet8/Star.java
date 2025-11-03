package Jobsheet8;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of N :");
    int n = scanner.nextInt();

    for(int i = 0 ; i > n ; i--){
        System.out.print("*");
    }
        
    }
}
