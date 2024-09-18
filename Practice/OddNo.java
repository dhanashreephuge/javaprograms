// Display odd numbers

public class OddNo {
    public static void main(String args[])   
    {  
        int number=100;  
        System.out.print("List of odd numbers from 1 to "+number+": ");  
        for (int i=1; i<=number; i++)   
        {  
        //logic to check if the number is odd or not  
        //if i%2 is not equal to zero, the number is odd  
            if (i%2!=0)   
            {  
                System.out.print(i + " ");  
            }  
        }  
    }  
}  

// using while loop
/*
 * import java.util.Scanner;  
public class DisplayOddNumbersExample 
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
i=1;   
System.out.print("Lit of odd numbers: ");  
//the while loop executes until the cond\ition become false  
while(i<=number)  
{  
//prints the odd number  
System.out.print(i +" ");   
//increments the variable i by 2  
i=i+2;  
}     
}  
}  
 */