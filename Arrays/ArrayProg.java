public class ArrayProg {
        public static void main(String[] args) {
        
            int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1}
            };

            int m = matrix.length;  
            int n = matrix.length; 
    
            
        int[] row = new int[m]; 
        int[] col = new int[n]; 

       
        System.out.println("Row array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(row[i] + " ");
        }
        
        System.out.println("\nCol array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(col[j] + " ");
        }
    }

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) {
                // Set entire row to -1 except where it's already 0
                for (int k = 0; k < matrix[i].length; k++) {
                    if (matrix[i][k] == 0) {
                        matrix[i][k] = 1;
                    }
                }
                // Set entire column to -1 except where it's already 0
                System.out.println("Matrix after converting rows and columns containing zero to 1:");
                for (int k = 0; k < matrix.length; k++) {
                    if (matrix[k][j] == 0) {
                        matrix[k][j] = 1;
                    }
                }
            }
        }
    }

   
    

}
    