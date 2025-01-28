public class FindGCD {
    public static void main(String[] args)   
{  
//x and y are the numbers to find the GCF  
int x = 12, y = 8, gcd = 1;  
//running loop form 1 to the smallest of both numbers  
for(int i = 1; i <= x && i <= y; i++)  
{  
//returns true if both conditions are satisfied   
if(x%i==0 && y%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
//prints the gcd  
System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}  
}  

//=====================================================================================
// using while loop
// public class FindGCDExample2  
// {  
// public static void main(String[] args)   
// {  
// int Num1=12, Num2=8, Temp, GCD=0;  
// while(Num2 != 0)  
// {  
// Temp = Num2;  
// Num2 = Num1 % Num2;  
// Num1 = Temp;  
// }  
// GCD = Num1;  
// System.out.println("\n GCD =  " + GCD);  
// }  
// }  

//=====================================================================================
//using user defined
// import java.util.Scanner;  
// public class FindGCDExample4  
// {  
// //private static Scanner sc;  
// public static void main(String[] args)   
// {  
// int a, b, gcd = 0;  
// Scanner sc = new Scanner(System.in);  
// System.out.print("Enter the First Number: ");  
// a = sc.nextInt();     
// System.out.print("Enter the Second Number: ");  
// b = sc.nextInt();  
// gcd = findGCD(a, b);  
// System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
// }  
// public static int findGCD(int a, int b)  
// {  
// while(b != 0)  
// {  
// if(a > b)  
// {  
// a = a - b;  
// }  
// else  
// {  
// b = b - a;  
// }  
// }  
// return a;  
// }  
// }  