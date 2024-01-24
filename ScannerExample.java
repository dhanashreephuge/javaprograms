package inputs;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		String name = scan.next();
		System.out.println("Enter your name" +name);
				
		int age = scan.nextInt();
		System.out.println("Enter age"+ age);
				
		double mark = scan.nextDouble();
		System.out.println("Enter marks" +mark);
				
		System.out.println("I'm "+name+". I am "+age+ "years old. "+"My marks is" +mark+"% .");

		}

}
