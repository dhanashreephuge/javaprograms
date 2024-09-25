// Program to print the largest element in an array

/*STEP 1: START
STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
STEP 3: max = arr[0]
STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
STEP 5: if(arr[i]>max) max=arr[i]
STEP 6: PRINT "Largest element in given array:"
STEP 7: PRINT max
STEP 8: END */

public class Largestelement {
  public static void main(String[] args) {  
  
    //Initialize array  
    int [] arr = new int [] {25, 11, 7, 75, 56};  
    //Initialize max with first element of array.  
    int max = arr[0];  
    //Loop through the array  
    for (int i = 0; i < arr.length; i++) {  
        //Compare elements of array with max  
       if(arr[i] > max)  
           max = arr[i];  
    }  
    System.out.println("Largest element present in given array: " + max);  
  }  
}  

//================================================================================================

// import java.util.*;

// public class Largestelement {

//     public static void main(String args[]) {
 
//         int arr1[] =  {2,5,1,3,0};
//         System.out.println("The Largest element in the array is: " + sort(arr1));
       
//        // int arr2[] =  {8,10,5,7,9};
//         //System.out.println("The Largest element in the array is: " + sort(arr2));
//       }
//       static int sort(int arr[]) {
//         Arrays.sort(arr);
//         return arr[arr.length - 1];
//       }
//     }