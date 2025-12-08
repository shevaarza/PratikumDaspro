import java.util.Scanner;

public class CubeStudent{

    static String[] students = {"Ringga", "Atha", "Rayyan", "Sheva", "Ayeras"};
    static int[][] grades = new int[5][7]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputGrades(sc);   
        displayGrade();
        highestWeek();
        highStudent();
       
    }

    // a. Function to input students’ grade data
    public static void inputGrades(Scanner sc) {
        System.out.println("=== Input data Student  ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter value for " + students[i] + ":");
            for (int w = 0; w < 7; w++) {
                System.out.print("  Week " + (w + 1) + ": ");
                grades[i][w] = sc.nextInt();
            }
        }
    }

    public static void displayGrade(){
        System.out.println("------ all data value ------");
        System.out.printf("%-10s" , "Name");

        for(int i = 0 ; i <= 7 ; i++)System.out.printf("week%d  " , i);
        System.out.println();

        for(int i = 0 ; i < students.length; i++){
            System.out.printf("%-10s" , students[i]);
        for(int w = 0 ; w < 7; w++){
            System.out.printf("%-5d" ,grades[i][w]);
             }
             System.out.println();
        }
    }


    public static void highestWeek(){
        int max = -1;
        int weekIndex = -1;

        for(int w = 0 ; w<7 ;w++){
            for(int s = 0 ; s <5 ; s++){
                if(grades[s][w] > max){
                    max = grades[s][w];
                    weekIndex = w;
                }
            }
        }
        System.out.println("\n ----- this week with a highest value");
        System.out.println("Highest value :" + max + " in week " + (weekIndex + 1));
    }

    public static void highStudent(){
        int max = -1;
        int studentIndex = -1;
        int weekIndex = -1;

        for(int s = 0 ; s<5 ; s++){
            for(int w = 0 ; w<7 ;w++){
                if(grades[s][w] >max){
                    max = grades[s][w];
                    studentIndex = w;
                    weekIndex = w;
                }
            }
        }
        System.out.println("------ Student with a highest value --------");
        System.out.println("Name :" + students[studentIndex]);
        System.out.println("Highest value : " + max + "( Minggu " + (weekIndex + 1 ) + ")");

        System.out.println("The value of week : ");
        for(int w = 0 ; w < 7 ; w++){
            System.out.println("Week " + (w+ 1 ) + ": " + grades[studentIndex][w]);
        }
    }
}
