package Jobsheet7;
import java.util.Scanner;
public class DoWhileLeaveEntitlement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int leaveEntitlement =0 ,numLeave;
        
        System.out.println("----------- DO-WHILE loop structurec ----------------");
        System.out.print("How many Leave enritlement :");
        leaveEntitlement = input.nextInt();
        input.nextLine();f1
        do {
            System.out.print(" Do you want to take leave (y/n) :");
            String comfirmation = input.nextLine();
            if(comfirmation.equalsIgnoreCase("y")){
                System.out.print("how many day (s)");
                numLeave =input.nextInt();
                if( numLeave <= leaveEntitlement){
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                }else{
                    System.out.println("you dont have enough leave entitlement");
                    break;
                }
            }

        } while(leaveEntitlement >0);

        input.close();
    }
}
