package Jobsheet10;
import java.util.Scanner;

public class CinemawithScSheva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] audience = new String[4][2];
        boolean running = true;

        while (running) {
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();

            int row, col;


            while (true) {
                System.out.print("Enter the seat row (1-4): ");
                row = scanner.nextInt();

                System.out.print("Enter the seat column (1-2): ");
                col = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                if (row < 1 || row > 4 || col < 1 || col > 2) {
                    System.out.println(" Invalid seat! Please enter again.");
                    continue;
                }

                if (audience[row - 1][col - 1] != null) {
                    System.out.println(" Seat already taken by " + audience[row - 1][col - 1]);
                    continue;
                }

                break;
            }

            audience[row - 1][col - 1] = name;

            System.out.print("Any other audience? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                running = false;
            }
        }

        System.out.println("\n=== Audience Seating ===");
        for (int i = 0; i < audience.length; i++) {
            for (int j = 0; j < audience[i].length; j++) {
                if (audience[i][j] == null) {
                    System.out.print("[ Empty ]\t");
                } else {
                    System.out.print("[ " + audience[i][j] + " ]\t");
                }
            }
            System.out.println();
        }
    }
}


// 1. Should the array elements from the scanner be filled in sequentially starting from the 
// 0th index? Please explain!
// answer:
// In this implementation, the array elements do not have to be filled in sequentially starting from
// the 0th index. The program allows users to choose specific seats (row and column) for each audience

