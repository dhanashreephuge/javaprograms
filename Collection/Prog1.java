//  Printing a user-defined ArrayList
// Create an ArrayList of the user-defined objects and populate the ArrayList.
// Overrider the toString() method in the user-defined class to print the item of the ArrayList in the desired format.
// Run a for-loop to print the objects.

// Java Program to print an arraylist of an
// user-defined collection

import java.util.*;

public class Prog1 {
    String name;
    int rollNo;
 
    // constructor of class Prog1
    Prog1(String s, int n)
    {
        name = s;
        rollNo = n;
    }
 
    // over-riding the toString method
    // to print the collection
    public String toString()
    {
        return "Name : " + name + " | Roll No : " + rollNo;
    }
 
    // Driver Main Method
    public static void main(String[] args)
    {
        // creating an arraylist of user-defined collection
        ArrayList<Prog1> arr = new ArrayList<Prog1>();
 
        // creating objects of class Prog1
        Prog1 t1 = new Prog1("John", 101);
        Prog1 t2 = new Prog1("Paul", 102);
        Prog1 t3 = new Prog1("Jack", 103);
        Prog1 t4 = new Prog1("Jose", 104);
 
        // adding objects to arraylist
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);
 
        // printing the collection
        for (Prog1 c : arr)
            System.out.println(c);
    }
}
