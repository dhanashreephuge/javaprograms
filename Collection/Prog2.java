// Printing a user-defined HashMap
// Create a hash map with user-defined key and value pair and fill the hash map using put() method.
// Make sure to Override the toString() method in the user-defined class to print the items in the desired format.
// Iterate over the hash map using the EntrySet() for loop and print the elements.

// Java program printing ArrayList
// of an user-defined collection
 
import java.util.*;

public class Prog2 {
    String firstName;
    String lastName;
 
    // Constructor
    Prog2 (String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
    }
 
    // Function- toString()
    public String toString()
    {
        // Over-riding the toString method to print the
        // collection
        return "| First Name : " + firstName
            + " | LastName : " + lastName;
    }
 
    // Driver Main Method
    public static void main(String[] args)
    {
        // Creating a hashmap with key as ID  and
        // value as user defined class
        HashMap<Integer, Prog2> hm
            = new HashMap<Integer, Prog2>();
 
        // creating objects
        Prog2 p1
            = new Prog2("Mohit", "Singh");
            Prog2 p2
            = new Prog2("Tarun", "Anand");
            Prog2 p3
            = new Prog2("Madhu", "Singh");
            Prog2 p4
            = new Prog2("Rohit", "Ahuja");
 
        // adding mappings
        hm.put(101, p1);
        hm.put(102, p2);
        hm.put(103, p3);
        hm.put(104, p4);
 
        // Iterating HashMap through for loop and printing the collection
        for (Map.Entry m : hm.entrySet())
            System.out.println(m.getKey() + " "
                               + m.getValue().toString());
    }
}
