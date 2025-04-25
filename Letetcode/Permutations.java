import java.util.*;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // Add a copy of the current permutation
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) continue; // Skip used numbers
                tempList.add(num);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1); // Undo the move
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);

        System.out.println("Permutations of " + Arrays.toString(nums) + ":");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}

