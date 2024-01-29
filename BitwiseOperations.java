public class BitwiseOperations {
    public static void main(String[] args) {
        int num1 = 5;  // binary: 0101
        int num2 = 3;  // binary: 0011

        // & Bitwise AND
        int bitwiseAnd = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // | Bitwise OR
        int bitwiseOr = num1 | num2;
        System.out.println("Bitwise OR: " + bitwiseOr);

        // ^ Bitwise XOR
        int bitwiseXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // ~ Bitwise NOT
        int bitwiseNotNum1 = ~num1;
        System.out.println("Bitwise NOT (num1): " + bitwiseNotNum1);

        // << Left Shift
        int leftShift = num1 << 1;
        System.out.println("Left Shift: " + leftShift);

        // >> Right Shift
        int rightShift = num1 >> 1;
        System.out.println("Right Shift: " + rightShift);
    }
}