public class AssignmentOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // = Assignment
        int result = num1;
        System.out.println("Assignment: " + result);

        // += Addition Assignment
        result += num2;
        System.out.println("Addition Assignment: " + result);

        // -= Subtraction Assignment
        result -= num2;
        System.out.println("Subtraction Assignment: " + result);

        // *= Multiplication Assignment
        result *= num2;
        System.out.println("Multiplication Assignment: " + result);

        // /= Division Assignment
        result /= num2;
        System.out.println("Division Assignment: " + result);

        // %= Modulus Assignment
        result %= num2;
        System.out.println("Modulus Assignment: " + result);
    }
}