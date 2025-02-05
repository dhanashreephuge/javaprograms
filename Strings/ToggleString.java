import java.util.*;
public class ToggleString {
    public static void main(String argvs[])   
{  
    // taking input from the user  
    Scanner scnnr = new Scanner(System.in);  
    String strng = scnnr.nextLine();  
    StringBuilder result = new StringBuilder("");  
  
    for(int i = 0; i < strng.length(); i++)   
    {  
        char chr = strng.charAt(i); //current character  
          
        // make the capital letter, small letter  
        if(chr >='A' && chr <= 'Z')   
        {  
            result.append((char)(chr + 32));  
        }   
        // make the small letter, the capital letter  
        else if(chr >='a' && chr <= 'z')  
        {  
            result.append((char)(chr - 32));  
        }   
        // taking care of the cases when the character  
        // is not the letter  
        else   
        {   
            result.append(chr);  
        }  
    }  
  
    String answer = result.toString();  
      
    // displaying the answer on the console  
    System.out.println("After toggling, the string " + strng + " becomes: " + answer);  
}  
}  
