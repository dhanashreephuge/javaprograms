public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division (using double for accurate result)
        double quotient = (double) num1 / num2;
        System.out.println("Quotient: " + quotient);

        // Modulus (remainder)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
    }
}