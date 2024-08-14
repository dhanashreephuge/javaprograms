import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int revNum = 0;
        
        while(n > 0){
            int ld = n % 10; //last digit n store it in ld
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }

        System.out.println(revNum);
    }
}


