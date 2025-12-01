package Jobsheet10;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;

        int[][] survey = new int[respondents][questions];

        System.out.println("=== Input Hasil Survei (1 - 5) ===");

        // Input data
        for (int i = 0; i < respondents; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < questions; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
            }
        }

        System.out.println("\n=== Rata-rata Setiap Responden ===");
        // Rata-rata per responden
        for (int i = 0; i < respondents; i++) {
            int sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey[i][j];
            }
            double avg = (double) sum / questions;
            System.out.println("Responden " + (i + 1) + ": " + avg);
        }

        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        // Rata-rata per pertanyaan
        for (int j = 0; j < questions; j++) {
            int sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += survey[i][j];
            }
            double avg = (double) sum / respondents;
            System.out.println("Pertanyaan " + (j + 1) + ": " + avg);
        }

        System.out.println("\n=== Rata-rata Keseluruhan ===");
        // Rata-rata keseluruhan
        int total = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                total += survey[i][j];
            }
        }

        double overall = (double) total / (respondents * questions);
        System.out.println("Rata-rata keseluruhan: " + overall);
    }
}
