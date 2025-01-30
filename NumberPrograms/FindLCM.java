import java.io.*;

public class FindLCM{
   
    public static void main(String[] args)
    {
        int a = 15, b = 25;

        // Checking for the largest
        // Number between them
        int ans = (a > b) ? a : b;

        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}
