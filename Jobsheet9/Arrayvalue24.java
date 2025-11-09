package Jobsheet9;
import java.util.Scanner;
public class Arrayvalue24 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] finalScore = new int[10];

        for(int i = 1; i <= finalScore.length; i++){
            System.out.print("Enter the final score " + i + ":");
            finalScore[i] = scanner.nextInt();

            for(int scores : finalScore){
                System.out.println("Final score" + i + "is " + scores);
            }
        }
    }
}
