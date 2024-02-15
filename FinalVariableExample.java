package encapsulation;

public class FinalVariableExample {
    // Final variable declared at the class level
    final int MAX_VALUE = 100;

    public static void main(String[] args) {
        // Creating an instance of the FinalVariableExample class
        FinalVariableExample obj = new FinalVariableExample();

        // Accessing the final variable
        System.out.println("Maximum value: " + obj.MAX_VALUE);

        // Trying to modify the value of the final variable will result in a compilation error
        // obj.MAX_VALUE = 200;
    }
}

