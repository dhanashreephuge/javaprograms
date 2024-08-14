import java.util.Scanner;

public class CountDigits {
    
    public static int countDigits(int n) {
        
        int cnt = 0;
       
        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
       
        return cnt;
    }

    public static void main(String [] args){
        int N = 35267398;
        System.out.println("N: " +N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " +digits);
    }
}

                                
                            