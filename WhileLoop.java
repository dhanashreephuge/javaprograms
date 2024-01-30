package inputs;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 1;
        while (count <= number) {
            System.out.println("This is message number " + count);
            count++;
        }

        scanner.close();
    }
}