package constructor;

import java.util.Scanner;

public class SimpleConstructor {
	  int i=9;
	  int j=5;
	  SimpleConstructor(){
		  System.out.println("Constructor called");
	  }
	  void callFun() {
		 System.out.println("Function called"); 
	  }
	  int add(int a,int b)
	  {
		  int c=a+b;
		  return c;
	  }
	  public static void main(String[] args) {
		  int x,y;
		  Scanner sc=new Scanner(System.in);
		//  x=sc.nextInt();
		//  y=sc.nextInt();
		  SimpleConstructor s=new SimpleConstructor();
		//System.out.println(s.j);
		//s.callFun();
		System.out.println(s.add(s.i,s.j));
		int z=s.add(s.i, s.j);
		System.out.println(z);
		//s.add(3, 5);
	}

}