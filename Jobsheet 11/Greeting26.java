import java.util.Scanner;
public class Greeting26 {
public static void main(String[] args) {
    
    String name = getGreetingRecipient();  
    System.out.println("thank you " + name);
}


public static String getGreetingRecipient() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the some of people you want to greet : ");
    String recipientname = scanner.nextLine();

    return recipientname;
}

}

// 1. Explain when do we need to create a function that requires a return value?

// You need to create a function with a return value when:

// The program needs data produced by the function

// 2. Can a System.out.println statement be added inside a function with a return value? What is its impact?
// ✔ Yes, you can put System.out.println() inside a function that also returns a value.


// 3. Can a function without a return value be called inside the main function without being passed to a variable? Like in experiment 1? Explain!
// ✔ Yes, it can!

// A function without a return value (a void function) does not return anything.
// Therefore, there is no value to store in a variable.

