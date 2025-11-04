package Jobsheet9;

public class ArrayNumber24 {
   
    public static void main(String[] args) {
        
        double[] number = new double[4];
        number[0]=434.43;
        number[1]=232.32;
        number[2]=0.23121;
        number[3]=9.231;

        for(int i = 0 ; i<4 ; i++)
        System.out.println(number[i]);
    }
}

        // 4. If the condition in the for-loop statement is changed to i <= 4, what is the output of 
        // the program? Why is the result like that?

        // The correct condition must be i < 4 or i < number.length
        // If i <= 4, the program will try to access the 4th index and cause an error.


