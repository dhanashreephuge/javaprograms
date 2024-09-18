// print ASCII value using scanner

import java.util.Scanner;  

public class AsciiValueSc {
    public static void main(String args[])  
    {  
        System.out.print("Enter a character: ");  
        Scanner sc = new Scanner(System.in);  
        char chr = sc.next().charAt(0);  
        int asciiValue = chr;  
        System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
    }  
}  