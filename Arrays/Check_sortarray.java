import java.util.*;

public class Check_sortarray{
    public static boolean isSorted(int[] array) {
        
        if (array == null || array.length < 2) {
            return true; 
        }

       
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
       
        int[] array1 = {1, 2, 2, 3, 4}; 
        int[] array2 = {1, 3, 2, 4};   

        
        System.out.println("Array 1 is sorted: " + isSorted(array1));
        System.out.println("Array 2 is sorted: " + isSorted(array2));
    }
}