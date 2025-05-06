import java.util.*;

public class GreatestNO_Candies {
   
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Find the maximum number of candies any kid currently has
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Check for each kid if they can have the greatest number of candies
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(kidsWithCandies(candies1, extraCandies1)); // [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(kidsWithCandies(candies2, extraCandies2)); // [true, false, false, false, false]

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(kidsWithCandies(candies3, extraCandies3)); // [true, false, true]
    }
}
