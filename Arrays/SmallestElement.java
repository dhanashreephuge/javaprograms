// find smallest number of an array

/*STEP 1: START
STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
STEP 3: min = arr[0]
STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
STEP 5: if(arr[i]<min)
min=arr[i]
STEP 6: PRINT "Smallest element in given array:"
STEP 7: PRINT min
STEP 8: END */

public class SmallestElement {
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize min with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with min  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
      }  
    }  
