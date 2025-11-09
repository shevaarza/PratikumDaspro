package Jobsheet9;

public class LInierSearch {

    public static void main(String[] args) {
        int[] arrayint = {34,32,25,20,12,9,43,45};

        int key =12;
        int result = 0;

        for(int i = 0 ; i < arrayint.length; i++){
            if (arrayint[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println("the key in the array is located an index position " + result);
    }
}
