package array;

import java.util.Scanner;

public class TwoDimensionalArrayProgram
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int r,c;

        System.out.println("Enter 9 numbers");
        for(r=0; r<3; r++)
        {
            for(c=0; c<3; c++)
            {
                a[r][c]=sc.nextInt();
            }
        }

        System.out.println("\nOutput");
        for(r=0; r<3; r++)			// this loop is for row
        {
            for(c=0; c<3; c++)		// this loop will print 3 numbers in each row
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();	// break the line after printing the numbers in a row
        }
    }
}
