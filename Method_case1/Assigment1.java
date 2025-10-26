package Method_case1;

import java.util.Scanner;

public class Assigment1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int calculate_subject1 ;
        int calculate_subject2;
        int calculate_total;
        String massage1 = "" ;
        String massage2 = "";
        String massage3 = "";
       
        String status1_pas = "";
      
        String status2_pas = "";
        String value_letter = "";

        System.out.println(" =====  INPUT DATA MAHASISWA ======");
        System.out.print("Enter Your name : ");
        String nama = input.nextLine().toLowerCase();
        System.out.print("Enter your ID  : ");
        int NIM = input.nextInt();

    

        System.out.println("\n ====== Subject lecture 1 : Algoritma dan Pemerogaman ======");
        System.out.print(" The value of UTS : ");
        int subject1_uts = input.nextInt();
        System.out.print(" The value of UAS : ");
        int subject1_uas = input.nextInt();
        System.out.print("The value of Assigment : ") ;
        int subject1_assig = input.nextInt();

        System.out.println("\n ====== Subject lecture 2 : Structure Data =====");
        System.out.print("The value of UTS :");
        int subject2_uts = input.nextInt();
        System.out.print(" The Value of UAS :");
        int subject2_uas = input.nextInt();
        System.out.print(" The value of Assigment : ");
        int subject2_assig = input.nextInt();

        // calculate the value 
        
        calculate_subject1 = (subject1_uts * 3/10) + (subject1_uas * 4/10) + (subject1_assig * 3/10 );
        calculate_subject2 = (subject2_uts * 3/10) + (subject2_uas * 4/10) + (subject2_assig * 3/10 );
        
        // condision 1
        if( calculate_subject1 >=80 && calculate_subject1 <= 100){
           massage1 = " Very Good ";
            value_letter = " A";
           status1_pas = "Pass";
        }else if ( calculate_subject1 >=73 && calculate_subject1 <=80 ){
           massage1 = "More Good";
            value_letter = "B+";
           status1_pas = "Pass";
        }else if ( calculate_subject1 >=65 && calculate_subject1 <= 73 ){
           massage1 = " Good ";
            value_letter = "B";
           status1_pas = "Pass";
        }else if ( calculate_subject1 >=60 && calculate_subject1 <=65){
           massage1 = "More than enough";
            value_letter = " C+ ";
           status1_pas = "Pass";

        }else if ( calculate_subject1 >=50 && calculate_subject1 <=60){
           massage1 = " Enough";
            value_letter = " C ";
          status1_pas = "Fail";
        } else if ( calculate_subject1 >= 39 && calculate_subject1 <=50){
           massage1 = "Less";
            value_letter = "D";
          status1_pas = "Fail";
        }else if (calculate_subject1 <= 39){
           massage1 = "Failed";
            value_letter = "E";
          status1_pas ="Fail";
        }else{
           massage1 = "System error";
        }

        // condision 2

           if( calculate_subject2 >=80 && calculate_subject2 <= 100 ){
           massage2 = " Very Good ";
            value_letter = " A";
           status2_pas = "Pass";
        }else if ( calculate_subject2 >=73 && calculate_subject2 <=80 ){
           massage2 = "More Good";
            value_letter = "B+";
           status2_pas = "Pass";
        }else if ( calculate_subject2 >=65 && calculate_subject2 <= 73 ){
           massage2 = " Good ";
            value_letter = "B";
           status2_pas = "Pass";
        }else if ( calculate_subject2 >=60 && calculate_subject2 <=65){
           massage2 = "More than enough";
            value_letter = " C+ ";
           status2_pas = "Pass";
        }else if ( calculate_subject2 >=50 && calculate_subject2 <=60){
           massage2 = " Enough";
            value_letter = " C ";
         status2_pas = "fail";
        } else if ( calculate_subject2 >= 39 && calculate_subject2 <=50){
           massage2 = "Less";
            value_letter = "D";
         status2_pas = "fail";
        }else if (calculate_subject2 <= 39){
           massage2 = "Failed";
            value_letter = "E";
         status2_pas = "fail";
        }else{
           massage2 = "System error";
        }

        // condision fail or pass
        calculate_total = (calculate_subject1 + calculate_subject2 ) /2;

        if(calculate_total >= 70){
           massage3 = "congratulations on graduating this semester";
        }else{
            massage3 = "sorry you didn't pass this semester";
        }

        
        System.out.println("\n===== academic assessment results =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + NIM);

        System.out.println("The subject \t\t UTS \t UAS\t Assigment\tLast Result\t Value latter\t Kualifikasi\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrogaman \t " + subject1_uts  +"\t" + subject1_uas +"\t"+ subject1_assig + "\t\t    " + calculate_subject1 +"\t\t   " + value_letter + "\t\t" + massage1+"\t"+ status1_pas);
        System.out.println("Strukture data\t\t " + subject2_uts  +"\t" + subject2_uas +"\t     "+ subject2_assig + "\t    " + calculate_subject2 +"\t" + value_letter + "\t\t" + massage2+"\t\t"+ status2_pas);
       System.out.println("\n Rata Rata Nilai mahasiswa " + nama + ":" + calculate_total);
       System.out.println("Status Semester  : " + massage3);
        
       

    }
}
