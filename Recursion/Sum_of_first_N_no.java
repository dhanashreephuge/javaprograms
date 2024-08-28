//  Sum of first N Natural Numbers

import java.util.*;

public class Sum_of_first_N_no {
    public static void main(String[] args) {

        solve(5);
        solve(6);
      }
      public static void solve(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
          sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
      }
    }



   //============== OR =========================
   /*
    * static void func(int i, int sum){
        
            // Base Condition.
            if(i<1){
                
                System.out.println(sum);
                return;
            }
            
            // Function call to increment sum by i till i decrements to 1.
            func(i-1,sum+i);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       func(n,0);
    }
}
    */