package Jobsheet10;

public class NumbersSheva {
    
    public static void main(String[] args) {
        
        String [][] mynumber = new String[3][];

        mynumber[0] = new String[5];
        mynumber[1] = new String[3];
        mynumber[2] = new String[1];

        for(int i = 0 ;i < mynumber.length ; i++){
            System.out.println("Length of row " + i + " : " + mynumber[i].length);
        }

        for(int i = 0 ; i < mynumber.length ; i++){
            System.out.println("Length of row " + (i +1) + " : " + mynumber[i].length);
        }
    }
}



// 2. What is the function of Arrays.toString()? Please explain!
// answer:
// The function of Arrays.toString() in Java is to provide a human-readable string representation
// of the contents of an array. When you pass an array to this method, it returns a string that lists all the
// elements in the array, enclosed in square brackets and separated by commas. This is particularly useful


// 3. What is the default value for elements in an array with the data type int? Please explain!
// answer:
// The default value for elements in an array with the data type int in Java is 0. When an integer array is created,
// all its elements are automatically initialized to 0 by the Java runtime environment. This is because int is a primitive data type in Java,
// and primitive types have predefined default values. This behavior ensures that the array elements have a known state before any explicit assignment is made to them.


// 5. The myNumbers array has a different length for each row. 
//    How to make the length for each row the same? 
//    Can the array length be modified?

// Answer:
// To make each row the same length, you must create the 2D 
// array with a fixed number of columns from the beginning. 
// Example:
//     int[][] myNumbers = new int[3][5];

// This ensures that every row has exactly 5 columns.

// Array length in Java cannot be modified after the array is 
// created because arrays have a fixed size. If a different 
// size is needed, a new array must be created and the data can 
// be copied into it.