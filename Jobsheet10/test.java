package Jobsheet10;
import java.util.Scanner;
public class test {
    
public static void main(String[] args) {
    
    int N =5;
    int[] score = new int[N];
    score = input(N); 
    output(score);

}

static int[] input(int n){
    int[] x = new int [n];
    Scanner scanner = new Scanner(System.in);
    for(int i = 0 ; i < x.length ; i++){
        System.out.print("enter ");
        x[i] = scanner.nextInt();
    }
    return x;
}

static void output(int[] x){
    for(int i = 0 ; i < x.length ; i++){
        System.out.print(x[i ] + " ");
    }
    }

} 


// name.length nilainya sama dengan angka 3
// sama aja ketik angka 3 tapi bedanya menyesuaikan dengan array name