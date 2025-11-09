package Jobsheet9;

import java.util.Scanner;

public class Assigment3 {

      public static final String RED = "\u001B[31m";  // inisilisation red color 
    public static final String BLUE = "\u001B[34m";    // inisialisation blue color
    public static final String YELLOW = "\u001B[33m";   // inisialisation yellow color
    public static final String RESET = "\u001B[0m";  
    public static void main(String[] args) {
        
        // Predefined menu
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", 
                         "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==== Welcome to the Cafe ====");
        for(int i = 0 ; i< menu.length ; i++){
            System.out.println((i+1)+ " Food : " + BLUE +menu[i] +RESET);
        }
        System.out.print("Enter the name of the item you want to search: ");
        String item = scanner.nextLine();
        
        boolean found = false;

        // Linear search process
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(item)) {  
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println( RED +item+RESET + " is available on the menu ");
        } else {
            System.out.println( RED +item+RESET + " is NOT on the menu ");
        }

        scanner.close();
    }
}
