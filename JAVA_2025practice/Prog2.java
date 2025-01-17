import java.util.Arrays;

//Sort string of characters

public class Prog2 {
	 public static void main(String[] args) {
	        String s = "geeksforgeeks";
	        
	        // Convert the string to a character array
	        char[] arr = s.toCharArray();

	        // Sort the character array
	        Arrays.sort(arr);

	        // Convert sorted character array back to string
	        s = new String(arr);

	        // Print the sorted string
	        System.out.print(s);
	    }
	}

