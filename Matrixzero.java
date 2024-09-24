public class Matrixzero {
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 5},
            {6, 7, 8}
        };
        
        System.out.println("Original Matrix:" );
        printMatrix(matrix);

        // Step 1: Scan the matrix and set elements to -1 for rows and columns with a 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    // Set entire row to -1 except where it's already 0
                    for (int k = 0; k < matrix[i].length; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }
                    // Set entire column to -1 except where it's already 0
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }

        System.out.println("Matrix after converting rows and columns containing zero to -1:");
        printMatrix(matrix);

        // Step 2: Convert all -1s back to 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        System.out.println("Matrix after converting -1s to 0:");
        printMatrix(matrix);
    }
}

