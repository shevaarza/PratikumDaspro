package Jobsheet8;
import java.util.Scanner;

public class Nestedloop24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        System.out.println("--- Enter Temperature Data ---");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        System.out.println("\n--- Displaying Temperatures & Average For Each City ---");

        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            System.out.print("City " + i + ": ");
            
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                sum += temps[i][j];
            }

            double average = sum / temps[0].length;
            System.out.println(" | Average = " + average);
        }

        scanner.close();
    }
}
