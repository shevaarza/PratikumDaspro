package Jobsheet10;
import java.util.Scanner;

public class SiakadSheva {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];
        String[] name = {"sheva" , "atha" , "habibi" , "tete"};
        String[] course = {"Programming" , "Mathematic" , "CTPS"};

        System.out.println("------ your value siakad score --------");

        // INPUT NILAI
        for (int i = 0; i < score.length; i++) {

            System.out.println("\nEnter value for " + name[i] + ":");

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("  " + course[j] + " : ");
                score[i][j] = scanner.nextInt();
            }
        }

        // OUTPUT NILAI PER MAHASISWA
        System.out.println("\n------ Value of Mahasiswa ------");

        for (int i = 0; i < score.length; i++) {
            int total = 0;

            System.out.print("\n" + name[i] + " : ");

            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "  ");
                total += score[i][j];
            }

            double avg = total / 3.0;
            System.out.printf(" | Rata-rata: %.2f", avg);
        }

        // RATA-RATA PER MATA KULIAH
        System.out.println("\n\n------ Rata-rata Nilai Setiap Mata Kuliah ------");

        for (int j = 0; j < course.length; j++) {
            int totalCourse = 0;

            for (int i = 0; i < score.length; i++) {
                totalCourse += score[i][j];
            }

            double avgCourse = totalCourse / 4.0;
            System.out.printf(course[j] + " : %.2f\n", avgCourse);
        }

        scanner.close();
    }
}
