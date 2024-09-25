// Program to print the elements of an array

/*STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}.
STEP 3: PRINT "Elements of given array:"
STEP 4: REPEAT STEP 5 for(i=0; i<arr.length; i++)
STEP 5: PRINT arr[i]
STEP 6: END */

public class PrintArray {
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
