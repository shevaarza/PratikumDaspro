import java.util.Scanner;
public class ExpressingGratit {
    public static String getgreetingRecipient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of people you want to greet :");
        String recipientname = scanner.nextLine();

        return recipientname;
    }

    public static void sayThankyou(){
        String name = getgreetingRecipient();
        System.out.println("Thank you " + name + " for your listening my kisah ");
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}


// 1. Based on experiment 4, which function will execute first? Please explain!
// The first function that executes is main().
// Why?
// In Java, the JVM (Java Virtual Machine) always starts the program by calling the main() method first.
// Inside main(), your program calls sayThankyou().
// Then inside sayThankyou(), the program calls getgreetingRecipient().

// 2. Which is the correct way to write a function inside a class? Above the main function or below the main function? Please explain!
//  Both ways are correct.

// In Java, the position of a function inside a class does NOT matter as long as:

// It is inside the class { }
// And not inside another method
// You can put methods:
// Above main()
// Below main()
// In any order
// Why?
// Because Java uses method signatures, and the compiler already knows all methods inside the class before execution.
// Conclusion:
//  Both styles are correct — it depends on your preference or coding style.

