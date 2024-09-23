// Java Program to swap two string variables without using third or temp variable.
/*STEP 1: START
STEP 2: DEFINE Strings str1 = "Good ", str2 = "morning " to swap
STEP 3: PRINT "Strings before swapping " str1, str2
STEP 4: str1 =str1 + str2
STEP 5: EXTRACT str1 from indexes 0 to length (str1) - (str2) using substring function and store it in str2.
STEP 6: EXTRACT str1 from index length(str2) till end using substring function and store it in str1.
STEP 7: PRINT "Strings after swapping " str1, str2.
STEP 8: END */

public class SwapString {
    public static void main(String[] args) {    
        String str1 = "Good ", str2 = "morning ";    
         System.out.println("Strings before swapping: " + str1 + " " + str2);    
        
        //Concatenate both the string str1 and str2 and store it in str1    
        str1 = str1 + str2;    
        //Extract str2 from updated str1    
        str2 = str1.substring(0, (str1.length() - str2.length()));    
        //Extract str1 from updated str1    
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings after swapping: " + str1 + " " + str2);    
    }    
}    