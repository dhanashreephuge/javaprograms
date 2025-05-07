public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Highest Altitude: " + largestAltitude(gain1)); // Output: 1

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Highest Altitude: " + largestAltitude(gain2)); // Output: 0
    }
}

