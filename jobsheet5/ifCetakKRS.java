import java.util.Scanner;

public class ifCetakKRS{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
while (loop) {
     System.out.println("====== Print KRS siakad ======");
        System.out.print(" Have the tuition  fees been paid in full> ( True / False ): ");
        String uktlunas = sc.nextLine();

        if(uktlunas.equalsIgnoreCase("True")){
            System.out.println("UKT paymant has been verified !");
            System.out.println(" KRS now can be printed and you can ask the academic advisor to sign in");
            loop = false;
        }else if ( uktlunas.equalsIgnoreCase("False")){
            System.out.println("Registation rejected. Please pay UKT first ");
            loop = false;
        } else {
            System.out.println("System error please try again ");
        }         
    }

    sc.close();   

    }
}