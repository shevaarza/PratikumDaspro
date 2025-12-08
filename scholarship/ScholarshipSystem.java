
import java.util.Scanner;

public class ScholarshipSystem {

    // Maximum number of applicants allowed
    static final int MAX = 100;

    // Arrays to store applicant data
    static String[] names = new String[MAX];
    static String[] nims = new String[MAX];
    static double[] gpas = new double[MAX];
    static String[] types = new String[MAX];
    static long[] incomes = new long[MAX];

    static int count = 0; // number of students saved

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Main menu loop
        do {
            System.out.println("\n===== Scholarship Registration System =====");
            System.out.println("1. Add Applicant");
            System.out.println("2. Display All Applicants");
            System.out.println("3. Search by Scholarship Type");
            System.out.println("4. Average GPA by Scholarship Type");
            System.out.println("5. Exit");
            System.out.print("Choose 1-5: ");

            choice = sc.nextInt();
            sc.nextLine(); // remove leftover newline

            switch (choice) {
                case 1 -> addApplicant(sc);
                case 2 -> displayAll();
                case 3 -> searchByType(sc);
                case 4 -> showAverage();
                case 5 -> System.out.println("Program ended.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // ------------------------------------------
    // 1. Add applicant data
    // ------------------------------------------
    public static void addApplicant(Scanner sc) {
        if (count >= MAX) {
            System.out.println("Data storage is full!");
            return;
        }

        System.out.print("Student Name: ");
        names[count] = sc.nextLine();

        System.out.print("NIM: ");
        nims[count] = sc.nextLine();

        System.out.print("Latest GPA: ");
        gpas[count] = sc.nextDouble();
        sc.nextLine(); 

        // Validate scholarship type
        String inputType;
        while (true) {
            System.out.print("Scholarship Type (Regular/Outstanding/Research): ");
            inputType = sc.nextLine();

            if (inputType.equalsIgnoreCase("Regular") ||
                inputType.equalsIgnoreCase("Outstanding") ||
                inputType.equalsIgnoreCase("Research"))
                break;

            System.out.println("Invalid type! Please enter correctly.");
        }
        types[count] = inputType;

        // Validate income
        System.out.print("Parent's Income (max 2000000): ");
        long inc = sc.nextLong();
        sc.nextLine();

        if (inc > 2000000) {
            System.out.println("Application rejected (income too high).");
            return; 
        }

        incomes[count] = inc;

        count++;
        System.out.println("Applicant saved successfully. Total: " + count);
    }

    // ------------------------------------------
    // 2. Display all applicants
    // ------------------------------------------
    public static void displayAll() {
        if (count == 0) {
            System.out.println("No applicants available.");
            return;
        }

        System.out.println("\n========== ALL APPLICANTS ==========");
        System.out.printf("%-12s %-12s %-6s %-15s %-10s\n",
                "Name", "NIM", "GPA", "Type", "Income");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-12s %-12s %-6.2f %-15s %-10d\n",
                    names[i], nims[i], gpas[i], types[i], incomes[i]);
        }
    }

    // ------------------------------------------
    // 3. Search applicants by type
    // ------------------------------------------
    public static void searchByType(Scanner sc) {
        if (count == 0) {
            System.out.println("There are no applicants.");
            return;
        }

        System.out.print("Enter Scholarship Type: ");
        String searchType = sc.nextLine();

        boolean found = false;
        System.out.println("\nApplicants with type: " + searchType);

        for (int i = 0; i < count; i++) {
            if (types[i].equalsIgnoreCase(searchType)) {
                System.out.printf("%s | %s | GPA: %.2f | Income: %d\n",
                        names[i], nims[i], gpas[i], incomes[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No applicants found.");
        }
    }

    // ------------------------------------------
    // 4. Calculate and show average GPA
    // ------------------------------------------
    public static void showAverage() {
        if (count == 0) {
            System.out.println("There are no applicants.");
            return;
        }

        double regSum = 0, outSum = 0, resSum = 0;
        int regCount = 0, outCount = 0, resCount = 0;

        for (int i = 0; i < count; i++) {
            switch (types[i].toLowerCase()) {
                case "regular" -> { regSum += gpas[i]; regCount++; }
                case "outstanding" -> { outSum += gpas[i]; outCount++; }
                case "research" -> { resSum += gpas[i]; resCount++; }
            }
        }

        System.out.println("\n===== Average GPA =====");
        System.out.println("Regular     : " + (regCount == 0 ? "No applicants" : regSum / regCount));
        System.out.println("Outstanding : " + (outCount == 0 ? "No applicants" : outSum / outCount));
        System.out.println("Research    : " + (resCount == 0 ? "No applicants" : resSum / resCount));
    }
}
