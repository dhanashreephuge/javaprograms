//package com.example.myprograms;

//Java Program to find sum of elements in a given array
public class SumOfArray {
	static int arr[] = { 12, 3, 4, 15 };

	// method for sum of elements in an array
	static int sum()
	{
		int sum = 0; // initialize sum
		int i;

		// Iterate through all elements and add them to sum
		for (i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	// Driver method
	public static void main(String[] args)
	{
		System.out.println("Sum of given array is "
						+ sum());
	}
}

//======================================================================================
//import java.util.Arrays;
////import Arrays class to use inbuilt sum() method
//import java.io.*;
//
//class GFG {
//	public static void main (String[] args) {
//		int [] nums = {1,2,3,4,5};
//		int sum = Arrays.stream(nums).sum();
//		System.out.println(sum);
//	}
//}

//=========================================================================================
//sum of array elements using
//Recursion

//import java.io.*;
//
//class GFG {
//	public static int sumArray(int[] arr, int n) {
//		if (n == 0) {
//			return arr[n];
//		}
//		return arr[n] + sumArray(arr, n-1);
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int n = arr.length;
//		int sum = sumArray(arr, n-1);
//		System.out.println("Sum of the elements in the array: " + sum);
//	}
//}

//This code is contributed Vinay Pinjala.


