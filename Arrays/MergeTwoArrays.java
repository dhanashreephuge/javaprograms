// Java Program to demonstrate merging
// two array without using pre-defined method
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30 };
        int b[] = { 40, 50, 60, 70, 80 };

        // determining length of both arrays
        int a1 = a.length;
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
          
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the 
            // resultant array
            c[a1 + i] = b[i];
        }

        System.out.println("" + Arrays.toString(c));
    }
}