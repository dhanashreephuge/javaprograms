import java.util.Arrays;

public class ArrayMatrixpo2 {
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 0},
            {6, 7, 8}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Step 1: Find the zero and mark row and column for conversion to -1
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Identify rows and columns that contain zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Convert marked rows and columns to -1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = -1;
                }
            }
        }
        
        System.out.println("Matrix after converting rows and columns containing zero to -1:");
        printMatrix(matrix);

        // Step 3: Convert all -1s back to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        System.out.println("Matrix after converting -1s to 0:");
        printMatrix(matrix);
    }
}
