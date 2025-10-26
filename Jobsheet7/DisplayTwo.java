package Jobsheet7;

import java.util.Scanner;
public class DisplayTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suminput = 0;
        System.out.print("Input some number:");
        suminput = input.nextInt();
        // for ( int i = 1 ; i <= suminput; i++){
        //     if( i %2 ==0 ){
        //         System.out.println("2 multiple :" + i );
        //     }
        // }

        for( int i = 1 ; i <= suminput; i++ ){
            if(i %2 ==0){
                System.out.print(i + " ");
            }
        }
    }
}
