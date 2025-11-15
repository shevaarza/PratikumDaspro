package Jobsheet10;

public class CinemaSheva {
    
    public static void main(String[] args) {
        
        String[][]  audience = new String [4][2];

        audience [0][0] = "Sheva";
        audience [0][1] = "bagas";
        audience [1][0] = "Budi";
        audience [1][1] = "Dani";
        audience [2][0] = "Asep";
        audience [2][1] = "Rudi";
        audience [3][0] = "Susi";
        audience [3][1] = "kemar";
        
      System.out.printf("%-10s %-10s%n", audience[0][0], audience[0][1]);
        System.out.printf("%-10s %-10s%n", audience[1][0], audience[1][1]);
        System.out.printf("%-10s %-10s%n", audience[2][0], audience[2][1]);
        System.out.printf("%-10s %-10s%n", audience[3][0], audience[3][1]); 
    }
}


// 1. Do array elements have to be filled in sequentially starting from the 0th index? Please 
// explain! 
// answer:
// No, array elements do not have to be filled in sequentially starting from the 0th index. In Java,
//  when you create an array, all elements are initialized to their default values (null for object types,
//  0 for numeric types, false for boolean). You can assign values to specific indices

// 2. Why is there a null in the list of audience names?
// answer:
// The null in the list of audience names indicates that the corresponding array element has not been assigned a value.




