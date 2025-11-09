package Jobsheet9;
import java.util.Scanner;
public class Assigment2 {
    public static final String RED = "\u001B[31m";  // inisilisation red color 
    public static final String BLUE = "\u001B[34m";    // inisialisation blue color
    public static final String YELLOW = "\u001B[33m";   // inisialisation yellow color
    public static final String RESET = "\u001B[0m";     // inisialisation reset color

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println(BLUE +"----- Progam manage food and beverage order -----");
        System.out.print("Enter how many do you want order : " + RESET);
        int order = scanner.nextInt();
        scanner.nextLine();

        String[] Item = new String[order];
        int[] price = new int[order];

        System.out.println(RED +"---- progam add order -----" +RESET);
        for(int i = 0 ; i < order; i++){
            System.out.print((i+1) + " Enter the order you want :");
            Item[i] = scanner.nextLine();

            System.out.print("Enter the price using rupiah :");
            price[i] = scanner.nextInt();
            scanner.nextLine();
        }

        double total = 0;
        System.out.println("\n");
        System.out.println(YELLOW +" -----  List order -----");
        for(int i = 0 ; i < Item.length; i++){
            System.out.println(YELLOW +(i+1) +". " + Item[i] + "- price :" + price[i] + RESET );

            total = total + price[i];
        }
        System.out.println("\n");
        System.out.println( BLUE +"---- List payment order -----");
        System.out.println("All payment : " + total);
        System.out.println("thank you for using restaurant shevaarza progam" + RESET);

    }
    
}


 