//The formula for simple interest is given as,

//Simple Interest = (principal amount × interest rate × time) / 100

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        // declare variables
        double principalAmount = 0.0; 
        double rate = 0.0;
        double time = 0.0;
        double interest = 0.0;
 
        // create object of Scanner class
        Scanner scan = new Scanner(System.in);
 
        // read inputs
        System.out.print("Enter principal amount:: ");
        principalAmount = scan.nextDouble();
        System.out.print("Enter time (in months):: ");
        time = scan.nextDouble();
        System.out.print("Enter  the  interest rate (per year):: ");
        rate = scan.nextDouble();
 
        // calculate simpleInterest
        interest = (principalAmount * rate * time) / 100;
 
        // display result
        System.out.println("Simple interest = "+interest);
        System.out.println("Total amount to pay = "+ 
                           (principalAmount+interest));
 
        // close scan 
        scan.close();
    }
 }
