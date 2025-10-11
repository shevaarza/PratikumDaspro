import java.util.Scanner;

public class ifelsemodulus{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println(" ===== progam check number even or odd ======");
        System.out.print(" Enter the number :");
        number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("===== the result ======");
            System.out.print(" the number is even !!");
        }else{
            System.out.println("===== The result =====");
            System.out.println("The number is Odd !!");
        }
        input.close();
    }
}