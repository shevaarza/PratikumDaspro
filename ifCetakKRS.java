
import java.util.Scanner;

public class ifCetakKRS{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Print KRS siakad ======");
        System.out.print(" Have the tuition  fees been paid in full> ( True / False ): ");
        boolean uktlunas = sc.nextBoolean();

        if(uktlunas){
            System.out.println("UKT paymant has been verified !");
            System.out.println(" KRS now can be printed and you can ask the academic advisor to sign in");
        }else {
            System.out.println("Registation rejected. Please pay UKT first ");
        }
       

    }
}