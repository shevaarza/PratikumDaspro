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


        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[2].length);


        System.out.println(audience.length);
        for(int i = 0 ; i < audience.length ; i++){
            System.out.println("Length of audience row " + i + " : " + audience[i].length);
        }


        for(String[] row : audience){
            System.out.println("Length of row : " + row.length);
        }


        System.out.println("audience in the row 3 : ");
        for(int i = 0 ; i < audience[2].length;i++){
            System.out.println(audience[2][i]);
        }
        

        for(int i = 0 ; i < audience.length ; i++){
            System.out.println("Audience in row " + (i +1) + String.join(", " , audience[i]));
        }
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


// 4. Explain the function of audience.length and audience[0].length! 
// Do audience[0].length, audience[1].length, audience[2].length, and 
// audience[3].length have the same value? Why?
// answer:
// audience.length returns the number of rows in the 2D array, which is 4


// 7. In your opinion, what are the advantages and disadvantages of foreach loop compared 
// to for loop? 
// answer:
// Advantages of foreach loop:
// 1. Simplicity: Foreach loops are easier to read and write, especially when iterating over collections or arrays.
// 2. Reduced Errors: Foreach loops eliminate the risk of off-by-one errors since you don't need to manage the loop counter manually.

// 8. What is the max row index for the audience array? 
// answer:
// The max row index for the audience array is 3, since there are 4 rows

// 9. What is the max column index for the audience array? 
// answer:
// The max column index for the audience array is 1, since there are 2 columns


// 13. What is the function of String.join()?   




