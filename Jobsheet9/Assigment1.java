package Jobsheet9;
import java.util.Scanner;
public class Assigment1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many size :");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] studentscore = new int[size];
        int total = 0;
        double avarage;
  System.out.println("--------- progam enter grade student --------------");
        for(int i = 0 ; i < studentscore.length;i++){
            System.out.print("Enter grade student : ");
            studentscore[i] = scanner.nextInt();
            total = total + studentscore[i];
        }
        System.out.println("--------- result grade ------------");
        for(int i = 0 ; i < studentscore.length; i++){
            System.out.println("student score is " + studentscore[i]);
        }

        avarage = total / studentscore.length;
        int highest = studentscore[0];
        int lowest = studentscore[0];

        for(int i = 1; i < studentscore.length; i++){
            if(studentscore[i]> highest){
                highest = studentscore[i];
            }
            if(studentscore[i] < lowest){
                lowest = studentscore[i];
            }
        }

        System.out.println("------------ end progam ---------");
        System.out.println("avarage Grade :" + avarage);
        System.out.println("Highest grade :" + highest);
        System.out.println("Lowest grade :" + lowest);
        
    }
    
}
