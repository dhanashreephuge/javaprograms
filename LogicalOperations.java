public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // && Logical AND
        boolean andResult = a && b;
        System.out.println("Logical AND: " + andResult);

        // || Logical OR
        boolean orResult = a || b;
        System.out.println("Logical OR: " + orResult);

        // ! Logical NOT
        boolean notResultA = !a;
        boolean notResultB = !b;
        System.out.println("Logical NOT A: " + notResultA);
        System.out.println("Logical NOT B: " + notResultB);
    }
}