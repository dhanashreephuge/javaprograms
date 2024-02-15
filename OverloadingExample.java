package polymorphismprog;
public class OverloadingExample {

    // Method with the same name but different parameter types (overloaded)
    static int add(int a, int b) {
        return a + b;
    }

    // Method with the same name but different number of parameters (overloaded)
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with the same name but different types and number of parameters (overloaded)
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling overloaded methods
        int sum1 = add(10, 20);
        int sum2 = add(10, 20, 30);
        double sum3 = add(10.5, 20.7);

        // Output the results
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of doubles: " + sum3);
    }
}

