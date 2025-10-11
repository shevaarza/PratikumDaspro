import java.util.Scanner;

public class ifElseCetakKRS {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println(" ===== Print KRS siakad =====");
        System.out.print("Enter current Semester : ");
        int Semester = input.nextInt();

        if(Semester == 1){
            System.out.println(" Semester 1 is displayed");
        }else if (Semester == 2){
            System.out.println("Semester 2 is displayed");
        }else if (Semester == 3){
            System.out.println("Semester 3 is displayed");
        }else if (Semester == 4){
            System.out.println("Semester 4 is displayed");
        }else if (Semester == 5){
            System.out.println("Semester 5 is displayed");
        }else if (Semester == 6){
            System.out.println("Semester 6 is displayed");
        }else {
            System.out.println("Invalid Semester Input !");
        }

        input.close();;
    }
}
