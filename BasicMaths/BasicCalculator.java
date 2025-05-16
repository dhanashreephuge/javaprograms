import java.util.Stack;

public class BasicCalculator {

    public int calculate(String s) {
        int result = 0;
        int sign = 1; // 1 means positive, -1 means negative
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * num;
                sign = 1;
                num = 0;
            } else if (ch == '-') {
                result += sign * num;
                sign = -1;
                num = 0;
            } else if (ch == '(') {
                // Push the current result and sign onto the stack
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // multiply with sign before the parentheses
                result += stack.pop(); // add to result before the parentheses
            }
            // Ignore spaces
        }

        if (num != 0) {
            result += sign * num;
        }

        return result;
    }

    // Testing the code
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        System.out.println(calc.calculate("1 + 1")); // 2
        System.out.println(calc.calculate(" 2-1 + 2 ")); // 3
        System.out.println(calc.calculate("(1+(4+5+2)-3)+(6+8)")); // 23
        System.out.println(calc.calculate("-(2+3)")); // -5
        System.out.println(calc.calculate("-1+(2+3)")); // 4
    }
}

/*How It Works:
1. It iterates through the string character by character.

2. Numbers are built digit-by-digit (num = num * 10 + digit).

3. Signs and parentheses are managed using a Stack.

4. When ) is encountered, it resolves the expression inside the parentheses using 
the saved state on the stack. */
