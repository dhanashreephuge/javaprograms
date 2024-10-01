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


//================================================================================================
/*public class ArrayMatrixWithoutUserInput {
    public static void main(String[] args) {
        // Define the number of rows (m) and columns (n)
        int m = 3;  // Number of rows
        int n = 4;  // Number of columns

        // Initialize the array with predefined values
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Print the array in matrix format (m x n)
        System.out.println("The array in " + m + "x" + n + " format is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Move to the next row after printing each row
        }
    }
}
 */

 // using user
 /*import java.util.Scanner;

public class ArrayMatrixFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Initialize the array
        int[][] array = new int[m][n];

        // Get array elements from the user
        System.out.println("Enter the elements for the array (m*n elements):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the array in matrix format (m x n)
        System.out.println("\nThe array in " + m + "x" + n + " format is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row after printing each row
        }

        scanner.close();
    }
}
 */