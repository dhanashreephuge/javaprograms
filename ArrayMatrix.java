import java.util.*;
import java.util.Array;

public class ArrayMatrix {
    public static void main(String[] arg){

               
                int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 0},
                    {6, 7, 8}
                };
                
            
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");

                       // int a[][] = matrix[i][2]*0;
                    }
                    System.out.println(); 
                }
            
                int row = 1; 
                int col = 1; 
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[row][i] = -1;
                }
                
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][col] = -1;
                }
               
            
                
                // for (int i = 0; i < matrix.length; i++) {
                //     for (int j = 0; j < matrix[i].length; j++) {
                //         if (matrix[i][j] == -1) {
                //             matrix[i][j] = 0;
                //         }
                //     }
                //     System.out.println();
                // } 

                System.out.println("convert all elements 2nd row and column to -1 of matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = 0;
                    }
                }
                System.out.println();
            } 
              
        System.out.println("Matrix after setting 2nd row and column to -1 and converting -1s to 0:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

