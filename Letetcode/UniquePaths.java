public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        long result = 1;
        int totalSteps = m + n - 2;
        int downSteps = m - 1;

        for (int i = 1; i <= downSteps; i++) {
            result = result * (totalSteps - downSteps + i) / i;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        int m1 = 3, n1 = 7;
        System.out.println("Unique paths for 3x7 grid: " + uniquePaths(m1, n1)); // Output: 28

        int m2 = 3, n2 = 2;
        System.out.println("Unique paths for 3x2 grid: " + uniquePaths(m2, n2)); // Output: 3
    }
}
