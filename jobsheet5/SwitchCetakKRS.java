import java.util.Scanner;

public class SwitchCetakKRS {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("===== Print KRS siakad =====");
        System.out.print("Enter current Semester : ");
        int Semester = input.nextInt();

        switch (Semester) {
            case 1:
                System.out.println("KRS semester 1 is Displayed ");
                break;
            case 2:
                System.out.println(" KRS Semester 2 is Diplayed ");
                break;
            case 3:
                System.out.println("KRS semester 3 is Displayed ");
                break;
            case 4:
                System.out.println("KRS semester 4 is Displayed ");
                break;
            case 5:
                System.out.println("KRS semester 5 is Displayed ");
                break;
            case 6:
                System.out.println("KRS semester 6 is Displayed ");
                break;

            default:
            System.out.println(" Invalid Semester ");
                break;
        }
        input.close();
    }
}
