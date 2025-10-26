
package Jobsheet7;
import java.util.Scanner;

class TheTriangle {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int numinput;
    String s = "";

    System.out.println("===== The Triangle ===== ");
    System.out.print("Input some number :");
    numinput = input.nextInt();

    // while(i < numinput){
    //     s+= "*";
    //     System.out.println(s);
    //     i++;
    // }

      for (int i = 0; i < numinput * numinput; i++) {
            s += "* ";
            
            if ((i + 1) % numinput == 0) {
                System.out.println(s);
                s = "";
            }
        }

 }
}