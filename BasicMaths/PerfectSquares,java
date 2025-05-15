import java.util.*;

public class PerfectSquares {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Precompute all perfect squares less than or equal to n
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        // Build up the dp array
        for (int i = 1; i <= n; i++) {
            for (int square : squares) {
                if (i < square) break;
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }

        return dp[n];
    }

    // Main method to test the function
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 13;

        System.out.println("Input: " + n1 + " -> Output: " + numSquares(n1)); // Output: 3
        System.out.println("Input: " + n2 + " -> Output: " + numSquares(n2)); // Output: 2
    }
}
// solve this problem using Dynamic Programming (DP). The idea is to build up a solution for n by using results from smaller values.
/*Explanation:
We use a DP array dp where dp[i] stores the minimum number of perfect squares needed to sum to i.

For every number i from 1 to n, we iterate over all smaller or equal perfect squares j*j and set:


dp[i] = min(dp[i], dp[i - j*j] + 1)
This approach runs in O(n√n) time, which is efficient for n up to 10⁴.*/