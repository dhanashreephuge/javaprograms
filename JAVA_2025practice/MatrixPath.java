public class MatrixPath {

    public static int countPaths(int m, int n) {
        // Create a 2D array to store the count of paths
        int[][] dp = new int[m][n];
        
        // Initialize the first row and column to 1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // Only one way to reach any cell in the first column
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // Only one way to reach any cell in the first row
        }
        
        // Fill the rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // Return the count of paths to the bottom-right corner
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 3; // Number of columns
        
        System.out.println("Number of paths in a " + m + "x" + n + " matrix: " + countPaths(m, n));
    }
}