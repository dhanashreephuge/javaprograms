package array;

public class MultiDimensionalArrayProgram {
    public static void main(String[] args) {
        // Creating and initializing a 3D array with dimensions 2x3x4
        int[][][] cube = new int[2][3][4];
        // Initializing values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    cube[i][j][k] = i + j + k;
                }
            }
        }
        // Accessing and printing elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}