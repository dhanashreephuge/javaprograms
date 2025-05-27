import java.util.*;

public class EqualRowColumnPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // Store rows as strings in a map
        Map<String, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String rowKey = Arrays.toString(grid[i]);
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }

        // Compare each column with stored rows
        for (int col = 0; col < n; col++) {
            int[] columnArr = new int[n];
            for (int row = 0; row < n; row++) {
                columnArr[row] = grid[row][col];
            }
            String colKey = Arrays.toString(columnArr);
            count += rowMap.getOrDefault(colKey, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println("Output: " + equalPairs(grid1)); // Output: 1

        int[][] grid2 = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println("Output: " + equalPairs(grid2)); // Output: 3
    }
}

