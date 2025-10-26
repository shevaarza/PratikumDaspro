import java.util.Scanner;

public class Mid_exam {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String ticket, message = "";
        int age;
        int price_weekday = 40000, price_weekend = 50000, base_price = 0;
        double total_price = 0;

        System.out.println("====== Final Movie Ticket Price =====");
        System.out.print("Enter day type (weekday or weekend): ");
        ticket = input.nextLine().toLowerCase();
        System.out.print("Enter Viewer Age: ");
        age = input.nextInt();

        if (ticket.equals("weekday")) {
            base_price = price_weekday;

            if (age <= 12) {
                total_price = base_price * 0.5;
                message = "Discount 50%";
            } else if (age >= 13 && age <= 59) {
                total_price = base_price;
                message = "Normal price";
            } else if (age >= 60) {
                total_price = base_price * 0.7;
                message = "Discount 30%";
            } else {
                message = "Invalid age input!";
            }

        } else if (ticket.equals("weekend")) {
            base_price = price_weekend;

            if (age <= 12) {
                total_price = base_price * 0.7;
                message = "Discount 30%";
            } else if (age >= 18 && age <= 25) {
                total_price = base_price * 1.05;
                message = "5% extra surcharge";
            } else if (age >= 13 && age <= 59) {
                total_price = base_price;
                message = "Normal price";
            } else if (age >= 60) {
                total_price = base_price * 0.9;
                message = "Discount 10%";
            } else {
                message = "Invalid age input!";
            }

        } else {
            System.out.println("System error: invalid day type.");
            return; // keluar dari program
        }

        // Output akhir
        System.out.println("\n====== The Result of the Program ======");
        System.out.println("Day Type        : " + ticket);
        System.out.println("Viewer Age      : " + age);
        System.out.println("Base Price      : Rp " + base_price);
        System.out.println("Total Price     : Rp " + total_price);
        System.out.println("Note            : " + message);
    }
}
