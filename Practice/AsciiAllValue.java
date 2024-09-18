// print  Ascii Value Of All Chracters.

public class AsciiAllValue {
    public static void main(String[] args)   
    {  
       // for(int i = 0; i <= 255; i++)  // Print all characters

       // for(int i = 65; i <= 90; i++)  // If we want to print the ASCII value of all the alphabets (A to Z),
        // we can set the values in the loop and print them.

        for(int i = 97; i <= 122; i++)  // print the ASCII value of a to z
        {  
             System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
        }  
    }  
}   