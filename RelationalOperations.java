public class RelationalOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // == Equal to 
        boolean isEqual = num1 == num2;
        System.out.println("Equal to: " + isEqual);

        // != Not equal to
        boolean isNotEqual = num1 != num2;
        System.out.println("Not equal to: " + isNotEqual);

        // > Greater than
        boolean isGreaterThan = num1 > num2;
        System.out.println("Greater than: " + isGreaterThan);

        // < Less than
        boolean isLessThan = num1 < num2;
        System.out.println("Less than: " + isLessThan);

        // >= Greater than or equal to
        boolean isGreaterOrEqual = num1 >= num2;
        System.out.println("Greater than or equal to: " + isGreaterOrEqual);

        // <= Less than or equal to
        boolean isLessOrEqual = num1 <= num2;
        System.out.println("Less than or equal to: " + isLessOrEqual);
    }
}