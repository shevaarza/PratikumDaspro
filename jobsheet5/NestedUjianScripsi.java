import java.util.Scanner;

public class NestedUjianScripsi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String message;

        System.out.println("====== Registration for Thesis Exam ======");
        System.out.print("\nHas the student been cleared of compensation? (Yes or No): ");
        String compensation = input.nextLine().trim();

        if (compensation.equalsIgnoreCase("Yes")) {
            System.out.println("\n==== Register for Exam ====");
            System.out.print("Enter the number of guidance logs with Supervisor 1: ");
            int supervisor1 = input.nextInt();
            System.out.print("Enter the number of guidance logs with Supervisor 2: ");
            int supervisor2 = input.nextInt();

            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 and Supervisor 2 fewer than 4.";
            } else if (supervisor1 >= 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
            } else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            } else {
                message = "System error.";
            }

            System.out.println("\nResult: " + message);

        } else {
            System.out.println("\nFailed: The student has not been cleared of compensation!");
        }

        input.close();
    }
}
