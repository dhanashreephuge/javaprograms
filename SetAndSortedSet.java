package collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAndSortedSet {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // Adding elements to the hashSet
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Banana");
        hashSet.add("Apple");// Adding duplicate element, which will be ignored
        hashSet.add("Grapes"); 

        System.out.println("HashSet: " + hashSet);

        // Creating a TreeSet
        SortedSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the treeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(8);

        System.out.println("TreeSet: " + treeSet);

        // Adding elements to the treeSet in sorted order
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(treeSet);

        System.out.println("SortedSet: " + sortedSet);
    }
}
